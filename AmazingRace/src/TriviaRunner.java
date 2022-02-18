import java.util.ArrayList;

import java.util.Scanner;


public class TriviaRunner
	{
		
		static Scanner stringInput = new Scanner(System.in);
		static Scanner intInput = new Scanner(System.in);
		
		static String enter;
		static String enter2;
		static String enter3;
		static String enter4;
		
		static int answer1;
		static int answer2;
		
		static int correct = 0;
		static int correct2 = 0;
		
		static int random;
		static int random2;
		
		public static void triviaRunner()
		{
			System.out.println("\n\nThis is how it works: each team will get 4 questions. The team who answers the most wins. If a tie occurs, then there is a final question");
			System.out.println("Team 1, you go first");
			team1();
			System.out.println("Ok team 2, your turn");
			team2();
			
			winner();
		}
		
		
		public static void team1()
		{
			System.out.println("Press enter to get your first question");
			enter = stringInput.nextLine();
			
			for(int i = 0; i < 4; i++)
				{
					random = (int) (Math.random() * Trivia.triviaList.size());
					System.out.println(Trivia.triviaList.get(random).getQuestion());
					
					if(Trivia.triviaList.get(random).getIntCorrect() == 1)
						{
							System.out.println("\t1) " + Trivia.triviaList.get(random).getAnswer());
							System.out.println("\t2) " + Trivia.triviaList.get(random).getOption2());
							System.out.println("\t3) " + Trivia.triviaList.get(random).getOption1());
							
							System.out.println("What is your guess?");
							answer1 = intInput.nextInt();
							
							if(answer1 == 1)
								{
									System.out.println("Correct!");
									correct ++;
									Trivia.triviaList.remove(random);
								}
							else
								{
									System.out.println("Incorrect!");
									Trivia.triviaList.remove(random);
								}
						}
					else if(Trivia.triviaList.get(random).getIntCorrect() == 2)
						{
							System.out.println("\t1) " + Trivia.triviaList.get(random).getOption2());
							System.out.println("\t2) " + Trivia.triviaList.get(random).getAnswer());
							System.out.println("\t3) " + Trivia.triviaList.get(random).getOption1());
							
							System.out.println("What is your guess?");
							answer1 = intInput.nextInt();
							
							if(answer1 == 2)
								{
									System.out.println("Correct!");
									correct ++;
									Trivia.triviaList.remove(random);
								}
							else
								{
									System.out.println("Incorrect!");
									Trivia.triviaList.remove(random);
								}
						}
					else
						{
							System.out.println("\t1) " + Trivia.triviaList.get(random).getOption2());
							System.out.println("\t2) " + Trivia.triviaList.get(random).getOption1());
							System.out.println("\t3) " + Trivia.triviaList.get(random).getAnswer());
							
							System.out.println("What is your guess?");
							answer1 = intInput.nextInt();
							
							if(answer1 == 3)
								{
									System.out.println("Correct!");
									correct ++;
									Trivia.triviaList.remove(random);
								}
							else
								{
									System.out.println("Incorrect!");
									Trivia.triviaList.remove(random);
								}
						}
					
				}
			
			System.out.println("Ok, team 1 your number of correct guesses is: " + correct);
		}
		
		public static void team2()
			{
				System.out.println("Press enter to get your first question");
				enter2 = stringInput.nextLine();
				
				for(int i = 0; i < 4; i++)
					{
						random = (int) (Math.random() * Trivia.triviaList.size());
						System.out.println(Trivia.triviaList.get(random).getQuestion());
						
						if(Trivia.triviaList.get(random).getIntCorrect() == 1)
							{
								System.out.println("\t1) " + Trivia.triviaList.get(random).getAnswer());
								System.out.println("\t2) " + Trivia.triviaList.get(random).getOption2());
								System.out.println("\t3) " + Trivia.triviaList.get(random).getOption1());
								
								System.out.println("What is your guess?");
								answer2 = intInput.nextInt();
								
								if(answer2 == 1)
									{
										System.out.println("Correct!");
										correct2 ++;
										Trivia.triviaList.remove(random);
									}
								else
									{
										System.out.println("Incorrect!");
										Trivia.triviaList.remove(random);
									}
							}
						else if(Trivia.triviaList.get(random).getIntCorrect() == 2)
							{
								System.out.println("\t1) " + Trivia.triviaList.get(random).getOption2());
								System.out.println("\t2) " + Trivia.triviaList.get(random).getAnswer());
								System.out.println("\t3) " + Trivia.triviaList.get(random).getOption1());
								
								System.out.println("What is your guess?");
								answer2 = intInput.nextInt();
								
								if(answer2 == 2)
									{
										System.out.println("Correct!");
										correct2 ++;
										Trivia.triviaList.remove(random);
									}
								else
									{
										System.out.println("Incorrect!");
										Trivia.triviaList.remove(random);
									}
							}
						else
							{
								System.out.println("\t1) " + Trivia.triviaList.get(random).getOption2());
								System.out.println("\t2) " + Trivia.triviaList.get(random).getOption1());
								System.out.println("\t3) " + Trivia.triviaList.get(random).getAnswer());
								
								System.out.println("What is your guess?");
								answer2 = intInput.nextInt();
								
								if(answer1 == 3)
									{
										System.out.println("Correct!");
										correct2 ++;
										Trivia.triviaList.remove(random);
									}
								else
									{
										System.out.println("Incorrect!");
										Trivia.triviaList.remove(random);
									}
							}
			}
			}
	
		public static void winner()
		{
			System.out.println("\n\nOkay, the game is over. Let's look at stats. ");
			System.out.println("Team 1 correct answers " + correct);
			System.out.println("Team 2 correct answers " + correct2);
			
			if(correct > correct2)
				{
					System.out.println("Team 1, you win!");
					HangmanRunner.greeceWins++;
				}
			else if(correct < correct2)
				{
					System.out.println("Team 2, you win!");
					HangmanRunner.greeceWins2++;
				}
			else
				{
					System.out.println("Both teams tied in number of correct answers. There is one final question each to break the tie");
					tieTrivia();
				}
		}
		
		public static void tieTrivia()
		{
			System.out.println("\nI am going to give a final question each. Team 1 will go first. The timer starts the answer the question. Team 2 goes next. Whoever finishes their question first wins");
			System.out.println("TEAM 1: Press enter to start ");
			enter3 = stringInput.nextLine();
		}
	
	
	}
