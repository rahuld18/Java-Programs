import java.util.Scanner;
class r_three_greater 
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);

int x=sc.nextInt();
int y=sc.nextInt();
int z=sc.nextInt();
int k=x>y?(x>z?x:z):y>z?y:z;

	System.out.println(k);





}	
	
	
}