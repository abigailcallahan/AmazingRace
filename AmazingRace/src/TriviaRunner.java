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
		static int tie1;
		static int tie2;
		
		static int correct = 0;
		static int correct2 = 0;
		
		static int random;
		static int random2;
		
		
		static double preT1;
		static double preT2;
		static double postT1;
		static double postT2;
		static double finalT1;
		static double finalT2;
		
		
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
										System.out.println("Correct!\n");
										correct2 ++;
										Trivia.triviaList.remove(random);
									}
								else
									{
										System.out.println("Incorrect!\n");
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
										System.out.println("Correct!\n");
										correct2 ++;
										Trivia.triviaList.remove(random);
									}
								else
									{
										System.out.println("Incorrect!\n");
										Trivia.triviaList.remove(random);
									}
							}
						else if(Trivia.triviaList.get(random).getIntCorrect() == 3)
							{
								System.out.println("\t1) " + Trivia.triviaList.get(random).getOption2());
								System.out.println("\t2) " + Trivia.triviaList.get(random).getOption1());
								System.out.println("\t3) " + Trivia.triviaList.get(random).getAnswer());
								
								System.out.println("What is your guess?");
								answer2 = intInput.nextInt();
								
								if(answer2 == 3)
									{
										System.out.println("Correct!\n");
										correct2 ++;
										Trivia.triviaList.remove(random);
									}
								else
									{
										System.out.println("Incorrect!\n");
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
			System.out.println("TEAM 1: Press enter to start the timer ");
			enter3 = stringInput.nextLine();
			
			t1Tie();
			System.out.println("\nTEAM 2: Press enter to start the timer ");
			enter4 = stringInput.nextLine();
			t2Tie();
		
			tieWinner();
			
		}
	
		public static void t1Tie()
		{
			System.out.println("\nWhat is the capital of Montana?");
			System.out.println("\t1) Montana City");
			System.out.println("\t2) Helena");
			System.out.println("\t3) Bozeman");
			
			preT1 = System.currentTimeMillis();
			tie1 = intInput.nextInt();
			
			while(tie1 != 2)
			{
				System.out.println("Try again");
				tie1 = intInput.nextInt();
			}
			if(tie1 == 2)
			{
				postT1 = System.currentTimeMillis();
				System.out.println("You got it!");
			}
			
			finalT1 = (postT1 - preT1) / 1000;
		}
		
		public static void t2Tie()
		{
			System.out.println("\nWhat is the capital of Nebraska");
			System.out.println("\t1) Omaha");
			System.out.println("\t2) Nebraska City");
			System.out.println("\t3) Lincoln");
			
			preT2 = System.currentTimeMillis();
			tie2 = intInput.nextInt();
			
			while(tie2 != 3)
			{
				System.out.println("Try again");
				tie2 = intInput.nextInt();
			}
			if(tie2 == 3)
			{
				postT2 = System.currentTimeMillis();
				System.out.println("You got it!");
			}
			
			finalT2 = (postT2 - preT2) / 1000;
		}
		
		public static void tieWinner()
		{
			if(finalT1 < finalT2)
			{
				System.out.println("\nTeam 1 finished faster with " + finalT1 + " seconds. Team 2 had " + finalT2 + " seconds");
				System.out.println("Team 1 won the second game of Greece!");
				HangmanRunner.greeceWins++;
			}
			else if(finalT1 > finalT2)
			{
				System.out.println("\nTeam 2 finished faster with " + finalT2 + " seconds. Team 1 had " + finalT1 + " seconds");
				System.out.println("Team 2 won the second game of Greece!");
				HangmanRunner.greeceWins2++;
			}
			else
			{
				System.out.println("There was another tie, no one wins");
			}
		}
	}
