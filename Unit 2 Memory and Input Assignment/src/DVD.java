/*Name: Zihe Zhang
 * Class: ICS2O1-02
 * Date: 08/03/2017
 * Teacher: Mr Naccorato
 * Program summary: Memory and Input Assignment part 1. This program asks for the length in inches of a DVD (or anything really) and converts it into centimeters
 */

//Imports scanner from the library
import java.util.Scanner;

public class DVD 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//Declaration that variable holds the sub program
		Scanner reader = new Scanner (System.in);
		
		//asks and reads how many inches their DVD is
		System.out.println ("Hey there, need help converting inches into centimetres? Came to the right place :)");
		System.out.println ("How many inches is your DVD?");
		double length = reader.nextDouble();
		
		//calculates and outputs the lenth of the dvd in centimeters
		System.out.println("Your DVD is " + (length*2.54 ) + " centimetres");
	}

}
