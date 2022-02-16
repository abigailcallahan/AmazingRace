import java.util.ArrayList;

public class Hangman
	{
		static ArrayList<Hangman> hangmanList = new ArrayList<Hangman>();
		
		private String word;
		
		public Hangman(String w)
		{
			word = w;
		}

		public String getWord()
			{
				return word;
			}

		public void setWord(String word)
			{
				this.word = word;
			}
		
		public static void fillHangman()
		{
			hangmanList.add(new Hangman("blizzard"));
			hangmanList.add(new Hangman("strength"));
			hangmanList.add(new Hangman("accurate"));
			hangmanList.add(new Hangman("breaking"));
			hangmanList.add(new Hangman("criminal"));
			hangmanList.add(new Hangman("material"));
		}
		
	}
