import java.net.*;
import java.io.*;
public class client{
	
	Socket C=null;
	public client()
	{
		try{
			connectToserver();
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
	void connectToserver()
	{
		while(true)
		{
			try{
				C=new Socket("localhost",1000);
				DataInputStream kb=new DataInputStream(System.in);
				System.out.println("Client");
				String cm=kb.readLine();
				PrintStream ctos=new PrintStream(C.getOutputStream());
				ctos.println(cm);
				  DataInputStream smsg=new DataInputStream(C.getInputStream());
	
	             String msg=smsg.readLine();
				 System.out.println("Server Says:"+msg);
	}catch(Exception e)
	{System.out.println(e);
		}
	
				
				
				
			}
		}public static void main(String arg[])
	{
		new client();
		}

	}
	
