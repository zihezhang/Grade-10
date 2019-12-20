/*Name: Zihe Zhang
 * Class: ICS2O1-02
 * Date: 08/03/2017
 * Teacher: Mr Naccorato
 * Program summary: Memory and Input Assignment part 6. This program takes the first and last name and outputs it in the order of last name then first name
 */

//Imports scanner from the library
import java.util.Scanner;

public class Fullname 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//Declaration that variable holds the sub program
		Scanner reader = new Scanner (System.in);
		
		//asks and reads user's first and last name input
		System.out.println ("Please enter your first name: ");
		String firstname = reader.nextLine();
		System.out.println ("Please enter your last name");
		String lastname = reader.nextLine();

		//outputs name in order of lastname and firstname respectively
		System.out.println (lastname +", " +firstname);
	}

}
