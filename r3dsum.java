import java.util.Scanner;
class r3dsum 
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int r=sc.nextInt();
int c=sc.nextInt();
int a[][][];
a=new int[n][r][c];
System.out.println("Enter elements in 2  array then u will get the sum of two array ::");
int i,j,k;

  for(i=0;i<a.length-1;i++)
  {
	  System.out.println("Enter elements in" + (i+1) + "array::=");
	  
	  for(j=0;j<a[i].length;j++)
	  {
		  
		  for(k=0;k<a[i][j].length;k++)
		  {
			  a[i][j][k]=sc.nextInt();
			  
			  
		  }
		  
		  
		  
	  }
	  System.out.println("\n\n");
	  
	  
	  
  }
  
  
   for(j=0;j<a[i].length;j++)
	  {
		  
		  for(k=0;k<a[i][j].length;k++)
		  {
			  a[2][j][k]=a[0][j][k]+a[1][j][k];
			  
			  
		  }
		  
		  
		  
	  }
  
  
  for(i=0;i<a.length;i++)
  {
	  System.out.println("\t"+(i+1)+"array::=");
	  for(j=0;j<a[i].length;j++)
	  {
		  
		  for(k=0;k<a[i][j].length;k++)
		  {
			  
			  System.out.print(" "+a[i][j][k]+" ");
			  
			  
		  }
		  
		  System.out.println();
		  
	  }
	  
	   System.out.println();
	    System.out.println();
	  
	  
  }

	





}	
	
	
}