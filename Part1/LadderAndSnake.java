package Part1;

import java.util.Arrays;

import java.util.Comparator;
import java.util.Random;

public class LadderAndSnake {

////A LadderAndSnake object has a board of 10x10 and a number of players attached to it, which is initialized at the creation time of the object. 

	private int[] board = new int[10];
	{

		// attach players to the board

	}
	private int players;

	public LadderAndSnake() {
		players = 2;

	}

//The number of players must be set through the use of a parameterized constructor of the class.
	public LadderAndSnake(int pl, String[] po) {
		players = pl;
	
	}

	public int getPlayers() {
		return players;
	}

	public void setPlayers(int players) {
		this.players = players;
		// The number of players must be between 2 and 4 inclusively.
		if (players < 2 || players > 4) {
			System.out.println("Invalid number of players. Numbers of players should be between 2 and 4 inclusively.");
			System.exit(0);
		}
	}

	

	public static  String[] play(int numbPlayers) {
 	
		int[] turns = new int[numbPlayers];
        String[] playerOrder = new String[numbPlayers];

        // Collect dice rolls
        for (int i = 0; i < numbPlayers; i++) {
            System.out.print("Player " + (i + 1) + " rolled the dice: ");
            turns[i] = flipDice();

            // Check for duplicates
            for (int j = 0; j < i; j++) {
                while (turns[i] == turns[j]) {
                    System.out.print("Player " + (i + 1) + " rolled the dice AGAIN: ");
                    turns[i] = flipDice();
                    j = 0; // Reset inner loop to recheck for duplicates
                }
            }

            // Assign player names with their corresponding dice rolls
            playerOrder[i] = "Player " + (i + 1) + ": " + turns[i];
        }
        
        System.out.println();
        // Sort the playerOrder array based on turns array values in reverse order
        Arrays.sort(playerOrder, Comparator.comparingInt(s -> Integer.parseInt(((String) s).split(": ")[1])).reversed());

        // Print the results
        System.out.println("Player order based on sorted dice rolls: " + Arrays.toString(playerOrder));
		return playerOrder;
    }
		 
		 
	public void startGame(String[] playerOrder) {
	    System.out.println("Game started!");

	    // Iterate through playerOrder and let each player take turns
	    for (String player : playerOrder) {
	        int playerNumber = Integer.parseInt(player.split(": ")[0].substring(7));
	        System.out.print("Player " + playerNumber + "'s turn: ");
	        flipDice();
	        
	        // Move player on the board based on dice roll
	        board[playerNumber - 1] += Integer.parseInt(player.split(": ")[1]);

	        // Display current board state
	        displayBoard(board);
	    }

	    // Add other game logic as needed
	}


	// Besides the constructors, and all basic methods in the class, the class must
	// include two methods, one called flipDice(), which should return a random
	// value between 1 and 6 inclusively.
	
	private void displayBoard(int[] playerPositions) {
	    // Display the current state of the board
	    // You can customize this method based on your board representation
	    // For simplicity, we'll just print player positions here
	    System.out.println("Current board state:");
	    for (int i = 0; i < playerPositions.length; i++) {
	        System.out.println("Player " + (i + 1) + " is at position " + playerPositions[i]);
	    }
	    System.out.println();
	}

    
	public static  int flipDice() {
		Random rd = new Random();
		int dice = rd.nextInt(6) + 1;
		System.out.println(dice);
		return dice;
	}

	// The other method is called play(), which actually initiate the core engine of
	// the game where the players start to play the game. The rules of the game are
	// as below:

}
