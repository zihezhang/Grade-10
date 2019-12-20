import java.util.Scanner;

public class Input 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner reader = new Scanner (System.in);
		System.out.println("First name: ");
		String firstName = reader.nextLine();
		System.out.println("Wow! I love your name!");
		System.out.println("What is your last name?");
		String lastName = reader.nextLine();
		System.out.println("Hi " + firstName + " " + lastName + " you are so good at programming keep up the good work");
		
		
	}

}
