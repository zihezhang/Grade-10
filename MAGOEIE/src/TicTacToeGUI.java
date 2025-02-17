import java.awt.*;

import java.awt.event.*;

import javax.swing.*;

import javax.swing.JFrame;





public class TicTacToeGUI implements ActionListener

{

	private JFrame game = new JFrame("Tic Tac Toe");

	private JButton button1 = new JButton("");

	private JButton button2 = new JButton("");

	private JButton button3 = new JButton("");

	private JButton button4 = new JButton("");

	private JButton button5 = new JButton("");

	private JButton button6 = new JButton("");

	private JButton button7 = new JButton("");

	private JButton button8 = new JButton("");

	private JButton button9 = new JButton("");

	private JButton button10 = new JButton("Play Again");

	private JButton button11 = new JButton("Player X's Score");

	private JButton button12 = new JButton("Player O's Score");

	private String letter = "";

	private int count = 0;

	private int XWins, OWins = 0;

	private boolean win = false;





	public TicTacToeGUI()

	{

	//create game

	game.setSize(300, 300);

	game.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	game.setLayout(new GridLayout(4, 3));

	game.setLocation(500, 300);



	//Add Buttons

	game.add(button1);

	game.add(button2);

	game.add(button3);

	game.add(button4);

	game.add(button5);

	game.add(button6);

	game.add(button7);

	game.add(button8);

	game.add(button9);

	game.add(button10);

	game.add(button11);

	game.add(button12);



	button1.addActionListener(this);

	button2.addActionListener(this);

	button3.addActionListener(this);

	button4.addActionListener(this);

	button5.addActionListener(this);

	button6.addActionListener(this);

	button7.addActionListener(this);

	button8.addActionListener(this);

	button9.addActionListener(this);

	button10.addActionListener(this);

	button11.addActionListener(this);

	button12.addActionListener(this);



	game.setVisible(true);

	}



	public void actionPerformed(ActionEvent z)

	{

		count++;



		//Who's Turn It is

		if (count == 1 || count == 3 || count == 5 || count == 7 || count == 9)

		{

			letter = "X";

		}

		else if (count == 2 || count == 4 || count == 6 || count == 8 || count == 10)

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

		else if (z.getSource() == button10)

		{

			int answer = JOptionPane.showConfirmDialog(null, "Would you like to play again?", "Confirm", JOptionPane.YES_NO_OPTION);

			if(answer == JOptionPane.NO_OPTION)

			{

				System.exit(0);

			}

			else

			{

				new TicTacToeGUI();

			}

		}

		else if (z.getSource() == button11)

		{

			JOptionPane.showMessageDialog(null, "Player X's Score" + " ");

		}

		else if (z.getSource() == button12)

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

			JOptionPane.showMessageDialog(null, letter +" " + "Wins!");

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

			XWins++;

		}

		else

		{

			OWins++;

		}

	}





	public static void main(String args[])

	{

		 TicTacToeGUI tictactoeGUI = new TicTacToeGUI();

	}

}