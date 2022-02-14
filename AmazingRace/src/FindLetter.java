import java.util.Scanner;



public class FindLetter
	{
		static Scanner stringInput = new Scanner(System.in);
		static Scanner intInput = new Scanner(System.in);
		
		static String enters1;
		static String enters2;
		
		public static void findLetter()
		{
			//import text file for each team 
			//with grid 
			System.out.println("Here are the rules: ");
			System.out.println("Each team is going to get a grid of letters. Your job is to find the 'a'. Type in the location of the 'a' in the column-row form - A1 for example");
			team1FL();
			team2FL();
		}
		
		public static void team1FL()
		{
			System.out.println("Team 1, you go first. Press enter to start the timer and find the letter");
			enters1 = stringInput.nextLine();
			//import text file
			//display it
			//start timer
			//give option to answer
		
		}
		
		public static void team2FL()
		{
			System.out.println("Team 2, you go next. Press enter to start the timer and find the letter");
			enters1 = stringInput.nextLine();
		}

	}
