import java.util.Scanner;
class rlinear 
{
public static void main(String arg[])
{int i,c=1;
Scanner sc=new Scanner(System.in);
System.out.println("Enter no of Element? ");
int n=sc.nextInt();
int x[]=new int[n];

System.out.println("Enter "+n+" elements:");

//int =sc.nextInt();
for(i=0;i<n;i++)
{
	x[i]=sc.nextInt();

}	
System.out.println("Enter item which u want to search? ");
int item=sc.nextInt();
for(i=0;i<n;i++)
{
if(x[i]==item)
{
	System.out.println("Element is found at index "+(i+1));
	c=1;
	break;

}
else
	c=0;

	
}
	if(c==0)
		System.out.println("Element not found");
	
}
}