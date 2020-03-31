import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
	public static final int TRIES_ALLOWED = 5;
	public static final int MAX_NUMBER = 3;
	public static void main(String[] args) {
		
		/* SELF ASSESSMENT
		   1. Did I use appropriate easy-to-understand, meaningful variables and CONSTANTS within the code? 
		       Mark out of 10: 10.0
		       Comment: I used easy to understand variable names such as "computersInput" and constants such as "TRIES_ALLOWED".
		   2. Did I format the variable and CONSTANT names appropriate (in lowerCamelCase and UPPERCASE)?
		       Mark out of 5: 5.0
		       Comment: My variables and constants are both formatted in lowerCamelCase and UPPERCASE respectively.
		   3. Did I generate the computer's choice in each game correctly using a Random number generator?
		       Mark out of 10: 10.0
		       Comment: I generated a random number using a random number generator to provide an unbiased game.
		   4. Did I input the user's choice in each game correctly?
		       Mark out of 10: 10.0
		       Comment: The users choice is correctly used against the random number generated by the computer.
		   5. Did I correctly compare the choices and update the score appropriately?
		       Mark out of 20: 20.0
		       Comment: I correctly compared both choices and updated the score after each round.
		   6. Did I inform the user of who won each game (and why) correctly?
		       Mark out of 10: 10.0
		       Comment: Yes, I informed who won each game and why after each try.
		   7. Did I use an appropriate for loop to allow the player to play 5 games?  There should be only one loop.
		       Mark out of 20: 20.0
		       Comment: I used a for-loop to allow 5 attempts/tries at the game. Only one loop was used.
		   8. Did I output the final scores correctly after the 5 games were played. 
		       Mark out of 10: 10.0
		       Comment: The final scores are displayed on the screen after 5 tries.
		   9. How well did I complete this self-assessment?
		       Mark out of 5: 5.0
		       Comment: I believe I completed this self-assessment honestly.
		   Total Mark out of 100 (Add all the previous marks): 100.0
		*/
	
		    Random generator = new Random();
		    int usersInput = 0;
		    int count = 0;
		    int usersScore = 0;
		    int computersScore = 0;
		    
		    for (count = 0; (count < TRIES_ALLOWED); count++)
		    { 
		    	int computersInput = generator.nextInt(MAX_NUMBER) + 1; // Number generated is from 1-3
		    
		    	Scanner firstInput = new Scanner( System.in );
			    System.out.println("Enter 1 (for Rock) or 2 (for Paper) or 3 (for Scissors)");
			    usersInput = firstInput.nextInt();
		      
		      // USER AND COMPUTER BOTH DRAW
		      if (usersInput == computersInput)
		      {
                System.out.println("We drew, we both chose " + ((computersInput == 1)?"Rock":(computersInput == 2)?"Paper":"Scissors"));
               
                // USER CHOOSES ROCK
		      }
		      if (usersInput == 1 && computersInput == 2)
		      {
			    System.out.println("I won, you chose Rock, and I chose Paper.");
		      	computersScore = computersScore + 1;
		        System.out.println("My score: " + computersScore);
		        System.out.println("Your score: " + usersScore);
		      }
		      if (usersInput == 1 && computersInput == 3)
		      {
			    System.out.println("You won, you chose Rock, and I chose Scissors.");
			    usersScore = usersScore + 1;
			    System.out.println("My score: " + computersScore);
		        System.out.println("Your score: " + usersScore);
		      }
		      
		      // USER CHOOSES PAPER
		      
		      if (usersInput == 2 && computersInput == 1)
		      {
		    	  System.out.println("You won, you chose Paper, and I chose Rock.");
		    	  usersScore = usersScore + 1;
		    	  System.out.println("My score: " + computersScore);
			      System.out.println("Your score: " + usersScore);
		      }
		      if (usersInput == 2 && computersInput == 3)
		      {
		    	  System.out.println("I won, you chose Paper, and I chose Scissors.");
		    	  computersScore = computersScore + 1;
		    	  System.out.println("My score: " + computersScore);
			      System.out.println("Your score: " + usersScore);
		      }
		      
		      // USER CHOOSES SCISSORS
		 
		      if (usersInput == 3 && computersInput == 2)
		      {
		    	  System.out.println("You won, you chose Scissors, and I chose Paper.");
		    	  usersScore = usersScore + 1;
		    	  System.out.println("My score: " + computersScore);
			      System.out.println("Your score: " + usersScore);
		      }
		      if (usersInput == 3 && computersInput == 1)
		      {
		    	  System.out.println("I won, you chose Scissors, and I chose Rock.");
		    	  computersScore = computersScore + 1;
		    	  System.out.println("My score: " + computersScore);
			      System.out.println("Your score: " + usersScore);
		      }
		      if (usersInput > 3)
		      {
		    	  System.out.println("Please choose a number between one and three.");
		    	  count--; //We decrease count by one, to not count this false attempt of input 4.
		      }
		      else {}
		      
	        }
		      if (count == 5)
		      {
		    	  System.out.println("Thanks for playing!");
		      }
	}
  
}