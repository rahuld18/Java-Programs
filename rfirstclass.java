import java.util.Scanner;

class student
{
	Scanner sc =new Scanner(System.in);
private int code;
private String name;
void getstudent()
{

System.out.print("Emter name=");
name=sc.nextLine();
System.out.print("Enter code=");
code=sc.nextInt();
}	
void putstudent()
{

System.out.println("Name="+name);
System.out.println("Code="+code);
}	
	
	
	
	
}



class rfirstclass
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
student s=new student();
System.out.println();
s.getstudent();
s.putstudent();
	





}	
	
	
}