package AssignmentTwo;

public class SnakeAndLadder {

		// constants
		public static final int NO_PLAY = 1; 
		public static final int LADDER = 2 ;
		public static final int SNAKE = 3;


	public static void main(String[] args) {
		
		// variables
		int user_position = 0;				// Initialized User Starting Position
		int no_of_times_die_rolled = 0;
		
		System.out.println("Roll Count\tPlayer Position");
		
		// While Loop for Continuous Die Rolling till Player reaches Winning Position 
		while(user_position < 100) {

		// Roll the Dice to get Number from 1 to 6
		int roll_dice_value = (int)(Math.random()*6+1); 
		no_of_times_die_rolled++;
		
		//Check for Options 1-No Play, 2-Ladder, 3-Snake
		int option = (int)(Math.random()*3+1); 
		
		//Switch Case to Change Player Position Based on Option 
		switch(option)
		{
			case LADDER : if(user_position + roll_dice_value <= 100) 	// if condition added to get Exact Winning Position
				      user_position += roll_dice_value;
				      break;
			
			case SNAKE  : if(user_position >= roll_dice_value)
				      user_position -= roll_dice_value;
				      else user_position = 0;
				      break;
		}
		
		System.out.println(no_of_times_die_rolled+"\t\t"+user_position);
		
		}
		// Display of Number of Times Die is Rolled till Player Wins
		System.out.println("Number of Times Die is Rolled till Player Wins : "+no_of_times_die_rolled);
		
	}

}
