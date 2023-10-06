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

	Private Label1 As Label
	Private Label2 As Label
	Private generarNumero As Button
	Private Button1 As Button	
	Private numaleatorio As Label
	Private Mayoromenor As Label
	
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("ejercicio1")

End Sub

Private Sub Button1_Click
	StartActivity("main")
End Sub

Private Sub generarNumero_Click
	Dim randomNum As Int
	randomNum = Rnd(1, 251) ' Genera un número entre 1 (incluido) y 251 (excluido)

	' Realizar otras operaciones específicas aquí, como mostrar el número en una etiqueta
	numaleatorio.Text = "Número aleatorio: " & randomNum
	
	If (randomNum < 150 And randomNum > 0) Then
		Mayoromenor.Text = "El número es menor que 150"
	Else If (randomNum > 150 And randomNum < 250) Then
		Mayoromenor.Text = "El número es mayor que 150"
	Else 
		Mayoromenor.Text = "El número no es válido"
	End If
	
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub


Private Sub Button2_Click
	
End Sub