package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xmainpage extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.example.b4xmainpage");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.b4xmainpage.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _root = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittext1 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittext2 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label1 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label2 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label3 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label4 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _button1 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _button2 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _button3 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _button4 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _button5 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _button6 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _button7 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _button8 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _button9 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _button10 = null;
public double _num1 = 0;
public double _num2 = 0;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public String  _b4xpage_created(anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
 //BA.debugLineNum = 36;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
 //BA.debugLineNum = 37;BA.debugLine="Root = Root1";
_root = _root1;
 //BA.debugLineNum = 38;BA.debugLine="Root.LoadLayout(\"Calculadora\")";
_root.LoadLayout("Calculadora",ba);
 //BA.debugLineNum = 41;BA.debugLine="End Sub";
return "";
}
public String  _button1_click() throws Exception{
 //BA.debugLineNum = 45;BA.debugLine="Private Sub Button1_Click";
 //BA.debugLineNum = 48;BA.debugLine="Dim num1 As Double = EditText1.Text";
_num1 = (double)(Double.parseDouble(_edittext1.getText()));
 //BA.debugLineNum = 49;BA.debugLine="Dim num2 As Double = EditText2.Text";
_num2 = (double)(Double.parseDouble(_edittext2.getText()));
 //BA.debugLineNum = 52;BA.debugLine="Label3.Text = \"Suma: \" & (num1 + num2)";
_label3.setText(BA.ObjectToCharSequence("Suma: "+BA.NumberToString((_num1+_num2))));
 //BA.debugLineNum = 53;BA.debugLine="Label4.Text = \"\"";
_label4.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 56;BA.debugLine="End Sub";
return "";
}
public String  _button10_click() throws Exception{
double _radianes = 0;
double _tangente = 0;
double _radianes2 = 0;
double _tangente2 = 0;
 //BA.debugLineNum = 179;BA.debugLine="Private Sub Button10_Click";
 //BA.debugLineNum = 182;BA.debugLine="Dim num1 As Double = EditText1.Text";
_num1 = (double)(Double.parseDouble(_edittext1.getText()));
 //BA.debugLineNum = 183;BA.debugLine="Dim num2 As Double = EditText2.Text";
_num2 = (double)(Double.parseDouble(_edittext2.getText()));
 //BA.debugLineNum = 185;BA.debugLine="Dim radianes As Double = num1 * (3.1415 / 180)";
_radianes = _num1*(3.1415/(double)180);
 //BA.debugLineNum = 188;BA.debugLine="Dim tangente As Double = Tan(radianes)";
_tangente = __c.Tan(_radianes);
 //BA.debugLineNum = 190;BA.debugLine="Dim radianes2 As Double = num2 * (3.1415 / 180)";
_radianes2 = _num2*(3.1415/(double)180);
 //BA.debugLineNum = 193;BA.debugLine="Dim tangente2 As Double = Tan(radianes2)";
_tangente2 = __c.Tan(_radianes2);
 //BA.debugLineNum = 196;BA.debugLine="Label3.Text = \"Tangente Num1: \" & tangente";
_label3.setText(BA.ObjectToCharSequence("Tangente Num1: "+BA.NumberToString(_tangente)));
 //BA.debugLineNum = 197;BA.debugLine="Label4.Text = \"Tangente Num2: \" & tangente2";
_label4.setText(BA.ObjectToCharSequence("Tangente Num2: "+BA.NumberToString(_tangente2)));
 //BA.debugLineNum = 199;BA.debugLine="End Sub";
return "";
}
public String  _button2_click() throws Exception{
 //BA.debugLineNum = 58;BA.debugLine="Private Sub Button2_Click";
 //BA.debugLineNum = 61;BA.debugLine="Dim num1 As Double = EditText1.Text";
_num1 = (double)(Double.parseDouble(_edittext1.getText()));
 //BA.debugLineNum = 62;BA.debugLine="Dim num2 As Double = EditText2.Text";
_num2 = (double)(Double.parseDouble(_edittext2.getText()));
 //BA.debugLineNum = 65;BA.debugLine="Label3.Text = \"Resta: \" & (num1 - num2)";
_label3.setText(BA.ObjectToCharSequence("Resta: "+BA.NumberToString((_num1-_num2))));
 //BA.debugLineNum = 66;BA.debugLine="Label4.Text = \"\"";
_label4.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 68;BA.debugLine="End Sub";
return "";
}
public String  _button3_click() throws Exception{
 //BA.debugLineNum = 70;BA.debugLine="Private Sub Button3_Click";
 //BA.debugLineNum = 74;BA.debugLine="Dim num1 As Double = EditText1.Text";
_num1 = (double)(Double.parseDouble(_edittext1.getText()));
 //BA.debugLineNum = 75;BA.debugLine="Dim num2 As Double = EditText2.Text";
_num2 = (double)(Double.parseDouble(_edittext2.getText()));
 //BA.debugLineNum = 78;BA.debugLine="Label3.Text = \"Multiplicación: \" & (num1 * num2)";
_label3.setText(BA.ObjectToCharSequence("Multiplicación: "+BA.NumberToString((_num1*_num2))));
 //BA.debugLineNum = 79;BA.debugLine="Label4.Text = \"\"";
_label4.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 81;BA.debugLine="End Sub";
return "";
}
public String  _button4_click() throws Exception{
 //BA.debugLineNum = 83;BA.debugLine="Private Sub Button4_Click";
 //BA.debugLineNum = 86;BA.debugLine="Dim num1 As Double = EditText1.Text";
_num1 = (double)(Double.parseDouble(_edittext1.getText()));
 //BA.debugLineNum = 87;BA.debugLine="Dim num2 As Double = EditText2.Text";
_num2 = (double)(Double.parseDouble(_edittext2.getText()));
 //BA.debugLineNum = 90;BA.debugLine="Label3.Text = \"División: \" & (num1 / num2)";
_label3.setText(BA.ObjectToCharSequence("División: "+BA.NumberToString((_num1/(double)_num2))));
 //BA.debugLineNum = 91;BA.debugLine="Label4.Text = \"\"";
_label4.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 93;BA.debugLine="End Sub";
return "";
}
public String  _button5_click() throws Exception{
double _porcentaje = 0;
 //BA.debugLineNum = 95;BA.debugLine="Private Sub Button5_Click";
 //BA.debugLineNum = 98;BA.debugLine="Dim num1 As Double = EditText1.Text";
_num1 = (double)(Double.parseDouble(_edittext1.getText()));
 //BA.debugLineNum = 99;BA.debugLine="Dim num2 As Double = EditText2.Text";
_num2 = (double)(Double.parseDouble(_edittext2.getText()));
 //BA.debugLineNum = 101;BA.debugLine="Dim porcentaje As Double = (num2 / num1) * 100";
_porcentaje = (_num2/(double)_num1)*100;
 //BA.debugLineNum = 103;BA.debugLine="Label3.Text = \"Porcentaje: \" & porcentaje";
_label3.setText(BA.ObjectToCharSequence("Porcentaje: "+BA.NumberToString(_porcentaje)));
 //BA.debugLineNum = 104;BA.debugLine="Label4.Text = \"\"";
_label4.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 106;BA.debugLine="End Sub";
return "";
}
public String  _button6_click() throws Exception{
double _logaritmo = 0;
double _logaritmo2 = 0;
 //BA.debugLineNum = 108;BA.debugLine="Private Sub Button6_Click";
 //BA.debugLineNum = 111;BA.debugLine="Dim num1 As Double = EditText1.Text";
_num1 = (double)(Double.parseDouble(_edittext1.getText()));
 //BA.debugLineNum = 112;BA.debugLine="Dim num2 As Double = EditText2.Text";
_num2 = (double)(Double.parseDouble(_edittext2.getText()));
 //BA.debugLineNum = 114;BA.debugLine="Dim logaritmo As Double = Logarithm(num1, 10)";
_logaritmo = __c.Logarithm(_num1,10);
 //BA.debugLineNum = 115;BA.debugLine="Dim logaritmo2 As Double = Logarithm(num2, 10)";
_logaritmo2 = __c.Logarithm(_num2,10);
 //BA.debugLineNum = 118;BA.debugLine="Label3.Text = \"Logaritmo num1: \" & logaritmo";
_label3.setText(BA.ObjectToCharSequence("Logaritmo num1: "+BA.NumberToString(_logaritmo)));
 //BA.debugLineNum = 119;BA.debugLine="Label4.Text = \"Logaritmo num2: \" & logaritmo2";
_label4.setText(BA.ObjectToCharSequence("Logaritmo num2: "+BA.NumberToString(_logaritmo2)));
 //BA.debugLineNum = 121;BA.debugLine="End Sub";
return "";
}
public String  _button7_click() throws Exception{
 //BA.debugLineNum = 123;BA.debugLine="Private Sub Button7_Click";
 //BA.debugLineNum = 126;BA.debugLine="Dim num1 As Double = EditText1.Text";
_num1 = (double)(Double.parseDouble(_edittext1.getText()));
 //BA.debugLineNum = 127;BA.debugLine="Dim num2 As Double = EditText2.Text";
_num2 = (double)(Double.parseDouble(_edittext2.getText()));
 //BA.debugLineNum = 130;BA.debugLine="Label3.Text = \"Potenciación: \" & Power(num1, num2";
_label3.setText(BA.ObjectToCharSequence("Potenciación: "+BA.NumberToString(__c.Power(_num1,_num2))));
 //BA.debugLineNum = 131;BA.debugLine="Label4.Text = \"\"";
_label4.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 133;BA.debugLine="End Sub";
return "";
}
public String  _button8_click() throws Exception{
double _radianes = 0;
double _seno = 0;
double _radianes2 = 0;
double _seno2 = 0;
 //BA.debugLineNum = 135;BA.debugLine="Private Sub Button8_Click";
 //BA.debugLineNum = 138;BA.debugLine="Dim num1 As Double = EditText1.Text";
_num1 = (double)(Double.parseDouble(_edittext1.getText()));
 //BA.debugLineNum = 139;BA.debugLine="Dim num2 As Double = EditText2.Text";
_num2 = (double)(Double.parseDouble(_edittext2.getText()));
 //BA.debugLineNum = 141;BA.debugLine="Dim radianes As Double = num1 * (3.1415 / 180)";
_radianes = _num1*(3.1415/(double)180);
 //BA.debugLineNum = 144;BA.debugLine="Dim seno As Double = Sin(radianes)";
_seno = __c.Sin(_radianes);
 //BA.debugLineNum = 146;BA.debugLine="Dim radianes2 As Double = num2 * (3.1415 / 180)";
_radianes2 = _num2*(3.1415/(double)180);
 //BA.debugLineNum = 149;BA.debugLine="Dim seno2 As Double = Sin(radianes2)";
_seno2 = __c.Sin(_radianes2);
 //BA.debugLineNum = 152;BA.debugLine="Label3.Text = \"Seno Num1: \" & seno";
_label3.setText(BA.ObjectToCharSequence("Seno Num1: "+BA.NumberToString(_seno)));
 //BA.debugLineNum = 153;BA.debugLine="Label4.Text = \"Seno Num2: \" & seno2";
_label4.setText(BA.ObjectToCharSequence("Seno Num2: "+BA.NumberToString(_seno2)));
 //BA.debugLineNum = 155;BA.debugLine="End Sub";
return "";
}
public String  _button9_click() throws Exception{
double _radianes = 0;
double _coseno = 0;
double _radianes2 = 0;
double _coseno2 = 0;
 //BA.debugLineNum = 157;BA.debugLine="Private Sub Button9_Click";
 //BA.debugLineNum = 160;BA.debugLine="Dim num1 As Double = EditText1.Text";
_num1 = (double)(Double.parseDouble(_edittext1.getText()));
 //BA.debugLineNum = 161;BA.debugLine="Dim num2 As Double = EditText2.Text";
_num2 = (double)(Double.parseDouble(_edittext2.getText()));
 //BA.debugLineNum = 163;BA.debugLine="Dim radianes As Double = num1 * (3.1415 / 180)";
_radianes = _num1*(3.1415/(double)180);
 //BA.debugLineNum = 166;BA.debugLine="Dim coseno As Double = Cos(radianes)";
_coseno = __c.Cos(_radianes);
 //BA.debugLineNum = 168;BA.debugLine="Dim radianes2 As Double = num2 * (3.1415 / 180)";
_radianes2 = _num2*(3.1415/(double)180);
 //BA.debugLineNum = 171;BA.debugLine="Dim coseno2 As Double = Cos(radianes2)";
_coseno2 = __c.Cos(_radianes2);
 //BA.debugLineNum = 174;BA.debugLine="Label3.Text = \"Coseno Num1: \" & coseno";
_label3.setText(BA.ObjectToCharSequence("Coseno Num1: "+BA.NumberToString(_coseno)));
 //BA.debugLineNum = 175;BA.debugLine="Label4.Text = \"Coseno Num2: \" & coseno2";
_label4.setText(BA.ObjectToCharSequence("Coseno Num2: "+BA.NumberToString(_coseno2)));
 //BA.debugLineNum = 177;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 8;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Private Root As B4XView";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 10;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 11;BA.debugLine="Private EditText1 As EditText";
_edittext1 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 12;BA.debugLine="Private EditText2 As EditText";
_edittext2 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 13;BA.debugLine="Private Label1 As Label";
_label1 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 14;BA.debugLine="Private Label2 As Label";
_label2 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 15;BA.debugLine="Private Label3 As Label";
_label3 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 16;BA.debugLine="Private Label4 As Label";
_label4 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 17;BA.debugLine="Private Button1 As Button";
_button1 = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 18;BA.debugLine="Private Button2 As Button";
_button2 = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 19;BA.debugLine="Private Button3 As Button";
_button3 = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 20;BA.debugLine="Private Button4 As Button";
_button4 = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 21;BA.debugLine="Private Button5 As Button";
_button5 = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 22;BA.debugLine="Private Button6 As Button";
_button6 = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 23;BA.debugLine="Private Button7 As Button";
_button7 = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 24;BA.debugLine="Private Button8 As Button";
_button8 = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 25;BA.debugLine="Private Button9 As Button";
_button9 = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 26;BA.debugLine="Private Button10 As Button";
_button10 = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 28;BA.debugLine="Dim num1, num2 As Double";
_num1 = 0;
_num2 = 0;
 //BA.debugLineNum = 29;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 31;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 33;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
if (BA.fastSubCompare(sub, "B4XPAGE_CREATED"))
	return _b4xpage_created((anywheresoftware.b4a.objects.B4XViewWrapper) args[0]);
return BA.SubDelegator.SubNotFound;
}
}
