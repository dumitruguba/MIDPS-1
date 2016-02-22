object Form1: TForm1
  Left = 251
  Top = 114
  Width = 408
  Height = 374
  Hint = 'Form1'
  Caption = 'MIDPS 1-B'
  Color = clBtnFace
  Font.Charset = DEFAULT_CHARSET
  Font.Color = clWindowText
  Font.Height = -11
  Font.Name = 'MS Sans Serif'
  Font.Style = []
  OldCreateOrder = False
  ShowHint = True
  PixelsPerInch = 96
  TextHeight = 13
  object Label1: TLabel
    Left = 80
    Top = 24
    Width = 243
    Height = 13
    Hint = 'Titlu'
    Caption = 'Realizarea unui cronometru  in C++ Builder'
    Font.Charset = DEFAULT_CHARSET
    Font.Color = clRed
    Font.Height = -11
    Font.Name = 'MS Sans Serif'
    Font.Style = [fsBold]
    ParentFont = False
  end
  object Label2: TLabel
    Left = 144
    Top = 160
    Width = 236
    Height = 24
    Hint = 'Titlu'
    Caption = 'C++Builder CRONOMETRU'
    Font.Charset = DEFAULT_CHARSET
    Font.Color = clRed
    Font.Height = -21
    Font.Name = 'MS Sans Serif'
    Font.Style = []
    ParentFont = False
  end
  object START: TButton
    Left = 24
    Top = 224
    Width = 65
    Height = 25
    Hint = 'Start cronometru.'
    Caption = 'START'
    TabOrder = 0
    OnClick = STARTClick
  end
  object STOP: TButton
    Left = 24
    Top = 256
    Width = 65
    Height = 25
    Hint = 'Stop cronometru.'
    Caption = 'STOP'
    TabOrder = 1
    OnClick = STOPClick
  end
  object ZERO: TButton
    Left = 24
    Top = 288
    Width = 65
    Height = 25
    Hint = 'Resetare cronometru.'
    Caption = 'ZERO'
    TabOrder = 2
    OnClick = ZEROClick
  end
  object Exit: TButton
    Left = 312
    Top = 304
    Width = 65
    Height = 25
    Hint = 'Iesire din program.'
    Caption = 'Exit'
    TabOrder = 3
    OnClick = ExitClick
  end
  object Edit1: TEdit
    Left = 216
    Top = 112
    Width = 161
    Height = 21
    Hint = 'Data si ora curenta.'
    Font.Charset = DEFAULT_CHARSET
    Font.Color = clWindowText
    Font.Height = -11
    Font.Name = 'MS Sans Serif'
    Font.Style = [fsBold]
    ParentFont = False
    TabOrder = 4
    Text = 'Edit1'
  end
  object Edit2: TEdit
    Left = 120
    Top = 248
    Width = 257
    Height = 37
    Hint = 'Valoarea cronometrului.'
    Font.Charset = DEFAULT_CHARSET
    Font.Color = clWindowText
    Font.Height = -24
    Font.Name = 'MS Sans Serif'
    Font.Style = [fsBold]
    ParentFont = False
    TabOrder = 5
    Text = 'Edit2'
  end
  object Timer1: TTimer
    OnTimer = Timer1Timer
    Left = 24
    Top = 96
  end
  object Timer2: TTimer
    Enabled = False
    Interval = 100
    OnTimer = Timer2Timer
    Left = 24
    Top = 136
  end
end
