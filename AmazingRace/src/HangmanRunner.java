import java.util.Scanner;

public class HangmanRunner
	{
		static Scanner stringInput = new Scanner(System.in);
		static String enter;
		static String word;
		static String guess;
		static String lettersGuessed = " ";
		
		
		static String[] wordArray = new String[8];
		
		public static void hangmanRunner()
		{
			Hangman.fillHangman();
			fillArray();
			
			System.out.println();
			System.out.println();
			System.out.println("Welcome to Hangman! Team 1 will take one turn, and then Team 2 will go. Whoever guesses the word first wins. I am giving you both the same word");
			
			System.out.println("press enter to start!");
			enter = stringInput.nextLine();
			
			do
				{
					play();
					t1Guess();
					check();
					lettersGuessed += guess;
					play();
					t2Guess();
					check();
					lettersGuessed += guess;
				}
			while(!wordArray[0].equals(word.substring(0,1)) && !wordArray[1].equals(word.substring(1,2)) && !wordArray[2].equals(word.substring(2,3)) && !wordArray[3].equals(word.substring(3,4)) && 
					!wordArray[4].equals(word.substring(4,5)) && !wordArray[5].equals(word.substring(5,6)) && !wordArray[6].equals(word.substring(6,7)) && !wordArray[7].equals(word.substring(7)));
			
			
			//System.out.println("The word was guessed!");
			
			//hangmanWinner();
			
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
		
		public static void play()
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
		
		public static void check()
		{
			word = Hangman.hangmanList.get(0).getWord();
			
			for(int i = 0; i < word.length();i++)
				{
					if(guess.equals(word.substring(i, i+1)))
						{
							System.out.println("You got it!");
							wordArray[i] = guess + " ";
						}
				}
		}
		
		public static void t2Guess()
		{
			System.out.println();
			System.out.println("Team 2, your turn, what is the first letter guess?");
			guess = stringInput.nextLine();
		}
		
		public static void hangmanWinner()
		{
			
		}
		
		
		
		
		
	}
