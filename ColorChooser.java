package project2017mk3;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



public class ColorChooser extends JFrame implements ActionListener, Shape{

	public ColorChooser() {
		
		super("Color Chooser");
		//WindowUtilities.setNimbusLookAndFeel();
	    //addWindowListener(new WindowAdapter_ExitListener());
		
	    Container contentMain = getContentPane();
	    contentMain.setBackground(Color.white);
	    contentMain.setLayout(new FlowLayout());
	    JButton colorChangeButton
	      = new JButton("Choose Background Color");
	    colorChangeButton.addActionListener(this);
	    contentMain.add(colorChangeButton);
	    setSize(500, 500);
	    setVisible(true);
	    add(colorChangeButton);
	    
	    
		
	   
	}

	public static void main(String[] args) {
         
		new ColorChooser();
		//new JFrameDriver();
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

}
