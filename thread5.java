class ServiceProvider extends Thread
{ public void run()
  {while(true)
  {   System.out.println("Service Provider of Main....");
	   try{sleep(1000);}catch(Exception e){}
	   } }
	}
class thread5
{ public static void main(String arg[])
  { ServiceProvider S=new ServiceProvider();
  S.setDaemon(true);
    S.start();
     try{Thread.sleep(5000);}catch(Exception e){}
     System.out.println("Main Function Killed...");

	  }}

