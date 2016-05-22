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
               XmlNode xmlNode = doc.SelectSingleNode("/Puzzles/" + difficulty + "/Puzzle[@index='" + index + "']");
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
               XmlNode xmlNode = doc.SelectSingleNode("/Puzzles/Practice/Count");
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

          void ClickOnButton(int I, int J)
          {
               Point UP = new Point(I - 1, J);
               Point DOWN = new Point(I + 1, J);
               Point LEFT = new Point(I, J - 1);
               Point RIGHT = new Point(I, J + 1);
               bool go_left = false, go_right = false, go_up = false, go_down = false;

               int SET;

               if (puzzle_matrix[I, J] / 10 == 7)
               {
                    puzzle_matrix[I, J] = 60 + puzzle_matrix[I, J] % 10;
                    SET = 1;
               }
               else if (puzzle_matrix[I, J] / 10 == 6)
               {
                    puzzle_matrix[I, J] = 70 + puzzle_matrix[I, J] % 10;
                    SET = -1;
               }
               else return;

               UpdateButton(I, J);

               for (int i = 0; i < puzzle_columns; i++)
               {
                    if (UP.X > -1)
                    {
                         if (puzzle_matrix[UP.X, UP.Y] / 10 == 7)
                         {
                              puzzle_matrix[UP.X, UP.Y] += SET;
                              UpdateButton(UP.X--, UP.Y);
                         }
                         else
                         {
                              if (puzzle_matrix[UP.X, UP.Y] / 10 == 6)
                                   go_down = true;
                              if (puzzle_matrix[UP.X, UP.Y] / 10 < 6)
                              {
                                   if (i == 0) puzzle_matrix[UP.X, UP.Y] += SET;
                              }
                              else
                              {
                                   puzzle_matrix[UP.X, UP.Y] += SET;
                              }
                              UpdateButton(UP.X, UP.Y);
                              UP.X = -1;
                         }
                    }

                    if (DOWN.X < puzzle_rows)
                    {
                         if (puzzle_matrix[DOWN.X, DOWN.Y] / 10 == 7)
                         {
                              puzzle_matrix[DOWN.X, DOWN.Y] += SET;
                              UpdateButton(DOWN.X++, DOWN.Y);
                         }
                         else
                         {
                              if (puzzle_matrix[DOWN.X, DOWN.Y] / 10 == 6)
                                   go_up = true;
                              if (puzzle_matrix[DOWN.X, DOWN.Y] / 10 < 6)
                              {
                                   if (i == 0) puzzle_matrix[DOWN.X, DOWN.Y] += SET;
                              }
                              else
                              {
                                   puzzle_matrix[DOWN.X, DOWN.Y] += SET;
                              }
                              UpdateButton(DOWN.X, DOWN.Y);
                              DOWN.X = puzzle_rows;
                         }
                    }

                    if (LEFT.Y > -1)
                    {
                         if (puzzle_matrix[LEFT.X, LEFT.Y] / 10 == 7)
                         {
                              puzzle_matrix[LEFT.X, LEFT.Y] += SET;
                              UpdateButton(LEFT.X, LEFT.Y--);
                         }
                         else
                         {
                              if (puzzle_matrix[LEFT.X, LEFT.Y] / 10 == 6)
                                   go_right = true;
                              if (puzzle_matrix[LEFT.X, LEFT.Y] / 10 < 6)
                              {
                                   if (i == 0) puzzle_matrix[LEFT.X, LEFT.Y] += SET;
                              }
                              else
                              {
                                   puzzle_matrix[LEFT.X, LEFT.Y] += SET;
                              }
                              UpdateButton(LEFT.X, LEFT.Y);
                              LEFT.Y = -1;
                         }
                    }

                    if (RIGHT.Y < puzzle_columns)
                    {
                         if (puzzle_matrix[RIGHT.X, RIGHT.Y] / 10 == 7)
                         {
                              puzzle_matrix[RIGHT.X, RIGHT.Y] += SET;
                              UpdateButton(RIGHT.X, RIGHT.Y++);
                         }
                         else
                         {
                              if (puzzle_matrix[RIGHT.X, RIGHT.Y] / 10 == 6)
                                   go_left = true;
                              if (puzzle_matrix[RIGHT.X, RIGHT.Y] / 10 < 6)
                              {
                                   if (i == 0) puzzle_matrix[RIGHT.X, RIGHT.Y] += SET;
                              }
                              else
                              {
                                   puzzle_matrix[RIGHT.X, RIGHT.Y] += SET;
                              }
                              UpdateButton(RIGHT.X, RIGHT.Y);
                              RIGHT.Y = puzzle_columns;
                         }
                    }
               }

               SET = -SET;

               if (go_up)
               {
                    UP = new Point(I - 1, J);
                    int i = 0;

                    while (UP.X > -1)
                    {
                         if (i == 0 && puzzle_matrix[UP.X, UP.Y] / 10 < 6)
                         {
                              break;
                         }

                         if (puzzle_matrix[UP.X, UP.Y] / 10 == 7)
                         {
                              puzzle_matrix[UP.X, UP.Y] += SET;
                              UpdateButton(UP.X--, UP.Y);
                         }
                         else
                         {
                              if (puzzle_matrix[UP.X, UP.Y] / 10 < 6)
                              {
                                   if (i++ == 0) puzzle_matrix[UP.X, UP.Y] += SET;
                              }
                              else
                              {
                                   puzzle_matrix[UP.X, UP.Y] += SET;
                              }
                              UpdateButton(UP.X, UP.Y);
                              UP.X = -1;
                         }
                    }
               }

               if (go_down)
               {
                    DOWN = new Point(I + 1, J);
                    int i = 0;

                    while (DOWN.X < puzzle_rows)
                    {
                         if (i == 0 && puzzle_matrix[DOWN.X, DOWN.Y] / 10 < 6)
                         {
                              break;
                         }

                         if (puzzle_matrix[DOWN.X, DOWN.Y] / 10 == 7)
                         {
                              puzzle_matrix[DOWN.X, DOWN.Y] += SET;
                              UpdateButton(DOWN.X++, DOWN.Y);
                         }
                         else
                         {
                              if (puzzle_matrix[DOWN.X, DOWN.Y] / 10 < 6)
                              {
                                   if (i++ == 0) puzzle_matrix[DOWN.X, DOWN.Y] += SET;
                              }
                              else
                              {
                                   puzzle_matrix[DOWN.X, DOWN.Y] += SET;
                              }
                              UpdateButton(DOWN.X, DOWN.Y);
                              DOWN.X = puzzle_rows;
                         }
                    }
               }

               if (go_left)
               {
                    LEFT = new Point(I, J - 1);
                    int i = 0;

                    while (LEFT.Y > -1)
                    {
                         if (i == 0 && puzzle_matrix[LEFT.X, LEFT.Y] / 10 < 6)
                         {
                              break;
                         }

                         if (puzzle_matrix[LEFT.X, LEFT.Y] / 10 == 7)
                         {
                              puzzle_matrix[LEFT.X, LEFT.Y] += SET;
                              UpdateButton(LEFT.X, LEFT.Y--);
                         }
                         else
                         {
                              if (puzzle_matrix[LEFT.X, LEFT.Y] / 10 < 6)
                              {
                                   if (i++ == 0) puzzle_matrix[LEFT.X, LEFT.Y] += SET;
                              }
                              else
                              {
                                   puzzle_matrix[LEFT.X, LEFT.Y] += SET;
                              }
                              UpdateButton(LEFT.X, LEFT.Y);
                              LEFT.Y = -1;
                         }
                    }
               }

               if (go_right)
               {
                    RIGHT = new Point(I, J + 1);
                    int i = 0;

                    while (RIGHT.Y < puzzle_columns)
                    {
                         if (i == 0 && puzzle_matrix[RIGHT.X, RIGHT.Y] / 10 < 6)
                         {
                              break;
                         }

                         if (puzzle_matrix[RIGHT.X, RIGHT.Y] / 10 == 7)
                         {
                              puzzle_matrix[RIGHT.X, RIGHT.Y] += SET;
                              UpdateButton(RIGHT.X, RIGHT.Y++);
                         }
                         else
                         {
                              if (puzzle_matrix[RIGHT.X, RIGHT.Y] / 10 < 6)
                              {
                                   if (i++ == 0) puzzle_matrix[RIGHT.X, RIGHT.Y] += SET;
                              }
                              else
                              {
                                   puzzle_matrix[RIGHT.X, RIGHT.Y] += SET;
                              }
                              UpdateButton(RIGHT.X, RIGHT.Y);
                              RIGHT.Y = puzzle_columns;
                         }
                    }
               }
          }
          
          private bool HasWon()
          {
               for (int i = 0; i < puzzle_rows; i++)
               {
                    for (int j = 0; j < puzzle_columns; j++)
                    {
                         if (puzzle_matrix[i, j] < 50 && puzzle_matrix[i, j] / 10 != puzzle_matrix[i, j] % 10)
                              return false;
                         else if (puzzle_matrix[i, j] == 70)
                              return false;
                         else if (puzzle_matrix[i, j] / 10 == 6 && puzzle_matrix[i, j] % 10 != 0)
                              return false;
                    }
               }

               return true;
          }

          private void ResetPuzzle()
          {
               for (int i = 0; i < puzzle_rows; i++)
               {
                    for (int j = 0; j < puzzle_columns; j++)
                    {
                         if (puzzle_matrix[i, j] / 10 == 6)
                         {
                              puzzle_matrix[i, j] = 70;
                         }
                         else
                         {
                              puzzle_matrix[i, j] = (puzzle_matrix[i, j] / 10) * 10;
                         }

                         UpdateButton(i, j);
                    }
               }
          }
          
          private int GetTime(string difficulty, string index)
          {
               XmlNode xmlNode = doc.SelectSingleNode("/Puzzles/" + difficulty + "/Puzzle[@index='" + index + "']");
               if (xmlNode == null)
               {
                    MessageBox.Show("Puzzle \"" + difficulty + " - " + index + "\" not found.", "Error");
                    Application.Exit();
                    return 0;
               }

               return Int32.Parse(xmlNode.Attributes["time"].Value);
          }

          private void SetTime(string difficulty, string index, int time)
          {
               XmlNode xmlNode = doc.SelectSingleNode("/Puzzles/" + difficulty + "/Puzzle[@index='" + index + "']");
               if (xmlNode == null)
               {
                    MessageBox.Show("Puzzle \"" + difficulty + " - " + index + "\" not found.", "Error");
                    Application.Exit();
                    return;
               }

               xmlNode.Attributes["time"].Value = time.ToString();

               doc.Save("puzzles.xml");
          }              
     }
}
