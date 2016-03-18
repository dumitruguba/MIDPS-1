//---------------------------------------------------------------------------

#include <vcl.h> 
#include <stdio.h>
#pragma hdrstop

#include "Unit1.h"
#include "dos.h"
//---------------------------------------------------------------------------
#pragma package(smart_init)
#pragma resource "*.dfm"
TForm1 *Form1;       
struct date d;
struct time t;
int min=0, sec=0, zec=0;
//---------------------------------------------------------------------------
__fastcall TForm1::TForm1(TComponent* Owner)
        : TForm(Owner)
{
     Edit1->Text="";
     Edit2->Text="00 min 00 sec 0 zec";

     START->Enabled = true;
     STOP->Enabled = false;
     ZERO->Enabled = false;
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
     zec++;
     if(zec == 10){
         zec = 0;
         sec++;
     }
     if(sec == 60){
         sec = 0;
         min++;
     } 
     if(min == 100){
         min = 0;
     }

     char buf[20];
     sprintf(buf, "%02d min %02d sec %d zec", min, sec, zec);
     Edit2->Text=(AnsiString)buf;

}
//---------------------------------------------------------------------------

void __fastcall TForm1::STARTClick(TObject *Sender)
{
     Timer2->Enabled = true;
     START->Enabled = false;
     STOP->Enabled = true;
}
//---------------------------------------------------------------------------

void __fastcall TForm1::STOPClick(TObject *Sender)
{
     Timer2->Enabled = false;
     STOP->Enabled = false;
     ZERO->Enabled = true;
}
//---------------------------------------------------------------------------

void __fastcall TForm1::ZEROClick(TObject *Sender)
{    
     sec = 0;
     min = 0;
     zec = 0;

     ZERO->Enabled = false;
     START->Enabled = true;

     Edit2->Text="00 min 00 sec 0 zec"; 
}
//---------------------------------------------------------------------------

void __fastcall TForm1::ExitClick(TObject *Sender)
{
     Close();
}
//---------------------------------------------------------------------------

