import java.util.ArrayList;

public class Trivia
	{
		
		private String question;
		private String option1;
		private String option2;
		private String answer;
		private int intCorrect;
		
		static ArrayList <Trivia> triviaList = new ArrayList<Trivia>();
		
		public Trivia(String q, String o1, String o2, String a, int ic)
		{
			question = q;
			option1 = o1;
			option2 = o2;
			answer = a;
			intCorrect = ic;
		}

		public String getQuestion()
			{
				return question;
			}

		public void setQuestion(String question)
			{
				this.question = question;
			}

		public String getAnswer()
			{
				return answer;
			}

		public String getOption1()
			{
				return option1;
			}

		public void setOption1(String option1)
			{
				this.option1 = option1;
			}

		public String getOption2()
			{
				return option2;
			}

		public void setOption2(String option2)
			{
				this.option2 = option2;
			}

		public void setAnswer(String answer)
			{
				this.answer = answer;
			}
		
		public static void fillList()
		{
			triviaList.add(new Trivia ("How long is an Olympic swimming pool (in meters)?", "100 meters", "60 meters", "50 meters", 1));
			triviaList.add(new Trivia ("Which country consumes the most chocolate per capita??", "Germany", "Sweden", "Switzerland", 3));
			triviaList.add(new Trivia ("Which bone are babies born without?", "Elbow", "Collarbone", "Knee cap", 1 ));
			triviaList.add(new Trivia ("Which American state is the largest (by area)?", "Texas", "California", "Alaska", 2 ));
			triviaList.add(new Trivia ("How many hearts does an octopus have?", "2", "4", "3", 2 ));
			triviaList.add(new Trivia ("How many national parks are in the United States?", "43", "50", "58", 3));
			triviaList.add(new Trivia ("How many total time zones are there in the world?", "32", "18", "24", 2 ));
			triviaList.add(new Trivia ("What year was the very first model of the iPhone released?", "2011", "2005", "2007", 1));
			
		}

		public int getIntCorrect()
			{
				return intCorrect;
			}

		public void setIntCorrect(int intCorrect)
			{
				this.intCorrect = intCorrect;
			}
	}
