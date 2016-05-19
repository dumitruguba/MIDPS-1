using System;
using System.Xml;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;

namespace Akari
{
     public partial class Form1 : Form
     {
          private void LoadPuzzle(string difficulty, string index)
          {
               XmlNode xmlNode;
               XmlDocument doc = new XmlDocument();

               try
               {
                    doc.Load("puzzles.xml");
               }
               catch
               {
                    MessageBox.Show("Could not open input XML file.", "Error");
                    Application.Exit();
                    return;
               }

               xmlNode = doc.SelectSingleNode("/Puzzles/" + difficulty + "/Puzzle[@index='" + index + "']");
               if (xmlNode == null)
               {
                    MessageBox.Show("Puzzle \"" + difficulty + " - " + index + "\" not found.", "Error");
                    Application.Exit();
                    return;
               }

               puzzle_columns = Int32.Parse(xmlNode.Attributes["cols"].Value);
               puzzle_rows = Int32.Parse(xmlNode.Attributes["rows"].Value);

               puzzle_matrix = new int[puzzle_rows, puzzle_columns];

               int count = 0;
               foreach (XmlNode node in xmlNode)
               {
                    string[] tokens = node.InnerText.Split(' ');
                    int[] int_array = Array.ConvertAll<string, int>(tokens, int.Parse);

                    for (int i = 0; i < puzzle_columns; i++)
                    {
                         puzzle_matrix[count, i] = int_array[i];
                    }
                    count++;
               }
          }

          void GetPuzzleCount()
          {
               XmlNode xmlNode;
               XmlDocument doc = new XmlDocument();

               try
               {
                    doc.Load("puzzles.xml");
               }
               catch
               {
                    MessageBox.Show("Could not open input XML file.", "Error");
                    Application.Exit();
                    return;
               }

               xmlNode = doc.SelectSingleNode("/Puzzles/Practice/Count");
               if (xmlNode == null)
               {
                    MessageBox.Show("Node \"/Puzzles/Practice/Count\" not found.", "Error");
                    Application.Exit();
                    return;
               }

               practice_count = Int32.Parse(xmlNode.Attributes["value"].Value);

               xmlNode = doc.SelectSingleNode("/Puzzles/Easy/Count");
               if (xmlNode == null)
               {
                    MessageBox.Show("Node \"/Puzzles/Easy/Count\" not found.", "Error");
                    Application.Exit();
                    return;
               }

               easy_count = Int32.Parse(xmlNode.Attributes["value"].Value);

               xmlNode = doc.SelectSingleNode("/Puzzles/Normal/Count");
               if (xmlNode == null)
               {
                    MessageBox.Show("Node \"/Puzzles/Normal/Count\" not found.", "Error");
                    Application.Exit();
                    return;
               }

               normal_count = Int32.Parse(xmlNode.Attributes["value"].Value);
          }
     }
}
