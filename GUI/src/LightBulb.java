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

public class LightBulb 
{
	//Image
	static final ImageIcon title = new ImageIcon("Untitled.png"); //Light on
	static final JLabel imageLabel = new JLabel(title); //Set this label to a picture


	//This adds function to your button
	//You can make an actionlistener yourself outside of the program and add that if you like

	static AudioInputStream audioInputStream;
	//variable for clip
	static Clip clip;

	public static void main(String[]args)
	{
		//Window
		JFrame window = new JFrame("Light Switch");//Name on the Window
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Let's the Java program close when x is pressed
		window.setSize(500, 600);//Set Size

		//Graphics container
		//Needed to set the layout for your graphics
		final JPanel container = new JPanel();
		container.setBackground(Color.WHITE);//Set background colour

		//On/Off button
		final JButton initial = new JButton("Start Game");
		
		initial.addActionListener(new ActionListener()
		{
			boolean isOn = true;
			@Override
			//Default procedure used when the button is pressed
			public void actionPerformed(ActionEvent e)
			{

				//Logic to change the image of the label
				if(isOn)
				{
					playSound();
					isOn = false;
				}
				else
				{
					stopSound();
					isOn = true;
				}
			}

		});
		//Layout
		GridBagLayout layout = new GridBagLayout();//Layout used to set ui element alignments
		GridBagConstraints constraints = new GridBagConstraints();//Used for spacing and location
		//Add Components
		container.setLayout(layout); //set layout to grid layout
		container.add(imageLabel);
		constraints.gridy = 1; //put the button image beneath the light image, 0 = light, 1 = button
		//insets(top, left, bottom, right);
		constraints.insets = new Insets(25,0,0,0);//Set padding above the button by 25 pixels
		container.add(initial,constraints);
		window.add(container);
		//Do this at the end
		window.setVisible(true);
	}


	//public static variable for playing music
	static public void playSound() 
	{
		try 
		{
			//finds the audio file
			if(audioInputStream==null)
				audioInputStream = AudioSystem.getAudioInputStream(new File("Creepy_Music_Box.wav").getAbsoluteFile());
			if(clip == null)
			{
				clip = AudioSystem.getClip();
				clip.open(audioInputStream);
			}
			clip.start();
		} 
		catch(Exception e) //catches any errors that may occur if the musics does not work
		{
			System.out.println("Error with playing sound.");
			e.printStackTrace();
		}
	}

	//public static variable for stopping the music
	static public void stopSound() 
	{
		try 
		{
			clip.stop();
		} 
		catch(Exception e) 
		{
			System.out.println("Error with playing sound."); //catches any errors that may occur if the musics does not work
			e.printStackTrace();
		}
	}

}
