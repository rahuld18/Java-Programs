//Example of Yield/Stop/Sleep(n)
class ProcessOne extends Thread
{ public void run()
  {for(int i=1;i<=5;i++)
   {  if(i==3)
     {System.out.println("Process One Relinquish Control Here....");
      yield();
     }
	   System.out.println("Process One....");}
	  }
	}
class ProcessTwo extends Thread
{ public void run()
  {for(int i=1;i<=5;i++)
   { try{sleep(1000);}catch(InterruptedException e){}
	   System.out.println("Process Two....");}
	  }
	}

class ProcessThree extends Thread
{ public void run()
  {for(int i=1;i<=5;i++)
   { if(i==3){stop();}
	   System.out.println("Process Three....");}
	  }
	}
class thread2
{ public static void main(String arg[])
  {ProcessOne P1=new ProcessOne();
   ProcessTwo P2=new ProcessTwo();
   ProcessThree P3=new ProcessThree();
   P1.start();
   P2.start();
   P3.start();
	  }

	}