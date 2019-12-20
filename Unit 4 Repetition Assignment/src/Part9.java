/*Name: Zihe Zhang
 * Class: ICS2O1-02
 * Date: 19/04/2017
 * Teacher: Mr Naccorato
 * Program summary:
 */

//Imports scanner from the library
import java.util.Scanner;

public class Part9 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//Declaration that variable holds the sub program
		Scanner reader = new Scanner (System.in);
		System.out.println("Please enter a number");
		int number = reader.nextInt();
		int times = 1;
		String factorial = "";
		String x = " x ";
		factorial = factorial + number;
		System.out.println("The factorial of " + number + " is ");
		System.out.print(number);
		for(int i = number-1; i >= 1; i-=1)
		{
			factorial = x + i;
			times = times*i;
			System.out.print(factorial);
		}
		System.out.println("\n= " + times*number);
	}

}
