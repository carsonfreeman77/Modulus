
import java.util.*;


public class quizzer
{

	public static void main(String[] args) 
	{
		System.out.println("Welcome to the math quiz of a century!");
		Scanner howMany = new Scanner(System.in);
		System.out.println("How many questions would you like? (Up to 10 available questiosns)");
		int numberOfQ = howMany.nextInt();
		int correct = 0;
		for (int i = 1; i < numberOfQ + 1; i++)
		{
			
				
				
					switch(i)
					{
					case 1:
					{
						Scanner ans1 = new Scanner(System.in);
						
						System.out.println("What is the square root of 64?");
						int answer1 = ans1.nextInt();
						
						if (answer1 == 8 )
						{
							correct++;
						}
						else
						{
							
						}
						break;
					}
					case 2:
					{
						Scanner ans2 = new Scanner(System.in);
						
						System.out.println("If you have 5 candy bars and you give 1.5 candy bars to Jack, and 2 candy bars to Jamal, how many candy bars do you have left?");
						int answer2 = ans2.nextInt();
						
						if (answer2 == 1.5 )
						{
							correct++;
						}
						else
						{
							
						}
						break;
					}
					case 3:
					{
						Scanner ans3 = new Scanner(System.in);
						
						System.out.println("What is a - times a -?");
						String answer3 = ans3.nextLine();
						
						
						if (answer3.equals("+") )
						{
							correct++;
						}
						else
						{
							
						}
						break;
					}
					case 4:
					{
						Scanner ans4 = new Scanner(System.in);
						
						System.out.println("How many roatations is 1080?");
						int answer4 = ans4.nextInt();
						
						if (answer4 == 3 )
						{
							correct++;
						}
						else
						{
							
						}
						break;
					}
					case 5:
					{
						Scanner ans5 = new Scanner(System.in);
						
						System.out.println("What is the square root of 144?");
						int answer5 = ans5.nextInt();
						
						if (answer5 == 12 )
						{
							correct++;
						}
						else
						{
							
						}
						break;
					}
					case 6:
					{
						Scanner ans6 = new Scanner(System.in);
						
						System.out.println("If you multiply a number by zero what is the outcome?");
						int answer6 = ans6.nextInt();
						int c = 5%5;
						if (answer6 == c )
						{
							correct++;
						}
						else
						{
							
						}
						break;
					}
					case 7:
					{
						Scanner ans7 = new Scanner(System.in);
						
						System.out.println("What is half of 15?");
						int answer7 = ans7.nextInt();
						
						if (answer7 == 7.5 )
						{
							correct++;
						}
						else
						{
							
						}
						break;
					}
					case 8:
					{
						Scanner ans8 = new Scanner(System.in);
						
					System.out.println("You buy 4 slices of pizza, 12 napkins, and 2 bags of chips. If a slice of pizza costs 1.25, a dozen napkins costs 3.50, and a bag of chips costs 3.00, how much did you spend? (Answer without $ symbol)");
						int answer8 = ans8.nextInt();
						
						if (answer8 == 14.50 )
						{
							correct++;
						}
						else
						{
							
						}
						break;
					}
					case 9:
					{
						Scanner ans9 = new Scanner(System.in);
						
						System.out.println("If a dozen is 12, how many is 5 dozen, half a dozen, and quarter of a dozen?");
						int answer9 = ans9.nextInt();
						
						if (answer9 == 69 )
						{
							correct++;
						}
						else
						{
							
						}
						break;
					}
					case 10:
					{
						Scanner ans10 = new Scanner(System.in);
						
						System.out.println("What is 60 percent of 10?");
						int answer10 = ans10.nextInt();
						int remainder6 = 26%10;
						if (answer10 == remainder6 )
						{
							correct++;
						}
						else
						{
							
						}
						break;
					}
				}
			}
				
					
				
			
				
					
				
			
		System.out.println("The number of answers you got correct is: " + correct + "/" + numberOfQ);
		}
		
		
	}


