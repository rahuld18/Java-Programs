import java.util.Scanner;
 class SpellEngine extends Thread
 {  String word=new String();
	 public void run()
  { while(true)
    {if(word.equalsIgnoreCase("play"))
    {System.out.println(word+" Tested");
		  }
	 else if(word.equalsIgnoreCase("utilities"))
      {System.out.println(word+" Tested");
		  }
	 else if(word.equalsIgnoreCase("tools"))
      {System.out.println(word+" Tested");
		  }
	 else if(word.equalsIgnoreCase("stop"))
      { stop();
		  }
	 else
	 {System.out.println("Invalid Word...");
		 }
	  suspend();
	}}}

class thread3
{ public static void main(String arg[])
  { SpellEngine S=new SpellEngine();
    S.start();
    do
    {Scanner KB=new Scanner(System.in);
    System.out.print("Enter Word:");
    S.word=KB.next();
    S.resume();
 }while(!S.word.equalsIgnoreCase("stop"));
}}
