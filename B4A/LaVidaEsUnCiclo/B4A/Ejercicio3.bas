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
	Activity.LoadLayout("ejercicio3")

End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub


Private Sub Button1_Click
	Dim num1 As String
	num1 = EditText1.Text
	Select num1 
		Case 0
			Label3.Text = "No es un número válido"
		Case 1
			Label3.Text = "Agua"
		Case 2
			Label3.Text = "Gasolina"
		Case 3 
			Label3.Text = "hormigón"
		Case Else
			Label3.Text = "No existe un valor válido"
	End Select
	
End Sub

Private Sub Button2_Click
	StartActivity("main")
End Sub