import java.util.Scanner;

class student
{
	Scanner sc =new Scanner(System.in);
private int rollno;
private String name;
void getstudent()
{

System.out.print("Enter name=");
name=sc.nextLine();
System.out.print("Enter rollno=");
rollno=sc.nextInt();
}	
void putstudent()
{

System.out.println("Name="+name);
System.out.println("rollno="+rollno);
}	
	boolean search(int ro)
	{
		if(ro==rollno)
			return true;
		return false;
		
	}
	boolean sear(String na)
	{
		
		if(na.contains(name))
			return true;
		return false;
	}
	
	
	
}



class rsearching
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);

System.out.println();
student s[]=new student[2];
for(int i=0;i<2;i++)
{s[i]=new student();
s[i].getstudent();

}
boolean found=false;
System.out.print("Enter roll no of student that you want to search=");
int ro=sc.nextInt();

for(int i=0;i<2;i++)
{
found=s[i].search(ro);
	
	if(found)
	{
		s[i].putstudent();
		break;
		
	}
	
}

if(!found)
	{
		
		System.out.println("roll no is not found");
		
	}
	found=false;
	Scanner sd=new Scanner(System.in);
System.out.print("Enter name of student that you want to search=");
String na=sd.nextLine();
for(int i=0;i<2;i++)
{
	found=s[i].sear(na);
	if(found)
	{s[i].putstudent();
	break;
	}
	if(!found)
		System.out.println("name is not found");
}


}	
	
	
}