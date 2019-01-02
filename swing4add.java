import javax.swing.*;
import java.awt.event.*;

class swing4add extends JFrame
{
	JLabel l1,l2,l3,l4;
	JTextField t1,t2;
	JButton b;
	
	public swing4add(){
		
	}
	public swing4add(String s)
	{
		super(s);
		
	}
	public void setComponents()
	{
		l1=new JLabel("Addition of two no..");
		l2=new JLabel("First no");
		l3=new JLabel("Second no");
		l4=new JLabel();
		t1=new JTextField();
        t2=new JTextField();
		b=new JButton();
		b=new JButton("ADD");
		setLayout(null);
		l1.setBounds(150,50,140,50); //(x,y,width,height)
         l2.setBounds(50,90,110,50); 
		 t1.setBounds(140,100,140,30); 
		 l3.setBounds(50,140,140,50); 

		 t2.setBounds(140,150,140,30);
		b.setBounds(155,220,60,30);
		l4.setBounds(155,270,100,40);
		b.addActionListener(new Handler());
		add(t1);
		add(t2);
		add(l1);
		add(l2);
		add(l3);
		add(l4);
		add(b);
		}
		
		
		class Handler implements ActionListener
		{
			public void actionPerformed(ActionEvent e)
			{
				int a=Integer.parseInt(t1.getText());
				int b=Integer.parseInt(t2.getText());
				
				int c=a+b;
				l4.setText("Result is="+c);
			}
		}
		
		
	public static void main(String a[])
	{
		
		
	swing4add jf=new swing4add("Swing Example"); 
	jf.setComponents();
	jf.setSize(500,500);// width,height in pixels
	jf.setVisible(true); //dialog box uska visible ho jae
	jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// cross pe click krte hi program close ho jaega
	}
}