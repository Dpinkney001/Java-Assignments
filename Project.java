package project2017mk3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

//import simpleexamples.MyFirstJP;
//import simpleexamples.MyJButtons;

public class Project extends JFrame implements ActionListener{
	
	public Project(){
		
		JButton jb1;
		JButton jb2;
		JButton jb3;
		JLabel jl1;
		
		JFrame alpha = new JFrame();
		jl1 = new JLabel("Helloworld");
		jb1 = new JButton("RED");
		jb2 = new JButton("YELLOW");
		jb3 = new JButton("GREEN");
		
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		jb3.addActionListener(this);
		add(jb1);
		add(jb2);
		add(jb3);
		alpha.setBackground(Color.WHITE);
		jb1.setBorder(BorderFactory.createLineBorder(Color.RED));
		jb2.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		jb3.setBorder(BorderFactory.createLineBorder(Color.GREEN));
		//tf.setText("HelloWorld");		
		JPanel mainContent = new JPanel();//everything will go here
		
		mainContent.setLayout(new BorderLayout());
		
		mainContent.add(BorderLayout.NORTH, jb1);  //add the jpanel with its label to the mainContnet
		mainContent.add(BorderLayout.WEST, jb2); //add the jpanel to the center
        mainContent.add(BorderLayout.SOUTH, jb3);
		add(mainContent);		//add the mainContent to the JFrame
		//mainContent.add(jb1);
		//mainContent.setBackground(Color.RED);
		
		//mainContent.add(jb2);
		//mainContent.setBackground(Color.BLUE);
		
		//mainContent.add(jb3);
		//mainContent.setBackground(Color.GREEN);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String actionCommand = e.getActionCommand();
		Container mainContent = getContentPane();
		if (e.getActionCommand().equals("RED"))
		{
			setBackground(Color.RED);
			mainContent.setBackground(Color.RED);
		}
		else if (e.getActionCommand().equals("YELLOW"))
		{
			setBackground(Color.YELLOW);
			mainContent.setBackground(Color.YELLOW);
		}
		else if(e.getActionCommand().equals("GREEN"))
		{
			setBackground(Color.GREEN);
			mainContent.setBackground(Color.GREEN);
		}
		else
			System.out.println("error");
		
	}		
	
	

}
