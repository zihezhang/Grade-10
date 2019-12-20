/*Name: Zihe Zhang
 * Class: ICS2O1-02
 * Date: 22/03/2017
 * Teacher: Mr Naccorato
 * Program summary: Program that determines what fare you payed for by allowing the user to input they price they payed for the fare
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

		//asks and reads user input
		System.out.println("Please enter a fare.");
		double fare = reader.nextDouble();
		reader.close();
		
		//analyses user input and see if it goes under any of the following if and if else statements. If it does fir in one of them, it would output what is determined. If not it will go under the else statements that has its own instructions
		if (fare==3.25)
			//for example, if user inputs 3.25 it will output that they have payed the price for a adult fare 
			System.out.println("You are an adult");
		else if (fare==2.00)
			System.out.println("You are a student or a senior");
		else if (fare==0.50)
			System.out.println("You put in a child fare, but the bus is free for children. You get a refund");
		else if (fare<0.50)
			System.out.println("You still need to put more money");
		else
			System.out.println("You put too much money");
		
	}

}
