using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;

namespace source
{
     public partial class Calculator : Form
     {
          private double num1, num2;
          private bool input_new = true;
          private bool zecimal = false;
          private string operation = string.Empty;

          [System.Runtime.InteropServices.DllImport("user32.dll")]
          static extern bool HideCaret(IntPtr hWnd);

          public Calculator()
          {
               InitializeComponent();
               this.ActiveControl = label1;
               HideCaret(textBox1.Handle);

          }

          private void textBox1_TextChanged(object sender, EventArgs e)
          {
               HideCaret(textBox1.Handle);
          }

          private void button0_Click(object sender, EventArgs e)
          {
               if (input_new)
               {
                    textBox1.Text = button0.Text;
               }
               else if (textBox1.TextLength < 32)
               {
                    textBox1.Text += button0.Text;
               }
          }

          private void button1_Click(object sender, EventArgs e)
          {
               if (input_new)
               {
                    textBox1.Text = button1.Text;
                    input_new = false;
               }
               else if (textBox1.TextLength < 32)
               {
                    textBox1.Text += button1.Text;
               }
          }

          private void button2_Click(object sender, EventArgs e)
          {
               if (input_new)
               {
                    textBox1.Text = button2.Text;
                    input_new = false;
               }
               else if (textBox1.TextLength < 32)
               {
                    textBox1.Text += button2.Text;
               }
          }

          private void button3_Click(object sender, EventArgs e)
          {
               if (input_new)
               {
                    textBox1.Text = button3.Text;
                    input_new = false;
               }
               else if (textBox1.TextLength < 32)
               {
                    textBox1.Text += button3.Text;
               }
          }

          private void button4_Click(object sender, EventArgs e)
          {
               if (input_new)
               {
                    textBox1.Text = button4.Text;
                    input_new = false;
               }
               else if (textBox1.TextLength < 32)
               {
                    textBox1.Text += button4.Text;
               }
          }

          private void button5_Click(object sender, EventArgs e)
          {
               if (input_new)
               {
                    textBox1.Text = button5.Text;
                    input_new = false;
               }
               else if (textBox1.TextLength < 32)
               {
                    textBox1.Text += button5.Text;
               }
          }

          private void button6_Click(object sender, EventArgs e)
          {
               if (input_new)
               {
                    textBox1.Text = button6.Text;
                    input_new = false;
               }
               else if (textBox1.TextLength < 32)
               {
                    textBox1.Text += button6.Text;
               }
          }

          private void button7_Click(object sender, EventArgs e)
          {
               if (input_new)
               {
                    textBox1.Text = button7.Text;
                    input_new = false;
               }
               else if (textBox1.TextLength < 32)
               {
                    textBox1.Text += button7.Text;
               }
          }

          private void button8_Click(object sender, EventArgs e)
          {
               if (input_new)
               {
                    textBox1.Text = button8.Text;
                    input_new = false;
               }
               else if(textBox1.TextLength<32)
               {
                    textBox1.Text += button8.Text;
               }
          }

          private void button9_Click(object sender, EventArgs e)
          {
               if (input_new)
               {
                    textBox1.Text = button9.Text;
                    input_new = false;
               }
               else if(textBox1.TextLength<32)
               {
                    textBox1.Text += button9.Text;
               }
          }

          private void button_point_Click(object sender, EventArgs e)
          {
               if (!zecimal)
               {
                    if (textBox1.TextLength > 0 && textBox1.TextLength < 32 && textBox1.Text != "0")
                    {
                         textBox1.Text += button_point.Text;
                         zecimal = true;
                    }
                    else if (input_new)
                    {
                         textBox1.Text = "0,";
                         zecimal = true;
                         input_new = false;
                    }
               }
          }

          private void button_plus_Click(object sender, EventArgs e)
          {
               if (textBox1.TextLength > 0)
               {
                    if (!input_new)
                    {
                         if (operation == string.Empty)
                         {
                              num1 = System.Double.Parse(textBox1.Text);
                         }
                         else
                         {
                              Calculate();
                         }

                         input_new = true;
                    }

                    operation = "Plus";
               }
          }

          private void button_minus_Click(object sender, EventArgs e)
          {
               if (textBox1.TextLength > 0)
               {
                    if (!input_new)
                    {
                         if (operation == string.Empty)
                         {
                              num1 = System.Double.Parse(textBox1.Text);
                         }
                         else
                         {
                              Calculate();
                         }

                         input_new = true;
                    }

                    operation = "Minus";
               }
          }

          private void button_mul_Click(object sender, EventArgs e)
          {
               if (textBox1.TextLength > 0)
               {
                    if (!input_new)
                    {
                         if (operation == string.Empty)
                         {
                              num1 = System.Double.Parse(textBox1.Text);
                         }
                         else
                         {
                              Calculate();
                         }

                         input_new = true;
                    }

                    operation = "Multiply";
               }

          }

          private void button_div_Click(object sender, EventArgs e)
          {
               if (textBox1.TextLength > 0)
               {
                    if (!input_new)
                    {
                         if (operation == string.Empty)
                         {
                              num1 = System.Double.Parse(textBox1.Text);
                         }
                         else
                         {
                              Calculate();
                         }

                         input_new = true;
                    }

                    operation = "Division";
               }
          }

          private void Calculate()
          {
               if (!input_new)
               {
                    num2 = System.Double.Parse(textBox1.Text);
               }

               switch (operation)
               {
                    case "Plus":
                         num1 += num2;
                         break;

                    case "Minus":
                         num1 -= num2;
                         break;

                    case "Multiply":
                         num1 *= num2;
                         break;

                    case "Division":
                         num1 /= num2;
                         break;
               }

               textBox1.Text = num1.ToString();
          }

     }
}
