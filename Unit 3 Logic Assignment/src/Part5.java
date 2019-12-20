/*Name: Zihe Zhang
 * Class: ICS2O1-02
 * Date: 22/03/2017
 * Teacher: Mr Naccorato
 * Program summary: Program that allows users to input a number from 1 to 7, each number representing a day of the week, starting with 1, which represents monday then 2 representing tuesday and so on.
 */

//Imports scanner from the library
import java.util.Scanner;

public class Part5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declaration that variable holds the sub program
		Scanner reader = new Scanner (System.in);

		//requests uder to input number
		System.out.println("Please enter a number between 1-7");

		//number inputted is saved as a integer
		int n = reader.nextInt();

		//switch statement starts
		String weekString;
		switch (n)
		{
			case 1: weekString = "Monday";
				break;
			case 2: weekString = "Tuesday";
				break;
			case 3: weekString = "Wednesday";
				break;
			case 4: weekString = "Thurday";
				break;
			case 5: weekString = "Friday";
				break;
			case 6: weekString = "Saturday";
				break;
			case 7: weekString = "Sunday";
				break;
			default: weekString = "Invalid";
				break;		
		}
		//outputs day of the week
		System.out.println(weekString);
		
	}

}
