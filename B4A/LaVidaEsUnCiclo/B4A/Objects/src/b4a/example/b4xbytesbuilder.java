package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xbytesbuilder extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.example.b4xbytesbuilder");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.b4xbytesbuilder.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public byte[] _vvvvvvvv5 = null;
public int _vvvvvvvv6 = 0;
public b4a.example.main _vvvv5 = null;
public b4a.example.ejercicio1 _vvvv6 = null;
public b4a.example.starter _vvvv7 = null;
public b4a.example.ejercicio2 _vvvv0 = null;
public b4a.example.ejercicio3 _vvvvv1 = null;
public b4a.example.ejercicio4 _vvvvv2 = null;
public b4a.example.ejercicio5 _vvvvv3 = null;
public b4a.example.ejercicio6 _vvvvv4 = null;
public b4a.example.b4xpages _vvvvv5 = null;
public b4a.example.b4xcollections _vvvvv6 = null;
public b4a.example.b4xbytesbuilder  _vvvvvv6(byte[] _data) throws Exception{
 //BA.debugLineNum = 24;BA.debugLine="Public Sub Append(Data() As Byte) As B4XBytesBuild";
 //BA.debugLineNum = 25;BA.debugLine="Return Append2(Data, 0, Data.Length)";
if (true) return _vvvvvv7(_data,(int) (0),_data.length);
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return null;
}
public b4a.example.b4xbytesbuilder  _vvvvvv7(byte[] _data,int _startindex,int _length) throws Exception{
int _oldlength = 0;
 //BA.debugLineNum = 31;BA.debugLine="Public Sub Append2(Data() As Byte, StartIndex As I";
 //BA.debugLineNum = 32;BA.debugLine="Dim OldLength As Int = ChangeLength(mLength + Len";
_oldlength = _vvvvvv0((int) (_vvvvvvvv6+_length));
 //BA.debugLineNum = 33;BA.debugLine="Bit.ArrayCopy(Data, StartIndex, mBuffer, OldLengt";
__c.Bit.ArrayCopy((Object)(_data),_startindex,(Object)(_vvvvvvvv5),_oldlength,_length);
 //BA.debugLineNum = 34;BA.debugLine="Return Me";
if (true) return (b4a.example.b4xbytesbuilder)(this);
 //BA.debugLineNum = 35;BA.debugLine="End Sub";
return null;
}
public int  _vvvvvv0(int _newlength) throws Exception{
int _oldlength = 0;
byte[] _b = null;
 //BA.debugLineNum = 12;BA.debugLine="Private Sub ChangeLength (NewLength As Int) As Int";
 //BA.debugLineNum = 13;BA.debugLine="Dim OldLength As Int = mLength";
_oldlength = _vvvvvvvv6;
 //BA.debugLineNum = 14;BA.debugLine="mLength = NewLength";
_vvvvvvvv6 = _newlength;
 //BA.debugLineNum = 15;BA.debugLine="If mBuffer.Length < mLength Then";
if (_vvvvvvvv5.length<_vvvvvvvv6) { 
 //BA.debugLineNum = 16;BA.debugLine="Dim b(Max(mBuffer.Length * 2, NewLength)) As Byt";
_b = new byte[(int) (__c.Max(_vvvvvvvv5.length*2,_newlength))];
;
 //BA.debugLineNum = 17;BA.debugLine="Bit.ArrayCopy(mBuffer, 0, b, 0, mBuffer.Length)";
__c.Bit.ArrayCopy((Object)(_vvvvvvvv5),(int) (0),(Object)(_b),(int) (0),_vvvvvvvv5.length);
 //BA.debugLineNum = 18;BA.debugLine="mBuffer = b";
_vvvvvvvv5 = _b;
 };
 //BA.debugLineNum = 20;BA.debugLine="Return OldLength";
if (true) return _oldlength;
 //BA.debugLineNum = 21;BA.debugLine="End Sub";
return 0;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private mBuffer() As Byte";
_vvvvvvvv5 = new byte[(int) (0)];
;
 //BA.debugLineNum = 3;BA.debugLine="Private mLength As Int";
_vvvvvvvv6 = 0;
 //BA.debugLineNum = 4;BA.debugLine="End Sub";
return "";
}
public String  _vvvvv7() throws Exception{
 //BA.debugLineNum = 37;BA.debugLine="Public Sub Clear";
 //BA.debugLineNum = 38;BA.debugLine="ChangeLength(0)";
_vvvvvv0((int) (0));
 //BA.debugLineNum = 39;BA.debugLine="End Sub";
return "";
}
public byte[]  _vvvvvvv1() throws Exception{
 //BA.debugLineNum = 103;BA.debugLine="Private Sub getBuffer As Byte() 'ignore";
 //BA.debugLineNum = 104;BA.debugLine="End Sub";
return null;
}
public byte[]  _getvvvvvvvv3() throws Exception{
 //BA.debugLineNum = 127;BA.debugLine="Public Sub getInternalBuffer As Byte()";
 //BA.debugLineNum = 128;BA.debugLine="Return mBuffer";
if (true) return _vvvvvvvv5;
 //BA.debugLineNum = 129;BA.debugLine="End Sub";
return null;
}
public int  _getvvvvvvvv4() throws Exception{
 //BA.debugLineNum = 92;BA.debugLine="Public Sub getLength As Int";
 //BA.debugLineNum = 93;BA.debugLine="Return mLength";
if (true) return _vvvvvvvv6;
 //BA.debugLineNum = 94;BA.debugLine="End Sub";
return 0;
}
public int  _vvvvvvv4(byte[] _searchfor) throws Exception{
 //BA.debugLineNum = 107;BA.debugLine="Public Sub IndexOf(SearchFor() As Byte) As Int";
 //BA.debugLineNum = 108;BA.debugLine="Return IndexOf2(SearchFor, 0)";
if (true) return _vvvvvvv5(_searchfor,(int) (0));
 //BA.debugLineNum = 109;BA.debugLine="End Sub";
return 0;
}
public int  _vvvvvvv5(byte[] _searchfor,int _index) throws Exception{
int _i1 = 0;
int _i2 = 0;
 //BA.debugLineNum = 112;BA.debugLine="Public Sub IndexOf2(SearchFor() As Byte, Index As";
 //BA.debugLineNum = 113;BA.debugLine="For i1 = Index To mLength - SearchFor.Length";
{
final int step1 = 1;
final int limit1 = (int) (_vvvvvvvv6-_searchfor.length);
_i1 = _index ;
for (;_i1 <= limit1 ;_i1 = _i1 + step1 ) {
 //BA.debugLineNum = 114;BA.debugLine="For i2 = 0 To SearchFor.Length - 1";
{
final int step2 = 1;
final int limit2 = (int) (_searchfor.length-1);
_i2 = (int) (0) ;
for (;_i2 <= limit2 ;_i2 = _i2 + step2 ) {
 //BA.debugLineNum = 115;BA.debugLine="If SearchFor(i2) <> mBuffer(i1 + i2) Then";
if (_searchfor[_i2]!=_vvvvvvvv5[(int) (_i1+_i2)]) { 
 //BA.debugLineNum = 116;BA.debugLine="Exit";
if (true) break;
 };
 }
};
 //BA.debugLineNum = 119;BA.debugLine="If i2 = SearchFor.Length Then";
if (_i2==_searchfor.length) { 
 //BA.debugLineNum = 120;BA.debugLine="Return i1";
if (true) return _i1;
 };
 }
};
 //BA.debugLineNum = 123;BA.debugLine="Return -1";
if (true) return (int) (-1);
 //BA.debugLineNum = 124;BA.debugLine="End Sub";
return 0;
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 6;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 7;BA.debugLine="Dim mBuffer(100) As Byte";
_vvvvvvvv5 = new byte[(int) (100)];
;
 //BA.debugLineNum = 8;BA.debugLine="mLength = 0";
_vvvvvvvv6 = (int) (0);
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvv6(int _index,byte[] _data) throws Exception{
byte[] _afterindex = null;
 //BA.debugLineNum = 43;BA.debugLine="Public Sub Insert(Index As Int, Data() As Byte)";
 //BA.debugLineNum = 44;BA.debugLine="If Index >= mLength Then";
if (_index>=_vvvvvvvv6) { 
 //BA.debugLineNum = 45;BA.debugLine="If Index > mLength Then Log(\"Index too large\")";
if (_index>_vvvvvvvv6) { 
__c.LogImpl("93211266","Index too large",0);};
 //BA.debugLineNum = 46;BA.debugLine="Append(Data)";
_vvvvvv6(_data);
 }else {
 //BA.debugLineNum = 48;BA.debugLine="Dim AfterIndex() As Byte = SubArray(Index)";
_afterindex = _vvvvvvv0(_index);
 //BA.debugLineNum = 49;BA.debugLine="ChangeLength(mLength + Data.Length)";
_vvvvvv0((int) (_vvvvvvvv6+_data.length));
 //BA.debugLineNum = 50;BA.debugLine="Bit.ArrayCopy(Data, 0, mBuffer, Index, Data.Leng";
__c.Bit.ArrayCopy((Object)(_data),(int) (0),(Object)(_vvvvvvvv5),_index,_data.length);
 //BA.debugLineNum = 51;BA.debugLine="Bit.ArrayCopy(AfterIndex, 0, mBuffer, Index + Da";
__c.Bit.ArrayCopy((Object)(_afterindex),(int) (0),(Object)(_vvvvvvvv5),(int) (_index+_data.length),_afterindex.length);
 };
 //BA.debugLineNum = 53;BA.debugLine="End Sub";
return "";
}
public byte[]  _vvvvvvv7(int _beginindex,int _endindex) throws Exception{
byte[] _res = null;
byte[] _afterendindex = null;
 //BA.debugLineNum = 69;BA.debugLine="Public Sub Remove(BeginIndex As Int, EndIndex As I";
 //BA.debugLineNum = 70;BA.debugLine="Dim res() As Byte = SubArray2(BeginIndex, EndInde";
_res = _vvvvvvvv1(_beginindex,_endindex);
 //BA.debugLineNum = 71;BA.debugLine="If EndIndex <= mLength Then";
if (_endindex<=_vvvvvvvv6) { 
 //BA.debugLineNum = 72;BA.debugLine="Dim AfterEndIndex() As Byte = SubArray(EndIndex)";
_afterendindex = _vvvvvvv0(_endindex);
 //BA.debugLineNum = 73;BA.debugLine="Bit.ArrayCopy(AfterEndIndex, 0, mBuffer, BeginIn";
__c.Bit.ArrayCopy((Object)(_afterendindex),(int) (0),(Object)(_vvvvvvvv5),_beginindex,_afterendindex.length);
 };
 //BA.debugLineNum = 75;BA.debugLine="ChangeLength(mLength - (EndIndex - BeginIndex))";
_vvvvvv0((int) (_vvvvvvvv6-(_endindex-_beginindex)));
 //BA.debugLineNum = 76;BA.debugLine="Return res";
if (true) return _res;
 //BA.debugLineNum = 77;BA.debugLine="End Sub";
return null;
}
public String  _vvvvvv2(int _index,byte[] _data) throws Exception{
 //BA.debugLineNum = 56;BA.debugLine="Public Sub Set(Index As Int, Data() As Byte)";
 //BA.debugLineNum = 57;BA.debugLine="If Index >= mLength Then";
if (_index>=_vvvvvvvv6) { 
 //BA.debugLineNum = 58;BA.debugLine="If Index > mLength Then Log(\"Index too large\")";
if (_index>_vvvvvvvv6) { 
__c.LogImpl("93276802","Index too large",0);};
 //BA.debugLineNum = 59;BA.debugLine="Append(Data)";
_vvvvvv6(_data);
 }else {
 //BA.debugLineNum = 61;BA.debugLine="If Data.Length + Index > mLength Then";
if (_data.length+_index>_vvvvvvvv6) { 
 //BA.debugLineNum = 62;BA.debugLine="ChangeLength(Data.Length + Index)";
_vvvvvv0((int) (_data.length+_index));
 };
 //BA.debugLineNum = 64;BA.debugLine="Bit.ArrayCopy(Data, 0, mBuffer, Index, Data.Leng";
__c.Bit.ArrayCopy((Object)(_data),(int) (0),(Object)(_vvvvvvvv5),_index,_data.length);
 };
 //BA.debugLineNum = 66;BA.debugLine="End Sub";
return "";
}
public byte[]  _vvvvvvv0(int _beginindex) throws Exception{
 //BA.debugLineNum = 80;BA.debugLine="Public Sub SubArray(BeginIndex As Int) As Byte()";
 //BA.debugLineNum = 81;BA.debugLine="Return SubArray2(BeginIndex, mLength)";
if (true) return _vvvvvvvv1(_beginindex,_vvvvvvvv6);
 //BA.debugLineNum = 82;BA.debugLine="End Sub";
return null;
}
public byte[]  _vvvvvvvv1(int _beginindex,int _endindex) throws Exception{
byte[] _b = null;
 //BA.debugLineNum = 86;BA.debugLine="Public Sub SubArray2(BeginIndex As Int, EndIndex A";
 //BA.debugLineNum = 87;BA.debugLine="Dim b(EndIndex - BeginIndex) As Byte";
_b = new byte[(int) (_endindex-_beginindex)];
;
 //BA.debugLineNum = 88;BA.debugLine="Bit.ArrayCopy(mBuffer, BeginIndex, b, 0, b.Length";
__c.Bit.ArrayCopy((Object)(_vvvvvvvv5),_beginindex,(Object)(_b),(int) (0),_b.length);
 //BA.debugLineNum = 89;BA.debugLine="Return b";
if (true) return _b;
 //BA.debugLineNum = 90;BA.debugLine="End Sub";
return null;
}
public byte[]  _vvvvvvvv2() throws Exception{
 //BA.debugLineNum = 97;BA.debugLine="Public Sub ToArray() As Byte()";
 //BA.debugLineNum = 98;BA.debugLine="Return SubArray(0)";
if (true) return _vvvvvvv0((int) (0));
 //BA.debugLineNum = 99;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
