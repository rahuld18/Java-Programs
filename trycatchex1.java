import java.util.Scanner;
import java.util.InputMismatchException;
 class trycatchex1
{
	public static void main(String ar[])
	{ 
	boolean error=false;
		
do{Scanner kb=new Scanner(System.in);
		try{
		int a;
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
		System.out.println("program ends");
	}

}