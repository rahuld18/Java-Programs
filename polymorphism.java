import java.util.*;

class A
{
	
	void show()
	{
	System.out.println("A");	
	}
}
	class B extends A
	{
		void show()
		{
	System.out.println("B");
		}
	}	
	





class polymorphism
{
	public static void main(String arg[])
	{
		B o =new B();
		o.show();
		//o.show(3);
		A q=new A();
		q.show();
		q=o;
		q.show();
		
	}
}