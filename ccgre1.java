
import java.util.*;

class ccgre1{
	
	
	
	
	public static void main(String arg[])
{
	int i,j,c=0;
Scanner sc=new Scanner(System.in);

int d=sc.nextInt();
int a[]=new int[]{1,2,4,8,16,32,64,128,256,1024,2048};
while(d-->0)
{c=0;
      int n=sc.nextInt();
	  
	  
	  for(i=0;i<a.length;i++)
	  {
		  if(n<a[i])
		  {
			  if(n%2==0){
				  c++;
			  break;}
			   n=n-a[i-1];
			  if(n%2==0)
			  {
				  c=c+2;
				  break;
			  }
			  else if(n==1)
				  c++;
			  else{
				  
				  c++;
				  i=0;
				  continue;
				  
			  }
		  }
	  }
System.out.println(c);
}








}
}