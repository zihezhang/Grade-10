/*Name: Zihe Zhang
 * Class: ICS2O1-02
 * Date: 08/03/2017
 * Teacher: Mr Naccorato
 * Program summary: Memory and Input Assignment part 7. Program that takes a user's age and output their age for next year 
 */

//Imports scanner from the library
import java.util.Scanner;

public class Futureage
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//Declaration that variable holds the sub program
		Scanner reader = new Scanner (System.in);
		
		//asks and reads user's age		
		System.out.println ("Please enter your age: ");
		int age = reader.nextInt();
		
		//calculates and outputs the age you will be in one year
		System.out.println ("Next Year you will be: " +(age+1));
		
			
	}

}
