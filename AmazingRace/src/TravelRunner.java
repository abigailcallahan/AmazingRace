import java.util.Scanner;

public class TravelRunner
	{
		static Scanner sInput = new Scanner(System.in);
		static String enter;
		
		public static void travel()
		{
			LocationArrayList.fillList();
			
			System.out.println("You landed in: " + LocationArrayList.countries.get(0).getCountry());
			System.out.println("The first game that both teams will play is: " + LocationArrayList.countries.get(0).getGame1());
			
			//IRELAND
			//which is number guessing game 
			NumberGuessingGame.playNGG();
			System.out.println("So far, in Ireland, team 1 wins is: " + NumberGuessingGame.irelandWins1 + " and team 2 wins is: " + NumberGuessingGame.irelandWins2);
			System.out.println("Press enter to play our next game");
			enter = sInput.nextLine();
			System.out.println("Our next game in " + LocationArrayList.countries.get(0).getCountry() + " is " + LocationArrayList.countries.get(0).getGame2());
			System.out.println();
			//guess the letter
			FindLetter.findLetter();
			
			
			
			
			
			
			//REMOVE COUNTRY FROM ARRAYLIST
		}
		
		
		

	}
