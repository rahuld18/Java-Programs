import java.util.Scanner;
class rstringpro
{
public static void main(String arg[])
{
	
Scanner sc=new Scanner(System.in);

String s=new String("GWALIOR");
String c=s.toLowerCase();
System.out.println(s+" "+c);
System.out.println(s==c);
int l=s.length()+c.length();;
System.out.println(l);
//char charAt(index);
int z=c.charAt(2);System.out.println(z);

if(s==c)
	System.out.println("Equal ");

else
	System.out.println("not equal ");


if(s.equalsIgnoreCase(c))
	System.out.println("equal");

else
	System.out.println("not equal");//not equal

if(s.equalsIgnoreCase(c))
	System.out.println("equal");

else
	System.out.println("not equal");//equal



boolean t=c.endsWith("ior");

System.out.println(t);

int g=s.indexOf('L');//int indexOf(character)   3
System.out.println(g);
String m=new String("malayalam");
int i=0;
while(true)
{
i=m.indexOf('a',i);
if(i==-1)
	break;
System.out.println(i);

i++;	
}

String q=new String("mohan das ailani");
int i1=q.indexOf(" ")+1;
int i2=q.lastIndexOf(" ");
String q1=q.substring(i1,i2);
System.out.println(q1);
String p=new String("Mohan das pratap singh");
String k1[]=p.split(" ");
for(int a1=0;a1<k1.length;a1++)
System.out.println(k1[a1]);

System.out.println("\n\n");

byte b1[]=k1[0].getBytes();
for(int a1=0;a1<b1.length;a1++)
{
	System.out.println(b1[a1]);
b1[a1]=(byte)(b1[a1]-1);
}

String b12=new String(b1);
System.out.println(b12);





StringBuffer x=new StringBuffer("hariom jai bhagwan ki ujjain wale bholenath ki jai ho jai bam bam bhole");
int Length=x.length();
int capacity=x.capacity();
int BufferSize=capacity-Length;
System.out.println(Length+" \n" + capacity  + " \n" + BufferSize);


























}	
	
	
}