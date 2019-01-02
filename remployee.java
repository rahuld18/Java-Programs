import java.util.Scanner;


class employe
{
	private int id;
	private String name;
	protected long salary;
	Scanner sc=new Scanner(System.in);
	void getemp()
	{
		System.out.print("Enter Name=");
		name=sc.nextLine();
		System.out.println();
		System.out.print("Enter id=");
		id=sc.nextInt();
		System.out.println();
		System.out.print("Enter salary=");
		salary=sc.nextLong();
		System.out.println();
	}
	void putemp()
	{
		System.out.println("-------------");
		System.out.println("Name="+name);
		System.out.println("ID="+id);
		System.out.println("Salary="+salary);
		
	}
	
	
}
class perks extends employe
{
	protected long dra,hra,pf;
    
	
	void cal()
	{
    dra=salary*20/100;

hra=salary*12/100;
pf=salary*5/100;
	}

	void putEmploye()
	{
		putemp();
         cal();
		System.out.println("DRA="+dra);
		System.out.println("HRA="+hra);
		System.out.println("PF="+pf);
	}


	
}
class netsalary extends perks
{
	private long net;
	
	void nets()
	{
		net= salary+dra+hra-pf;
		System.out.println("Net salary="+net);
	}
}
class remployee
{
	public static void main(String arg[])
	{
		netsalary e=new netsalary();
		e.getemp();
		e.putEmploye();
		
		e.nets();
	}
	
}