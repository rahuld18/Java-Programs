import java.util.Scanner;
import java.util.InputMismatchException;
 public class scan
{
	public static  int integer(String msg)
	{ int a;
	boolean error=false;
		
do{Scanner kb=new Scanner(System.in);
a=0;
		try{
			System.out.print(msg);
		
		a=kb.nextInt();
		System.out.println(a);
		 error=false;
		}
		catch(InputMismatchException e)      /*         3.3
        {                                     errorjava.util.InputMismatchException
                                              errornull
                                               program ends*/
											   {error=true;
			System.out.println("Invalid input "+e);
			System.out.println("Invalid input "+e.getMessage()); //tecjnology konsi use kri h nipta padegi ise java hide ho jaega;
		}
}while(error);
		return a;
	}
	public static  float floatInput(String msg)
	{float s;;
	boolean error=false;
		do{Scanner kb=new Scanner(System.in);
			s=(float)0.0;
			try{
	System.out.print(msg);
		 s=kb.nextFloat();
	    System.out.println(s);
		error=false;
	}
	catch(InputMismatchException e)
	{error=true;
		System.out.println("error"+e.getMessage());
		
		System.out.println("Invalid input");
	}
	}while(error);
	return s;
	}
}