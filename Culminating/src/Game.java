import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Game 
{
	public static void main(String[]args)
	{
		//Window
		final JFrame window = new JFrame("Light Switch");//Name on the Window
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Let's the Java program close when x is pressed
		window.setSize(500, 600);//Set Size

		//Graphics container
		//Needed to set the layout for your graphics
		final JPanel startPanel = new JPanel();
		final JPanel gamePanel = new JPanel();
		startPanel.setBackground(Color.WHITE);//Set background colour
		gamePanel.setBackground(Color.GRAY);
		
		//Layout
		GridBagLayout layout = new GridBagLayout();//Layout used to set ui element alignments
		GridBagConstraints constraints = new GridBagConstraints();//Used for spacing and location

		//Image
		final ImageIcon title = new ImageIcon("Untitled.png"); //Light on
		final ImageIcon lightOff = new ImageIcon("Light_Off_Small.png"); //Light off
		final JLabel imageLabel = new JLabel(title); //Set this label to a picture
		final JLabel imageLabel2 = new JLabel(lightOff);
		startPanel.add(imageLabel);
		gamePanel.add(imageLabel2);
		
		//On/Off button
		final JButton initial = new JButton("Start Game");
		startPanel.add(initial);
		final JButton newgame = new JButton("Restart");
		gamePanel.add(newgame);
		//This adds function to your button
		//You can make an actionlistener yourself outside of the program and add that if you like
		initial.addActionListener(new ActionListener()
		{
			boolean isOn = false;
			@Override
			//Default procedure used when the button is pressed
			public void actionPerformed(ActionEvent e) 
			{
				//Logic to change the image of the label
				if(isOn)
				{
					isOn = false;
					window.remove(gamePanel);
					window.add(startPanel);
					window.validate();
				}
				else
				{
					isOn = true;
					window.remove(startPanel);
					window.add(gamePanel);
					window.validate();
				}
			}
		});

		//Add Components
		startPanel.setLayout(layout); //set layout to grid layout
		startPanel.add(imageLabel);
		constraints.gridy = 1; //put the button image beneath the light image, 0 = light, 1 = button
		//insets(top, left, bottom, right);
		constraints.insets = new Insets(25,0,0,0);//Set padding above the button by 25 pixels
		startPanel.add(initial,constraints);
		window.add(startPanel);
		//Do this at the end
		window.setVisible(true);
	}

}
