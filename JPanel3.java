package project2017mk3;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JPanel3 extends JPanel {
	public JPanel3()
	{
		JPanel JPanel3 = new JPanel();
		setBackground(Color.GREEN);
		JLabel JLabel3 = new JLabel("GREEN");
		JButton greenButton = new JButton("GREEN");
		add(greenButton);
		add(JPanel3);
		add(JLabel3);
		
	}
}
