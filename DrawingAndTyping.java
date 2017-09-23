package project2017mk3;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class DrawingAndTyping extends MyDrawingSpace implements KeyListener{
	
	private FontMetrics fm;
	private int fontSize = 40;
	//color... etc...
	//Font set a different font....
	Font font = new Font("Serif",Font.ITALIC, fontSize);
	
	public DrawingAndTyping()
	{
			super();
			addKeyListener(this);
			fm = getFontMetrics(font);
			
		}	

	@Override
	public void keyTyped(KeyEvent e) {
		String s = String.valueOf(e.getKeyChar());
		Graphics g = getGraphics();
		g.setColor(Color.RED);
		g.setColor(getBackground());
		//ColorChooser colorChangeButton = new ColorChooser();
	    ColorChooser color = new ColorChooser();
	    g.setClip(color);
		/*	will later use a variable to store the color
		that variable will be cahnged from what the user chooses via
		the JColorChooser*/
		//To write over multiple lines compare against the maxwidth... 
		//increase Y by the height size of the font using the getHeight method
		g.drawString(s, getLastX(), getLastY());//use the last x and last y
		recordPos(getLastX()+fm.stringWidth(s), getLastY());//avoid letters being on top of each other
				
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
