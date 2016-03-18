//---------------------------------------------------------------------------

#include <vcl.h>
#pragma hdrstop

#include "Unit1.h"
//---------------------------------------------------------------------------
#pragma package(smart_init)
#pragma resource "*.dfm"
TForm1 *Form1;
int i=0;
//---------------------------------------------------------------------------
__fastcall TForm1::TForm1(TComponent* Owner)
        : TForm(Owner)
{
        Edit1->Text="0";
}
//---------------------------------------------------------------------------
void __fastcall TForm1::UPClick(TObject *Sender)
{
     Edit1->Text=++i;
     Label2->Caption="i creste in Edit1";
}
//---------------------------------------------------------------------------
void __fastcall TForm1::DOWNClick(TObject *Sender)
{
     Edit1->Text=--i;
     Label2->Caption="i scade in Edit1";
}
//---------------------------------------------------------------------------
void __fastcall TForm1::ExitClick(TObject *Sender)
{
     Close();
}
//---------------------------------------------------------------------------

