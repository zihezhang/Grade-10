/*Name: Zihe Zhang
 * Class: ICS2O1-02
 * Date: 22/03/2017
 * Teacher: Mr Naccorato
 * Program summary: This is a quiz about celebration days. It uses if else statements to determine the right answer. At the end of the quiz it will give you how many question you got right over the total amount of questions and it will give you your results in percentage form
 */
import java.util.Scanner;

public class Part4 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner reader = new Scanner (System.in);
		
		int mark = 0;
		
		//asks user the question and gives them the multiple choice answers
		System.out.println("What day is \"Put a Pillow on Your Fridge Day\"");
		System.out.println("1. May 29th");
		System.out.println("2. February 13th");
		System.out.println("3. July 27th");
		System.out.println("4. October 29th");		
		
		//sets user's input as a integer
		int day1 = reader.nextInt();
		
		//if input is correct, it will do the following
		if (day1 == 1)
		{
			System.out.println("Correct");
			mark = mark+1;
		}
		//if input is incorrect, it will do the following
		else
		{
			System.out.println("Incorrect");
		}
	
		
		//asks user the question and gives them the multiple choice answers
		System.out.println("\nWhat day is Walk on Stilts Day");
		System.out.println("1. July 1st");
		System.out.println("2. Decempber 30th");
		System.out.println("3. July 27th");
		System.out.println("4. January 09th");
				
		//sets user's input as a integer
		int day2 = reader.nextInt();
		
		//if input is correct, it will do the following
		if (day2 == 3)
		{
			System.out.println("Correct");
			mark = mark+1;
		}
		//if input is incorrect, it will do the following
		else
		{
			System.out.println("Incorrect");
		}	


		//asks user the question and gives them the multiple choice answers
		System.out.println("\nWhat day is Manatee Appreciation Day");
		System.out.println("1. February 11th");
		System.out.println("2. March 29th");
		System.out.println("3. July 06th");
		System.out.println("4. June 10th");
		
		//sets user's input as a integer
		int day3 = reader.nextInt();
		
		//if input is correct, it will do the following
		if (day3 == 2)
		{
			System.out.println("Correct");
			mark = mark+1;
		}
		//if input is incorrect, it will do the following
		else
		{
			System.out.println("Incorrect");
		}


		//asks user the question and gives them the multiple choice answers
		System.out.println("\nWhat day is Fancy Rat & Mouse Day");
		System.out.println("1. January 29th");
		System.out.println("2. November 12th");
		System.out.println("3. December 21th");
		System.out.println("4. May 20th");
		
		//sets user's input as a integer		
		int day4 = reader.nextInt();
		
		//if input is correct, it will do the following
		if (day4 == 2)
		{
			System.out.println("Correct");
			mark = mark+1;
		}
		//if input is incorrect, it will do the following
		else
		{
			System.out.println("Incorrect");
		}


		//asks user the question and gives them the multiple choice answers
		System.out.println("\nWhat day is Bat Appreciation Day");
		System.out.println("1. April 18th");
		System.out.println("2. April 21st");
		System.out.println("3. April 1st");
		System.out.println("4. April 17th");
		
		//sets user's input as a integer
		int day5 = reader.nextInt();
		
		//if input is correct, it will do the following
		if (day5 == 4)
		{
			System.out.println("Correct");
			mark = mark+1;
		}
		//if input is incorrect, it will do the following
		else
		{
			System.out.println("Incorrect");
		}
		
		//calculates and sets a integer for how many questions the quiz tacker got right

		
		//outputs and calculates the results from the quiz
		System.out.println("\nYou got " +(mark) +" out of 5");
		System.out.println("That is " + ((mark *100) / 5) + " %");
	}

}
