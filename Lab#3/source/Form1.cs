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

          private void Calculator_Load(object sender, EventArgs e)
          {
               this.ActiveControl = label1;
               foreach (Control control in this.Controls)
               {
                    control.PreviewKeyDown += new PreviewKeyDownEventHandler(control_PreviewKeyDown);
               }
          }

          void control_PreviewKeyDown(object sender, PreviewKeyDownEventArgs e)
          {
               switch(e.KeyCode)
               {
                    case Keys.Up:
                    case Keys.Down:
                    case Keys.Left:
                    case Keys.Right:
                         e.IsInputKey = true;
                         break;
                    default:
                         break;
               }

          }
     }
}
