import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class TravelRunner
	{
		static Scanner stringInput = new Scanner(System.in);
		static Scanner intInput = new Scanner(System.in);
		
		static String enter;
		static String enter2;
		static String enterStats;
		static String enterTie;
		static String enterCon;
		
		public static void travel() throws IOException
		{
			LocationArrayList.fillList();
			
			System.out.println("You landed in: " + LocationArrayList.countries.get(0).getCountry());
			System.out.println("The first game that both teams will play is: " + LocationArrayList.countries.get(0).getGame1());
			
			//IRELAND
			
			//which is number guessing game 
			NumberGuessingGame.playNGG();
			System.out.println("So far, in Ireland, team 1 wins is: " + NumberGuessingGame.irelandWins1 + " and team 2 wins is: " + NumberGuessingGame.irelandWins2);
			System.out.println("Press enter to play our second game");
			enter = stringInput.nextLine();
			System.out.println("Our next game in " + LocationArrayList.countries.get(0).getCountry() + " is " + LocationArrayList.countries.get(0).getGame2());
			System.out.println();
			System.out.println();
			//guess the letter
			FindLetter.findLetter();
			//checks if tie
			tieGame();
			//continue
			statsAndContinue();
			LocationArrayList.countries.remove(0);
			
			//GREECE
			
			System.out.println("You landed in: " + LocationArrayList.countries.get(0).getCountry());
			System.out.println("The first game that both teams will play is: " + LocationArrayList.countries.get(0).getGame1());
			//hangman
			//HangmanRunner.hangmanRunner();
			//System.out.println("So far, in " + LocationArrayList.countries.get(0).getCountry() + " team 1 wins is: " + NumberGuessingGame.irelandWins1 + " and team 2 wins is: " + NumberGuessingGame.irelandWins2);
			System.out.println("Press enter to play our second game");
			enter2 = stringInput.nextLine();
			System.out.println("Our next game in " + LocationArrayList.countries.get(0).getCountry() + " is " + LocationArrayList.countries.get(0).getGame2());
			TriviaRunner.triviaRunner();
			
			
		}
		
		
		public static void tieGame()
			{
				System.out.println("Press enter to finish this country and see stats");
				enterStats = stringInput.nextLine();
				
				System.out.println();
				System.out.println("Team 1 wins in " + LocationArrayList.countries.get(0).getCountry() + ": " +NumberGuessingGame.irelandWins1);
				System.out.println("Team 2 wins in " + LocationArrayList.countries.get(0).getCountry() + ": " +NumberGuessingGame.irelandWins2);
				
				if(NumberGuessingGame.irelandWins1 > NumberGuessingGame.irelandWins2)
					{
						System.out.println("Team 1 won " + LocationArrayList.countries.get(0).getCountry() + "!");
						AmazingRaceRunner.team1.setCountryWins(AmazingRaceRunner.team1.getCountryWins() + 1);
					}
				else if(NumberGuessingGame.irelandWins1 < NumberGuessingGame.irelandWins2)
					{
						System.out.println("Team 2 won " + LocationArrayList.countries.get(0).getCountry() + "!");
						AmazingRaceRunner.team2.setCountryWins(AmazingRaceRunner.team2.getCountryWins() + 1);
					}
				else
					{
						System.out.println("There was a tie between the two games so we move on to the tie game!");
						Unscramble.unscramble();
					}
			}
		
		public static void statsAndContinue()
			{
				System.out.println();
				System.out.println();
				System.out.println("Before we move into the next country let's recap");
				System.out.println("\tTeam 1 country wins: " + AmazingRaceRunner.team1.getCountryWins());
				System.out.println("\tTeam 2 country wins: " + AmazingRaceRunner.team2.getCountryWins());
				
				System.out.println("Press enter to travel to our next country in the race");
				enterCon = stringInput.nextLine();
				
			}
		
		
		

	}
