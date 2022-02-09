
public class Word
	{
		private String plainWord;
		private String mixedWord;
		
		public Word(String p, String m)
		{
			plainWord = p;
			mixedWord = m;
		}

		public String getPlainWord()
			{
				return plainWord;
			}

		public void setPlainWord(String plainWord)
			{
				this.plainWord = plainWord;
			}

		public String getMixedWord()
			{
				return mixedWord;
			}

		public void setMixedWord(String mixedWord)
			{
				this.mixedWord = mixedWord;
			}
	}
