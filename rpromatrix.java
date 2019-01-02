import java.util.Scanner;
class rpromatrix
{
public static void main(String arg[])
{int i,j;
int x[][],y[][],z[][];
Scanner sc=new Scanner(System.in);
System.out.println("Enter rows n cols::");
int r=sc.nextInt();
int c=sc.nextInt();
x=new int [r][c];
y=new int [r][c];
z=new int [r][c];

System.out.println("Enter numbers for 1st array::");
 for(i=0;i<x.length;i++)
 {
   for(j=0;j<x[i].length;j++)
   {

     x[i][j]=sc.nextInt();
   }	   
	
 }
 System.out.println("Enter numbers for 2nd array::");
 for(i=0;i<y.length;i++)
 {
   for(j=0;j<y[i].length;j++)
   {

     y[i][j]=sc.nextInt();
   }	   
	
 }
 for(int k=0;k<3;k++)
 {
       for(i=0;i<z.length;i++)
	   {
		   for(j=0;j<z[i].length;j++)
		   {
 
 z[k][i]=z[k][i]+x[k][j]*y[j][i];
 
		   }
 
 
	   }
	
 }
 
 for(i=0;i<z.length;i++)
 {
   for(j=0;j<z[i].length;j++)
   {
 System.out.print(" "+z[i][j]);
    
   }
   
System.out.println();   
	
 }






}	
	
	
}