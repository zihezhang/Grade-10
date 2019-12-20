/*Name: Zihe Zhang
 * Class: ICS2O1-02
 * Date: 08/03/2017
 * Teacher: Mr Naccorato
 * Program summary: Memory and Input Assignment part 3. This program allows user to input the start time and end time of a road trip and distance travelled. The input is then used to calculate the average speed in km/h.
 */

//Imports scanner from the library
import java.util.Scanner;

public class Roadtrip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declaration that variable holds the sub program
		Scanner reader = new Scanner (System.in);
		
		//asking and reading user's information about their trip (time leaving, time arriving and distance)
		System.out.println ("Hi, I see you want to go on a road trip! I'll help you out!");
		System.out.println ("Please enter the hour you're leaving:");
		double hour1 = reader.nextDouble();
		System.out.println ("Please enter what minute you're leaving");
		double minute1 = reader.nextDouble();
		System.out.println ("Please enter the hour you'll be arriving at (make sure to use 24 Hours)");
		double hour2 = reader.nextDouble();
		System.out.println ("Please enter what minute you'll be arriving at");
		double minute2 = reader.nextDouble();
		System.out.println ("Please enter the distance you'll be travelling in km");
		double distance = reader.nextDouble();
		
		//calculates the total time in hours an sets a double for total time
		double starttime = (hour1+(minute1/60));
		double endtime = (hour2+(minute2/60));
		double totaltime = (endtime-starttime);

		//calculates and outputs average velocity
		System.out.println ("Your average velocity is: " + (distance/totaltime) +"km/h");
		
		
	}

}
