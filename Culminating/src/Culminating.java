
import java.util.Scanner;
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



public class Culminating 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner reader = new Scanner (System.in);
		
		JFrame jframe =new JFrame("Stuff");
		jframe.setSize(640, 480);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setVisible(true);
		String names[] = {"John","Ben","Heather","Peter","Ricardo", "Zhie", "Victoire", "Charles", "Maggie"};
		JComboBox nameCombo =new JComboBox(names);
		JButton button = new JButton("Start Game");
	}

}
