


class unicode{
	public static void main(String[] a){
String s = "your string with \u";
StringBuffer sbuffer=new StringBuffer();
for(int i=0;i<s.length();i++){
char ch= s.charAt(i);
if(ch>='\u0000' && ch<='\u001F'){
String ss=Integer.toHexString(ch);
sbuffer.append("\\u");
for(int k=0;k<4-ss.length();k++){
sbuffer.append('0');
}
sbuffer.append(ss.toUpperCase());

}
else{
sbuffer.append(ch);

}
}
	}

}