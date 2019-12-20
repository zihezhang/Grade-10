/*Name: Zihe Zhang
 * Class: ICS2O1-02
 * Date: 19/04/2017
 * Teacher: Mr Naccorato
 * Program summary:
 */

//Imports scanner from the library
import java.util.Scanner;

public class Part2 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//Declaration that variable holds the sub program
		Scanner reader = new Scanner (System.in);
		System.out.println("Please enter the right number \nTip: -1 is the right number");
		boolean incorrect = true;
		while(incorrect)
		{
			int number = reader.nextInt();
			if (number==-1)
			{
				incorrect = false;
				System.out.println("Program ended");
			}
			else
				System.out.println("Please try another number");
		}

		
	}

}
