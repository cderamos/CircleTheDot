import java.util.Random;


/**
 * The class <b>GameModel</b> holds the model, the state of the systems. 
 * It stores the following information:
 * - the current location of the blue dot
 * - the state of all the dots on the board (available, selected or 
 *  occupied by the blue dot
 * - the size of the board
 * - the number of steps since the last reset
 *
 * The model provides all of this informations to the other classes trough 
 *  appropriate Getters. 
 * The controller can also update the model through Setters.
 * Finally, the model is also in charge of initializing the game
 *
 * @author Guy-Vincent Jourdan, University of Ottawa
 */

public class GameModel {
	
	/**
	 * Predefined values to capture the state of a point
	 */
	//Declare global variables
	public static final int AVAILABLE = 0;
	public static final int SELECTED = 1;
	public static final int DOT = 2;
	private static final int INITIAL_PROBA = 10;
	
	public final int boardSize;
	private static int numberSteps;
	private int [][] board;
	private Point blueDot;
	

	/**
	 * Create constructor to initialize the model to a given
	 * size of a board
	 * @param size
	 * the size of the board
	 */
	
	public GameModel (int size) {
		//Initialize boardSize and Board
		this.boardSize = size;
		this.board = new int[size][size];//Pass paramters for rows/columns 
	}
		 /**
	     * Resets the model to (re)start a game. The previous game (if there is one)
	     * is cleared up . The blue dot is positioned as per instructions, and each 
	     * dot of the board is either AVAILABLE, or SELECTED (with
	     * a probability 1/INITIAL_PROBA). The number of steps is reset.
	     */
		
	public void reset(){
		//For each dot, set each dot back to available
		for(int i=0; i< boardSize; i++) {
			for(int j=0; j < boardSize; j++ ){
				board[i][j] = AVAILABLE;
			}
		}
		//Declare variables
		int x;
		int y;
		//If the size of the board is even, set blueDot at one of the 4 center points
		if( boardSize % 2 == 0) 
		{
			
			 x = (int) (Math.random() * 2) + (boardSize/2 - 1);
			 y = (int) (Math.random()* 2) + (boardSize/2 - 1);
		}
		else //If board size is odd, set blueDot at one of the 9 center points
		{
			 x = (int) (Math.random() * 3) + (boardSize/2 - 1);
			 y = (int) (Math.random()* 3) + (boardSize/2 - 1);
		}
		//Place dot at a random point in odd/even board
		board[x][y] = DOT;
		blueDot = new Point(x,y);//call new Point class
		
		//Initalize a counter
		int counter =0;
		
		//While the counter is less than number of dots/10, create x/y coordinates at random places (with initial probability of 10% that
		//a dot that isn’t the blue dot is initially selected.)
		while(counter < (boardSize*boardSize)/INITIAL_PROBA) {
			 x = (int)(Math.random() * boardSize);
			 y = (int)(Math.random() * boardSize);
			 
			 //If the coordinate of the dot is not the blueDot, or a preselected orange dot,
			 //Set coordinate of the dot to be a selected dot
			 //Increment counter
			 if(board[x][y] != DOT && board[x][y] != SELECTED) {
				 board[x][y] = SELECTED;
				 counter++;
			 }
		}
		//Reset # of steps back to 0
		numberSteps = 0;
		
	}
		/**
		 * Getter class method for the size of the game
		 * @return the value of the attribute sizeOfGame
		 * 
		 */
	public int getSize(){
		//Return boardSize
		return this.boardSize;
	}
		/**
	     * returns the current status (AVAILABLE, SELECTED or DOT) of a given dot in the game
	     * @param i
	     *            the x coordinate of the dot
	     * @param j
	     *            the y coordinate of the dot
	     * @return the status of the dot at location (i,j)
	     */ 
	public int getCurrentStatus(int i, int j) {
		//Return x/y coordinate of a given dot in the game
		return board[i][j];
	}
		  /**
	     * Sets the status of the dot at coordinate (i,j) to SELECTED, and 
	     * increases the number of steps by one
	     * 
	     * @param i
	     *            the x coordinate of the dot
	     * @param j
	     *            the y coordinate of the dot
	     */  
	public void select (int i, int j){
		//Sets the status of a given dot to SELECTED, increment steps
		board[i][j] = SELECTED;
		numberSteps +=1;
			
	}
	    /**
	     * Puts the blue dot at coordinate (i,j). Clears the previous location 
	     * of the blue dot. If the i coordinate is "-1", it means that the blue 
	     * dot exits the board (the player lost)
	     *
	     * @param i
	     *            the new x coordinate of the blue dot
	     * @param j
	     *            the new y coordinate of the blue dot
	     */ 
	public void setCurrentDot(int i, int j){
			//Blue dot x/y coordinates are set to AVAILABLE/ call methods from getCurrentDot, which gets method getX/getY from point class
			board[getCurrentDot().getX()][getCurrentDot().getY()] = AVAILABLE;
			blueDot = new Point(i,j);//Creates new point class/Sets point blue dot at given x/y coordinate
			board[i][j] = DOT;
	}
		 /**
	     * Getter method for the current blue dot
	     * 
	     * @return the location of the current blue dot
	     */  
	public Point getCurrentDot(){
		//Returns coordinates for blueDot
		return blueDot;
	}
		 /**
	     * Getter method for the current number of steps
	     * 
	     * @return the current number of steps
	     */   
	public int getNumberOfSteps(){
		//returns number of steps
		return numberSteps;
			
	}

}
