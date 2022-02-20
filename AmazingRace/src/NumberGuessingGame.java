import java.util.Scanner;

public class NumberGuessingGame
	{
		
		static Scanner stringInput = new Scanner(System.in);
		static Scanner intInput = new Scanner(System.in);
		
		static String enter1;
		static String enter2;
		static String enter;
		
		static int guess1;
		static int guess2;
		
		static int counter1 = 0;
		static int counter2 = 0;
		
		static int irelandWins1;
		static int irelandWins2;
		
		public static void playNGG()
		{
			System.out.println("Whoever guesses the number (1-10) in the least amount of tries wins the game. If there is a tie, we play again.");
			
			team1();
			team2();
			winnerNGG();
		}
		
		public static void team1()
			{
				System.out.println("Team 1, you go first. The number is between 1 and 10, and you want to guess in the least amount of tries. Press enter to start.");
				enter1 = stringInput.nextLine();
				int secretNumber = (int) (Math.random() * 10) + 1;
				
				do
					{
						
						System.out.println("Guess the number: ");
						guess1 = intInput.nextInt();
						counter1++;
					}
				while(guess1 != secretNumber);
				
				if(guess1 == secretNumber)
					{
						System.out.println("You guessed in " + counter1 + " tries!");
					}
				
				
				
			}
			
			public static void team2()
			{
				System.out.println("Team 2, you go next. The number is between 1 and 10, and you want to guess in the least amount of tries. Press enter to start.");
				enter2 = stringInput.nextLine();
				int secretNumber2 = (int) (Math.random() * 10) + 1;
				
				do
					{
						System.out.println("Guess the number: ");
						guess2 = intInput.nextInt();
						counter2++;
					}
				while(guess2 != secretNumber2);
				
				if(guess2 == secretNumber2)
					{
						System.out.println("You guessed in " + counter2 + " tries!");
					}
			}
			
			
			public static void winnerNGG()
			{
				if(counter1 < counter2)
					{
						System.out.println("Team 1 guessed their word in the least number of tries so they win this game.");
						irelandWins1 = 1;
						irelandWins2 = 0;
					}
				else if(counter1 > counter2)
					{
						System.out.println("Team 2 guessed their word in the least number of tries so they win this game.");
						irelandWins1 = 0;
						irelandWins2 = 1;
					}
				else
					{
						System.out.println("There was a tie we play again. Press enter to break the tie");
						enter = stringInput.nextLine();
						playNGG();
					}
			}
			
			
			
			
	}
