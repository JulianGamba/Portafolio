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

	Private ImageView3 As ImageView
	Private ImageView4 As ImageView
	Private ImageView1 As ImageView
	Private Button2 As Button
	Private Button1 As Button
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("perfil")
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub


Private Sub ImageView3_Click
	
End Sub

Private Sub ImageView4_Click
	StartActivity("landingPage")
End Sub

Private Sub ImageView1_Click
	StartActivity("landingPage")
End Sub

Private Sub Button2_Click
	StartActivity("main")
End Sub

Private Sub Button1_Click
	StartActivity("ingresardatos")
End Sub

