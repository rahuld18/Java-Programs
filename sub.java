import java.util.*;
class sub{
	
	public static void main(String a[])
	{
		int d=0,i,j;
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for( i=1;i<=t;i++)
		{
			int n=sc.nextInt();
			
			
		String s=new String();
		s=sc.next();

		for(i=1;i<n;i++)
		{
			for(j=1;j<n;j++)
			{
			if(s.substring(i,j).startsWith("1") && s.substring(0,j).endsWith("1") )
				d++;
			
			}
		}
		System.out.println(d);
		
		}
	}
	
	
}