using System;
using System.Media;
using System.Windows.Forms;

namespace source
{
     public partial class Calculator : Form
     {
          private void button0_Click(object sender, EventArgs e)
          {
               if (input_new || textBox1.Text == "0")
               {
                    if (equal_pressed)
                    {
                         clear_everything();
                    }

                    if (textBox1.Text == "0")
                    {
                         SystemSounds.Beep.Play();
                    }

                    textBox1.Text = button0.Text;
                    input_new = false;
               }
               else if (textBox1.TextLength <= textBox1.MaxLength)
               {
                    textBox1.Text += button0.Text;
               }
               else
               {
                    SystemSounds.Beep.Play();
               }

               this.ActiveControl = label1;
          }

          private void button1_Click(object sender, EventArgs e)
          {
               if (input_new || textBox1.Text == "0")
               {
                    if (equal_pressed)
                    {
                         clear_everything();
                    }
                    textBox1.Text = button1.Text;
                    input_new = false;
               }
               else if (textBox1.TextLength <= textBox1.MaxLength)
               {
                    textBox1.Text += button1.Text;
               }
               else
               {
                    SystemSounds.Beep.Play();
               }

               this.ActiveControl = label1;
          }

          private void button2_Click(object sender, EventArgs e)
          {
               if (input_new || textBox1.Text == "0")
               {
                    if (equal_pressed)
                    {
                         clear_everything();
                    }
                    textBox1.Text = button2.Text;
                    input_new = false;
               }
               else if (textBox1.TextLength <= textBox1.MaxLength)
               {
                    textBox1.Text += button2.Text;
               }
               else
               {
                    SystemSounds.Beep.Play();
               }

               this.ActiveControl = label1;
          }

          private void button3_Click(object sender, EventArgs e)
          {
               if (input_new || textBox1.Text == "0")
               {
                    if (equal_pressed)
                    {
                         clear_everything();
                    }
                    textBox1.Text = button3.Text;
                    input_new = false;
               }
               else if (textBox1.TextLength <= textBox1.MaxLength)
               {
                    textBox1.Text += button3.Text;
               }
               else
               {
                    SystemSounds.Beep.Play();
               }

               this.ActiveControl = label1;
          }

          private void button4_Click(object sender, EventArgs e)
          {
               if (input_new || textBox1.Text == "0")
               {
                    if (equal_pressed)
                    {
                         clear_everything();
                    }
                    textBox1.Text = button4.Text;
                    input_new = false;
               }
               else if (textBox1.TextLength <= textBox1.MaxLength)
               {
                    textBox1.Text += button4.Text;
               }
               else
               {
                    SystemSounds.Beep.Play();
               }

               this.ActiveControl = label1;
          }

          private void button5_Click(object sender, EventArgs e)
          {
               if (input_new || textBox1.Text == "0")
               {
                    if (equal_pressed)
                    {
                         clear_everything();
                    }
                    textBox1.Text = button5.Text;
                    input_new = false;
               }
               else if (textBox1.TextLength <= textBox1.MaxLength)
               {
                    textBox1.Text += button5.Text;
               }
               else
               {
                    SystemSounds.Beep.Play();
               }

               this.ActiveControl = label1;
          }

          private void button6_Click(object sender, EventArgs e)
          {
               if (input_new || textBox1.Text == "0")
               {
                    if (equal_pressed)
                    {
                         clear_everything();
                    }
                    textBox1.Text = button6.Text;
                    input_new = false;
               }
               else if (textBox1.TextLength <= textBox1.MaxLength)
               {
                    textBox1.Text += button6.Text;
               }
               else
               {
                    SystemSounds.Beep.Play();
               }

               this.ActiveControl = label1;
          }

          private void button7_Click(object sender, EventArgs e)
          {
               if (input_new || textBox1.Text == "0")
               {
                    if (equal_pressed)
                    {
                         clear_everything();
                    }
                    textBox1.Text = button7.Text;
                    input_new = false;
               }
               else if (textBox1.TextLength <= textBox1.MaxLength)
               {
                    textBox1.Text += button7.Text;
               }
               else
               {
                    SystemSounds.Beep.Play();
               }

               this.ActiveControl = label1;
          }

          private void button8_Click(object sender, EventArgs e)
          {
               if (input_new || textBox1.Text == "0")
               {
                    if (equal_pressed)
                    {
                         clear_everything();
                    }
                    textBox1.Text = button8.Text;
                    input_new = false;
               }
               else if (textBox1.TextLength <= textBox1.MaxLength)
               {
                    textBox1.Text += button8.Text;
               }
               else
               {
                    SystemSounds.Beep.Play();
               }

               this.ActiveControl = label1;
          }

          private void button9_Click(object sender, EventArgs e)
          {
               if (input_new || textBox1.Text == "0")
               {
                    if (equal_pressed)
                    {
                         clear_everything();
                    }
                    textBox1.Text = button9.Text;
                    input_new = false;
               }
               else if (textBox1.TextLength <= textBox1.MaxLength)
               {
                    textBox1.Text += button9.Text;
               }
               else
               {
                    SystemSounds.Beep.Play();
               }

               this.ActiveControl = label1;
          }

          private void button_point_Click(object sender, EventArgs e)
          {
               if (!zecimal)
               {
                    if (input_new || textBox1.Text == "0")
                    {
                         if (equal_pressed)
                         {
                              clear_everything();
                         }
                         textBox1.Text = "0,";
                         zecimal = true;
                         input_new = false;
                    }
                    else if (textBox1.TextLength > 0 && textBox1.TextLength < 32 && textBox1.Text != "0")
                    {
                         textBox1.Text += button_point.Text;
                         zecimal = true;
                    }
               }
               else
               {
                    SystemSounds.Beep.Play();
               }

               this.ActiveControl = label1;
          }

          private void button_sign_Click(object sender, EventArgs e)
          {
               if (textBox1.TextLength > 0)
               {
                    if (textBox1.Text.StartsWith("-"))
                    {
                         textBox1.Text = textBox1.Text.Remove(0, 1);
                    }
                    else
                    {
                         textBox1.Text = "-" + textBox1.Text;
                    }

                    if (!equal_pressed)
                    {
                         input_new = false;
                    }
               }

               this.ActiveControl = label1;
          }
     }
}
