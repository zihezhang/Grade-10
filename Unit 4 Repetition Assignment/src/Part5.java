/*Name: Zihe Zhang
 * Class: ICS2O1-02
 * Date: 19/04/2017
 * Teacher: Mr Naccorato
 * Program summary:
 */

//Imports scanner from the library
import java.util.Scanner;

public class Part5 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//Declaration that variable holds the sub program
		Scanner reader = new Scanner (System.in);
		System.out.println("How much was your car");
		double vehicle = reader.nextDouble();
		double car = vehicle*1.027;
		double payment = 0;
		int month = 0;
		do
		{
			System.out.println("Please enter a payment");	
			payment = reader.nextDouble();
			car = (car-payment);
			System.out.println("Balance remaining $ "+car);
			month = (month+1);
		}while(car>=0);
		System.out.println("It took you "+(month*3)+" months to finish paying");

	}

}
