/*Name: Maggie Wang and Zihe Zhang
 * Class: ICS2O1-02
 * Date: 06/16/2017
 * Teacher: Mr Naccorato
 * Program summary: This is the code for a Tic Tac Toe game.
 */
//importing things from the library
import java.awt.*;
import java.io.File;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

//public class that has a action listener. All of the code used in the tic tac toe games is within this class.
public class TicTacToeGUI implements ActionListener
{
	//this is the string that determines if the button is marked X or O, right now all the bottons are blank
	private String letter = "";
	//this is the counter for the order of who goes next in the game
	private int count = 0;
	//the main frame for the game. This is where all the functions are and what the users will be seeing most of the time.
	private JFrame gamePanel = new JFrame("Tic Tac Toe");
	
	//these are all the tic tac toe buttons that can be clicked on to play the game
	private JButton button1 = new JButton("");
	private JButton button2 = new JButton("");
	private JButton button3 = new JButton("");
	private JButton button4 = new JButton("");
	private JButton button5 = new JButton("");
	private JButton button6 = new JButton("");
	private JButton button7 = new JButton("");
	private JButton button8 = new JButton("");
	private JButton button9 = new JButton("");
	//button that can be pressed to restart the game
	private JButton playagain = new JButton("Play Again");
	//this button that controls if the music is played or not
	private JButton music = new JButton("Play Music");
	//if this button is pressed you'll get a surprise :)
	private JButton scare = new JButton("Click for a surpise!!!");
	//sets a boolean to see if the game has ended or not
	private boolean win = false;


	//music for game
	//variable for audio input stream
	static AudioInputStream audioInputStream;
	//variable for clip
	static Clip clip;
	
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
		} catch(Exception e) //catches any errors that may occur if the musics does not work
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
		} catch(Exception e) 
		{
			System.out.println("Error with playing sound."); //catches any errors that may occur if the musics does not work
			e.printStackTrace();
		}
	}

	//music for jump scare (pretty much the same as the code for the music above but with different variable names and different file being taken
	static AudioInputStream audioInputStream2;
	static Clip clip2;
	static public void playSound2()
	{
		try 
		{
			if(audioInputStream2==null)
				audioInputStream2 = AudioSystem.getAudioInputStream(new File("Jumpscare.wav").getAbsoluteFile());
			if(clip2 == null)
			{
				clip2 = AudioSystem.getClip();
				clip2.open(audioInputStream2);
			}
			clip2.start();
		} catch(Exception e) 
		{
			System.out.println("Error with playing sound.");
			e.printStackTrace();
		}
	}
	static public void stopSound2() 
	{
		try 
		{
			clip.stop();
		} catch(Exception e) 
		{
			System.out.println("Error with playing sound.");
			e.printStackTrace();
		}
	}


	//public variable called "TicTacToeGUI"
	public TicTacToeGUI()
	{
		//create game
		gamePanel.setSize(500, 600);	//sets the size of the panel
		gamePanel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//the program will exit when X is pressed
		gamePanel.setLayout(new GridLayout(4, 3));	//layout program (a 4 by 3 grid and each box will have a button in it
		gamePanel.setLocation(200, 100); //where the panel will be found on the screen

		//Add Buttons to the game panel
		gamePanel.add(button1);
		gamePanel.add(button2);
		gamePanel.add(button3);
		gamePanel.add(button4);
		gamePanel.add(button5);
		gamePanel.add(button6);
		gamePanel.add(button7);
		gamePanel.add(button8);
		gamePanel.add(button9);
		gamePanel.add(playagain);
		gamePanel.add(music);
		gamePanel.add(scare);

		//sets a action listener to all of the buttons
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		button5.addActionListener(this);
		button6.addActionListener(this);
		button7.addActionListener(this);
		button8.addActionListener(this);
		button9.addActionListener(this);
		playagain.addActionListener(this);
		scare.addActionListener(this);

		//the following will happen when the button called music is pressed
		music.addActionListener(new ActionListener()
		{
			//a boolean called isOn is set as true and is added to the program
			boolean isOn = true;
			@Override
			//Default procedure used when the button is pressed
			public void actionPerformed(ActionEvent e)
			{

				//if isOn true then music is played, isOn is set to false and the text for the music button is set to "Stop Music"
				if(isOn)
				{
					playSound();
					isOn = false;
					music.setText("Stop Music");
				}
				//else the button is stopped, isOn is set to true and the text for the music button is set to "Play Music
				else
				{
					stopSound();
					isOn = true;
					music.setText("Play Music");
				}
			}

		});
		//makes the panel visible when the program is ran
		gamePanel.setVisible(true);
	}

	//this is a counter that checks who plays next
	public void actionPerformed(ActionEvent z) 
	{
		//it +1 after every turn
		count++;

		//Who's Turn It is
		if (count%2 == 1) // if the number has a remainder of 1, it is X's turn
		{
			//sets the font of all the X's and O's
			Font players = new Font ("serif", Font.BOLD, 50);
			//applies the font above to all the buttons
			button1.setFont(players); 
			button2.setFont(players);
			button3.setFont(players);
			button4.setFont(players);
			button5.setFont(players);
			button6.setFont(players);
			button7.setFont(players);
			button8.setFont(players);
			button9.setFont(players);
			//the letter X is written on the button
			letter = "X";
		}
		else if (count%2 == 0) // if the number has a remainder of 0, it is O's turn
		{
			letter = "O";
		}


		//Displaying an X or O on the buttons
		if (z.getSource() == button1)
		{
			button1.setText(letter);
			button1.setEnabled(false); //button is set enabled as false so that it can't be pressed again
		}
		else if (z.getSource() == button2)
		{
			button2.setText(letter);
			button2.setEnabled(false);
		}
		else if (z.getSource() == button3)
		{
			button3.setText(letter);
			button3.setEnabled(false);
		}
		else if (z.getSource() == button4)
		{
			button4.setText(letter);
			button4.setEnabled(false);
		}
		else if (z.getSource() == button5)
		{
			button5.setText(letter);
			button5.setEnabled(false);
		}
		else if (z.getSource() == button6)
		{
			button6.setText(letter);
			button6.setEnabled(false);
		}
		else if (z.getSource() == button7)
		{
			button7.setText(letter);
			button7.setEnabled(false);
		}
		else if (z.getSource() == button8)
		{
			button8.setText(letter);
			button8.setEnabled(false);
		}
		else if (z.getSource() == button9)
		{
			button9.setText(letter);
			button9.setEnabled(false);
		}


		//Checking who wins
		//Horizontal
		if (button1.getText() == button2.getText() && button2.getText() == button3.getText() && button1.getText() != "")
		{
			win = true;
		}
		else if (button4.getText() == button5.getText() && button5.getText() == button6.getText() && button4.getText() != "")
		{
			win = true;
		}
		else if (button7.getText() == button8.getText() && button8.getText() == button9.getText() && button7.getText() != "")
		{
			win = true;
		}

		//Win vertically
		else if (button1.getText() == button4.getText() && button4.getText() == button7.getText() && button1.getText() != "")
		{
			win = true;
		}
		else if (button2.getText() == button5.getText() && button5.getText() == button8.getText() && button2.getText() != "")
		{
			win = true;
		}
		else if (button3.getText() == button6.getText() && button6.getText() == button9.getText() && button3.getText() != "")
		{
			win = true;
		}

		//Win diagonally
		else if (button1.getText() == button5.getText() && button5.getText() == button9.getText() && button1.getText() != "")
		{
			win = true;
		}
		else if (button3.getText() == button5.getText() && button5.getText() == button7.getText() && button3.getText() != "")
		{
			win = true;
		}
		//If no wins
		else
		{
			win = false;
		}

		//Show who wins or if a tie
		if (count == 9 && win == false)
		{
			JOptionPane.showMessageDialog(null, "It's a tie!");		//a small panel pops up and says that its a tie
		}

		//if someone wins
		else if (win == true)
		{
			//sets a integer for a pane that will pop up if someone wins. The player who won is declared and they ask if you would like to play again
			int answer = JOptionPane.showConfirmDialog(null, letter+" Won! Would you like to play again?", "Confirm", JOptionPane.YES_NO_OPTION);

			//if you click on No, you do not want to play again the program ends
			if(answer == JOptionPane.NO_OPTION)
			{
				System.exit(0);
			}
			
			//if you click Yes, a new panel pops up and the whole public class TicTacToeGUI restarts
			else
			{
				new TicTacToeGUI();
			}

		}

		//program for the playagain button
		playagain.addActionListener(new ActionListener()
		{
			boolean restart = true;
			@Override
			//Default procedure used when the button is pressed
			public void actionPerformed(ActionEvent e)
			{

				//if button is pressed a new TicTacToeGUI will show up and the restart boolean is set to false
				if(restart)
				{
					new TicTacToeGUI();
					restart = false;
				}
				//if the button is not pressed nothing will happen
				else
				{
					restart = true;
				}
			}

		});

		//program for the scare button
		scare.addActionListener(new ActionListener()
		{
			boolean boo = true;
			@Override
			//Default procedure used when the button is pressed
			public void actionPerformed(ActionEvent e)
			{
				//sets a integer for a pane that will pop up the button called scare is pressed. This pane has a yes or no button for you to pick your option
				int warning = JOptionPane.showConfirmDialog(null, "Are you sure you want to do this? (might be scary)", "Confirm", JOptionPane.YES_NO_OPTION);

				//if you press on yes the following will happen...
				if(warning == JOptionPane.YES_OPTION)
				{
					playSound2();	//scary music is played
					
					//new JFrame
					JFrame scared = new JFrame("AHAHA SCARED YOU!!!");
						scared.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//Let's the Java program close when x is pressed
						scared.setSize(1900, 1150);	//Set Size of the frame

						//Graphics container
						//Needed to set the layout for your graphics
						final JPanel container = new JPanel();
						container.setBackground(Color.BLACK);	//Set background color

						//Layout
						GridBagLayout layout = new GridBagLayout();//Layout used to set gui element alignments
						GridBagConstraints constraints = new GridBagConstraints();//Used for spacing and location

						//Image
						final ImageIcon title = new ImageIcon("Scary.png"); //scary picture is imported
						final JLabel imageLabel = new JLabel(title); //Set this label to a picture


						//Add Components
						container.setLayout(layout); //set layout to grid layout
						container.add(imageLabel);
						constraints.gridy = 1; //put the button image beneath the light image, 1 = picture
						//insets(top, left, bottom, right);
						scared.add(container);
						//makes the jump scare frame visible and it pops of to score people
						scared.setVisible(true);
				}
				else
				{
					//restarts the game and the whole 
					new TicTacToeGUI();
				}
			}

		});
	}
	//a main to make the game work
	public static void main(String args[])
	{
		TicTacToeGUI tictactoeGUI = new TicTacToeGUI();
	}
}