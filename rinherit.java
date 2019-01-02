import java.util.Scanner;

class student
{
	private int rollno;
	private String name;
	Scanner sc=new Scanner(System.in);
	void getStudent()
	{
				System.out.print("Enter name=");
				name=sc.nextLine();
						System.out.print("Enter roll no=");
						rollno=sc.nextInt();
				
	   
    }
	void putStudent()
	{System.out.println("------------------");

	System.out.print("Name=");

		System.out.println(name);
System.out.print("Roll No=");
				System.out.println(rollno);
	}
	
}

class bse extends student
{
private int p,c,m;

void getbse()
{
	getStudent();
			System.out.println("Enter physics marks");
			p=sc.nextInt();
			
			System.out.println("Enter chemistry marks");
			c=sc.nextInt();
			
			System.out.println("Enter maths marks");
			m=sc.nextInt();
}
void putbse()
{
	putStudent();
	
	System.out.print("physics marks=");
			System.out.println(p);
			System.out.print("chemistry marks=");
			System.out.println(c);
System.out.print("maths marks=");

			System.out.println(m);
	
	
}

int getTotal()
{
	return p+c+m;
}


	
}
class total extends bse
{
	private int t;
	void show()
	{
		t=getTotal();
		System.out.print("total="+t);

	}
}

class rinherit
{
	public static void main(String arg[])
	{
		total s=new total();
		s.getbse();
		s.putbse();
		
		s.show();
	}
}
