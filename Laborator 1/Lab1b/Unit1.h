//---------------------------------------------------------------------------

#ifndef Unit1H
#define Unit1H
//---------------------------------------------------------------------------
#include <Classes.hpp>
#include <Controls.hpp>
#include <StdCtrls.hpp>
#include <Forms.hpp>
#include <ExtCtrls.hpp>
//---------------------------------------------------------------------------
class TForm1 : public TForm
{
__published:	// IDE-managed Components
        TLabel *Label1;
        TLabel *Label2;
        TTimer *Timer1;
        TTimer *Timer2;
        TButton *START;
        TButton *STOP;
        TButton *ZERO;
        TButton *Exit;
        TEdit *Edit1;
        TEdit *Edit2;
        void __fastcall Timer1Timer(TObject *Sender);
        void __fastcall Timer2Timer(TObject *Sender);
        void __fastcall STARTClick(TObject *Sender);
        void __fastcall STOPClick(TObject *Sender);
        void __fastcall ZEROClick(TObject *Sender);
        void __fastcall ExitClick(TObject *Sender);
private:	// User declarations
public:		// User declarations
        __fastcall TForm1(TComponent* Owner);
};
//---------------------------------------------------------------------------
extern PACKAGE TForm1 *Form1;
//---------------------------------------------------------------------------
#endif
