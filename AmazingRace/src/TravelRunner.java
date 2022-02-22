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
		static String enterStats2;
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
			tieGame1();
			//continue
			statsAndContinue();
			LocationArrayList.countries.remove(0);
			
			//GREECE
			
			System.out.println("You landed in: " + LocationArrayList.countries.get(0).getCountry());
			System.out.println("The first game that both teams will play is: " + LocationArrayList.countries.get(0).getGame1());
			//hangman
			HangmanRunner.hangmanRunner();
			System.out.println("So far, in " + LocationArrayList.countries.get(0).getCountry() + " team 1 wins is: " + HangmanRunner.greeceWins + " and team 2 wins is: " + HangmanRunner.greeceWins2);
			System.out.println("Press enter to play our second game");
			enter2 = stringInput.nextLine();
			System.out.println("Our next game in " + LocationArrayList.countries.get(0).getCountry() + " is " + LocationArrayList.countries.get(0).getGame2());
			TriviaRunner.triviaRunner();
			System.out.println("Ok, you are done with your second country in this race, congrats!");
			tieGame2();
			statsAndContinue();
			LocationArrayList.countries.remove(0);
			
			finalWinner();
		}
		
		
		public static void tieGame1()
			{
				System.out.println("\n\nPress enter to finish this country and see stats");
				enterStats = stringInput.nextLine();
				
				System.out.println();
				System.out.println("Team 1 wins in " + LocationArrayList.countries.get(0).getCountry() + ": " +NumberGuessingGame.irelandWins1);
				System.out.println("Team 2 wins in " + LocationArrayList.countries.get(0).getCountry() + ": " +NumberGuessingGame.irelandWins2);
				
				if(NumberGuessingGame.irelandWins1 > NumberGuessingGame.irelandWins2 || HangmanRunner.greeceWins > HangmanRunner.greeceWins2)
					{
						System.out.println("Team 1 won " + LocationArrayList.countries.get(0).getCountry() + "!");
						AmazingRaceRunner.team1.setCountryWins(AmazingRaceRunner.team1.getCountryWins() + 1);
					}
				else if(NumberGuessingGame.irelandWins1 < NumberGuessingGame.irelandWins2 || HangmanRunner.greeceWins < HangmanRunner.greeceWins2)
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
		
		
		public static void tieGame2()
		{
			System.out.println("\n\nPress enter to finish this country and see stats");
			enterStats2 = stringInput.nextLine();
			
			System.out.println();
			System.out.println("Team 1 wins in " + LocationArrayList.countries.get(0).getCountry() + ": " +HangmanRunner.greeceWins);
			System.out.println("Team 2 wins in " + LocationArrayList.countries.get(0).getCountry() + ": " +HangmanRunner.greeceWins2);
			
			if(HangmanRunner.greeceWins > HangmanRunner.greeceWins2)
				{
					System.out.println("Team 1 won " + LocationArrayList.countries.get(0).getCountry() + "!");
					AmazingRaceRunner.team1.setCountryWins(AmazingRaceRunner.team1.getCountryWins() + 1);
				}
			else if(HangmanRunner.greeceWins < HangmanRunner.greeceWins2)
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
				System.out.println("Before we continue the race let's recap");
				System.out.println("\tTeam 1 country wins: " + AmazingRaceRunner.team1.getCountryWins());
				System.out.println("\tTeam 2 country wins: " + AmazingRaceRunner.team2.getCountryWins());
				
				System.out.println("Press enter to continue");
				enterCon = stringInput.nextLine();
				
			}
		
		public static void finalWinner()
		{
			System.out.println("Congrats! You are almost done with the race. You traveled to your two countries and now we just look at stats");
			System.out.println("\nTeam 1, your wins in Ireland were: " + NumberGuessingGame.irelandWins1 + " and your wins in Greece were: " + HangmanRunner.greeceWins );
			System.out.println("\tTeam 1 country wins: " + AmazingRaceRunner.team1.getCountryWins());
			
			System.out.println("\nTeam 2, your wins in Ireland were: " + NumberGuessingGame.irelandWins2 + " and your wins in Greece were: " + HangmanRunner.greeceWins2 );
			System.out.println("\tTeam 2 country wins: " + AmazingRaceRunner.team2.getCountryWins());
			
			if(AmazingRaceRunner.team1.getCountryWins() > AmazingRaceRunner.team2.getCountryWins())
			{
				System.out.println("\nTEAM 1 WON THE RACE");
			}
			else if(AmazingRaceRunner.team1.getCountryWins() < AmazingRaceRunner.team2.getCountryWins())
			{
				System.out.println("\nTEAM 2 WON THE RACE");
			}
			else
			{
				System.out.println("\n There was a tie in country wins, so we move to a final game of unscramble");
				Unscramble.unscramble();
				
				if(Unscramble.finalTime1 < Unscramble.finalTime2)
				{
					System.out.println("TEAM 1 WINS THE RACE");
					
				}
				else if(Unscramble.finalTime1 > Unscramble.finalTime2)
				{
					System.out.println("TEAM 2 WINS THE RACE");
				}
				else
				{
					System.out.println("You both tied AGAIN so there is no winner, a tie!");
				}
				
			}
		}
	}
