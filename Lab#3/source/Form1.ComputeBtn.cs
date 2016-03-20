using System;
using System.Windows.Forms;


namespace source
{
     public partial class Calculator : Form
     {
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
                    else if (equal_pressed)
                    {
                         num1 = System.Double.Parse(textBox1.Text);
                    }

                    if (textBox1.TextLength > 0)
                    {
                         num2 = System.Double.Parse(textBox1.Text);
                    }
                    equal_pressed = false;
                    operation = "Plus";
               }
               this.ActiveControl = label1;
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
                    else if (equal_pressed)
                    {
                         num1 = System.Double.Parse(textBox1.Text);
                    }

                    if (textBox1.TextLength > 0)
                    {
                         num2 = System.Double.Parse(textBox1.Text);
                    }
                    equal_pressed = false;
                    operation = "Minus";
               }
               this.ActiveControl = label1;
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
                    else if (equal_pressed)
                    {
                         num1 = System.Double.Parse(textBox1.Text);
                    }

                    if (textBox1.TextLength > 0)
                    {
                         num2 = System.Double.Parse(textBox1.Text);
                    }
                    equal_pressed = false;
                    operation = "Multiply";
               }
               this.ActiveControl = label1;
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
                    else if (equal_pressed)
                    {
                         num1 = System.Double.Parse(textBox1.Text);
                    }
                    
                    if (textBox1.TextLength > 0)
                    {
                         num2 = System.Double.Parse(textBox1.Text);
                    }
                    equal_pressed = false;
                    operation = "Division";
               }
               this.ActiveControl = label1;
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

                    if (textBox1.TextLength > 0)
                    {
                         num2 = System.Double.Parse(textBox1.Text);
                    }
                    equal_pressed = false;
                    operation = "Power";
               }
               this.ActiveControl = label1;
          }

          private void button_sqr_Click(object sender, EventArgs e)
          {
               if (textBox1.TextLength > 0)
               {
                    input_new = true;

                    num2 = System.Double.Parse(textBox1.Text);

                    operation = "SquareRoot";
                    Calculate();

                    if (textBox1.TextLength > 0)
                    {
                         num2 = System.Double.Parse(textBox1.Text);
                    }
               }
               this.ActiveControl = label1;
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
               this.ActiveControl = label1;
          }

          private void Calculate()
          {
               if (!input_new && textBox1.TextLength > 0)
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
                         if (num2 == 0)
                         {
                              num1 = num2;
                              clear_everything();
                              return;
                         }
                         num1 /= num2;
                         break;

                    case "Power":
                         num1 = System.Math.Pow(num1, num2);
                         break;

                    case "SquareRoot":
                         if (num2 < 0)
                         {
                              clear_everything();
                              return;
                         }
                         num1 = System.Math.Sqrt(num2);
                         operation = string.Empty;
                         break;
               }

               textBox1.Text = num1.ToString();
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
               this.ActiveControl = label1;
          }

          private void button_c_Click(object sender, EventArgs e)
          {
               clear_everything();
               this.ActiveControl = label1;
          }

          private void button_ce_Click(object sender, EventArgs e)
          {
               if (!input_new)
               {
                    textBox1.Text = "0";
               }
               this.ActiveControl = label1;
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
