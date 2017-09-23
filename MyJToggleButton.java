package project2017mk3;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JToggleButton;

public class MyJToggleButton extends JPanel implements ItemListener{

	      
	
		  private Icon duvall = new ImageIcon("imagesduvall2.jpeg.jpg");
		  private Icon computer = new ImageIcon("imagescomputer.jpeg.jpg");
		  JToggleButton tb1, tb2;
		  public MyJToggleButton()
		  {
			  JPanel mainContent = new JPanel();
			  tb1 =  new JToggleButton(duvall);
			  tb1 =  new JToggleButton("<HTML><H1><FONT color=black>ON</FONT/</H1></HTML>");
			  tb1.setBorder(BorderFactory.createLoweredBevelBorder());
			  tb1.setBorderPainted(true);
			  tb1.setSelected(true);
			  tb1.setSize(200, 200);
			  tb1.addItemListener(this);
			  mainContent.add(tb1);
			  add(tb1);
			  add(mainContent);
			  setVisible(true);
			  
			  //JPanel mainContent = new JPanel();
			  tb2 =  new JToggleButton(computer);
			  tb2 =  new JToggleButton("<HTML><H1><FONT color=red>CLEAR</FONT/</H1></HTML>");
			  tb2.setBorder(BorderFactory.createLoweredBevelBorder());
			  tb2.setBorderPainted(true);
			  tb2.setSelected(true);
			  tb2.setSize(200, 200);
			  tb2.addItemListener(this);
			  mainContent.add(tb2);
			  add(tb2);
			  add(mainContent);
			  setVisible(true);
			  //add((Component) duvall);
			  //add((Component) computer);
			  
			  
	}
		  
		  
	public static void main(String [] args)
	{
		new MyJToggleButton();
	}
	@Override
	public void itemStateChanged(ItemEvent e) 
	{
		
	System.out.println("\n\nSTATE: "+ e.getStateChange());
	System.out.println("\n\nSOURCE: "+ e.getSource());
	if(e.getStateChange() == ItemEvent.SELECTED){
		tb1.setIcon(duvall);
		tb1.setText("<HTML><H1><FONT color=green>ON</FONT/</H1></HTML>");
		tb1.setBorder(BorderFactory.createLoweredBevelBorder());
		tb1.setBorderPainted(true);
		
		//((AbstractButton) e.getSource()).setText("ON");
		
		//((AbstractButton) e.getSource()).setBorder(BorderFactory.createLoweredBevelBorder());
		//((AbstractButton) e.getSource()).setBorderPainted(true);
		
		setBackground(Color.RED);
	}
	else {
		tb2.setIcon(computer);
		tb2.setText("<HTML><H1><FONT color=red><EM>OFF</EM></FONT/</H1></HTML>");
		tb2.setBorder(BorderFactory.createRaisedBevelBorder());
		tb2.setBorderPainted(true);
		
		//((AbstractButton) e.getSource()).setText("OFF");
		//((AbstractButton) e.getSource()).setBorder(BorderFactory.createRaisedBevelBorder());
		//((AbstractButton) e.getSource()).setBorderPainted(true);
		
		setBackground(Color.GREEN);		
	}
	}
}
	
	
	
	
	
	
