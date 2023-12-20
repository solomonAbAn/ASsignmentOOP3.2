package Part1;


import java.util.Scanner;

public class TheGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter the number of players: ");
		LadderAndSnake numbPlayers = new LadderAndSnake();//numbPlayers
		numbPlayers.setPlayers(kb.nextInt());
		
		
		
		System.out.println();
		
		numbPlayers.play(numbPlayers.getPlayers());
//		System.out.print("Flipping dice: ");
//		flipDice();
		
		
		// Get player order
        String[] playerOrder = LadderAndSnake.play(numbPlayers.getPlayers());
        LadderAndSnake Start = new LadderAndSnake();
        // Start the game
        Start.startGame(playerOrder);
		
	}
}
	
		


