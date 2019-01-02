import java.awt.event.*;
import javax.swing.*;




class rjavacalc extends JFrame implements ActionListener
{
	JLabel l1,l2,l3;
	JTextField t1,t2;
	JButton b1,b2,b3,b4;
	rjavacalc()
	{
		
	}
	rjavacalc(String s)
	{
		super(s);
	}
	

	
	public void actionPerformed(ActionEvent e)
	{if(e.getSource()==b1)
		{
			int a=Integer.parseInt(t1.getText());
				int b=Integer.parseInt(t2.getText());
				int c=a+b;
				l3.setText("Sum="+c);
		}
		if(e.getSource()==b2)
		{
			int a=Integer.parseInt(t1.getText());
				int b=Integer.parseInt(t2.getText());
				int c=a-b;
				l3.setText("Subtract="+c);
		}
		if(e.getActionCommand().equals("*"))
		{
			int a=Integer.parseInt(t1.getText());
				int b=Integer.parseInt(t2.getText());
				int c=a*b;
				l3.setText("Multiply="+c);
		}
		if(e.getSource()==b4)
		{
			int a=Integer.parseInt(t1.getText());
				int b=Integer.parseInt(t2.getText());
				int c=a/b;
				l3.setText("Division="+c);
		}
		
	}
void setComponents()
{l1=new JLabel("Enter first no:");

l2=new JLabel("Enter second no:");

l3=new JLabel();

t1=new JTextField();
t2=new JTextField();
b1=new JButton("+");
b2=new JButton("-");
b3=new JButton("*");
b4=new JButton("/");
b1.addActionListener(this);

b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);


setLayout(null);
l1.setBounds(50,50,100,50);
t1.setBounds(150,55,150,30);

l2.setBounds(50,100,100,50);
t2.setBounds(150,100,150,30);

b1.setBounds(100,170,50,50);
b2.setBounds(170,170,50,50);
b3.setBounds(210,170,50,50);
b4.setBounds(270,170,50,50);

l3.setBounds(50,240,100,50);
add(l1);


add(l2);
add(l3);
add(t1);
add(t2);
add(b1);
add(b2);
add(b3);
add(b4);
}	
	
	public static void main(String arg[])
	{
			rjavacalc jf=new rjavacalc("Basic calculator");
		
	jf.setComponents();
	jf.setVisible(true);
	jf.setSize(500,500);
	jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}