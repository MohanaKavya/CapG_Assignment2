package AssignmentTwo;

public class SnakeAndLadder {

		// constants
		public static final int NO_PLAY = 1; 
		public static final int LADDER = 2 ;
		public static final int SNAKE = 3;


	public static void main(String[] args) {
		
		// variables
		int [] user_position = new int[2];				
		user_position[0] = 0; user_position[1] = 0;											// Initialized Two Players Starting Position
		int no_of_times_die_rolled = 0;
		int i = 0;
		int player_chance = 0;

		
		System.out.println(" Player\t\tPlayer Position");
		System.out.println("----------------------------------");
		
		// While Loop for Continuous Die Rolling till Player reaches Winning Position 
		while(user_position[i] < 100) {

		// Roll the Dice to get Number from 1 to 6
		int roll_dice_value = (int)(Math.random()*6+1); 
		no_of_times_die_rolled++;
		
		//Check for Options 1-No Play, 2-Ladder, 3-Snake
		int option = (int)(Math.random()*3+1); 
		
		//Switch Case to Change Player Position Based on Option 
		switch(option)
		{
			case LADDER : if(user_position[i] + roll_dice_value <= 100) 	// if condition added to get Exact Winning Position
				      user_position[i] += roll_dice_value;
					  player_chance++;
				      break;
			
			case SNAKE  : if(user_position[i] >= roll_dice_value)
				      user_position[i] -= roll_dice_value;
				      else user_position[i] = 0;
				      break;
		}
		
		player_chance++;
		
		System.out.println("Player "+(i+1)+"\t\t"+user_position[i]);

		//For Changing Rolling Chances between Players
		if(player_chance%2 == 0)
			i = 0;
		else 
			i = 1;
				
		}
		
		// Display Results
		if(user_position[0] == 100)
				System.out.println("\nPlayer 1 is the Winner");
		else if(user_position[1] == 100)
				System.out.println("\nPlayer 2 is the Winner");
			
		// Display of Number of Times Die is Rolled till Player Wins
		System.out.println("\nNumber of Times Die is Rolled till Player Wins : "+no_of_times_die_rolled);
		
		
	}

}
