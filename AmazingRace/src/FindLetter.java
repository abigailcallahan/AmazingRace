import java.util.Scanner;
import java.io.File;
import java.io.IOException;


public class FindLetter
	{
		static Scanner stringInput = new Scanner(System.in);
		static Scanner intInput = new Scanner(System.in);
		static Scanner myFile;
		static Scanner myFile2;
		
		static String enters1;
		static String enters2;
		
		static String ansFL1;
		static String ansFL2;

		static double preFL1;
		static double preFL2;
		static double postFL1;
		static double postFL2;
		
		
		public static void findLetter() throws IOException
		{
			System.out.println("Here are the rules: ");
			System.out.println("Each team is going to get a grid of letters. Your job is to find the 'a'. Type in the location of the 'a' in the column-row form - A1 for example");
			team1FL();
			team2FL();
			winnerFL();
		}
		
		public static void team1FL() throws IOException
		{
			myFile = new Scanner(new File("team1.txt"));
			System.out.println("Team 1, you go first. Press enter to start the timer and find the letter");
			enters1 = stringInput.nextLine();
			
			while(myFile.hasNext())
				{
					System.out.println(myFile.nextLine());
				}
			preFL1 = System.currentTimeMillis();
			
			do
				{
					System.out.println("Where is the 'a' located? (answer in A1 form)");
					ansFL1 = stringInput.nextLine();
				}
			while(!ansFL1.equals("H5") && !ansFL1.equals("h5"));
			
			if(ansFL1.equals("H5") || ansFL1.equals("h5"))
				{
					postFL1 = System.currentTimeMillis();
					System.out.println("Congrats! You found the 'a' in " + ((postFL1 - preFL1) / 1000) + " seconds.");
				}
			

		
		}
		
		public static void team2FL() throws IOException
		{
			System.out.println("Team 2, you go next. Press enter to start the timer and find the letter");
			enters2 = stringInput.nextLine();
			
			myFile2 = new Scanner(new File("team2.txt"));
			
			while(myFile2.hasNext())
				{
					System.out.println(myFile2.nextLine());
				}
			preFL2 = System.currentTimeMillis();
			
			do
				{
					System.out.println("Where is the 'a' located? (answer in A1 form)");
					ansFL2 = stringInput.nextLine();
				}
			while(!ansFL2.equals("D8") && !ansFL2.equals("d8"));
			
			if(ansFL2.equals("D8") || ansFL2.equals("d8"))
				{
					postFL2 = System.currentTimeMillis();
					System.out.println("Congrats! You found the 'a' in " + ((postFL2 - preFL2) / 1000) + " seconds.");
				}
		}
		
		public static void winnerFL() throws IOException
		{
			System.out.println();
			System.out.println("Team 1 finished in " + ((postFL1 - preFL1) / 1000) + " seconds. And team 2 finished in " + ((postFL2 - preFL2) / 1000) + " seconds.");
			
			if(((postFL1 - preFL1) / 1000) < ((postFL2 - preFL2) / 1000))
				{
					System.out.println("Team 1 finished faster, so they win the point!");
					NumberGuessingGame.irelandWins1 += 1;
				}
			else if(((postFL1 - preFL1) / 1000) > ((postFL2 - preFL2) / 1000))
				{
					System.out.println("Team 2 finished faster, so they win the point!");
					NumberGuessingGame.irelandWins2 += 1;
				}
			else
				{
					System.out.println("There was a tie no one wins");
				}
		}
		
		
		
		
		

	}
