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
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public b4a.example.main _main = null;
public b4a.example.landingpage _landingpage = null;
public b4a.example.plantas _plantas = null;
public b4a.example.recomendaciones _recomendaciones = null;
public b4a.example.plantas2 _plantas2 = null;
public b4a.example.plantas3 _plantas3 = null;
public b4a.example.aloevera _aloevera = null;
public b4a.example.bambu _bambu = null;
public b4a.example.cactus _cactus = null;
public b4a.example.coco _coco = null;
public b4a.example.contenidoconsejos _contenidoconsejos = null;
public b4a.example.desertico _desertico = null;
public b4a.example.fresno _fresno = null;
public b4a.example.ingresardatos _ingresardatos = null;
public b4a.example.iniciasesion _iniciasesion = null;
public b4a.example.jengibre _jengibre = null;
public b4a.example.landing1 _landing1 = null;
public b4a.example.lavanda _lavanda = null;
public b4a.example.mediterraneo _mediterraneo = null;
public b4a.example.nuevacont _nuevacont = null;
public b4a.example.palma _palma = null;
public b4a.example.perfil _perfil = null;
public b4a.example.recuperarcont _recuperarcont = null;
public b4a.example.registro _registro = null;
public b4a.example.resultadosdatos _resultadosdatos = null;
public b4a.example.starter _starter = null;
public b4a.example.subartico _subartico = null;
public b4a.example.templado _templado = null;
public b4a.example.tomate _tomate = null;
public b4a.example.tropical _tropical = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public String  _b4xpage_created(anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
 //BA.debugLineNum = 17;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return "";
}
public String  _button1_click() throws Exception{
 //BA.debugLineNum = 23;BA.debugLine="Private Sub Button1_Click";
 //BA.debugLineNum = 24;BA.debugLine="xui.MsgboxAsync(\"Hello world!\", \"B4X\")";
_xui.MsgboxAsync(ba,BA.ObjectToCharSequence("Hello world!"),BA.ObjectToCharSequence("B4X"));
 //BA.debugLineNum = 25;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 8;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 12;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
if (BA.fastSubCompare(sub, "B4XPAGE_CREATED"))
	return _b4xpage_created((anywheresoftware.b4a.objects.B4XViewWrapper) args[0]);
return BA.SubDelegator.SubNotFound;
}
}
