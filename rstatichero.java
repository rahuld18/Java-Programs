import java.util.Scanner;
class hero
{
	private int cno;
	private String name;
	static private int np,ng,no;
	
	
	Scanner sc=new Scanner(System.in);
	void getVehicle( )
	{
		
		System.out.print("Enter name=");
		name=sc.nextLine();
		System.out.print("Enter chasis no=");
		cno=sc.nextInt();
		
		if(name.compareTo("passion")==0)
			np++;
		else if(name.compareTo("glamour")==0)
			ng++;
		else
			no++;
		
	}
	void putVehicle()
	{
		System.out.println("Name="+name);
		System.out.println("Chasis no="+cno);
	}
	static void noOfVehicle()
	{
System.out.println("no of passion="+np);
System.out.println("no of Glamour="+ng);
System.out.println("no of other vehicle="+no);
	}	
	boolean search(String n)
	{
		if(name.compareTo(n)==0)
			return true;
		return false;
		
	}
}

class rstatichero
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no of vehicles=");
		int vehi=sc.nextInt();
			hero v[]=new hero[vehi];
			for(int i=0;i<vehi;i++)
			{
				v[i]=new hero();
				v[i].getVehicle();
				
			}
			hero.noOfVehicle();
			System.out.print("Enter name to know about vehicle  details=");
			String n=sc.next();boolean found=false;
			for(int i=0;i<vehi;i++)
			{
			found=v[i].search(n);
			if(found)
				v[i].putVehicle();
			}
	if(!found)
System.out.print("vehicle not found");		
	}
	
	
}
