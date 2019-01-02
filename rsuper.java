import java.util.Scanner;

class a
{int c;
 a(int x)
 {c=x;
	 System.out.println("A");
 }	 
 void put()
 {
	 System.out.println(c);
 }
}
 class b extends a
{
	b()
	{super(4);
		System.out.println("B");
		
	}
	
}




class rsuper 
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
b o=new b();
o.put();



	





}	
	
	
}