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

	Private Button1 As Button
	Private Label3 As Label
	Private Button2 As Button
	
	Dim num1 As Int = 11
	Dim num2 As Int
	Dim todoJunto As String
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("ejercicio5")

End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub


Private Sub Button1_Click
	Dim i As Int = 1
	Do While (i <= 25)
		todoJunto = todoJunto & " " & num1
		num1 = num1 + 11
		i = i + 1
	Loop 
	Label3.Text = ("Serie:" & todoJunto)
End Sub

Private Sub Button2_Click
	StartActivity("main")
End Sub