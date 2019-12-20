import java.awt.*;
import java.awt.event.*;
import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;

public class Copyandpastething 
{
	private static JFrame gameFrame;// = new JFrame("Tic Tac Toe");
	private static JButton playagain = new JButton("Play Again");
	private static JPanel gamepanel = new JPanel();
	public static void main(String a[])
	{
		gameFrame = new JFrame("Tic Tac Toe");
		gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Let's the Java program close when x is pressed
		gameFrame.setSize(500, 600);//Set Size
		
		//Graphics container
		//Needed to set the layout for your graphics
		final JPanel container = new JPanel();
		container.setBackground(Color.WHITE);//Set background colour

		//Layout
		GridBagLayout layout = new GridBagLayout();//Layout used to set ui element alignments
		GridBagConstraints constraints = new GridBagConstraints();//Used for spacing and location

		//Image
		final ImageIcon title = new ImageIcon("Untitled.png"); //Light on
		final JLabel imageLabel = new JLabel(title); //Set this label to a picture

		//On/Off button
		final JButton startgame = new JButton("Start Game");
		//This adds function to your button
		//You can make an actionlistener yourself outside of the program and add that if you like

		//Add Components
		container.setLayout(layout); //set layout to grid layout
		container.add(imageLabel);
		constraints.gridy = 1; //put the button image beneath the light image, 0 = light, 1 = button
		//insets(top, left, bottom, right);
		constraints.insets = new Insets(25,0,0,0);//Set padding above the button by 25 pixels
		container.add(startgame,constraints);
		gameFrame.add(container);
		//Do this at the end
		gameFrame.setVisible(true);




		class TicTacToeGUI2 implements ActionListener
		{
			private String letter = "";
			private int count = 0;
			private int oscore = 0; //new
			private int xscore = 0; //new
			private JButton button1 = new JButton("");
			private JButton button2 = new JButton("");
			private JButton button3 = new JButton("");
			private JButton button4 = new JButton("");
			private JButton button5 = new JButton("");
			private JButton button6 = new JButton("");
			private JButton button7 = new JButton("");
			private JButton button8 = new JButton("");
			private JButton button9 = new JButton("");
			
			private JButton music = new JButton("Play Music");
			private JLabel score = new JLabel("<html>Player X's Score : "+xscore +"<br>Player O's Score : <html>" +oscore, SwingConstants.CENTER);
			
			private boolean win = false;
			AudioInputStream audioInputStream;
			Clip clip;
			public void playSound() 
			{
				try 
				{
					if(audioInputStream==null)
						audioInputStream = AudioSystem.getAudioInputStream(new File("Creepy_Music_Box.wav").getAbsoluteFile());
					if(clip == null)
					{
						clip = AudioSystem.getClip();
						clip.open(audioInputStream);
					}
					clip.start();
				} catch(Exception e) 
				{
					System.out.println("Error with playing sound.");
					e.printStackTrace();
				}
			}
			public void stopSound() 
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

			public TicTacToeGUI2()
			{
				//create game
				gamepanel.setSize(500, 600);
				gamepanel.setLayout(new GridLayout(4, 3));

				//Add Buttons
				gamepanel.add(button1);
				gamepanel.add(button2);
				gamepanel.add(button3);
				gamepanel.add(button4);
				gamepanel.add(button5);
				gamepanel.add(button6);
				gamepanel.add(button7);
				gamepanel.add(button8);
				gamepanel.add(button9);
				gamepanel.add(playagain);
				gamepanel.add(music);
				gamepanel.add(score);

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

				music.addActionListener(new ActionListener()
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

			}

			public void actionPerformed(ActionEvent z)
			{
				count++;

				//Who's Turn It is
				if (count%2 == 1)
				{
					letter = "X";
				}
				else if (count%2 == 0)
				{
					letter = "O";
				}


				//Displaying an X or O on the buttons
				if (z.getSource() == button1)
				{
					button1.setText(letter);
					button1.setEnabled(false);
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
				else if (z.getSource() == playagain)
				{
					int answer = JOptionPane.showConfirmDialog(null, "Would you like to play again?", "Confirm", JOptionPane.YES_NO_OPTION);
					if(answer == JOptionPane.NO_OPTION)
					{
						System.exit(0);
					}
					else
					{
						new TicTacToeGUI();
						System.exit(0);
					}
				}
				else if (z.getSource() == score)
				{

					JOptionPane.showMessageDialog(null, "Player X's Score" + " ");
				}
				else if (z.getSource() == score)
				{
					JOptionPane.showMessageDialog(null, "Player O's Score" + " " );
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
				else
				{
					win = false;
				}

				//Show who wins or if a tie
				if (win == true)
				{
					JOptionPane.showMessageDialog(null, letter +" Wins!");

				}
				else if (count == 9 && win == false)
				{
					JOptionPane.showMessageDialog(null, "It's a tie!");
				}

			}
			//track scores
			void Scores()
			{
				if(letter.equals("X"))
				{
					xscore++;
					score.setText("Player X's Score:"+ xscore);
				}
				if(letter.equals("0"))
				{
					oscore++;
				}
			}

		}


		startgame.addActionListener( new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				gameFrame.add(gamepanel);
				gameFrame.remove(container);

			}
		});

		playagain.addActionListener( new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				gameFrame.add(container);
				gameFrame.remove(gamepanel);
			}
		});
	}
}