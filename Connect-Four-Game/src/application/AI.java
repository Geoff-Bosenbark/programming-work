/**
 * Abstract base class for AI behavior. Defines the structure for AI implementations by providing a constructor
 * to set game board dimensions and an abstract method 'decideMove' for determining the AI's next move.
 * Subclasses must implement the 'decideMove' method to define specific AI logic, supporting
 * both random and strategic AI behaviors. This class serves as a foundation for extending the game with
 * various AI opponents, facilitating easy integration and expansion of AI strategies.
 */
package application;

import java.util.HashMap;

public abstract class AI
{
	protected int columns;
	protected int rows;

	/**
	 * initializes AI with dimensions of game board
	 * 
	 * @param columns = number of columns in board
	 * @param rows 	  = number of rows in board
	 */
	public AI(int columns, int rows)
	{
		this.columns = columns;
		this.rows = rows;
	}

	/**
	 * Abstract method for subclasses 'RandomAI' and 'SmartAI' to implement
	 * 
	 * @param boardState = current state of board
	 * @param playerTurn = true if player's turn, false if AI's turn
	 * @return column index where AI will place chip
	 */
	public abstract int decideMove(HashMap<String, Chip> boardState, boolean playerTurn);
}
