
import java.util.*;

class ccgre{
	
	public static void main(String arg[])
{
	int i,j,c=0;
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int d=sc.nextInt();

int a[];
a=new int[n];
for(i=0;i<a.length;i++)
{
	
a[i]=sc.nextInt();	
}
for(i=0;i<a.length;i++)
		{
		for(j=0;j<a.length-i-1;j++)
		{
			if(a[j]>a[j+1])
			{
			int temp=a[j];
			a[j]=a[j+1];
			a[j+1]=temp;
			
			
		    }
		}	



	
}
for(i=0;i<a.length-1;i++)
{
	//System.out.println(a[i]);
	if(a[i+1]-a[i]<=d)
	{
		c++;
		i++;
	}
	
}
System.out.println(d);
}
}