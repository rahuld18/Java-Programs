import java.util.Scanner;
class rtramatrix 
{
public static void main(String arg[])
{int i,j;
int x[][],y[][];
Scanner sc=new Scanner(System.in);
System.out.println("Enter rows n cols::");
int r=sc.nextInt();
int c=sc.nextInt();
x=new int [r][c];
y=new int [r][c];
 System.out.println("Enter elements in  array");
 for(i=0;i<x.length;i++)
 {
   for(j=0;j<x[i].length;j++)
   {

     x[i][j]=sc.nextInt();
   }	   
	
	
 }
 for(i=0;i<r;i++)
 {
   for(j=0;j<c;j++)
   {
y[j][i]=x[i][j];

   }	   
	
 }
 System.out.println("Before transpose::");
 for(i=0;i<r;i++)
 {
   for(j=0;j<c;j++)
   {

System.out.print(" "+x[i][j]);
   }	   
	System.out.println();
 }

 System.out.println();
 System.out.println("After transpose::");

 
  for(i=0;i<r;i++)
 {
   for(j=0;j<c;j++)
   {

System.out.print(" "+y[i][j]);
   }	   
	System.out.println();
 }





}	
	
	
}