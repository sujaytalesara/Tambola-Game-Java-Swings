/*
NOTE :-
Please run this game in Java 1.7 or its upgraded version as some compoments and function may not work properly.
After compiling please maximize the window opened.
*/




import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

class tambola extends JFrame implements ActionListener
{
	JButton b[]=new JButton[100];
	JButton bt;
	JLabel l,l1,l2,l3,l4,l5,l6,lb,lb1;
	Vector v=new Vector();
	int Count=0;
	int a,c;

	tambola()
	{

	try
	{
		UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
	}
	catch(Exception e)
	{
		System.out.println(e);
	}

	try
	{
		 setLayout(new GridLayout(11,10));
		 setSize(300,300);
		 setTitle("TAMBOLA - Designed By : SUJAY TALESARA");
		 setVisible(true);

	Font BF = new Font("Forte Regular",Font.PLAIN,30);
	for(int i=0;i<100;i++)
	 {
		b[i] = new JButton(""+i);
		b[i].setFont(BF);
		add(b[i]);
	 }

		l = new JLabel("Last No:>");
		l.setFont(BF);
		add(l);

		lb = new JLabel("");
		lb.setFont(BF);
		add(lb);

		l1 = new JLabel("");
		add(l1);

		l2 = new JLabel("");
		add(l2);

		bt = new JButton("BEGIN");
		bt.setFont(BF);
		add(bt);
		bt.addActionListener(this);

		l3 = new JLabel("");
		add(l3);

		l4 = new JLabel("");
		add(l4);

		l5 = new JLabel("");
		add(l5);

		l6 = new JLabel("New No:>");
		add(l6);
		l6.setFont(BF);

		lb1 = new JLabel();
		add(lb1);
		lb1.setFont(BF);
	}
	catch(Exception exp)
	{
		System.out.println(exp);
	}
}

	public void actionPerformed(ActionEvent e)
	{
		String s,s1="";

			while(true)
			{
				Random r = new Random();
				a = r.nextInt(100);
				lb.setText(""+c);

				if(v.contains(a))
				{
					System.out.println("Same number");
					if(Count==100){
						bt.setEnabled(false);
						bt.setText("TAMBOLA");
						break;
				}
				}
				else
				{
					v.add(a);
					c=a;
					//System.out.println(v);
					lb1.setText(""+a);
					b[a].setBackground(Color.RED);
					Count++;
					break;
				}
			}
	}
	public static void main(String...s)
	{
		new tambola();
	}
}