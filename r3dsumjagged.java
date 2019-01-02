import java.util.Scanner;
class r3dsumjagged 
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int r=sc.nextInt();
int c=0;
int a[][][];
a=new int[n][r][];
int i,j,k;


  for(i=0;i<a.length;i++)
  {
	  System.out.println("Enter elements in\t" + (i+1) + "\tarray::=");
	  
	  for(j=0;j<a[i].length;j++)
	  {
		   System.out.print("Enter no of cols=");
		  c=sc.nextInt();
		  a[i][j]=new int[c];
		  for(k=0;k<c;k++)
		  {
			  a[i][j][k]=sc.nextInt();
			  
			  
		  }
		  
		  
		  
	  }
	  System.out.println("\n\n");
	  
	  
	  
  }
  
  /*
   for(j=0;j<a[i].length;j++)
	  {
		  
		  for(k=0;k<a[i][j].length;k++)
		  {
			  a[2][j][k]=a[0][j][k]+a[1][j][k];
			  
			  
		  }
		  
		  
		  
	  }
  */
  
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