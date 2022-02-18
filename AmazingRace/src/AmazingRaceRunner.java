import java.util.ArrayList;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class AmazingRaceRunner
	{

		static Scanner stringInput = new Scanner(System.in);
		static Scanner intInput = new Scanner(System.in);
		static int ruleDecision;
		static Team team1;
		static String team1name;
		
		static Team team2;
		static String team2name;
		static String enterToStart;
		static String enterToTravel;
		
		
		//NEED TO DECIDE ON TIE GAME IN FIND LETTER 
		//PLAY AGAIN
		//OR
		//PLAY THE UNSCRAMBLE BUT HAVE TO FIX THE POINTS/COUNTRY ETC
		
		
		
		public static void main(String[] args) throws IOException
			{
				UnscrambleArrayList.fillUnscrambleWords();
				Trivia.fillList();
				
				//intro();
				//getTeams();
				//TravelRunner.travel();
			
				//TEST
				TriviaRunner.triviaRunner();
			//DONT ADD ANYTHING ELSE HERE BECAUSE ITS ALL IN TRAVEL RUNNER CLASS
				
				
			}
		
		public static void intro()
		{
			System.out.println("Hello and welcome to: THE AMAZING RACE!");
			//option to see the rules
			System.out.println("would you like to 1) see the rules or 2) start the game right away?");
			ruleDecision = intInput.nextInt();
			if(ruleDecision == 1)
				{
					rules();
					System.out.println();
					System.out.println("Press enter to get started...");
					enterToStart = stringInput.nextLine();
				}
			else
				{
					System.out.println("okay let's get started.....");
					System.out.println();
				}
		}
		
		public static void rules()
		{
			System.out.println("So here is how it works: ");
			System.out.println("There is two teams, and 5 different countries. ");
			System.out.println("In each country, each team will compete two challenges.");
			System.out.println("If one team wins both challenges, they win that country. BUT if there is a tie between the two games, there will be a tie breaking game. Winner of the tie breaker wins the country");
			System.out.println("The team who wins the majority of the 3 countries wins the race.");
		}
		
		public static void getTeams()
		{
			System.out.println("Team 1, what is your name?");
			team1name = stringInput.nextLine();
			team1 = new Team(team1name, 0);
			
			
			System.out.println("Team 2, what is your name?");
			team2name = stringInput.nextLine();
			team2 = new Team(team2name, 0);
			
			
			System.out.println("Welcome team " + team1name + " and team " + team2name + "!");
			System.out.println("Press enter to travel to your first country");
			enterToTravel = stringInput.nextLine();
		}
	}
