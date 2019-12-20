import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;
import sun.audio.*;
import java.io.*;

public class Music 
{

	public static void main(String[] args) 
	{
		JFrame frame = new JFrame();
		frame.setSize(200,200);
		JButton button = new JButton ("Click me");
		frame.add(button);
		button.addActionListener(new AL());
		frame.show(true);
	}
	
	public static void music() {  
        AudioPlayer MGP = AudioPlayer.player;  
        AudioStream BGM;  
        AudioData MD;  
        ContinuousAudioDataStream loop = null;  

        try 
        {  
            BGM = new AudioStream(new FileInputStream("Creepy_Music_Box.wav"));  
            MD = BGM.getData();  
            loop = new ContinuousAudioDataStream(MD);  
        } 
        catch(IOException error)  
        {  
            System.out.println("Error!!!");  

        }  
        MGP.start(loop);  
    }  
	
}


\\https://www.youtube.com/watch?v=VMSTTg5EEnY