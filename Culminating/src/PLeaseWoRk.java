
import java.util.Scanner;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.ItemSelectable;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JComboBox;

public class PLeaseWoRk 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		JFrame jframe = new JFrame ("Stuff");
		jframe.setSize(640, 480);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		panel.setSize(400,500);
		panel.add(new JButton("Button"));
	    panel.add(new JLabel("this is JLabel"));
	    panel.setBackground(Color.RED);
		jframe.getContentPane().setBackground(Color.CYAN);
		jframe.setVisible(true);

		
		
		
		
		
	}

}
