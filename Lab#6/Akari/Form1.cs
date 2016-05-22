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
          XmlDocument doc = new XmlDocument();

          int[,] puzzle_matrix;
          int puzzle_columns;
          int puzzle_rows;

          int practice_count;
          int easy_count;
          int normal_count;

          class GameMove
          {
               int _i, _j, _type;

               public int I
               {
                    get { return _i; }
               }

               public int J
               {
                    get { return _j; }
               }

               public int Type
               {
                    get { return _type; }
               }

               public GameMove(int i, int j, int type)
               {
                    _i = i;
                    _j = j;
                    _type = type;
               }
          }

          Stack<GameMove> moves = new Stack<GameMove>(200);

          public Form1()
          {
               InitializeComponent();
               button1.BackColor = Color.LightGray;
               button2.BackColor = Color.LightGray;
               button3.BackColor = Color.LightGray;
               back_to_menu.BackColor = Color.LightGray;
               back_to_menu.Hide();
               back_to_problems.BackColor = Color.LightGray;
               back_to_problems.Hide();
               time_label.Hide();
               reset_button.BackColor = Color.LightGray;
               reset_button.Hide();

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
          }

          private void Form1_Load(object sender, EventArgs e)
          {
              GetPuzzleCount();
          }
     }
}
