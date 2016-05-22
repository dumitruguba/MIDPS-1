using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;

namespace Akari
{

    public class MyButton : Button
    {
        public int _i, _j;

        public MyButton(int i, int j)
        {
            _i = i;
            _j = j;

            this.BackColor = Color.Black;
            this.Font = new Font("Tahoma", 10f, FontStyle.Bold);
			this.ForeColor = Color.DarkRed;
            this.FlatStyle = FlatStyle.Flat;
            this.FlatAppearance.MouseOverBackColor = Color.Black;
            this.FlatAppearance.MouseDownBackColor = Color.Black;
            this.FlatAppearance.BorderSize = 0;
        }
    }

     public partial class Form1 : Form
     {
         private void menu_button_Click(object sender, EventArgs e)
         {
             Button button = (Button)sender;
             menu_panel.Hide();
             difficulty = button.Text;
             LoadProblems();
             problems_panel.Show();
             back_to_menu.Show();
         }

         String difficulty;
         String problem_index;

         Button[,] btnArray;

         private void LoadProblems()
         {
             btnArray = new Button[4, 5];

             int contor = 0;

             if (difficulty == "Practice")
                 contor = practice_count;
             else if (difficulty == "Easy")
                 contor = easy_count;
             else if (difficulty == "Normal")
                 contor = normal_count;
             if (contor == 0)
                 return;

             for (int i = 0; i < 4; i++)
             {
                 for (int j = 0; j < 5; j++)
                 {
                     btnArray[i, j] = new Button();
                     btnArray[i, j].Size = new Size(30, 30);
                     problems_panel.Controls.Add(btnArray[i, j]);
                     btnArray[i, j].Click += new EventHandler(btnProblem_Click);
                     btnArray[i, j].FlatAppearance.BorderSize = 0;
                     btnArray[i, j].BackColor = Color.SteelBlue;
                     btnArray[i, j].FlatStyle = FlatStyle.Flat;
                     btnArray[i, j].FlatAppearance.MouseOverBackColor = Color.SteelBlue;
                     btnArray[i, j].FlatAppearance.MouseDownBackColor = Color.SteelBlue;
                     btnArray[i, j].Text = ((j+1) +(i*5)).ToString();
                     btnArray[i, j].Location = new Point(62 + j * 60, 80 + i * 60);

                     if (GetTime(difficulty, btnArray[i, j].Text) != 99999)
                     {
                         TimeSpan score_time = TimeSpan.FromSeconds(GetTime(difficulty, btnArray[i, j].Text));
                         new ToolTip().SetToolTip(btnArray[i, j], score_time.ToString(@"hh\:mm\:ss"));
                         btnArray[i, j].BackColor = Color.Orange;
                         btnArray[i, j].FlatAppearance.MouseOverBackColor = Color.Orange;
                         btnArray[i, j].FlatAppearance.MouseDownBackColor = Color.Orange;
                     }

                     if (--contor == 0) return;
                 }
             }
         }

         private void btnProblem_Click(object sender, EventArgs e)
         {
             Button button = (Button)sender;
             problems_panel.Hide();
             problem_index = button.Text;
             LoadPuzzle(difficulty, problem_index);
             LoadStage();
             back_to_problems.Show();
             reset_button.Show();
             undo_button.Show();
             timer1.Start();
             time_label.Show();
         }

         MyButton[,] btnStage;
         Label label;

         private void LoadStage()
         {
             stage_panel.Hide();

             btnStage = new MyButton[puzzle_rows, puzzle_columns];
             int x = 0, y = 0;

             if (difficulty == "Practice") { 
                 x = 117; 
                 y = 75; 
             }
             else if (difficulty == "Easy" || difficulty == "Normal") { 
                 x = 54; 
                 y = 32; 
             }

             label = new Label();

             label.BackColor = Color.DimGray;
             label.Location = new Point(x-4, y-4);
             label.Size = new Size(8 + 31 * puzzle_rows, 8 + 31 * puzzle_columns);

             stage_panel.Controls.Add(label);

             for (int i = 0; i < puzzle_rows; i++)
             {
                 for (int j = 0; j < puzzle_columns; j++)
                 {
                     btnStage[i, j] = new MyButton(i,j);
                     btnStage[i, j].Size = new Size(30, 30);
                     label.Controls.Add(btnStage[i, j]);
                     btnStage[i, j].Click += new EventHandler(btnGame_Click);
					 btnStage[i, j].MouseUp += new MouseEventHandler(btnGame_RightClick);
                     if (puzzle_matrix[i, j] >= 0 && puzzle_matrix[i, j] <= 49)
                     {
                         if (puzzle_matrix[i, j] / 10 == puzzle_matrix[i, j] % 10)
                            btnStage[i, j].ForeColor = Color.Orange;
                         else
                             btnStage[i, j].ForeColor = Color.White;

                         btnStage[i, j].Text = (puzzle_matrix[i, j] / 10).ToString();
                         btnStage[i, j].BackColor = Color.SteelBlue;
                         btnStage[i, j].FlatAppearance.MouseOverBackColor = Color.SteelBlue;
                         btnStage[i, j].FlatAppearance.MouseDownBackColor = Color.SteelBlue;
                     }

                     if (puzzle_matrix[i, j] >= 50 && puzzle_matrix[i, j] <= 59)
                     {
                         btnStage[i, j].Text = " ";
                         btnStage[i, j].BackColor = Color.SteelBlue;
                         btnStage[i, j].Enabled = false;
                     }

                     btnStage[i, j].Location = new Point(4 + j * 31, 4 + i * 31);
                 }
             }
             stage_panel.Show();
         }

         private void btnGame_Click(object sender, EventArgs e)
         {
             MyButton button = (MyButton)sender;

             if (button.Text == "•")
                 SetMove(button._i, button._j, 2);
             else
                 SetMove(button._i, button._j, 0);

             ClickOnButton(button._i, button._j);

             if (HasWon())
             {
                 if (time_contor < GetTime(difficulty, problem_index))
                     SetTime(difficulty, problem_index, time_contor);

                 timer1.Stop();

                 reset_button.Enabled = false;
                 undo_button.Enabled = false;

                 for (int i = 0; i < puzzle_rows; i++)
                 {
                     for (int j = 0; j < puzzle_columns; j++)
                     {
                         if (!(puzzle_matrix[i, j] >= 0 && puzzle_matrix[i, j] <= 49))
                             btnStage[i, j].Enabled = false;
                     }
                 }
             }
         }

         private void btnGame_RightClick(object sender, MouseEventArgs e)
         {
             MyButton button = (MyButton)sender;

             if (e.Button == MouseButtons.Right && puzzle_matrix[button._i, button._j] / 10 == 7)
             {
                 SetMove(button._i, button._j, 1);
                 SetPoint(button);
             }
         }

         private void SetPoint(MyButton button)
         {
             if (button.Text == "")
             {
                 button.Text = "•";
             }
             else if (button.Text == "•")
             {
                 button.Text = "";
             }
         }

         private void UpdateButton(int k, int p)
         {
             if (puzzle_matrix[k, p] / 10 == 6)
             {
				 btnStage[k, p].Text = "";
				 
                 if (puzzle_matrix[k, p] % 10 == 0)
                 {
                     btnStage[k, p].BackColor = Color.Orange;
                     btnStage[k, p].FlatAppearance.MouseOverBackColor = Color.Orange;
                     btnStage[k, p].FlatAppearance.MouseDownBackColor = Color.Orange;
                 }
                 else
                 {
                     btnStage[k, p].BackColor = Color.Red;
                     btnStage[k, p].FlatAppearance.MouseOverBackColor = Color.Red;
                     btnStage[k, p].FlatAppearance.MouseDownBackColor = Color.Red;
                 }
             }

             if (puzzle_matrix[k, p] > 70 && puzzle_matrix[k, p] <= 79)
             {
                 btnStage[k, p].BackColor = Color.Khaki;
                 btnStage[k, p].FlatAppearance.MouseOverBackColor = Color.Khaki;
                 btnStage[k, p].FlatAppearance.MouseDownBackColor = Color.Khaki;
             }

             else if (puzzle_matrix[k, p] >= 0 && puzzle_matrix[k, p] <= 49)
             {
                 if (puzzle_matrix[k, p] / 10 == puzzle_matrix[k, p] % 10)
                     btnStage[k, p].ForeColor = Color.Orange;
                 else
                     btnStage[k, p].ForeColor = Color.White;
             }

             else if (puzzle_matrix[k, p] == 70)
             {
                 btnStage[k, p].BackColor = Color.Black;
                 btnStage[k, p].FlatAppearance.MouseOverBackColor = Color.Black;
                 btnStage[k, p].FlatAppearance.MouseDownBackColor = Color.Black;
             }
         }

         private void back_to_menu_button_Click(object sender, EventArgs e)
         {
             for (int i = 0; i < 4; i++)
             {
                 for (int j = 0; j < 5; j++)
                 {
                     btnArray[i, j].Hide();
                 }
             }
             menu_panel.Show();
             back_to_menu.Hide();
         }

         private void back_to_problems_button_Click(object sender, EventArgs e)
         {
             label.Hide();
             problems_panel.Show();
             back_to_problems.Hide();
             reset_button.Enabled = true;
             reset_button.Hide();
             undo_button.Enabled = true;
             undo_button.Hide();
             time_label.Hide();
             time_label.Text = "00:00:00";
             time_contor = 0;

             if (!HasWon())
             {
                 timer1.Stop();
             }
             for (int i = 0; i < 4; i++)
             {
                 for (int j = 0; j < 5; j++)
                 {
                     if (GetTime(difficulty, btnArray[i, j].Text) != 99999)
                     {
                         TimeSpan score_time = TimeSpan.FromSeconds(GetTime(difficulty, btnArray[i, j].Text));
                         new ToolTip().SetToolTip(btnArray[i, j], score_time.ToString(@"hh\:mm\:ss"));
                         btnArray[i, j].BackColor = Color.Orange;
                         btnArray[i, j].FlatAppearance.MouseOverBackColor = Color.Orange;
                         btnArray[i, j].FlatAppearance.MouseDownBackColor = Color.Orange;
                     }
                 }
             }

         }

         private void reset_btn_Click(object sender, EventArgs e)
         {
             ResetPuzzle();
         }

         private void undo_btn_click(object sender, EventArgs e)
         {
             UndoMove();
         }

         int time_contor = 0;

         private void timer1_Tick(object sender, EventArgs e)
         {
             time_contor++;

             TimeSpan time = TimeSpan.FromSeconds(time_contor);
             time_label.Text = time.ToString(@"hh\:mm\:ss");
         }
     }
}
