/* NUMBER GUESSING GAME 
 * 
 * PROBLEM STATEMENT:-
 * BUILD A CLI GAME IN JAVA WHERE THE USER GUESSES A RANDOMLY GENERATED NUMBER WITHIN A LIMITED NUMBER OF ATTEMPTS.
 * 
 * WHAT YOU'LL LEARN FROM THIS PROJECT:-
 * 1)USING RANDOM CLASS
 * 2)LOOPS AND CONDITION STATEMENTS.
 * 3)HANDLING USER INPUT WITH SCANNER
 * 4)FEEDBACK SYSTEM IN GAMES
 * 
*/
import java.util.Scanner;
import java.util.Random;

class NumberGuessingGame{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();//isse random number generate hoga
		int number = rand.nextInt(100)+1;
		int attempt=0;
		int maxAttempt=7;
		
		System.out.println("Guess the number (1 to 100): ");
		
		while(attempt < maxAttempt){
		    System.out.println("Attempt:" + (attempt + 1) + "Enter the number: ");
			
			try{
				int guess = Integer.parseInt(sc.nextLine());
				attempt++;
				
				if(guess == number){
					System.out.println("Correct! bravo.....");
				}else if(guess > number){
					System.out.println("too low.....try again");
				}else{
					System.out.println("too high.....");
				}
			}catch(NumberFormatException e){
				System.out.println("Please enter the valid number.....");
			}
			
			if(attempt == maxAttempt){
				System.out.println("Out of the chances play again" + number + ".");
			}
		}
		sc.close();
	}
}