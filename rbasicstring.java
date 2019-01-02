import java.util.Scanner;
class rbasicstring 
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
String s=new String("GWALIOR");
s=s+"city";
String c=s.toLowerCase();
System.out.println(c);
String s1=new String("k");
System.out.println(s==s);

int l=s.length();
System.out.println(l);
char a=s.charAt(10);

System.out.println(a);

for(int i=l-1;i>=0;i--)
{
	char x=s.charAt(i);
	System.out.print(x);
}
System.out.println();
String s3=new String("amit");
String s2=new String("zt");
if(s3==s2){
	
	System.out.println("Equal");
}
else
	System.out.println("Not equal");
if(s3.equals(s2)){
	
	System.out.println("Equal");
}
else
	System.out.println("Not equal");
}	
	
	
}