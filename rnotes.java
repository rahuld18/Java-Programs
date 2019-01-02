import java.util.Scanner;
class rnotes 
{
public static void main(String arg[])
{int q,r=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter Amount=");
int amt=sc.nextInt();

if(amt>0)
{
 q=amt/2000;
 r=amt%2000;
System.out.println(" 2000 notes="+q);

}
if(r>0)
{
	q=r/500;
	r=r%500;
	System.out.println("500 notes="+q);
	
}

if(r>0)
{
	q=r/100;
	r=r%100;
	System.out.println("100 notes="+q);
	
}
if(r>0)
{
	q=r/50;
	r=r%50;
	System.out.println("100 notes="+q);
	
}

}	
	
	
}