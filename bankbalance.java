import java.util.Scanner;
class bank
{
	private int accno;
	private String name;
	private int balance;
	static private int bankbalance;
	
	
	Scanner sc=new Scanner(System.in);
	void getCustomer( )
	{
		
		System.out.print("Enter name=");
		name=sc.nextLine();
		System.out.print("Enter Account no=");
		accno=sc.nextInt();
		System.out.print("Balance=");
		balance=sc.nextInt();
		
		bankbalance=bankbalance+balance;
		
	}
	void putCustomer()
	{
		System.out.println("Name="+name);
		System.out.println("Account number="+accno);
		System.out.println("Balance="+balance);
	}
	static void bankBalance()
	{
System.out.println("Bank Balance="+bankbalance);
	}	
	
}

class bankbalance
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no of customers=");
		int cust=sc.nextInt();
			bank c[]=new bank[cust];
			for(int i=0;i<cust;i++)
			{
				c[i]=new bank();
				c[i].getCustomer();
				
			}
			bank.bankBalance();
			
	}
	
	
}
