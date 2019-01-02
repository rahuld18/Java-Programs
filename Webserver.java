import java.net.*;
import java.io.*;
 class Webserver extends Thread
{  ServerSocket S=null;
   DataInputStream cmsg=null;
   PrintStream stoc=null;
   public Webserver()
   { try{
	   S=new ServerSocket(1000);
	   start();
} catch(Exception e)
 {System.out.println(e);
	 }
	   }

	public void run()
	{  try{
	Socket C=S.accept();
     System.out.println("Client Connected");
	 stoc=new PrintStream(C.getOutputStream());
	 stoc.println("Hello Client");

	 C.close();
 }catch(Exception e)
 {
	 System.out.println(e);}

		}

	 public static void main(String arg[])
	 { new Webserver();
		 }
	}