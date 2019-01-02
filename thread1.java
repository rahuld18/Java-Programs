class ProcessOne extends Thread
{ public void run()
  {while(true)
   {System.out.println("Process One....");}
	  }
	}
class ProcessTwo extends Thread
{ public void run()
  {while(true)
   {System.out.println("Process Two....");}
	  }
	}

class ProcessThree extends Thread
{ public void run()
  {while(true)
   {System.out.println("Process Three....");}
	  }
	}
class thread1
{ public static void main(String arg[])
  {ProcessOne P1=new ProcessOne();
   ProcessTwo P2=new ProcessTwo();
   ProcessThree P3=new ProcessThree();
   P1.start();
   P2.start();
   P3.start();
	  }

	}