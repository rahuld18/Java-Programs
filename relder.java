import java.util.Scanner;
class person
{
	private String name;
	private int age;
	
	Scanner sc=new Scanner(System.in);
	void getPerson()
	{
		System.out.print("Enter name=");
		name=sc.nextLine();
		System.out.print("Enter age=");
		age=sc.nextInt();
		
	}
	void putPerson()
	{
		System.out.println("name="+name);
		System.out.println("name="+age);
		
		
		
	}
	person elder(person p)
	{
		if(age>p.age)
			return this;
		return p;
		
		
	}
	
}


class relder
{
	public static void main(String arg[])
	{
		
		person p1=new person();
		p1.getPerson();
		person p2=new person();
		p2.getPerson();
		person p3=p1.elder(p2);
		p3.putPerson();
		
	}
	
	
}
