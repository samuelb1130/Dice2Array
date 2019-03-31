package dice_array;

import java.util.Random;
import java.util.Scanner;

public class dice_array {

public static void main(String[] args) {
		
		/**
		*
		*	@ Sam Bauer 22
		*	
		**/	
		
		
		Random rand = new Random();
		int dice = rand.nextInt(6) + 1;
		int dice2 = rand.nextInt(6) + 1;

		double rolls = 1000;
		
		int[] diceArr = new int[6];
		int[] diceArr2 = new int[6];
				
		for(int i = 1; i <= rolls; i++)
		{
			
			dice = rand.nextInt(6) + 1;
			
			//System.out.print(dice);    //debug line
			
			if(dice == 1)
			{
				diceArr[0]++;
			}
			if (dice == 2)
			{
				diceArr[1]++;
			}
			if (dice == 3)
			{
				diceArr[2]++;
			}		
			if (dice == 4)
			{
				diceArr[3]++;
			}			
			if (dice == 5)
			{
				diceArr[4]++;
			}				
			if (dice == 6)
			{
				diceArr[5]++;
			}
	
		
		}	
		
		for(int i = 1; i <= rolls; i++)
		{
		
			dice2 = rand.nextInt(6) + 1;
			
			if(dice2 == 1)
			{
				diceArr2[0]++;
			}
			if (dice2 == 2)
			{
				diceArr2[1]++;
			}
			if (dice2 == 3)
			{
				diceArr2[2]++;
			}		
			if (dice2 == 4)
			{
				diceArr2[3]++;
			}			
			if (dice2 == 5)
			{
				diceArr2[4]++;
			}				
			if (dice2 == 6)
			{
				diceArr2[5]++;
			}
		}	
			
			System.out.println("dice one");
			System.out.println("1: " + diceArr[0]);
			System.out.println("2: " + diceArr[1]);
			System.out.println("3: " + diceArr[2]);
			System.out.println("4: " + diceArr[3]);
			System.out.println("5: " + diceArr[4]);
			System.out.println("6: " + diceArr[5]);
			
			System.out.println("\ndice two");
			System.out.println("1: " + diceArr2[0]);
			System.out.println("2: " + diceArr2[1]);
			System.out.println("3: " + diceArr2[2]);
			System.out.println("4: " + diceArr2[3]);
			System.out.println("5: " + diceArr2[4]);
			System.out.println("6: " + diceArr2[5]);
			
	}
	
}
