import java.util.Scanner;
import java.util.Date;

public class Unscramble
	{
		static Scanner stringInput = new Scanner(System.in);
		static Scanner intInput = new Scanner(System.in);
		static String enterT;
		static String enterT2;
		
		static boolean isNotEqual1 = true;
		static boolean isNotEqual2 = true;
		
		static double preTime1;
		static double afterTime1;
		static double finalTime1;
		
		static double preTime2;
		static double afterTime2;
		static double finalTime2;
		
		
		static String plainWordAns1;
		static String plainWordAns2;
		
		public static void unscramble()
		{
			
			System.out.println("since the two teams tied for the last two games, we play unscramble! Here is how it works: ");
			System.out.println("\tI am going to give team 1 a word to unscramble. Then I am going to give team 2 a word with the same number of letters to unscramble.");
			System.out.println("\tWhoever finishes their word first wins!");
			
			System.out.println();
			System.out.println("Team 1, you go first. Press enter to start the timer and unscramble your word. Use all lowercase letters when typing in your word.");
			enterT = stringInput.nextLine();
			
			team1TieGame();
			
			System.out.println("Team 2, you go next. Press enter to start the timer and unscramble your word. Use all lowercase letters when typing in your word.");
			enterT2 = stringInput.nextLine();
			team2TieGame();
			
			
			getWinner();
		}
		
		public static void team1TieGame()
		{
			preTime1 = System.currentTimeMillis();
			System.out.println("Your word is: " + UnscrambleArrayList.unscrambleWords.get(0).getMixedWord());
		
			do {
				plainWordAns1 = stringInput.nextLine();
				if(plainWordAns1.equals(UnscrambleArrayList.unscrambleWords.get(0).getPlainWord()))
					{
						//stop timer
						afterTime1 = System.currentTimeMillis();
						finalTime1 = (afterTime1 - preTime1) / 1000;
						
						System.out.println("That is correct! The time was: " + finalTime1);
						isNotEqual1 = false;
					}
				else
					{
						System.out.println("Incorrect, try again");
					}
			}
			while(isNotEqual1 == true);
			
			UnscrambleArrayList.unscrambleWords.remove(0);
		}
		
		
		public static void team2TieGame()
			{
				preTime2 = System.currentTimeMillis();
				System.out.println("Your word is: " + UnscrambleArrayList.unscrambleWords.get(0).getMixedWord());
			
				do {
					plainWordAns2 = stringInput.nextLine();
					if(plainWordAns2.equals(UnscrambleArrayList.unscrambleWords.get(0).getPlainWord()))
						{
							//stop timer
							afterTime2 = System.currentTimeMillis();
							finalTime2 = (afterTime2 - preTime2) / 1000;
							
							System.out.println("That is correct! The time was: " + finalTime2);
							isNotEqual2 = false;
						}
					else
						{
							System.out.println("Incorrect, try again");
						}
				}
				while(isNotEqual2 == true);
				
				UnscrambleArrayList.unscrambleWords.remove(0);
			}
		
		public static void getWinner()
		{
			if(finalTime1 < finalTime2)
				{
					System.out.println("Team 1 finished their word faster, so they win the country!");
					AmazingRaceRunner.team1.setCountryWins(AmazingRaceRunner.team1.getCountryWins() + 1);
					
				}
			else if(finalTime1 > finalTime2)
				{
					System.out.println("Team 2 finished their word faster, so they win the country");
					AmazingRaceRunner.team2.setCountryWins(AmazingRaceRunner.team2.getCountryWins() + 1);
				}
			else
				{
					System.out.println("You both tied so we will do this again!");
					unscramble();
				}
		}
		
	}
