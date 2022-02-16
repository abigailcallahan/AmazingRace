import java.util.Scanner;

public class HangmanRunner
	{
		static Scanner stringInput = new Scanner(System.in);
		static String enter;
		
		public static void hangmanRunner()
		{
			System.out.println();
			System.out.println();
			System.out.println("Welcome to Hangman! Team 1 will take one turn, and then Team 2 will go. Whoever guesses the word first wins. I am giving you the same word");
			
			System.out.println("press enter to start!");
			enter = stringInput.nextLine();
			
			play();
			
		}
		
		public static void play()
		{
			//display
			//go t1 turn, t2, etc
		}
	}
