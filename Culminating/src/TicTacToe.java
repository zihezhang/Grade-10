import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import java.util.Scanner;
import java.awt.Color;
import java.awt.FlowLayout;
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


public class TicTacToe extends JFrame
{
/*
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		JFrame frame = new JFrame ("Test");
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600,600);
		JPanel pansexual = new JPanel();
		JButton button1 = new JButton ("Click here");
		button1.setSize(20,20);
		JButton button2 = new JButton ("No here!");
		button2.setSize(20,20);
		pansexual.add(button1);
		pansexual.add(button2);
		frame.add(pansexual);
		frame.setVisible(true);
		}
	}
	
	*/
private JLabel lbl;
private ImageIcon image;
public TicTacToe ()
{
	setLayout(new FlowLayout());
	image = new ImageIcon (getClass().getResource("TIC TAC TOEEEE.jpg"));
	lbl = new JLabel (image);
	add(lbl);
	
}

public static void main (String [] arg)
{
	TicTacToe a = new TicTacToe ();
	a.setTitle ("window with Image");
	a.setVisible(true);
	a.pack();
	a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}


//https://www.youtube.com/watch?v=anQlrk3OEik