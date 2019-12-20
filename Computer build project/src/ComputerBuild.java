/*Name: Zihe Zhang
 * Class: ICS2O1-02
 * Date: 04/04/2017
 * Teacher: Mr Naccorato
 * Program summary: Computer build assignment that asks the user what kind of computer build they wish to make. Once the selection happens, program prompts the user to select a computer part from a list of 3. Once the user makes their computer the program creates a bill of sale for each part chosen and display the subtotal and total after taxes for the computer build
 */

//Imports scanner from the library
import java.util.Scanner;

public class ComputerBuild 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//Declaration that variable holds the sub program
		Scanner reader = new Scanner (System.in);
		//This helps calculate the total amount of money. It is set to 0 right now and as the user chooses more and more computer parts the cost will be added onto this/
		double cost = 0;
		//Sets a string for the computer parts and as the user chooses more computer parts the part name will be added onto this string 
		String computer = "\nYou're computer has the following parts: ";
		//Lays out the choices of computer the user can make
		System.out.println("What kind of computer do you want to build (input the number representing the computer part of your choice)");
		System.out.println("1. Budget Build- you will only have $600 to spend");
		System.out.println("2. Business Build- you will have $1000 to spend");
		System.out.println("3. Gaming Build- you will have $1700 to spend");
		//sets and reads integer inputted
		int build = reader.nextInt();
		//if the integer build is 1, the following will happen
		if (build == 1 )
		{
			//asks user what kind of processor they would like and sets out the options
			System.out.println("What kind of processor would you like in your computer?");
			System.out.println("1. Intel Celeron G3900 2.8GHz Dual-Core Processor");
			System.out.println("2. Intel Celeron G3950 3.0GHz Dual-Core Processor");		
			System.out.println("3. Intel Celeron G3930 2.9GHz Dual-Core Processor");

			//sets the integer for the computer part and allows user to input the number representing the computer part that they want. This reads the number inputed.
			int processor = reader.nextInt();

			//if they choose computer part number 1, it will output the computer part, telling them what they chose. It will add the price of the product onto the total cost and it does the similar things with the same of the product name (adds onto the string).
			if (processor == 1)
			{
				System.out.println("You have chosen Intel Celeron G3900 2.8GHz Dual-Core Processor");
				cost = cost+60.99;
				computer = computer+ "\nIntel Celeron G3900 2.8GHz Dual-Core Processor- $60.99"; 
			}
			//if they choose computer part number 2, it will output the computer part, telling them what they chose. It will add the price of the product onto the total cost and it does the similar things with the same of the product name (adds onto the string).
			else if (processor == 2)
			{
				System.out.println("You have chosen Intel Celeron G3950 3.0GHz Dual-Core Processor");
				cost = cost+75.00;
				computer = computer+ "\nIntel Celeron G3950 3.0GHz Dual-Core Processor- $75.00"; 
			}
			//if they choose computer part number 3, it will output the computer part, telling them what they chose. It will add the price of the product onto the total cost and it does the similar things with the same of the product name (adds onto the string).
			else if (processor == 3)
			{
				System.out.println("You have chosen Intel Celeron G3930 2.9GHz Dual-Core Processor");
				cost = cost+52.50;
				computer = computer+ "\nIntel Celeron G3930 2.9GHz Dual-Core Processor- $52.50"; 
			}
			//if they don't pick a number 1-3 this will happen
			else
				System.out.println("You didn't choose a processor");


			System.out.println("\nChoose a Motherboard");
			System.out.println("1. Gigabyte GA-H110M-A Micro ATX LGA1151 Motherboard");
			System.out.println("2. Asus H110M-K Micro ATX LGA1151 Motherboard");		
			System.out.println("3. Gigabyte GA-B250M-DS3H Micro ATX LGA1151 Motherboard");
			int motherboard = reader.nextInt();
			if (motherboard == 1)
			{
				System.out.println("You have chosen Gigabyte GA-H110M-A Micro ATX LGA1151 Motherboard");
				cost = cost+73.50;
				computer = computer+ "\nGigabyte GA-H110M-A Micro ATX LGA1151 Motherboard- $73.50"; 
			}
			else if (motherboard == 2)
			{
				System.out.println("You have chosen Asus H110M-K Micro ATX LGA1151 Motherboard");
				cost = cost+77.00;
				computer = computer+ "\nAsus H110M-K Micro ATX LGA1151 Motherboard- $77.00"; 
			}
			else if (motherboard == 3)
			{
				System.out.println("You have chosen Gigabyte GA-B250M-DS3H Micro ATX LGA1151 Motherboard");
				cost = cost+99.99;
				computer = computer+ "\nGigabyte GA-B250M-DS3H Micro ATX LGA1151 Motherboard- $99.99"; 
			}
			else
				System.out.println("You didn't choose a motherboard");


			System.out.println("\nChoose a RAM");
			System.out.println("1. Kingston HyperX Fury Black 4GB (1 x 4GB) DDR4-2133 Memory");
			System.out.println("2. Corsair Vengeance LPX 4GB (1 x 4GB) DDR4-2400 Memory");		
			System.out.println("3. Crucial 4GB (1 x 4GB) DDR4-2133 Memory");
			int ram = reader.nextInt();
			if (ram == 1)
			{
				System.out.println("You have chosen Kingston HyperX Fury Black 4GB (1 x 4GB) DDR4-2133 Memory");
				cost = cost+46.00;
				computer = computer+ "\nKingston HyperX Fury Black 4GB (1 x 4GB) DDR4-2133 Memory- $46.00"; 
			}
			else if (ram == 2)
			{
				System.out.println("You have chosen Corsair Vengeance LPX 4GB (1 x 4GB) DDR4-2400 Memory");
				cost = cost+46.99;
				computer = computer+ "\nCorsair Vengeance LPX 4GB (1 x 4GB) DDR4-2400 Memory- $46.99"; 
			}
			else if (ram == 3)
			{
				System.out.println("You have chosen Crucial 4GB (1 x 4GB) DDR4-2133 Memory");
				cost = cost+37.99;
				computer = computer+ "\nCrucial 4GB (1 x 4GB) DDR4-2133 Memory- $37.99"; 
			}
			else
				System.out.println("You didn't choose a RAM");


			System.out.println("\nChoose a Hard Drive");
			System.out.println("1. Toshiba 1TB 3.5\" 7200RPM Internal Hard Drive");
			System.out.println("2. Seagate Barracuda 1TB 3.5\" 7200RPM Internal Hard Drive");		
			System.out.println("3. Western Digital Caviar Blue 1TB 3.5\" 7200RPM Internal Hard Drive");
			int harddrive = reader.nextInt();
			if (harddrive == 1)
			{
				System.out.println("You have chosen Toshiba 1TB 3.5\" 7200RPM Internal Hard Drive");
				cost = cost+62.50;
				computer = computer+ "\nToshiba 1TB 3.5\" 7200RPM Internal Hard Drive- $62.50"; 
			}
			else if (harddrive == 2)
			{
				System.out.println("You have chosen Seagate Barracuda 1TB 3.5\" 7200RPM Internal Hard Drive");
				cost = cost+64.05;
				computer = computer+ "\nSeagate Barracuda 1TB 3.5\" 7200RPM Internal Hard Drive- $64.05"; 
			}
			else if (harddrive == 3)
			{
				System.out.println("You have chosen Western Digital Caviar Blue 1TB 3.5\" 7200RPM Internal Hard Drive");
				cost = cost+67.05;
				computer = computer+ "\nWestern Digital Caviar Blue 1TB 3.5\" 7200RPM Internal Hard Drive- $67.05"; 
			}
			else
				System.out.println("You didn't choose a Hard Drive");


			System.out.println("\nChoose a Power supply");
			System.out.println("1. Diablotek 400W ATX Power Supply");
			System.out.println("2. Logisys 480W ATX Power Supply");		
			System.out.println("3. EVGA 400W ATX Power Supply");
			int powersupply = reader.nextInt();
			if (powersupply == 1)
			{
				System.out.println("You have chosen Diablotek 400W ATX Power Supply");
				cost = cost+20.52;
				computer = computer+ "\nDiablotek 400W ATX Power Supply- $20.52"; 
			}
			else if (powersupply == 2)
			{
				System.out.println("You have chosen Logisys 480W ATX Power Supply");
				cost = cost+29.99;
				computer = computer+ "\nLogisys 480W ATX Power Supply- $29.99"; 
			}
			else if (powersupply == 3)
			{
				System.out.println("You have chosen EVGA 400W ATX Power Supply");
				cost = cost+43.00;
				computer = computer+ "\nEVGA 400W ATX Power Supply- $43.00"; 
			}
			else
				System.out.println("You didn't choose a Power supply");

			System.out.println("Your computer does not have a seperate Graphics card (it is intergrated in Processor)");
			computer = computer+ "\nYou're computer does not have a seperate Graphics card";


			System.out.println("\nChoose a Case");
			System.out.println("1. Xion XON-310_BK MicroATX Mid Tower Case");
			System.out.println("2. Bitfenix Nova ATX Tower Window Case");		
			System.out.println("3. Rosewill FBM-01 MicroATX Mini Tower Case");
			int cases = reader.nextInt();
			if (cases == 1)
			{
				System.out.println("You have chosen Xion XON-310_BK MicroATX Mid Tower Case");
				cost = cost+39.99;
				computer = computer+ "\nXion XON-310_BK MicroATX Mid Tower Case- $39.99"; 
			}
			else if (cases == 2)
			{
				System.out.println("You have chosen Bitfenix Nova ATX Tower Window Case");
				cost = cost+35.84;
				computer = computer+ "\nBitfenix Nova ATX Tower Window Case- $35.84"; 
			}
			else if (cases == 3)
			{
				System.out.println("You have chosen Rosewill FBM-01 MicroATX Mini Tower Case");
				cost = cost+49.99;
				computer = computer+ "\nRosewill FBM-01 MicroATX Mini Tower Case- $49.99"; 
			}
			else
				System.out.println("You didn't choose a Case");


			System.out.println("\nChoose a Keyboard and Mouse combo");
			System.out.println("1. Slimline Corded USB Keyboard &Mouse Combo");
			System.out.println("2. Imicro KBIMK9 107-key Usb Wired English Keyboard and \"Mapletop Optical USB LED Wired Game Mouse  Purple Mice For PC Laptop Computer\"");		
			System.out.println("3. Logitech Desktop MK120 Mouse and keyboard Combo");
			int keyboardmouse = reader.nextInt();
			if (keyboardmouse == 1)
			{
				System.out.println("You have chosen Slimline Corded USB Keyboard &Mouse Combo");
				cost = cost+17.98;
				computer = computer+ "\nSlimline Corded USB Keyboard &Mouse Combo- $17.98"; 
			}
			else if (keyboardmouse == 2)
			{
				System.out.println("You have chosen Imicro KBIMK9 107-key Usb Wired English Keyboard and \"Mapletop Optical USB LED Wired Game Mouse  Purple Mice For PC Laptop Computer\"");
				cost = cost+5.91+3.20;
				computer = computer+ "\nImicro KBIMK9 107-key Usb Wired English Keyboard and \"Mapletop Optical USB LED Wired Game Mouse  Purple Mice For PC Laptop Computer\"- $5.91 and $3.20"; 
			}
			else if (keyboardmouse == 3)
			{
				System.out.println("You have chosen Logitech Desktop MK120 Mouse and keyboard Combo");
				cost = cost+19.99;
				computer = computer+ "\nLogitech Desktop MK120 Mouse and keyboard Combo- $19.99"; 
			}
			else
				System.out.println("You didn't choose a Keyboard and Mouse combo");


			System.out.println("\nChoose a Monitor");
			System.out.println("1. HP LE1711 LCD Monitor");
			System.out.println("2. BenQ GW2265HM 21.5-Inch Screen LED-Lit LCD Monitors");		
			System.out.println("3. Acer V196HQL 18.5\" LED LCD Monitor");
			int monitor = reader.nextInt();
			if (monitor == 1)
			{
				System.out.println("You have chosen HP LE1711 LCD Monitor");
				cost = cost+89.00;
				computer = computer+ "\nHP LE1711 LCD Monitor- $89.00"; 
			}
			else if (monitor == 2)
			{
				System.out.println("You have chosen BenQ GW2265HM 21.5-Inch Screen LED-Lit LCD Monitor");
				cost = cost+83.94;
				computer = computer+ "\nBenQ GW2265HM 21.5-Inch Screen LED-Lit LCD Monitor- $83.94"; 
			}
			else if (monitor == 3)
			{
				System.out.println("You have chosen Acer V196HQL 18.5\" LED LCD Monitor");
				cost = cost+96.99;
				computer = computer+ "\nAcer V196HQL 18.5\" LED LCD Monitor -$96.99"; 
			}
			else
				System.out.println("You didn't choose a Monitor");


			System.out.println("\nChoose a Operating System");
			System.out.println("1. Microsoft Windows 10 Home (64-Bit)");
			System.out.println("2. Microsoft Windows 8 32-bit ");		
			System.out.println("3. Cr OS Linux");
			int os = reader.nextInt();
			if (os == 1)
			{
				System.out.println("You have chosen Microsoft Windows 10 Home (64-Bit)");
				cost = cost+92.99;
				computer = computer+ "\nMicrosoft Windows 10 Home (64-Bit)- $92.99"; 
			}
			else if (os == 2)
			{
				System.out.println("You have chosen Microsoft Windows 8 32-bit ");
				cost = cost+101.50;
				computer = computer+ "\nMicrosoft Windows 8 32-bit- $101.50"; 
			}
			else if (os == 3)
			{
				System.out.println("You have chosen Cr OS Linux");
				cost = cost+0.00;
				computer = computer+ "\nCr OS Linux- $0.00"; 
			}
			else
				System.out.println("You didn't choose a Operating System");


			System.out.println("\nChoose your first software");
			System.out.println("1. Spotify");
			System.out.println("2. Gimp");		
			System.out.println("3. Firefox");
			int software1 = reader.nextInt();
			if (software1 == 1)
			{
				System.out.println("You have chosen Spotify");
				cost = cost+0.00;
				computer = computer+ "\nSpotify- $0.00"; 
			}
			else if (software1 == 2)
			{
				System.out.println("Gimp");
				cost = cost+0.00;
				computer = computer+ "\nGimp- $0.00"; 
			}
			else if (software1 == 3)
			{
				System.out.println("You have chosen Firefox");
				cost = cost+0.00;
				computer = computer+ "\nFirefox- $0.00"; 
			}
			else
				System.out.println("You didn't choose first software");


			System.out.println("\nChoose your second software");
			System.out.println("1. Google Chrome");
			System.out.println("2. Avidemux");		
			System.out.println("3. Skype");
			int software2 = reader.nextInt();
			if (software2 == 1)
			{
				System.out.println("You have chosen Google Chrome");
				cost = cost+0.00;
				computer = computer+ "\nGoogle Chrome- $0.00"; 
			}
			else if (software2 == 2)
			{
				System.out.println("You have chosen Avidemux");
				cost = cost+0.00;
				computer = computer+ "\nAvidemux- $0.00"; 
			}
			else if (software2 == 3)
			{
				System.out.println("You have chosen Skype");
				cost = cost+0.00;
				computer = computer+ "\nSkype- $0.00"; 
			}
			else
				System.out.println("You didn't choose your second software");
		}

		else if (build == 2 )
		{
			System.out.println("What kind of processor would you like in your computer?");
			System.out.println("1. Intel Celeron G3950 3.0GHz Dual-Core Processor");
			System.out.println("2. Intel Core i3-6100 3.7GHz Dual-Core Processor");		
			System.out.println("3. Intel Core i3-7100 3.9GHz Dual-Core Processor");

			int processor = reader.nextInt();

			if (processor == 1)
			{
				System.out.println("You have chosen Intel Celeron G3950 3.0GHz Dual-Core Processor");
				cost = cost+75.00;
				computer = computer+ "\nIntel Celeron G3950 3.0GHz Dual-Core Processor- $75.00"; 
			}
			else if (processor == 2)
			{
				System.out.println("You have chosen Intel Core i3-6100 3.7GHz Dual-Core Processor");
				cost = cost+156.50;
				computer = computer+ "\nIntel Core i3-6100 3.7GHz Dual-Core Processor- $156.50"; 
			}
			else if (processor == 3)
			{
				System.out.println("You have chosen Intel Core i3-7100 3.9GHz Dual-Core Processor");
				cost = cost+149.50;
				computer = computer+ "\nIntel Core i3-7100 3.9GHz Dual-Core Processor- $149.50"; 
			}
			else
				System.out.println("You didn't choose a processor");


			System.out.println("\nChoose a Motherboard");
			System.out.println("1. Gigabyte GA-B250M-DS3H Micro ATX LGA1151 Motherboard");
			System.out.println("2. MSI B150 Gaming M3 ATX LGA1151 Motherboard");		
			System.out.println("3. ASRock B250M Pro4 Micro ATX LGA1151 Motherboard");
			int motherboard = reader.nextInt();
			if (motherboard == 1)
			{
				System.out.println("You have chosen Gigabyte GA-B250M-DS3H Micro ATX LGA1151 Motherboard");
				cost = cost+102.50;
				computer = computer+ "\nGigabyte GA-B250M-DS3H Micro ATX LGA1151 Motherboard- $102.50"; 
			}
			else if (motherboard == 2)
			{
				System.out.println("You have chosen MSI B150 Gaming M3 ATX LGA1151 Motherboard");
				cost = cost+149.99;
				computer = computer+ "\nMSI B150 Gaming M3 ATX LGA1151 Motherboard- $149.99"; 
			}
			else if (motherboard == 3)
			{
				System.out.println("You have chosen ASRock B250M Pro4 Micro ATX LGA1151 Motherboard");
				cost = cost+129.05;
				computer = computer+ "\nASRock B250M Pro4 Micro ATX LGA1151 Motherboard- $129.05"; 
			}
			else
				System.out.println("You didn't choose a motherboard");


			System.out.println("\nChoose a RAM");
			System.out.println("1. G.Skill NT Series 8GB (1 x 8GB) DDR4-2400 Memory");
			System.out.println("2. Corsair Vengeance LPX 8GB (1 x 8GB) DDR4-2666 Memory");		
			System.out.println("3. Kingston HyperX Fury Black 8GB (2 x 4GB) DDR4-2133 Memory");
			int ram = reader.nextInt();
			if (ram == 1)
			{
				System.out.println("You have chosen G.Skill NT Series 8GB (1 x 8GB) DDR4-2400 Memory");
				cost = cost+79.99;
				computer = computer+ "\nG.Skill NT Series 8GB (1 x 8GB) DDR4-2400 Memory- $78.99"; 
			}
			else if (ram == 2)
			{
				System.out.println("You have chosen Corsair Vengeance LPX 8GB (1 x 8GB) DDR4-2666 Memory");
				cost = cost+89.99;
				computer = computer+ "\nCorsair Vengeance LPX 8GB (1 x 8GB) DDR4-2666 Memory- $89.99"; 
			}
			else if (ram == 3)
			{
				System.out.println("You have chosen Kingston HyperX Fury Black 8GB (2 x 4GB) DDR4-2133 Memory");
				cost = cost+79.99;
				computer = computer+ "\nKingston HyperX Fury Black 8GB (2 x 4GB) DDR4-2133 Memory- $79.99"; 
			}
			else
				System.out.println("You didn't choose a RAM");


			System.out.println("\nChoose a Hard Drive");
			System.out.println("1. Toshiba 2TB 3.5\" 7200RPM Internal Hard Drive");
			System.out.println("2. Western Digital BLACK SERIES 1TB 3.5\" 7200RPM Internal Hard Drive");		
			System.out.println("3. Hitachi Travelstar 1TB 2.5\" 7200RPM Internal Hard Drive");
			int harddrive = reader.nextInt();
			if (harddrive == 1)
			{
				System.out.println("You have chosen Toshiba 2TB 3.5\" 7200RPM Internal Hard Drive");
				cost = cost+62.50;
				computer = computer+ "\nToshiba 2TB 3.5\" 7200RPM Internal Hard Drive- $62.50"; 
			}
			else if (harddrive == 2)
			{
				System.out.println("You have chosen Western Digital BLACK SERIES 1TB 3.5\" 7200RPM Internal Hard Drive");
				cost = cost+64.05;
				computer = computer+ "\nWestern Digital BLACK SERIES 1TB 3.5\" 7200RPM Internal Hard Drive- $64.05"; 
			}
			else if (harddrive == 3)
			{
				System.out.println("You have chosen Hitachi Travelstar 1TB 2.5\" 7200RPM Internal Hard Drive");
				cost = cost+67.05;
				computer = computer+ "\nHitachi Travelstar 1TB 2.5\" 7200RPM Internal Hard Drive- $67.05"; 
			}
			else
				System.out.println("You didn't choose a Hard Drive");


			System.out.println("\nChoose a Power supply");
			System.out.println("1. EVGA 400W ATX Power Supply");
			System.out.println("2. EVGA 500W 80+ Bronze Certified ATX Power Supply");		
			System.out.println("3. Rosewill 500W 80+ Bronze Certified Semi-Modular ATX Power Supply");
			int powersupply = reader.nextInt();
			if (powersupply == 1)
			{
				System.out.println("You have chosen EVGA 400W ATX Power Supply");
				cost = cost+42.50;
				computer = computer+ "\nEVGA 400W ATX Power Supply- $42.50"; 
			}
			else if (powersupply == 2)
			{
				System.out.println("You have chosen EVGA 500W 80+ Bronze Certified ATX Power Supply");
				cost = cost+71.00;
				computer = computer+ "\nEVGA 500W 80+ Bronze Certified ATX Power Supply- $71.00"; 
			}
			else if (powersupply == 3)
			{
				System.out.println("You have chosen Rosewill 500W 80+ Bronze Certified Semi-Modular ATX Power Supply");
				cost = cost+106.39;
				computer = computer+ "\nRosewill 500W 80+ Bronze Certified Semi-Modular ATX Power Supply- $106.39"; 
			}
			else
				System.out.println("You didn't choose a Power supply");

			System.out.println("Your computer does not have a seperate Graphics card (it is intergrated in Processor)");
			computer = computer+ "\nYou're computer does not have a seperate Graphics card";


			System.out.println("\nChoose a Case");
			System.out.println("1. Thermaltake Versa H15 MicroATX Mid Tower Case");
			System.out.println("2. Corsair 200R ATX Mid Tower Case");		
			System.out.println("3. Deepcool TESSERACT BF ATX Mid Tower Case");
			int cases = reader.nextInt();
			if (cases == 1)
			{
				System.out.println("You have chosen Thermaltake Versa H15 MicroATX Mid Tower Case");
				cost = cost+46.00;
				computer = computer+ "\nThermaltake Versa H15 MicroATX Mid Tower Case- $46.00"; 
			}
			else if (cases == 2)
			{
				System.out.println("You have chosen Corsair 200R ATX Mid Tower Case");
				cost = cost+64.89;
				computer = computer+ "\nCorsair 200R ATX Mid Tower Case- $64.89"; 
			}
			else if (cases == 3)
			{
				System.out.println("You have chosen Deepcool TESSERACT BF ATX Mid Tower Case");
				cost = cost+44.99;
				computer = computer+ "\nDeepcool TESSERACT BF ATX Mid Tower Case- $44.99"; 
			}
			else
				System.out.println("You didn't choose a Case");


			System.out.println("\nChoose a Keyboard and Mouse combo");
			System.out.println("1. Gigabyte GK-KM6150 Wired Standard Keyboard w/Optical Mouse");
			System.out.println("2. Logitech K120 Wired Standard Keyboard and Gigabyte GM-M6800 Wired Optical Mouse");		
			System.out.println("3. Gigabyte KM7580 Wireless Slim Keyboard w/Optical Mouse");
			int keyboardmouse = reader.nextInt();
			if (keyboardmouse == 1)
			{
				System.out.println("You have chosen Gigabyte GK-KM6150 Wired Standard Keyboard w/Optical Mouse");
				cost = cost+26.29;
				computer = computer+ "\nGigabyte GK-KM6150 Wired Standard Keyboard w/Optical Mouse- $26.29"; 
			}
			else if (keyboardmouse == 2)
			{
				System.out.println("You have chosen Logitech K120 Wired Standard Keyboard and Gigabyte GM-M6800 Wired Optical Mouse");
				cost = cost+18.50+18.00;
				computer = computer+ "\nLogitech K120 Wired Standard Keyboard and Gigabyte GM-M6800 Wired Optical Mouse- $18.50 and $18.00"; 
			}	
			else if (keyboardmouse == 3)
			{
				System.out.println("You have chosen Gigabyte KM7580 Wireless Slim Keyboard w/Optical Mouse");
				cost = cost+32.99;
				computer = computer+ "\nGigabyte KM7580 Wireless Slim Keyboard w/Optical Mouse- $32.99"; 
			}
			else
				System.out.println("You didn't choose a Keyboard and Mouse combo");


			System.out.println("\nChoose a Monitor");
			System.out.println("1. Planar PLL2210W 22.0\" 1920x1080 Monitor");
			System.out.println("2. Acer UM.WV6AA.B01 21.5\" 1920x1080 60Hz Monitor");		
			System.out.println("3. ViewSonic VA2246M-LED 22.0\" 1920x1080 60Hz Monitor");
			int monitor = reader.nextInt();
			if (monitor == 1)
			{
				System.out.println("You have chosen Planar PLL2210W 22.0\" 1920x1080 Monitor");
				cost = cost+89.00;
				computer = computer+ "\nPlanar PLL2210W 22.0\" 1920x1080 Monitor- $89.00"; 
			}
			else if (monitor == 2)
			{
				System.out.println("You have chosen Acer UM.WV6AA.B01 21.5\" 1920x1080 60Hz Monitor");
				cost = cost+83.94;
				computer = computer+ "\nAcer UM.WV6AA.B01 21.5\" 1920x1080 60Hz Monitor- $83.94"; 
			}
			else if (monitor == 3)
			{
				System.out.println("You have chosen ViewSonic VA2246M-LED 22.0\" 1920x1080 60Hz Monitor");
				cost = cost+96.99;
				computer = computer+ "\nViewSonic VA2246M-LED 22.0\" 1920x1080 60Hz Monitor- $96.99"; 
			}
			else
				System.out.println("You didn't choose a Monitor");


			System.out.println("\nChoose a Operating System");
			System.out.println("1. Microsoft Windows 8.1 OEM 64-bit");
			System.out.println("2. Ubuntu 13.04 Desktop Edition");		
			System.out.println("3. Microsoft Windows 10 Home (64-Bit) - Windows");
			int os = reader.nextInt();
			if (os == 1)
			{
				System.out.println("You have chosen Microsoft Windows 8.1 OEM 64-bit");
				cost = cost+92.99;
				computer = computer+ "\nMicrosoft Windows 8.1 OEM 64-bit- $92.99"; 
			}
			else if (os == 2)
			{
				System.out.println("You have chosen Ubuntu 13.04 Desktop Edition");
				cost = cost+0.00;
				computer = computer+ "\nUbuntu 13.04 Desktop Edition- $0.00"; 
			}
			else if (os == 3)
			{
				System.out.println("You have chosen Microsoft Windows 10 Home (64-Bit) - Windows");
				cost = cost+101.50;
				computer = computer+ "\nMicrosoft Windows 10 Home (64-Bit) - Windows- $101.50"; 
			}
			else
				System.out.println("You didn't choose a Operating System");


			System.out.println("\nChoose your first software");
			System.out.println("1. Microsoft Office Home and Student 2013 Software");
			System.out.println("2. Microsoft Office 365 Personal (1 Year Subscription) Software");		
			System.out.println("3. AVG Antivirus Software");
			int software1 = reader.nextInt();
			if (software1 == 1)
			{
				System.out.println("You have chosen Microsoft Office Home and Student 2013 Software");
				cost = cost+139.00;
				computer = computer+ "\nMicrosoft Office Home and Student 2013 Software- $139.00"; 
			}
			else if (software1 == 2)
			{
				System.out.println("Microsoft Office 365 Personal (1 Year Subscription) Software");
				cost = cost+69.00;
				computer = computer+ "\nMicrosoft Office 365 Personal (1 Year Subscription) Software- $69.00"; 
			}
			else if (software1 == 3)
			{
				System.out.println("You have chosen AVG Antivirus Software");
				cost = cost+0.00;
				computer = computer+ "\nAVG Antivirus Software- $0.00"; 
			}
			else
				System.out.println("You didn't choose first software");


			System.out.println("\nChoose your second software");
			System.out.println("1. Grammarly");
			System.out.println("2. Skype");		
			System.out.println("3. SketchUp Free");
			int software2 = reader.nextInt();
			if (software2 == 1)
			{
				System.out.println("You have chosen Grammarly");
				cost = cost+0.00;
				computer = computer+ "\nGrammarly- $0.00"; 
			}
			else if (software2 == 2)
			{
				System.out.println("You have chosen Skype");
				cost = cost+0.00;
				computer = computer+ "\nSkype- $0.00"; 
			}
			else if (software2 == 3)
			{
				System.out.println("You have chosen SketchUp Free");
				cost = cost+0.00;
				computer = computer+ "\nSketchUp Free- $0.00"; 
			}
			else
				System.out.println("You didn't choose your second software");
		}

		else if (build == 3 )
		{
			System.out.println("What kind of processor would you like in your computer?");
			System.out.println("1. Intel Core i5-6600K 3.5GHz Quad-Core Processor and Cooler Master Hyper T2 54.8 CFM Sleeve Bearing CPU Cooler");
			System.out.println("2. Intel Core i5-6600 3.3GHz Quad-Core Processor");		
			System.out.println("3. Intel Core i5-7500 3.4GHz Quad-Core Processor");

			int processor = reader.nextInt();
			if (processor == 1)
			{
				System.out.println("You have chosen Intel Core i5-6600K 3.5GHz Quad-Core Processor and Cooler Master Hyper T2 54.8 CFM Sleeve Bearing CPU Cooler");
				cost = cost+319.50+19.99;
				computer = computer+ "\nIntel Core i5-6600K 3.5GHz Quad-Core Processor and Cooler Master Hyper T2 54.8 CFM Sleeve Bearing CPU Cooler- $319.50+ $19.99"; 
			}
			else if (processor == 2)
			{
				System.out.println("You have chosen Intel Core i5-6600 3.3GHz Quad-Core Processor");
				cost = cost+300.00;
				computer = computer+ "\nIntel Core i5-6600 3.3GHz Quad-Core Processor- $300.00"; 
			}
			else if (processor == 3)
			{
				System.out.println("You have chosen Intel Core i5-7500 3.4GHz Quad-Core Processor");
				cost = cost+265.00;
				computer = computer+ "\nIntel Core i5-7500 3.4GHz Quad-Core Processor- $265.00"; 
			}
			else
				System.out.println("You didn't choose a processor");


			System.out.println("\nChoose a Motherboard");
			System.out.println("1. MSI H110M Gaming Micro ATX LGA1151 Motherboard");
			System.out.println("2. MSI B150M BAZOOKA PLUS Micro ATX LGA1151 Motherboard");		
			System.out.println("3. Asus H110M-E/M.2 Micro ATX LGA1151 Motherboard");
			int motherboard = reader.nextInt();
			if (motherboard == 1)
			{
				System.out.println("You have chosen MSI H110M Gaming Micro ATX LGA1151 Motherboard");
				cost = cost+95.50;
				computer = computer+ "\nMSI H110M Gaming Micro ATX LGA1151 Motherboard- $95.50"; 
			}
			else if (motherboard == 2)
			{
				System.out.println("You have chosen MSI B150M BAZOOKA PLUS Micro ATX LGA1151 Motherboard");
				cost = cost+96.50;
				computer = computer+ "\nMSI B150M BAZOOKA PLUS Micro ATX LGA1151 Motherboard- $96.50"; 
			}
			else if (motherboard == 3)
			{
				System.out.println("You have chosen Asus H110M-E/M.2 Micro ATX LGA1151 Motherboard");
				cost = cost+74.99;
				computer = computer+ "\nAsus H110M-E/M.2 Micro ATX LGA1151 Motherboard- $74.99"; 
			}
			else
				System.out.println("You didn't choose a motherboard");


			System.out.println("\nChoose a RAM");
			System.out.println("1. PNY Anarchy 16GB (2 x 8GB) DDR4-2133 Memory");
			System.out.println("2. G.Skill Aegis 8GB (1 x 8GB) DDR4-2133 Memory");		
			System.out.println("3. Crucial 4GB (1 x 4GB) DDR4-2133 Memory");
			int ram = reader.nextInt();
			if (ram == 1)
			{
				System.out.println("You have chosen PNY Anarchy 16GB (2 x 8GB) DDR4-2133 Memory");
				cost = cost+111.99;
				computer = computer+ "\nPNY Anarchy 16GB (2 x 8GB) DDR4-2133 Memory- $111.99"; 
			}
			else if (ram == 2)
			{
				System.out.println("You have chosen G.Skill Aegis 8GB (1 x 8GB) DDR4-2133 Memory");
				cost = cost+79.99;
				computer = computer+ "\nG.Skill Aegis 8GB (1 x 8GB) DDR4-2133 Memory- $79.99"; 
			}
			else if (ram == 3)
			{
				System.out.println("You have chosen Kingston HyperX Fury Black 16GB (2 x 8GB) DDR4-2133 Memory");
				cost = cost+142.00;
				computer = computer+ "\nKingston HyperX Fury Black 16GB (2 x 8GB) DDR4-2133 Memory- $142.00"; 
			}
			else
				System.out.println("You didn't choose a RAM");


			System.out.println("\nChoose a Hard Drive");
			System.out.println("1. Samsung 850 EVO-Series 250GB 2.5\" Solid State Drive and Western Digital Blue 2TB 3.5\" 5400RPM Internal Hard Drive");
			System.out.println("2. Sandisk SSD PLUS 240GB 2.5\" Solid State Drive and Toshiba 2TB 3.5\" 7200RPM Internal Hard Drive");		
			System.out.println("3. Kingston SSDNow V300 Series 120GB 2.5\" Solid State Drive and Seagate Barracuda 2TB 3.5\" 7200RPM Internal Hard Drive");
			int harddrive = reader.nextInt();
			if (harddrive == 1)
			{
				System.out.println("You have chosen Samsung 850 EVO-Series 250GB 2.5\" Solid State Drive and Western Digital Blue 2TB 3.5\" 5400RPM Internal Hard Drive");
				cost = cost+134.50+92.05;
				computer = computer+ "\nSamsung 850 EVO-Series 250GB 2.5\" Solid State Drive and Western Digital Blue 2TB 3.5\" 5400RPM Internal Hard Drive- $134.50 and $92.05"; 
			}
			else if (harddrive == 2)
			{
				System.out.println("You have chosen Sandisk SSD PLUS 240GB 2.5\" Solid State Drive and Toshiba 2TB 3.5\" 7200RPM Internal Hard Drive");
				cost = cost+104.99+99.99;
				computer = computer+ "\nSandisk SSD PLUS 240GB 2.5\" Solid State Drive and Toshiba 2TB 3.5\" 7200RPM Internal Hard Drive- $104.99 and $99.99"; 
			}
			else if (harddrive == 3)
			{
				System.out.println("You have chosen Kingston SSDNow V300 Series 120GB 2.5\" Solid State Drive and Seagate Barracuda 2TB 3.5\" 7200RPM Internal Hard Drive");
				cost = cost+66.99+88.50;
				computer = computer+ "\nKingston SSDNow V300 Series 120GB 2.5\" Solid State Drive and Seagate Barracuda 2TB 3.5\" 7200RPM Internal Hard Drive- $66.99 and $88.50"; 
			}
			else
				System.out.println("You didn't choose a Hard Drive");


			System.out.println("\nChoose a Power supply");
			System.out.println("1. EVGA 500W 80+ Bronze Certified ATX Power Supply");
			System.out.println("2. SeaSonic 520W 80+ Bronze Certified Fully-Modular ATX Power Supply");		
			System.out.println("3. EVGA 600B 600W 80+ Bronze Certified ATX Power Supply");
			int powersupply = reader.nextInt();
			if (powersupply == 1)
			{
				System.out.println("You have chosen EVGA 500W 80+ Bronze Certified ATX Power Supply");
				cost = cost+71.00;
				computer = computer+ "\nEVGA 500W 80+ Bronze Certified ATX Power Supply"; 
			}
			else if (powersupply == 2)
			{
				System.out.println("You have chosen SeaSonic 520W 80+ Bronze Certified Fully-Modular ATX Power Supply");
				cost = cost+91.00;
				computer = computer+ "\nSeaSonic 520W 80+ Bronze Certified Fully-Modular ATX Power Supply- $91.00"; 
			}
			else if (powersupply == 3)
			{
				System.out.println("You have chosen EVGA EVGA 600B 600W 80+ Bronze Certified ATX Power Supply");
				cost = cost+62.99;
				computer = computer+ "\nEVGA 600B 600W 80+ Bronze Certified ATX Power Supply- $62.99"; 
			}
			else
				System.out.println("You didn't choose a Power supply");

			System.out.println("\nChoose a Graphics Card");
			System.out.println("1. Gigabyte Radeon RX 480 8GB G1 Gaming Video Card");
			System.out.println("2. Asus Radeon RX 480 8GB ROG STRIX Video Card");		
			System.out.println("3. XFX Radeon RX 480 8GB XXX OC Video Card");
			int graphicscard = reader.nextInt();
			if (graphicscard == 1)
			{
				System.out.println("You have chosen Gigabyte Radeon RX 480 8GB G1 Gaming Video Card");
				cost = cost+369.99;
				computer = computer+ "\nGigabyte Radeon RX 480 8GB G1 Gaming Video Card- $369.99"; 
			}
			else if (graphicscard == 2)
			{
				System.out.println("You have chosen Asus Radeon RX 480 8GB ROG STRIX Video Card");
				cost = cost+358.99;
				computer = computer+ "\nAsus Radeon RX 480 8GB ROG STRIX Video Card- $358.99"; 
			}
			else if (graphicscard == 3)
			{
				System.out.println("You have chosen RXFX Radeon RX 480 8GB XXX OC Video Card");
				cost = cost+354.50;
				computer = computer+ "\nXFX Radeon RX 480 8GB XXX OC Video Card+ $354.50"; 
			}
			else
				System.out.println("You didn't choose a Graphics Card");


			System.out.println("\nChoose a Case");
			System.out.println("1. Corsair 100R ATX Mid Tower Case");
			System.out.println("2. Cooler Master N200 MicroATX Mini Tower Case");		
			System.out.println("3. NZXT S340 (Black) ATX Mid Tower Case");
			int cases = reader.nextInt();
			if (cases == 1)
			{
				System.out.println("You have chosen Corsair 100R ATX Mid Tower Case");
				cost = cost+62.99;
				computer = computer+ "\nCorsair 100R ATX Mid Tower Case- $62.99"; 
			}
			else if (cases == 2)
			{
				System.out.println("You have chosen Cooler Master N200 MicroATX Mini Tower Case");
				cost = cost+58.50;
				computer = computer+ "\nCooler Master N200 MicroATX Mini Tower Case- $58.50"; 
			}
			else if (cases == 3)
			{
				System.out.println("You have chosen NZXT S340 (Black) ATX Mid Tower Case");
				cost = cost+89.99;
				computer = computer+ "\nNZXT S340 (Black) ATX Mid Tower Case- $89.99"; 
			}
			else
				System.out.println("You didn't choose a Case");


			System.out.println("\nChoose a Keyboard and Mouse combo");
			System.out.println("1. Redragon S101 Wired Gaming Keyboard w/Optical Mouse");
			System.out.println("2. AZIO L70 Wired Gaming Keyboard and Redragon Centrophorus M601 Wired Optical Mouse");		
			System.out.println("3. Logitech Desktop MK120 Mouse and keyboard Combo");
			int keyboardmouse = reader.nextInt();
			if (keyboardmouse == 1)
			{
				System.out.println("You have chosen Redragon S101 Wired Gaming Keyboard w/Optical Mouse");
				cost = cost+36.99;
				computer = computer+ "\nRedragon S101 Wired Gaming Keyboard w/Optical Mouse- $36.99"; 
			}
			else if (keyboardmouse == 2)
			{
				System.out.println("You have chosen AZIO L70 Wired Gaming Keyboard and Redragon Centrophorus M601 Wired Optical Mouse");
				cost = cost+22.77+18.99;
				computer = computer+ "\nAZIO L70 Wired Gaming Keyboard and Redragon Centrophorus M601 Wired Optical Mouse- $22.77 and $18.99"; 
			}
			else if (keyboardmouse == 3)
			{
				System.out.println("You have chosen Cooler Master Devastator II Wired Gaming Keyboard w/Optical Mouse");
				cost = cost+40.00;
				computer = computer+ "\nCooler Master Devastator II Wired Gaming Keyboard w/Optical Mouse- $40.00"; 
			}
			else
				System.out.println("You didn't choose a Keyboard and Mouse combo");


			System.out.println("\nChoose a Monitor");
			System.out.println("1. AOC I2379VHE 23.0\" 1920x1080 60Hz Monitor");
			System.out.println("2. Asus VS228H-P 21.5\" 1920x1080 Monitor");		
			System.out.println("3. Acer UM.WV6AA.B01 21.5\" 1920x1080 60Hz Monitor");
			int monitor = reader.nextInt();
			if (monitor == 1)
			{
				System.out.println("You have chosen AOC I2379VHE 23.0\" 1920x1080 60Hz Monitor");
				cost = cost+173.50;
				computer = computer+ "\nAOC I2379VHE 23.0\" 1920x1080 60Hz Monitor- $173.50"; 
			}
			else if (monitor == 2)
			{
				System.out.println("You have chosen Asus VS228H-P 21.5\" 1920x1080 Monitor");
				cost = cost+149.50;
				computer = computer+ "\nAsus VS228H-P 21.5\" 1920x1080 Monitor- $149.50"; 
			}
			else if (monitor == 3)
			{
				System.out.println("You have chosen Acer UM.WV6AA.B01 21.5\" 1920x1080 60Hz Monitor");
				cost = cost+124.99;
				computer = computer+ "\nAcer UM.WV6AA.B01 21.5\" 1920x1080 60Hz Monitor- $124.99"; 
			}
			else
				System.out.println("You didn't choose a Monitor");


			System.out.println("\nChoose a Operating System");
			System.out.println("1. Ubuntu 13.04 Desktop Edition");
			System.out.println("2. Windows 10 Home (64-Bit)");		
			System.out.println("3. Microsoft Windows 8.1 OEM 64-bit");
			int os = reader.nextInt();
			if (os == 1)
			{
				System.out.println("You have chosen Ubuntu 13.04 Desktop Edition");
				cost = cost+0.00;
				computer = computer+ "\nUbuntu 13.04 Desktop Edition- $0.00"; 
			}
			else if (os == 2)
			{
				System.out.println("You have chosen Windows 10 Home (64-Bit)");
				cost = cost+92.99;
				computer = computer+ "\nWindows 10 Home (64-Bit)- $92.99"; 
			}
			else if (os == 3)
			{
				System.out.println("You have chosen Microsoft Windows 8.1 OEM 64-bit");
				cost = cost+130.00;
				computer = computer+ "\nMicrosoft Windows 8.1 OEM 64-bit- $130.00"; 
			}
			else
				System.out.println("You didn't choose a Operating System");


			System.out.println("\nChoose your first software");
			System.out.println("1. Steam");
			System.out.println("2. Devil May Cry 4: Special Editionp");		
			System.out.println("3. Batman: Arkham City");
			int software1 = reader.nextInt();
			if (software1 == 1)
			{
				System.out.println("You have chosen Steam");
				cost = cost+0.00;
				computer = computer+ "\nSteam- $0.00"; 
			}
			else if (software1 == 2)
			{
				System.out.println("Devil May Cry 4: Special Edition");
				cost = cost+24.99;
				computer = computer+ "\nDevil May Cry 4: Special Edition- $24.99"; 
			}
			else if (software1 == 3)
			{
				System.out.println("You have chosen Batman: Arkham City");
				cost = cost+9.99;
				computer = computer+ "\nBatman: Arkham City- $9.99"; 
			}
			else
				System.out.println("You didn't choose first software");


			System.out.println("\nChoose your second software");
			System.out.println("1. Moonbase Alpha");
			System.out.println("2. Lucky Sudoku");		
			System.out.println("3. Minecraft");
			int software2 = reader.nextInt();
			if (software2 == 1)
			{
				System.out.println("You have chosen Moonbase Alpha");
				cost = cost+0.00;
				computer = computer+ "\nMoonbase Alpha- $0.00"; 
			}
			else if (software2 == 2)
			{
				System.out.println("You have chosen Lucky Sudoku");
				cost = cost+0.00;
				computer = computer+ "\nLucky Sudoku- $0.00"; 
			}
			else if (software2 == 3)
			{
				System.out.println("You have chosen Minecraft");
				cost = cost+35.00;
				computer = computer+ "\nMinecraft- $35.00"; 
			}
			else
				System.out.println("You didn't choose your second software");
		}
		
		//if the user does not input a numumber representing the options they would not have a computer build
		else
		{
			System.out.println("You did not choose a computer build");
			computer = computer+ "\nYou do not have any computer parts";
		}

		//outputs the reciept
		System.out.println(computer);

		//outputs the prince of all the computer parts before tax
		System.out.println("\nYour sub total comes to a cost of $ " + cost);

		//calculates the amount of tax for the total price
		double tax = cost*0.13;
		
		//outputs the tax price
		System.out.println("Your tax is $ " + tax);
		
		//adds the cost of the computer parts with the tax
		double taxcost = cost+tax;
		
		//outputs the price of the computer parts including tax
		System.out.println("Your total comes to a cost of $ " + taxcost);
		

		//if else statment that determines if the person is under or over budget
		if (build == 1)
		{
			if (taxcost>600)
				System.out.println("You are over budget, please rerun the program to get computer parts that are under budget");
			else
				System.out.println("You are under budget");
		}
		
		else if (build == 2)
		{
			if (taxcost>1000)
				System.out.println("You are over budget, please rerun the program to get computer parts that are under budget");
			else
				System.out.println("You are under budget");
		}
		
		else if (build == 3)
		{
			if (taxcost>1700)
				System.out.println("You are over budget, please rerun the program to get computer parts that are under budget");
			else
				System.out.println("You are under budget");
		}
		
		else
		{
			System.out.println("You did not purchase your computer and you saved all you money :)");
		}
		
	}

}
