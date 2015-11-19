import java.util.Scanner;
public class Hi_Low 
{
	private int high = 0;
	private int low = 0;
	public int numberOfDice = 0;
	public int guess = 0;
	public int highRange = 0;
	public int lowRange = 0;
	public int winCount = 0;
	
	public Hi_Low()
	{
		high = 6;
		low = 1;
	}
	
	public int getRandom(int dice)
	{
		int roll = 0;
		int range = (dice *(high - low)) + 1;     
		roll = (int)(Math.random() * range) + 1;
		return roll;
	}
	
	public void getDice()
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of dice to roll: ");
		numberOfDice = input.nextInt();
	}
	
	public int setDice()
	{
		return numberOfDice;
	}
	
	public void guessNumber()
	{
		Scanner input = new Scanner(System.in);
		System.out.print("\nEnter your guess: ");
		guess = input.nextInt();
	}
	
	public void lowRange()
	{
		if (numberOfDice == 1)
		{
			System.out.printf("Low Range: %d - %d.", low, 3);
		}
		
		else
		{
			System.out.printf("Low Range: %d - %d.", ((low + numberOfDice) - 1), ((3 * numberOfDice)));
		}
	}
	public void highRange()
	{
		if (numberOfDice == 1)
		{
			System.out.printf("High Range: %d - %d.", 3, high);
		}
		
		else
		{
			System.out.printf("High Range: %d - %d.", ((7 + (numberOfDice + 2))), ((6 * numberOfDice)));
		}
	}
	
	public void winLose()
	{
		if ((lowRange == (low + numberOfDice) - 1) || (lowRange == (3 * numberOfDice)))
		{
			System.out.println("You lose.");
			winCount--;
		}
		else if ((highRange == (7 + numberOfDice) + 2) || (highRange == (6 * numberOfDice)))
		{
			System.out.println("You win.");
			winCount++;
		}
	}
}
