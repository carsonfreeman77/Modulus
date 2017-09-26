
import java.util.*;


public class quizzer
{

	public static void main(String[] args) 
	{
		System.out.println("Welcome to the Modulus quizzer of a century!");
		Scanner howMany = new Scanner(System.in);
		System.out.println("How many questions would you like? (Up to 10 available questiosns)");
		int numberOfQ = howMany.nextInt();
		int correct = 0;
		for (int i = 1; i < numberOfQ + 1; i++)
		{
				
				int mod = (int)Math.ceil(Math.random()* 20);
				int othermod = (int)Math.ceil(Math.random() * 20);
				
				System.out.println("Question " + i + ": What is " + mod + "%" + othermod + "?" );
				Scanner answer = new Scanner(System.in);
				int ans = answer.nextInt();
				if (ans == mod%othermod ) 
				{
					correct++;
				}
				else
				{
					
				}
				
			
				int c = 9%6;
				System.out.println(c);
					
				
			
		
		}
		System.out.println("The number of answers you got correct is: " + correct + "/" + numberOfQ);
		
	}
}

