object Form1: TForm1
  Left = 192
  Top = 114
  Width = 401
  Height = 236
  Caption = 'MIDPS 1-A'
  Color = clBtnFace
  Font.Charset = DEFAULT_CHARSET
  Font.Color = clWindowText
  Font.Height = -11
  Font.Name = 'MS Sans Serif'
  Font.Style = []
  OldCreateOrder = False
  PixelsPerInch = 96
  TextHeight = 13
  object Label1: TLabel
    Left = 120
    Top = 16
    Width = 200
    Height = 13
    Hint = 'Titlu.'
    Caption = 'Incrementare decrementare contor.'
    Color = clBtnFace
    Font.Charset = DEFAULT_CHARSET
    Font.Color = clRed
    Font.Height = -11
    Font.Name = 'MS Sans Serif'
    Font.Style = [fsBold]
    ParentColor = False
    ParentFont = False
    ParentShowHint = False
    ShowHint = True
  end
  object Label2: TLabel
    Left = 248
    Top = 96
    Width = 104
    Height = 19
    Hint = 'Directia variatiei lui i.'
    Caption = 'i scade in Edit1'
    Font.Charset = DEFAULT_CHARSET
    Font.Color = clWindowText
    Font.Height = -16
    Font.Name = 'Times New Roman'
    Font.Style = [fsBold, fsItalic]
    ParentFont = False
    ParentShowHint = False
    ShowHint = True
  end
  object Edit1: TEdit
    Left = 104
    Top = 96
    Width = 89
    Height = 21
    Hint = 'Valarea lui i.'
    AutoSelect = False
    ParentShowHint = False
    ShowHint = True
    TabOrder = 0
  end
  object UP: TButton
    Left = 24
    Top = 56
    Width = 73
    Height = 25
    Hint = 'Incrementeaza i.'
    Caption = 'UP'
    ParentShowHint = False
    ShowHint = True
    TabOrder = 1
    OnClick = UPClick
  end
  object DOWN: TButton
    Left = 24
    Top = 128
    Width = 73
    Height = 25
    Hint = 'Decrementeaza i.'
    Caption = 'DOWN'
    ParentShowHint = False
    ShowHint = True
    TabOrder = 2
    OnClick = DOWNClick
  end
  object Exit: TButton
    Left = 280
    Top = 160
    Width = 73
    Height = 25
    Hint = 'Iesire din program.'
    Caption = 'Exit'
    ParentShowHint = False
    ShowHint = True
    TabOrder = 3
    OnClick = ExitClick
  end
end
