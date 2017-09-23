package project2017mk3;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JPanel5Center extends JPanel{
	public JPanel5Center()
	{
		JPanel JPanel5 = new JPanel();
		setBackground(Color.WHITE);
		JLabel JLabel5 = new JLabel("WHITE");
		JButton centerButton = new JButton();
		add(centerButton);
		add(JPanel5);
		add(JLabel5);
		
		
	}
}
