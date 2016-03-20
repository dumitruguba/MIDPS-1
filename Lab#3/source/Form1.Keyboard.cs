using System;
using System.Windows.Forms;


namespace source
{
     public partial class Calculator : Form
     {
          private void Calculator_KeyDown(object sender, KeyEventArgs e)
          {
               switch (e.KeyCode)
               {
                    case Keys.NumPad0:
                         button0.PerformClick();
                         break;

                    case Keys.NumPad1:
                         button1.PerformClick();
                         break;

                    case Keys.NumPad2:
                         button2.PerformClick();
                         break;

                    case Keys.NumPad3:
                         button3.PerformClick();
                         break;

                    case Keys.NumPad4:
                         button4.PerformClick();
                         break;

                    case Keys.NumPad5:
                         button5.PerformClick();
                         break;

                    case Keys.NumPad6:
                         button6.PerformClick();
                         break;

                    case Keys.NumPad7:
                         button7.PerformClick();
                         break;

                    case Keys.NumPad8:
                         button8.PerformClick();
                         break;

                    case Keys.NumPad9:
                         button9.PerformClick();
                         break;

                    case Keys.Add:
                         button_plus.PerformClick();
                         break;

                    case Keys.Subtract:
                         button_minus.PerformClick();
                         break;

                    case Keys.Divide:
                         button_div.PerformClick();
                         break;

                    case Keys.Multiply:
                         button_mul.PerformClick();
                         break;

                    case Keys.Enter:
                         button_equal.PerformClick();
                         break;

                    case Keys.P:
                         button_pow.PerformClick();
                         break;

                    case Keys.S:
                         button_sqr.PerformClick();
                         break;

                    case Keys.Back:
                         button_bckspc.PerformClick();
                         break;

                    case Keys.Escape:
                         button_c.PerformClick();
                         break;

                    case Keys.Delete:
                         button_ce.PerformClick();
                         break;

                    case Keys.M:
                         button_sign.PerformClick();
                         break;
               }       
          }
     }
}
