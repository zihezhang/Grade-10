/*Name: Zihe Zhang
 * Class: ICS2O1-02
 * Date: 19/04/2017
 * Teacher: Mr Naccorato
 * Program summary:
 */

//Imports scanner from the library
import java.util.Scanner;

public class Part3 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//Declaration that variable holds the sub program
		Scanner reader = new Scanner (System.in);
		System.out.println("What is your test out of?");
		double overall = reader.nextDouble();
		System.out.println("How many marks would you like to enter?");
		double amount = reader.nextDouble();
		double average = 0;
		for (int i = 0 ; i <amount ; i++)
		{
			System.out.println("Please enter a mark");
			double mark = reader.nextDouble();
			average = ((mark/overall)*100);
		}
		double total = average;
		System.out.println(total);
	}

}
