import javax.swing.*;

class swing2 extends JFrame
{
	
	public swing2(){
		
	}
	public swing2(String s)
	{
		super(s);
		
	}
	public static void main(String a[])
	{
		
		
	swing2 jf=new swing2("Swing Example"); // error parametric constructor is not there
	jf.setSize(300,300);// width,height in pixels
	jf.setVisible(true); //dialog box uska visible ho jae
	jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// cross pe click krte hi program close ho jaega
	}
}