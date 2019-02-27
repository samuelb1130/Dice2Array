import java.util.Random;
import java.util.Scanner;

public class Dice2 {

	public static void main(String[] args) {
		
		/**
		*
		*	@ Sam Bauer 22
		*	
		**/	
		
		
		Random rand = new Random();
		int dice = rand.nextInt(6) + 1;
		Scanner bread = new Scanner (System.in);
		
		System.out.print("Please enter a number between 1 to 6");
		int choice = bread.nextInt();
		bread.nextLine();
		int rolls = 1;
		
		while (choice > 6 || choice < 1)
		{	
			System.out.println("Please enter a number between 1 to 6");
			choice = bread.nextInt();
		}
			
		while (choice != dice)
		{
		
			dice = rand.nextInt(6) + 1;
			
			System.out.println("The dice number was " + dice + " roll again");
			bread.nextLine();
			// debug line  System.out.println("\n\nDice: " + dice);
		
			rolls++;
			
		}	
		
			System.out.println("It took you " + rolls + " rolls to land on your number");
			
			System.out.println("\nEND");
			
			
		

	}

}
