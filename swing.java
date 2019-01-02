import javax.swing.*;

class swing{
	public static void main(String a[])
	{
	JFrame jf=new JFrame("Swing Example"); // we pass Swing Example this string in constructor it is title
	jf.setSize(300,300);// width,height in pixels
	jf.setVisible(true);
	jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// cross pe click krte hi program close ho jaega
	}
}