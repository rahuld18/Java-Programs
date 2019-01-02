 class Printer //producer
 { void process()
   { System.out.println(Thread.currentThread().getName()+" Using Printer...");}
	 }
  class User extends Thread //consumer
  {  private Printer P;
     User(String tn,Printer P)
     { super(tn);
       this.P=P;
		 }
	 public void run()
	 {for(int i=1;i<=5;i++)
	    {P.process();}
		 }
	  }

class thread4
{ public static void main(String arg[])
  { Printer P=new Printer();
    User U1=new User("Ajay",P);
    User U2=new User("Peter",P);
    User U3=new User("Smith",P);
    U1.start();
    U2.start();
    U3.start();

    }}


