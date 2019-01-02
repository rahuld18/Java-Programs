import java.util.Scanner;
class rjagged 
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter rows=");
int r=sc.nextInt();
int a[][]=new int [r][];

for(int i=0;i<a.length;i++)
{
	System.out.println("Enter cols");
	int c=sc.nextInt();
	System.out.println("Enter number::");
	a[i]=new int [c];
	for(int j=0;j<a[i].length;j++)
	{
		a[i][j]=sc.nextInt();
	}
	
	
}
for(int i=0;i<a.length;i++)
{
	
	for(int j=0;j<a[i].length;j++)
	{
		System.out.print(" "+a[i][j]);
	}
	System.out.println();
	
}

}	
	
	
}