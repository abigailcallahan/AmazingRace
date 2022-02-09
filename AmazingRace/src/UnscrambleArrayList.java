import java.util.ArrayList;

public class UnscrambleArrayList
	{
		static ArrayList <Word> unscrambleWords = new ArrayList<Word>();
		
		public static void fillUnscrambleWords()
		{
			//4 letters
			unscrambleWords.add(new Word("frog", "ofgr"));
			unscrambleWords.add(new Word("snow", "wons"));
			unscrambleWords.add(new Word("star", "tars"));
			unscrambleWords.add(new Word("book", "okob"));
			
			//5 letters
			unscrambleWords.add(new Word("grass", "srsga"));
			unscrambleWords.add(new Word("bloom", "omlob"));
			unscrambleWords.add(new Word("green", "ergen"));
			unscrambleWords.add(new Word("frog", "ofgr"));
			
			//6letters
			unscrambleWords.add(new Word("flower", "orelwf"));
			unscrambleWords.add(new Word("cotton", "ntotco"));
			unscrambleWords.add(new Word("people", "plpeeo"));
			unscrambleWords.add(new Word("travel", "lvatre"));
			
			
		}
	}
