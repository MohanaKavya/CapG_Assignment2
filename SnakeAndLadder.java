package AssignmentTwo;

public class SnakeAndLadder {

		// constants
		public static final int NO_PLAY = 1; 
		public static final int LADDER = 2 ;
		public static final int SNAKE = 3;


	public static void main(String[] args) {
		
		// variables
		// Initialized User Starting Position
		int user_position = 0;
		
		// Roll the Dice to get Number from 1 to 6
		int roll_dice_value = (int)(Math.random()*6+1);
		
		//Check for Options 1-No Play, 2-Ladder, 3-Snake
		int option = (int)(Math.random()*3+1);
		
		//Switch Case to Change Player Position Based on Option 
		switch(option)
		{
			case LADDER : user_position += roll_dice_value;
				      break;
			
			case SNAKE  : if(user_position >= roll_dice_value)
				      user_position -= roll_dice_value;
				      else user_position = 0;
				      break;
		}

	}

}
