//Import all the required packages.
import java.util.Scanner;

//Create a class with the class name GuessNumber.
public class GuessNumber
{
    //Define a main() method to execute the program.
	public static void main(String args[])
	{
        //Create Scanner class's object.
		Scanner s = new Scanner(System.in);
        
        //Number to be guessed.
		int number;    
        
        //User's guess.
		int userNumber; 
        
        //String version of user's guess.
		String stringNumber;  
        
        //Contains a "Y" or "N" determining if the user wants to continue.
		String keepGoing;  

		//This is the work done in the detailLoop() method
		//Generate a random number.
		number = 1 + (int) (Math.random() * 10); 

		//Prime the loop.
		System.out.println("Do you want to guess a number? Enter Y or N");
		keepGoing  = s.nextLine();

		//Validate input.
		while(!(keepGoing.compareTo("Y")==0 || keepGoing.compareTo("N")==0)) {
			System.out.println("Please enter correct value. Enter Y or N");
			keepGoing  = s.nextLine();
		}

		//Enter loop if they want to play.
		while(keepGoing.compareTo("Y") == 0)

		{
			//Get the user's guess.
			System.out.println("I'm thinking of a number. .\n Try to guess by entering a number between 1 and 10");

			stringNumber  = s.nextLine();
			userNumber = Integer.parseInt(stringNumber);

			//Validate input.
			while(userNumber<1 || userNumber>10) 
			{
				System.out.println("Please enter correct value. Try to guess by entering a number between 1 and 10");
				stringNumber  = s.nextLine();
				userNumber = Integer.parseInt(stringNumber);
			}

			//Test to see if the user guessed correctly.
			if(userNumber == number)
			{
				keepGoing = "N";
				System.out.println("You are a genius. That's correct!");
			}

			else
			{
				System.out.println("That's not correct. Do you want to guess again? Enter Y or N");
				keepGoing  = s.nextLine();

				// Validate input.
				while(!(keepGoing.compareTo("Y")==0 || keepGoing.compareTo("N")==0))
				{
					System.out.println("Please enter correct value. Enter Y or N");
					keepGoing  = s.nextLine();
				}
			}
		} // End of while loop.

		System.exit(0);
	} // End of main() method.
} // End of GuessNumber class.