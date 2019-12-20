/*Name: Zihe Zhang
 * Class: ICS2O1-02
 * Date: 08/03/2017
 * Teacher: Mr Naccorato
 * Program summary: Memory and Input Assignment part 4 This program outputs the user's name, street, city, and postal code in a specific order
 */

//Imports scanner from the library
import java.util.Scanner;

public class Address 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//Declaration that variable holds the sub program
		Scanner reader = new Scanner (System.in);
		
		//asks and reads user's name		
		System.out.println ("Please enter your name: ");
		String name = reader.nextLine();
		
		//asks and reads user's street
		System.out.println ("Please enter your Street: ");
		String street = reader.nextLine();
		
		//asks and reads user's city
		System.out.println ("Please enter your City: ");
		String city = reader.nextLine();
		
		//asks and reads user's postal code
		System.out.println ("Please enter your Postal Code: ");
		String postalcode = reader.nextLine();
		
		//outputs user's name, street, city and postal code
		System.out.println ("Hello: " +name +"\n" +"Your address: " +street + ", " +city + ", " +postalcode);		
	}

}
