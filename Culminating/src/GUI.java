import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

public class GUI 
{
	public static void main(String[] args) 
	{
		//Window
		JFrame jframe = new JFrame("Stuff");
		jframe.setSize(640, 480);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//UI Objects
		//Graphics container
		JPanel jpanel = new JPanel();
		jpanel.setBackground(Color.YELLOW);
		
		//Gridbaglayout
		GridBagLayout layout = new GridBagLayout();
		GridBagConstraints constraints = new GridBagConstraints();
		
		//Labels
		final JLabel label = new JLabel(" ");
		label.setFont(new Font("Verdana", Font.BOLD, 20));
		//abel.setVisible(false);
		
		//Combo Box (List)s
		String names[] = {"amggie","anthony","zihe","Peter","Ricardo"};
		final JComboBox nameCombo = new JComboBox(names);
		//Button
		JButton button = new JButton("whos a fat hoe");
		button.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{

				label.setText(nameCombo.getSelectedItem().toString());
				//label.setVisible(true);
			}
			
		});
		
		//Add to the jpanel
		jpanel.setLayout(layout);
		constraints.anchor = GridBagConstraints.NORTHWEST;
		constraints.gridx = 0;
		constraints.gridy = 0;
		constraints.weightx = 1;
		constraints.fill = GridBagConstraints.HORIZONTAL;
		//insets(top, left, bottom, right);
		constraints.insets = new Insets(0,0,0,200);
		jpanel.add(nameCombo,constraints);
		
		//Add Button
		constraints.gridx = 0;
		constraints.gridy = 1;
		constraints.weightx = 0.1;
		constraints.fill = GridBagConstraints.NONE;
		//insets(top, left, bottom, right);
		constraints.insets = new Insets(0,0,0,0);
		jpanel.add(button,constraints);
		
		//Add label
		constraints.gridx = 0;
		constraints.gridy = 2;
		constraints.insets = new Insets(10,0,0,0);
		jpanel.add(label,constraints);
		
		//Add the panel container to our window
		jframe.add(jpanel);
		jframe.setVisible(true);
	}

}
