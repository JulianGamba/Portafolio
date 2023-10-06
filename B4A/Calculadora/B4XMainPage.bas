B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=9.85
@EndOfDesignText@
#Region Shared Files
#CustomBuildAction: folders ready, %WINDIR%\System32\Robocopy.exe,"..\..\Shared Files" "..\Files"
'Ctrl + click to sync files: ide://run?file=%WINDIR%\System32\Robocopy.exe&args=..\..\Shared+Files&args=..\Files&FilesSync=True
#End Region

'Ctrl + click to export as zip: ide://run?File=%B4X%\Zipper.jar&Args=Project.zip

Sub Class_Globals
	Private Root As B4XView
	Private xui As XUI
	Private EditText1 As EditText
	Private EditText2 As EditText
	Private Label1 As Label
	Private Label2 As Label
	Private Label3 As Label
	Private Label4 As Label
	Private Button1 As Button
	Private Button2 As Button
	Private Button3 As Button
	Private Button4 As Button
	Private Button5 As Button
	Private Button6 As Button
	Private Button7 As Button
	Private Button8 As Button
	Private Button9 As Button
	Private Button10 As Button
	
	Dim num1, num2 As Double
End Sub

Public Sub Initialize
'	B4XPages.GetManager.LogEvents = True
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	Root.LoadLayout("Calculadora")
	
	
End Sub

'You can see the list of page related events in the B4XPagesManager object. The event name is B4XPage.

Private Sub Button1_Click
	
	' Captura el texto ingresado por el usuario en EditText1 y EditText2
	Dim num1 As Double = EditText1.Text
	Dim num2 As Double = EditText2.Text
    
	' Realiza alguna operación con num1 y num2, por ejemplo, muestra la suma en Label3
	Label3.Text = "Suma: " & (num1 + num2)
	Label4.Text = ""
	
	' xui.MsgboxAsync("Hello world!", "B4X")
End Sub

Private Sub Button2_Click
	
	' Captura el texto ingresado por el usuario en EditText1 y EditText2
	Dim num1 As Double = EditText1.Text
	Dim num2 As Double = EditText2.Text
    
	' Realiza alguna operación con num1 y num2, por ejemplo, muestra la resta en Label3
	Label3.Text = "Resta: " & (num1 - num2)
	Label4.Text = ""
	
End Sub

Private Sub Button3_Click
	
	' Captura el texto ingresado por el usuario en EditText1 y EditText2

	Dim num1 As Double = EditText1.Text
	Dim num2 As Double = EditText2.Text
    
	' Realiza alguna operación con num1 y num2, por ejemplo, muestra la multiplicación en Label3
	Label3.Text = "Multiplicación: " & (num1 * num2)
	Label4.Text = ""
	
End Sub

Private Sub Button4_Click
	
	' Captura el texto ingresado por el usuario en EditText1 y EditText2
	Dim num1 As Double = EditText1.Text
	Dim num2 As Double = EditText2.Text
    
	' Realiza alguna operación con num1 y num2, por ejemplo, muestra la división en Label3
	Label3.Text = "División: " & (num1 / num2)
	Label4.Text = ""
	
End Sub

Private Sub Button5_Click
	
	' Captura el texto ingresado por el usuario en EditText1 y EditText2
	Dim num1 As Double = EditText1.Text
	Dim num2 As Double = EditText2.Text
    
	Dim porcentaje As Double = (num2 / num1) * 100
	' Realiza alguna operación con num1 y num2, por ejemplo, muestra el porcentaje en Label3
	Label3.Text = "Porcentaje: " & porcentaje
	Label4.Text = ""
	
End Sub

Private Sub Button6_Click
	
	' Captura el texto ingresado por el usuario en EditText1 y EditText2
	Dim num1 As Double = EditText1.Text
	Dim num2 As Double = EditText2.Text
    
	Dim logaritmo As Double = Logarithm(num1, 10)
	Dim logaritmo2 As Double = Logarithm(num2, 10)
	
	' Realiza alguna operación con num1 y num2, por ejemplo, muestra el logaritmo en Label3
	Label3.Text = "Logaritmo num1: " & logaritmo
	Label4.Text = "Logaritmo num2: " & logaritmo2
	
End Sub

Private Sub Button7_Click
	
	' Captura el texto ingresado por el usuario en EditText1 y EditText2
	Dim num1 As Double = EditText1.Text
	Dim num2 As Double = EditText2.Text
    
	' Realiza alguna operación con num1 y num2, por ejemplo, muestra la potenciación en Label3
	Label3.Text = "Potenciación: " & Power(num1, num2)
	Label4.Text = ""
	
End Sub

Private Sub Button8_Click
	
	' Captura el texto ingresado por el usuario en EditText1 y EditText2
	Dim num1 As Double = EditText1.Text
	Dim num2 As Double = EditText2.Text
    
	Dim radianes As Double = num1 * (3.1415 / 180)

	' Calcula el seno
	Dim seno As Double = Sin(radianes)
	
	Dim radianes2 As Double = num2 * (3.1415 / 180)

	' Calcula el seno
	Dim seno2 As Double = Sin(radianes2)
	
	' Realiza alguna operación con num1 y num2, por ejemplo, muestra la potenciación en Label3
	Label3.Text = "Seno Num1: " & seno
	Label4.Text = "Seno Num2: " & seno2
	
End Sub

Private Sub Button9_Click
	
	' Captura el texto ingresado por el usuario en EditText1 y EditText2
	Dim num1 As Double = EditText1.Text
	Dim num2 As Double = EditText2.Text
    
	Dim radianes As Double = num1 * (3.1415 / 180)

	' Calcula el coseno
	Dim coseno As Double = Cos(radianes)
	
	Dim radianes2 As Double = num2 * (3.1415 / 180)

	' Calcula el coseno
	Dim coseno2 As Double = Cos(radianes2)
	
	' Realiza alguna operación con num1 y num2, por ejemplo, muestra la potenciación en Label3
	Label3.Text = "Coseno Num1: " & coseno
	Label4.Text = "Coseno Num2: " & coseno2
	
End Sub

Private Sub Button10_Click
	
	' Captura el texto ingresado por el usuario en EditText1 y EditText2
	Dim num1 As Double = EditText1.Text
	Dim num2 As Double = EditText2.Text
    
	Dim radianes As Double = num1 * (3.1415 / 180)

	' Calcula el seno
	Dim tangente As Double = Tan(radianes)
	
	Dim radianes2 As Double = num2 * (3.1415 / 180)

	' Calcula el seno
	Dim tangente2 As Double = Tan(radianes2)
	
	' Realiza alguna operación con num1 y num2, por ejemplo, muestra la potenciación en Label3
	Label3.Text = "Tangente Num1: " & tangente
	Label4.Text = "Tangente Num2: " & tangente2
	
End Sub