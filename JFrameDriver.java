package project2017mk3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JFrameDriver extends JFrame implements ActionListener{
	
	JFrameDriver()
	{
		JPanel mainContent = new JPanel();
		mainContent.setLayout(new BorderLayout());
		//create 5 seperate panel
		JPanel1 np = new JPanel1();
		JPanel2 sp = new JPanel2();
		//JPanel3 ep = new JPanel3();
		//JPanel4 wp = new JPanel4();
		MyJToggleButton jtb = new MyJToggleButton();
		//JPanel5Center cp = new JPanel5Center();
		MyDrawingSpace cp = new MyDrawingSpace();
		//ColorChooser color = new ColorChooser();
		//add those 5 separate JPanel instances to the 5 different regions
		mainContent.add(BorderLayout.NORTH, np);
		mainContent.add(BorderLayout.SOUTH, sp);
		//mainContent.add(BorderLayout.EAST, ep);
		//mainContent.add(BorderLayout.WEST, wp);
		mainContent.add(BorderLayout.CENTER, cp);
		mainContent.add(BorderLayout.WEST, jtb);
		//mainContent.add(BorderLayout.EAST, color);
		add(mainContent);//add the main JPanel to the JFrame
		//setSize(500,500);
		//setDefaultCloseOperation(EXIT_ON_CLOSE);
		//setVisible(true);
		// color choser code----------------------------------
		 //Container mainContent = getContentPane();
		    //mainContent.setBackground(Color.white);
		    //mainContent.setLayout(new FlowLayout());
		   // JButton colorChangeButton
		   //   = new JButton("Choose Background Color");
		    //colorChangeButton.addActionListener(this);
		    //mainContent.add(colorChangeButton);
		    //colorChangeButton.setSize(500, 500);
		    //setVisible(true);
		    //add(colorChangeButton);
		    //color chooser code----------------------------------
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		 Color backgroundColor
	      = JColorChooser.showDialog(this,
	                                 "Select Background Color",
	                                 getContentPane().getBackground());
	    if (backgroundColor != null)
	      getContentPane().setBackground(backgroundColor);
		
		
	}

	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater( new Runnable(){
			public void run(){
                //new MyJToggleButton();
                //new DrawingAndTyping();
				//ImageIcon duvall = new ImageIcon("imagesduvall2.jpeg.jpg");
      		    //ImageIcon computer = new ImageIcon("imagescomputer.jpeg.jpg");
				new ColorChooser();
                new JFrameDriver();
                
      		  //JToggleButton tb1, tb2;
				
				JFrameDriver myGUI = new JFrameDriver();
				//Project myGUI = new Project();
				((JFrame) myGUI).setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				myGUI.setSize(500, 500);
				myGUI.setVisible(true);
			}
		}
		);
	}
}


