package project2017mk3;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;

public class MyDrawingSpace extends JPanel implements MouseListener, MouseMotionListener{

	private int circleSize = 40;
	private int lastXPos = 0, lastYPos = 0;
	private int timesClicked=0;
	protected static boolean drawShapes = false;
	
	public MyDrawingSpace()
	{
		setBackground(Color.WHITE);
		addMouseListener(this);
		addMouseMotionListener(this);
	}
	
	
	public static void main(String[] args) {
		new MyDrawingSpace();

	}

	@Override
	public void mouseDragged(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		System.out.println("X IS "+x+ "Y IS "+y);
		Graphics g = getGraphics();
		Graphics g2d = (Graphics2D)g;
		((Graphics2D) g2d).setStroke(new BasicStroke(20));
		g2d.setColor(Color.BLUE);  
		g2d.drawLine(lastXPos, lastYPos, x, y);
		recordPos(x,y);		
	}
	protected void recordPos(int x, int y){
		lastXPos = x;
		lastYPos = y;
	}
	public int getLastX(){
		return lastXPos;
	}
	public int getLastY(){
		return lastYPos;
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		recordPos(e.getX(), e.getY());		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		if(drawShapes){
			timesClicked++;
			recordPos(e.getX(), e.getY()); //store the lastX and lastY values
			//lastXPos = e.getX();
			//lastYPos = e.getY();
			Graphics g = getGraphics();
			Graphics2D g2d = (Graphics2D)g;
			g2d.setColor(Color.RED);
			//g2d.fillOval(lastXPos, lastYPos, circleSize, circleSize);
			// notice circle is NOT drawn around the click
			g2d.fillOval(lastXPos-(circleSize/2), lastYPos-(circleSize/2), circleSize, circleSize);
		}
			//g2d.fillRect(lastXPos-(circleSize/2), lastYPos-(circleSize/2), circleSize, circleSize);//same idea for other shapes
			//draw a hollow circle
			//g2d.setStroke(new BasicStroke(10));
			//g2d.drawOval(lastXPos-(circleSize/2), lastYPos-(circleSize/2), circleSize, circleSize);
			/*
			//draw a triangle.... polygon
			int [] xs =  {lastXPos-(circleSize/2) ,lastXPos+(circleSize/2), lastXPos};
		    int [] ys = {lastYPos-(circleSize/2),lastYPos-(circleSize/2),lastYPos+(circleSize/2)};
			g2d.fillPolygon(xs , ys,3);
			*/		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		requestFocus();//need for typing
		recordPos(e.getX(), e.getY());		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
