import java.util.Scanner;
class rsummatrix
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
 
 for(i=0;i<x.length;i++)
 {
   for(j=0;j<x[i].length;j++)
   {

     z[i][j]=x[i][j]+y[i][j];
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