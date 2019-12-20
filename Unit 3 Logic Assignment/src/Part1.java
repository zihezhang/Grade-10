/*Name: Zihe Zhang
 * Class: ICS2O1-02
 * Date: 22/03/2017
 * Teacher: Mr Naccorato
 * Program summary: Program that asks for how much someone payed for lunch and determines if they have to pay tax or not use if, else statements.
 */

//Imports scanner from the library
import java.util.Scanner;

public class Part1 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//Declaration that variable holds the sub program
		Scanner reader = new Scanner (System.in);
		
		//asks and reads the reader's input 
		System.out.println("Please enter the amount of money you paid for lunch");
		double money = reader.nextDouble();
		
		//analyses the input and checks if it is satistying the if statement 
		if (money > 4)
			System.out.println("Since you spent more than $4, you have to pay 13% tax \nThis is what you have to pay: $" +(money*1.13));
		
		//determines what the program will do if the if the input did no satisfy the if statement
		else
		System.out.println("Since you spent less than $4, you do not have to pay 13% tax)");
	}

}
