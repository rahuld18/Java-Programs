import java.util.Scanner;
class rbubble 
{
public static void main(String arg[])
{int i,temp,j;
Scanner sc=new Scanner(System.in);
System.out.println("Enter no of Element ? ");
int n=sc.nextInt();
int x[]=new int[n];

System.out.println("Enter elements::");

//int =sc.nextInt();
for(i=0;i<n;i++)
{
	x[i]=sc.nextInt();

}	

for(i=0;i<n;i++)
{
	for(j=0;j<n-i-1;j++)
	{
if(x[j]>x[j+1])
{
	temp=x[j];
	x[j]=x[j+1];
	x[j+1]=temp;

}	

	
}
	
	
}
System.out.println();
for(i=0;i<n;i++)
{
	System.out.println(x[i]);

}	
}
}