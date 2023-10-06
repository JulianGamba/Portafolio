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

	Private ImageView4 As ImageView
	Private ImageView1 As ImageView
	Private ImageView3 As ImageView
	Private ScrollView1 As ScrollView
	Private Label1 As Label
	Private Label2 As Label
	Private Label3 As Label
	Private ImageView7 As ImageView
	Private ImageView8 As ImageView
	Private ImageView9 As ImageView
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("plantas3")

	ScrollView1.Panel.LoadLayout("templadas")
	ScrollView1.Panel.Width=363dip
	ScrollView1.Panel.Height=770dip
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Private Sub ImageView4_Click
	StartActivity("plantas2")
End Sub

Private Sub ImageView1_Click
	StartActivity("landingpage")
End Sub

Private Sub ImageView3_Click
	StartActivity("perfil")
End Sub

'Private Sub ImageView6_Click
'	StartActivity("plantas4")
'End Sub

Private Sub Label1_Click
	StartActivity("fresno")
End Sub

Private Sub ImageView7_Click
	StartActivity("fresno")
End Sub

Private Sub ImageView8_Click
	StartActivity("lavanda")
End Sub

Private Sub Label2_Click
	StartActivity("lavanda")
End Sub

Private Sub ImageView9_Click
	StartActivity("tomate")
End Sub

Private Sub Label3_Click
	StartActivity("tomate")
End Sub