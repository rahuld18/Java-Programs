 class trycatch
{
	public static void main(String ar[])
	{
		

		try{
		int a=1,b=0,c;
		c=a/b;
		System.out.println(c);
		}
		catch(ArithmeticException e) //jo b exception aaega voh try sidhe throw krdega catch mein
		//catch mein ArithmeticException is a class and e is a object
		{
			System.out.println("error"+e);
			System.out.println("error"+e.getMessage()); //tecjnology konsi use kri h nipta padegi ise java hide ho jaega;
		}
		System.out.println("bye");
	}

}