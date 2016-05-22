namespace Akari
{
     partial class Form1
     {
          /// <summary>
          /// Required designer variable.
          /// </summary>
          private System.ComponentModel.IContainer components = null;

          /// <summary>
          /// Clean up any resources being used.
          /// </summary>
          /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
          protected override void Dispose(bool disposing)
          {
               if (disposing && (components != null))
               {
                    components.Dispose();
               }
               base.Dispose(disposing);
          }

          #region Windows Form Designer generated code

          /// <summary>
          /// Required method for Designer support - do not modify
          /// the contents of this method with the code editor.
          /// </summary>
          private void InitializeComponent()
          {
            this.components = new System.ComponentModel.Container();
            this.menu_panel = new System.Windows.Forms.Panel();
            this.button3 = new System.Windows.Forms.Button();
            this.button2 = new System.Windows.Forms.Button();
            this.button1 = new System.Windows.Forms.Button();
            this.problems_panel = new System.Windows.Forms.Panel();
            this.back_to_menu = new System.Windows.Forms.Button();
            this.stage_panel = new System.Windows.Forms.Panel();
            this.undo_button = new System.Windows.Forms.Button();
            this.reset_button = new System.Windows.Forms.Button();
            this.time_label = new System.Windows.Forms.Label();
            this.back_to_problems = new System.Windows.Forms.Button();
            this.timer1 = new System.Windows.Forms.Timer(this.components);
            this.menu_panel.SuspendLayout();
            this.problems_panel.SuspendLayout();
            this.stage_panel.SuspendLayout();
            this.SuspendLayout();
            // 
            // menu_panel
            // 
            this.menu_panel.Controls.Add(this.button3);
            this.menu_panel.Controls.Add(this.button2);
            this.menu_panel.Controls.Add(this.button1);
            this.menu_panel.Location = new System.Drawing.Point(97, 65);
            this.menu_panel.Name = "menu_panel";
            this.menu_panel.Size = new System.Drawing.Size(200, 250);
            this.menu_panel.TabIndex = 0;
            // 
            // button3
            // 
            this.button3.FlatAppearance.BorderSize = 0;
            this.button3.FlatAppearance.MouseOverBackColor = System.Drawing.Color.LightGray;
            this.button3.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.button3.Font = new System.Drawing.Font("Microsoft Sans Serif", 10F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(204)));
            this.button3.Location = new System.Drawing.Point(63, 157);
            this.button3.Name = "button3";
            this.button3.Size = new System.Drawing.Size(75, 30);
            this.button3.TabIndex = 2;
            this.button3.Text = "Normal";
            this.button3.UseVisualStyleBackColor = true;
            this.button3.Click += new System.EventHandler(this.menu_button_Click);
            // 
            // button2
            // 
            this.button2.FlatAppearance.BorderSize = 0;
            this.button2.FlatAppearance.MouseOverBackColor = System.Drawing.Color.LightGray;
            this.button2.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.button2.Font = new System.Drawing.Font("Microsoft Sans Serif", 10F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(204)));
            this.button2.Location = new System.Drawing.Point(63, 106);
            this.button2.Name = "button2";
            this.button2.Size = new System.Drawing.Size(75, 30);
            this.button2.TabIndex = 1;
            this.button2.Text = "Easy";
            this.button2.UseVisualStyleBackColor = true;
            this.button2.Click += new System.EventHandler(this.menu_button_Click);
            // 
            // button1
            // 
            this.button1.FlatAppearance.BorderSize = 0;
            this.button1.FlatAppearance.MouseOverBackColor = System.Drawing.Color.LightGray;
            this.button1.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.button1.Font = new System.Drawing.Font("Microsoft Sans Serif", 10F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(204)));
            this.button1.Location = new System.Drawing.Point(63, 55);
            this.button1.Name = "button1";
            this.button1.Size = new System.Drawing.Size(75, 30);
            this.button1.TabIndex = 0;
            this.button1.Text = "Practice";
            this.button1.UseVisualStyleBackColor = true;
            this.button1.Click += new System.EventHandler(this.menu_button_Click);
            // 
            // problems_panel
            // 
            this.problems_panel.Controls.Add(this.back_to_menu);
            this.problems_panel.Controls.Add(this.menu_panel);
            this.problems_panel.Location = new System.Drawing.Point(11, 11);
            this.problems_panel.Name = "problems_panel";
            this.problems_panel.Size = new System.Drawing.Size(401, 372);
            this.problems_panel.TabIndex = 1;
            // 
            // back_to_menu
            // 
            this.back_to_menu.FlatAppearance.BorderSize = 0;
            this.back_to_menu.FlatAppearance.MouseOverBackColor = System.Drawing.Color.LightGray;
            this.back_to_menu.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.back_to_menu.Font = new System.Drawing.Font("Microsoft Sans Serif", 10F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(204)));
            this.back_to_menu.Location = new System.Drawing.Point(18, 319);
            this.back_to_menu.Name = "back_to_menu";
            this.back_to_menu.Size = new System.Drawing.Size(75, 30);
            this.back_to_menu.TabIndex = 3;
            this.back_to_menu.Text = "Back";
            this.back_to_menu.UseVisualStyleBackColor = true;
            this.back_to_menu.Click += new System.EventHandler(this.back_to_menu_button_Click);
            // 
            // stage_panel
            // 
            this.stage_panel.Controls.Add(this.undo_button);
            this.stage_panel.Controls.Add(this.reset_button);
            this.stage_panel.Controls.Add(this.time_label);
            this.stage_panel.Controls.Add(this.back_to_problems);
            this.stage_panel.Controls.Add(this.problems_panel);
            this.stage_panel.Location = new System.Drawing.Point(1, 1);
            this.stage_panel.Name = "stage_panel";
            this.stage_panel.Size = new System.Drawing.Size(424, 395);
            this.stage_panel.TabIndex = 2;
            // 
            // undo_button
            // 
            this.undo_button.FlatAppearance.BorderSize = 0;
            this.undo_button.FlatAppearance.MouseOverBackColor = System.Drawing.Color.LightGray;
            this.undo_button.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.undo_button.Font = new System.Drawing.Font("Microsoft Sans Serif", 10F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(204)));
            this.undo_button.Location = new System.Drawing.Point(171, 353);
            this.undo_button.Name = "undo_button";
            this.undo_button.Size = new System.Drawing.Size(75, 30);
            this.undo_button.TabIndex = 7;
            this.undo_button.Text = "Undo";
            this.undo_button.UseVisualStyleBackColor = true;
            this.undo_button.Click += new System.EventHandler(this.undo_btn_click);
            // 
            // reset_button
            // 
            this.reset_button.FlatAppearance.BorderSize = 0;
            this.reset_button.FlatAppearance.MouseOverBackColor = System.Drawing.Color.LightGray;
            this.reset_button.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.reset_button.Font = new System.Drawing.Font("Microsoft Sans Serif", 10F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(204)));
            this.reset_button.Location = new System.Drawing.Point(337, 353);
            this.reset_button.Name = "reset_button";
            this.reset_button.Size = new System.Drawing.Size(75, 30);
            this.reset_button.TabIndex = 6;
            this.reset_button.Text = "Reset";
            this.reset_button.UseVisualStyleBackColor = true;
            this.reset_button.Click += new System.EventHandler(this.reset_btn_Click);
            // 
            // time_label
            // 
            this.time_label.AutoSize = true;
            this.time_label.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(204)));
            this.time_label.ForeColor = System.Drawing.Color.SteelBlue;
            this.time_label.Location = new System.Drawing.Point(167, 8);
            this.time_label.Name = "time_label";
            this.time_label.Size = new System.Drawing.Size(79, 20);
            this.time_label.TabIndex = 5;
            this.time_label.Text = "00:00:00";
            // 
            // back_to_problems
            // 
            this.back_to_problems.FlatAppearance.BorderSize = 0;
            this.back_to_problems.FlatAppearance.MouseOverBackColor = System.Drawing.Color.LightGray;
            this.back_to_problems.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.back_to_problems.Font = new System.Drawing.Font("Microsoft Sans Serif", 10F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(204)));
            this.back_to_problems.Location = new System.Drawing.Point(11, 353);
            this.back_to_problems.Name = "back_to_problems";
            this.back_to_problems.Size = new System.Drawing.Size(75, 30);
            this.back_to_problems.TabIndex = 4;
            this.back_to_problems.Text = "Back";
            this.back_to_problems.UseVisualStyleBackColor = true;
            this.back_to_problems.Click += new System.EventHandler(this.back_to_problems_button_Click);
            // 
            // timer1
            // 
            this.timer1.Interval = 1000;
            this.timer1.Tick += new System.EventHandler(this.timer1_Tick);
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(425, 396);
            this.Controls.Add(this.stage_panel);
            this.Name = "Form1";
            this.Text = "Form1";
            this.Load += new System.EventHandler(this.Form1_Load);
            this.menu_panel.ResumeLayout(false);
            this.problems_panel.ResumeLayout(false);
            this.stage_panel.ResumeLayout(false);
            this.stage_panel.PerformLayout();
            this.ResumeLayout(false);

          }

          #endregion

          private System.Windows.Forms.Panel menu_panel;
          private System.Windows.Forms.Button button3;
          private System.Windows.Forms.Button button2;
          private System.Windows.Forms.Button button1;
          private System.Windows.Forms.Panel problems_panel;
          private System.Windows.Forms.Panel stage_panel;
          private System.Windows.Forms.Button back_to_menu;
          private System.Windows.Forms.Button back_to_problems;
          private System.Windows.Forms.Timer timer1;
          private System.Windows.Forms.Label time_label;
          private System.Windows.Forms.Button reset_button;
          private System.Windows.Forms.Button undo_button;


     }
}

