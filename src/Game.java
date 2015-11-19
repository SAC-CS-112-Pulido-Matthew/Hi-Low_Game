
public class Game {

	public static void main(String[] args) 
	{
		int dice;
		int roll;
		char choice = 'Y';
		
		do
		{
			Hi_Low game = new Hi_Low();
			
			game.getDice();
			
			dice = game.setDice();
			
			roll = game.getRandom(dice);
			
			//System.out.println(roll);
			
			if (dice == 1)
			{
				game.lowRange();
				game.highRange();
			}
			else
			{
				game.lowRange();
				game.highRange();
			}
			
			game.guessNumber();
			
			game.winLose();
		}while (choice == 'Y');
			
	}

}
