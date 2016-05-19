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
     public partial class Form1 : Form
     {
          int[,] puzzle_matrix;
          int puzzle_columns;
          int puzzle_rows;

          int practice_count;
          int easy_count;
          int normal_count;

          public Form1()
          {
               InitializeComponent();
          }
     }
}
