import javax.swing.*;
import java.awt.event.*;

class rexam extends JFrame implements ActionListener
{
	int current=1,count=0;
	JLabel l;
	JRadioButton rb[]=new JRadioButton[5];
	ButtonGroup bg;
	JButton b1,b2;
	rexam()
	{
	}
	rexam(String s)
	{
		super(s);
		
		
	}
	void setComponents()
	{
		l=new JLabel("what is the difference betwween flower and phool?");
		b1=new JButton("Next");
		b2=new JButton("Back");
		bg=new ButtonGroup();
		b1.addActionListener(this);
		b2.addActionListener(this);
		for(int i=0;i<5;i++)
		{
			rb[i]=new JRadioButton();
			bg.add(rb[i]);
			add(rb[i]);
		}
		setLayout(null);
		l.setBounds(50,50,1000,60);
		rb[0].setBounds(50,120,800,40);
		rb[1].setBounds(50,170,800,40);
		rb[2].setBounds(50,210,800,40);
		rb[3].setBounds(50,250,800,40);
		rb[4].setBounds(50,300,800,40);
		b1.setBounds(70,410,80,50);
			b2.setBounds(170,410,80,50);
		add(l);
		add(b1);
		add(b2);
		
	}
	
	
	void question()
	{
		rb[4].setSelected(true);
			if(current==1)
			{
				l.setText("what is java?");
				rb[0].setText("Procedural language");
				rb[1].setText("oops");
				rb[2].setText("both");
				rb[3].setText("none");
				rb[4].setText("dont know");
			}
			
			if(current==2)
			{
				l.setText("what is you java?");
				rb[0].setText("Procedural language");
				rb[1].setText("oops");
				rb[2].setText("both");
				rb[3].setText("none");
				rb[4].setText("dont know");
			}
			
			if(current==3)
			{
				l.setText("what is accha java?");
				rb[0].setText("Procedural language");
				rb[1].setText("oops");
				rb[2].setText("both");
				rb[3].setText("none");
				rb[4].setText("dont know");
			}
			
			if(current==4)
			{
				l.setText("what is  bye java?");
				rb[0].setText("Procedural language");
				rb[1].setText("oops");
				rb[2].setText("both");
				rb[3].setText("none");
				rb[4].setText("dont know");
			}
			
			if(current==5)
			{
				l.setText("what is  last java?");
				rb[0].setText("Procedural language");
				rb[1].setText("oops");
				rb[2].setText("both");
				rb[3].setText("none");
				rb[4].setText("dont know");
			}
			
			
			
		
			
		}
	
	
	
	boolean checks()
	{
		if(current==1)
		return (rb[1].isSelected());
	if(current==2)
		return (rb[1].isSelected());
	if(current==3)
		return (rb[1].isSelected());
	if(current==4)
		return (rb[1].isSelected());
	if(current==5)
		return (rb[1].isSelected());
		
		return false;
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			if(checks())
				count++;
			current++;
			question();
			if(current==5)
			{b1.setText("Result");
				
			}
		}
		if(e.getActionCommand().equals("Result"))
		{
			if(checks())
				count++;
			JOptionPane.showMessageDialog(this,"correct ans="+count);
			System.exit(0);
		}
		if(e.getActionCommand().equals("Back"))
		{
			current--;
			question();
			if(current==1)
			{
				JOptionPane.showMessageDialog(this,"you are on 1st question ");
			}
		}
		
		
	}
	public static void main(String arg[])
	{
		rexam jf=new rexam("Programming exam");
		jf.setComponents();
		jf.setSize(700,900);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jf.question();
		
		
		
	}
	
}
