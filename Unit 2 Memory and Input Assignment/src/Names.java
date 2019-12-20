/*Name: Zihe Zhang
 * Class: ICS2O1-02
 * Date: 08/03/2017
 * Teacher: Mr Naccorato
 * Program summary: Memory and Input Assignment part 5. This program takes 5 inputs of full names and outputs the names in the opposite order entered
 */

//Imports scanner from the library
import java.util.Scanner;

public class Names 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//Declaration that variable holds the sub program
		Scanner reader = new Scanner (System.in);
		
		//asks user and reads input names
		System.out.println ("Want to see a cool trick?");
		System.out.println ("Please enter a name");
		String name1 = reader.nextLine();
		System.out.println ("Please enter another name");
		String name2 = reader.nextLine();
		System.out.println ("Please enter another name");
		String name3 = reader.nextLine();
		System.out.println ("Please Enter another name");
		String name4 = reader.nextLine();
		System.out.println ("Please enter another name");
		String name5 = reader.nextLine();

		//outputs name in reverse order
		System.out.println (name5 +"\n" +name4 + "\n" +name3 +"\n" +name2 +"\n" +name1);
		System.out.println ("Wow! They are all outputted the opposite order as entered! Cool right?");
	}

}
