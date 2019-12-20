/*Name: Zihe Zhang
 * Class: ICS2O1-02
 * Date: 08/03/2017
 * Teacher: Mr Naccorato
 * Program summary: Memory and Input Assignment part 2. This program is used to figure out how old the user will be by the end of the year
 */

//Imports scanner from the library
import java.util.Scanner;

public class Age 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//Declaration that variable holds the sub program
		Scanner reader = new Scanner (System.in);
		
		//asks and reads user's year of birth
		System.out.println("Please enter your year of birth");								
		int year = reader.nextInt();													
		//outputs user's age by the end of the year
		System.out.println("That means that you will be " + (2017-year) + " by the end of the year");
	}

}
