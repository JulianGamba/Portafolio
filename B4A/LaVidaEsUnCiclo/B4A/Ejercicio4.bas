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
	Private Label4 As Label
	Private Button2 As Button
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("ejercicio4")

End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub


Private Sub Button1_Click
	Dim paragraph As String
	paragraph = "Porta fames dis aenean platea neque semper? Conubia eleifend " _
                & "commodo maecenas risus risus pellentesque. Eros iaculis duis posuere " _
                & "integer purus euismod consequat. Vel congue curabitur penatibus ac mus " _
                & "nisi iaculis; scelerisque feugiat blandit molestie euismod. Tincidunt risus " _
                & "sociis nostra fermentum laoreet aliquet aptent est. Platea non proin aliquet " _
                & "scelerisque nam maecenas elit cum."
    
	Dim vowelsCount As Int
	Dim vowels As String
	vowels = "AEIOUaeiou" ' Lista de vocales
	Dim index As Int = 0
    
	Do While (index < paragraph.Length)
	Dim currentChar As Char = paragraph.CharAt(index)
		If vowels.Contains(currentChar) Then
			vowelsCount = vowelsCount + 1
		End If
	index = index + 1
	Loop

	' Mostrar el resultado
	Label4.Text = ("El párrafo contiene " & vowelsCount & " vocales.")
End Sub


Private Sub Button2_Click
	StartActivity("main")
End Sub