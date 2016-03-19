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
          private bool equal_pressed = false;
          private string operation = string.Empty;

          [System.Runtime.InteropServices.DllImport("user32.dll")]
          static extern bool HideCaret(IntPtr hWnd);

          public Calculator()
          {
               InitializeComponent();
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
                    if (equal_pressed)
                    {
                         clear_everything();
                    }
                    textBox1.Text = button0.Text;
               }
               else if (textBox1.TextLength <= textBox1.MaxLength)
               {
                    textBox1.Text += button0.Text;
               }
          }

          private void button1_Click(object sender, EventArgs e)
          {
               if (input_new)
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
          }

          private void button2_Click(object sender, EventArgs e)
          {
               if (input_new)
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
          }

          private void button3_Click(object sender, EventArgs e)
          {
               if (input_new)
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
          }

          private void button4_Click(object sender, EventArgs e)
          {
               if (input_new)
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
          }

          private void button5_Click(object sender, EventArgs e)
          {
               if (input_new)
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
          }

          private void button6_Click(object sender, EventArgs e)
          {
               if (input_new)
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
          }

          private void button7_Click(object sender, EventArgs e)
          {
               if (input_new)
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
          }

          private void button8_Click(object sender, EventArgs e)
          {
               if (input_new)
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
          }

          private void button9_Click(object sender, EventArgs e)
          {
               if (input_new)
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
          }

          private void button_point_Click(object sender, EventArgs e)
          {
               if (!zecimal)
               {
                    if (input_new)
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
                         zecimal = false;
                    }

                    equal_pressed = false;
                    num2 = System.Double.Parse(textBox1.Text);
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
                         zecimal = false;
                    }

                    equal_pressed = false;
                    num2 = System.Double.Parse(textBox1.Text);
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
                         zecimal = false;
                    }

                    equal_pressed = false;
                    num2 = System.Double.Parse(textBox1.Text);
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
                         zecimal = false;
                    }

                    equal_pressed = false;
                    num2 = System.Double.Parse(textBox1.Text);
                    operation = "Division";
               }
          }

          private void button_pow_Click(object sender, EventArgs e)
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
                         zecimal = false;
                    }

                    equal_pressed = false;
                    num2 = System.Double.Parse(textBox1.Text);
                    operation = "Power";
               }

          }

          private void button_sqr_Click(object sender, EventArgs e)
          {
               if (textBox1.TextLength > 0)
               {
                    input_new = true;

                    num2 = System.Double.Parse(textBox1.Text);

                    operation = "SquareRoot";
                    Calculate();

                    num2 = System.Double.Parse(textBox1.Text);
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

                    case "Power":
                         num1 = System.Math.Pow(num1, num2);
                         break;

                    case "SquareRoot":
                         num1 = System.Math.Sqrt(num2);
                         operation = string.Empty;
                         break;
               }

               textBox1.Text = num1.ToString();
          }

          private void button_sign_Click(object sender, EventArgs e)
          {
               if (textBox1.TextLength > 0)
               {
                    if (!input_new)
                    {
                         if (textBox1.Text.StartsWith("-"))
                         {
                              textBox1.Text = textBox1.Text.Remove(0, 1);
                         }
                         else
                         {
                              textBox1.Text = "-" + textBox1.Text;
                         }
                    }
                    else
                    {
                         textBox1.Text = "0";
                    }
               }
          }

          private void button_equal_Click(object sender, EventArgs e)
          {
               if (textBox1.TextLength > 0)
               {
                    if (operation != string.Empty)
                    {
                         Calculate();
                         input_new = true;
                         zecimal = false;
                         equal_pressed = true;
                    }                    
               }
          }

          private void button_c_Click(object sender, EventArgs e)
          {
               clear_everything();
          }

          private void button_ce_Click(object sender, EventArgs e)
          {
               if (!input_new)
               {
                    textBox1.Text = "0";
               }
          }

          private void button_bckspc_Click(object sender, EventArgs e)
          {
               if (!input_new)
               {
                    if (textBox1.TextLength > 0)
                    {
                         textBox1.Text = textBox1.Text.Remove(textBox1.TextLength - 1);
                    }
               }
          }

          private void clear_everything()
          {
               textBox1.Text = string.Empty;
               operation = string.Empty;
               input_new = true;
               zecimal = false;
               equal_pressed = false;
          }

     }
}
