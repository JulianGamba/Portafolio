B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Activity
Version=12.5
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: False
#End Region

Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.

End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.

	Private EditText1 As EditText
	Private Label3 As Label
	Private Button1 As Button
	Private Button2 As Button
	
	
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("ejercicio2")

End Sub

Private Sub Button1_Click
	' Obtén el número ingresado por el usuario desde EditText1
	Dim numero As String
	numero = EditText1.Text
    
	' Verifica la longitud del número
	If numero.Length <= 6 Then
		' El número tiene 6 cifras o menos
		Label3.Text = "El número tiene " & numero.Length & " cifras."
	Else
		' El número tiene más de 6 cifras
		Label3.Text = "El número tiene más de 6 cifras."
	End If
End Sub

Private Sub Button2_Click
	StartActivity("main")
End Sub