import java.util.Scanner;

public class HangmanRunner
	{
		static Scanner stringInput = new Scanner(System.in);
		static String enter;
		static String enter2;
		
		static String word;
		
		static String guess;
		static String guess2;
		
		static String lettersGuessed = " ";
		
		static boolean notGuessed = true;
		
		static int greeceWins = 0;
		static int greeceWins2 = 0;
		
		static int counter;
		
		static boolean team1GuessedIt = false;
		static boolean team2GuessedIt = false;
		
		static String[] wordArray = new String[8];
		
		public static void hangmanRunner()
		{
			Hangman.fillHangman();
			fillArray();
			System.out.println();
			System.out.println();
			System.out.println("Welcome to Hangman! Team 1 will guess their word, and then Team 2 will go. Whoever guesses the word first wins.");
			
			System.out.println("press enter to start!");
			enter = stringInput.nextLine();
			
			word = Hangman.hangmanList.get(0).getWord();
			
			while(notGuessed == true)
				{
					display();
					t1Guess();
					check1();
					lettersGuessed += guess;
					counter = 0;
					for(int i  = 0; i < wordArray.length; i++)
						{
							if(wordArray[i].equals(word.substring(i, i+1)))
								{
									counter++;
								}
						}
					if(counter == 8)
						{
							System.out.println();
							for(int i = 0; i < wordArray.length; i++)
								{
								System.out.print(wordArray[i]);
								 }
							notGuessed = false;
							team1GuessedIt = true;
						}
						if(notGuessed == true)
						{
							display();
							t2Guess();
							check2();
							lettersGuessed += guess2;
							counter = 0;
							for(int i  = 0; i < wordArray.length; i++)
								{
									if(wordArray[i].equals(word.substring(i, i+1)))
										{
											counter++;
										}
								}
							if(counter == 8)
								{
									System.out.println();
									for(int i = 0; i < wordArray.length; i++)
										{
										System.out.print(wordArray[i]);
										}
									notGuessed = false;
									team2GuessedIt = true;
								}
						}
					
				}
			
			System.out.println("\n\nThe word was guessed!");
			
			hangmanWinner();
			
		}
		
		public static void fillArray()
		{
			wordArray[0] = "_ ";
			wordArray[1] = "_ ";
			wordArray[2] = "_ ";
			wordArray[3] = "_ ";
			wordArray[4] = "_ ";
			wordArray[5] = "_ ";
			wordArray[6] = "_ ";
			wordArray[7] = "_ ";
		}
		
		public static void display()
		{
			//display
			System.out.println();
			for(int i = 0; i < wordArray.length; i++)
				{
					System.out.print(wordArray[i]);
				}
			System.out.println("\n\nletters already guessed: " + lettersGuessed);
		}
		
		public static void t1Guess()
		{
			System.out.println();
			System.out.println("Team 1, your turn, what is the first letter guess?");
			guess = stringInput.nextLine();
		}
		
		public static void check1()
		{
			for(int i = 0; i < word.length();i++)
				{
					if(guess.equals(word.substring(i, i+1)))
						{
							System.out.println("You got it!");
							wordArray[i] = guess;
						}
				}
		}
		
		public static void check2()
		{
			for(int i = 0; i < word.length();i++)
			{
				if(guess2.equals(word.substring(i, i+1)))
					{
						System.out.println("You got it!");
						wordArray[i] = guess2;
					}
			}
		}
		
		public static void t2Guess()
		{
			System.out.println();
			System.out.println("Team 2, your turn, what is the first letter guess?");
			guess2 = stringInput.nextLine();
		}
		
		public static void hangmanWinner()
		{
			System.out.println();
			System.out.println();
			
			if(team1GuessedIt == true)
			{
				System.out.println("Team 1 had the final winning guess so they win");
				greeceWins++;
			}
			else if(team2GuessedIt == true)
			{
				System.out.println("Team 2 had the final winning guess so they win");
				greeceWins2++;
			}
			else
			{
				System.out.println("It was a tie, no one wins");
			}
		}	
	}
