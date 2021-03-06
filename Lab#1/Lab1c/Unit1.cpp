//---------------------------------------------------------------------------

#include <vcl.h>
#include <stdio.h>
#pragma hdrstop

#include "Unit1.h"
#include "dos.h"
//---------------------------------------------------------------------------
#pragma package(smart_init)
#pragma link "PERFGRAP"
#pragma resource "*.dfm"
TForm1 *Form1;
struct date d;
struct time t;
int xCurr, yCurr;
TRect rect, init, fin;
//---------------------------------------------------------------------------
__fastcall TForm1::TForm1(TComponent* Owner): TForm(Owner)
{
     Stop->Enabled = false;
     Start->Enabled = true;
     xCurr = PaintBox1->Width-10;
     yCurr = PaintBox1->Height/2;
     PaintBox1->Canvas->MoveTo(xCurr, yCurr);
}
//---------------------------------------------------------------------------
void __fastcall TForm1::Timer1Timer(TObject *Sender)
{
     char buf[20];
     getdate(&d);
     gettime(&t);
     sprintf(buf, "%02d-%02d-%4d %02d:%02d:%02d", d.da_day, d.da_mon, d.da_year,
                  t.ti_hour, t.ti_min, t.ti_sec);
     Edit1->Text=(AnsiString)buf;
}
//---------------------------------------------------------------------------
void __fastcall TForm1::Timer2Timer(TObject *Sender)
{
     Panel1->Height = rand() % Panel2->Height;
     yCurr = PaintBox1->Height/3 + rand() % PaintBox1->Height/3;


     PaintBox1->Canvas->Pen->Color = clRed;
     PaintBox1->Canvas->LineTo(xCurr+2, yCurr);
     PaintBox1->Canvas->MoveTo(xCurr, yCurr);

     init = Rect(3, 0, PaintBox1->Width-1, PaintBox1->Height);
     fin = Rect(1, 0, PaintBox1->Width-3, PaintBox1->Height);
     PaintBox1->Canvas->CopyRect(fin, PaintBox1->Canvas, init);

      
     init = Rect(1, 1, 9, 9);
     for(int i=0; i<18; i++){
         fin = Rect(1, 1+8*i, 9, 9+8*i);
         PaintBox1->Canvas->CopyRect(fin, PaintBox1->Canvas, init);
     }


     init = Rect(1, 0, 8, PaintBox1->Height);
     fin = Rect(PaintBox1->Width-8, 0, PaintBox1->Width-1, PaintBox1->Height);
     PaintBox1->Canvas->CopyRect(fin, PaintBox1->Canvas, init);

}
//---------------------------------------------------------------------------
void __fastcall TForm1::StartClick(TObject *Sender)
{
     Timer2->Enabled = true;
     Stop->Enabled = true;
     Start->Enabled = false;
}
//---------------------------------------------------------------------------
void __fastcall TForm1::PaintBox1Paint(TObject *Sender)
{
     rect = Rect(0, 0, PaintBox1->Width, PaintBox1->Height);

     PaintBox1->Canvas->Pen->Color = clBlack;
     PaintBox1->Canvas->Brush->Color = clBtnFace;
     PaintBox1->Canvas->Rectangle(rect);
     PaintBox1->Canvas->Brush->Color = clSilver;
     PaintBox1->Canvas->Brush->Style = bsCross;
     PaintBox1->Canvas->FloodFill(2, 2, clBlack, fsBorder);
}
//---------------------------------------------------------------------------

void __fastcall TForm1::ExitClick(TObject *Sender)
{
     Close();
}
//---------------------------------------------------------------------------

void __fastcall TForm1::StopClick(TObject *Sender)
{
     Timer2->Enabled = false;
     Stop->Enabled = false;
     Start->Enabled = true;

     Panel1->Height = Panel2->Height;
}
//---------------------------------------------------------------------------


