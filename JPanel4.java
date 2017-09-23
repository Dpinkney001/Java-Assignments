package project2017mk3;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JPanel4 extends JPanel {
	public JPanel4()
	{
		JPanel JPanel4 = new JPanel();
		setBackground(Color.RED);
		JLabel JLabel4 = new JLabel("RED");
		JButton redButton = new JButton();
		add(redButton);
		add(JPanel4);
		add(JLabel4);
		
		
	}
}
