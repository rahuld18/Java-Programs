
package com.infosys.math;
import java.util.Scanner;  
public class mat
{
    public static int n;
	public static String  name;
	static Scanner sc=new Scanner(System.in);
	public static void show()
	{
		System.out.println("hii");
	}
	public void run()
	{
		
	System.out.println("hello");
	}
	public static void getInt(String msg)
	{
		System.out.print(msg+"=");
		 n=sc.nextInt();
	}
	static Scanner zc=new Scanner(System.in);
	public static void getString(String msg)
	{
		System.out.print(msg+"=");
		 name=zc.nextLine();
	}
	public static void showInt(String msg)
	{
		System.out.print(msg+"="+n);
		 
	}
	
	public static void showString(String msg)
	{
		System.out.print(msg+"="+name);
		 
	}
	
	
}