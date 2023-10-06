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
	Private Button1 As Button
	Private Label6 As Label
	Private Label5 As Label
	Private Label4 As Label
	Private Label3 As Label
	Private Button2 As Button
	Private Label7 As Label
	Private Label8 As Label
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("ejercicio6")

End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub


Private Sub Button1_Click
	Dim num As Int
	num = EditText1.Text
	Dim total As Int
	total = 0
    
	' Realizar la sumatoria de todas las iteraciones
	For i = 1 To num
		total = total + i
	Next
    
	' Calcular la raíz cuadrada del total
	Dim raizCuadrada As Double
	raizCuadrada = Sqrt(total)
    
	' Generar un número aleatorio entre 1 y la sumatoria de las iteraciones
	Dim numeroAleatorio As Int
	numeroAleatorio = Rnd(1, total + 1)
    
	' Determinar los divisores del total
	Dim divisores As String
	divisores = "Divisores: "
	For i = 1 To total
		If total Mod i = 0 Then
			divisores = divisores & i & " "
		End If
	Next
    
	' Calcular el factorial del total
	Dim factorial As Double
	factorial = 1
	For i = 1 To total
		factorial = factorial * i
	Next
    
	' Verificar si es un número perfecto
	Dim esPerfecto As Boolean
	esPerfecto = total = (raizCuadrada * raizCuadrada)
    
	' Mostrar los resultados
	Label3.Text = "Sumatoria: " & total
	Label4.Text = "Raiz cuadrada: " & raizCuadrada
	Label5.Text = "Número aleatorio: " & numeroAleatorio
	Label6.Text = "Divisores: " & divisores
	Label7.Text = "Factorial: " & factorial
	Label8.Text = "Es un número perfecto: " & esPerfecto	
End Sub


Private Sub Button2_Click
	StartActivity("main")
End Sub