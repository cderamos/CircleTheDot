//Import
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.*;
/**
 * The class <b>BoardView</b> provides the current view of the board. It extends
 * <b>JPanel</b> and lays out a two dimensional array of <b>DotButton</b> instances.
 *
 * @author Guy-Vincent Jourdan, University of Ottawa
 */
public class BoardView extends JPanel {
	//Declare Global Variables
	private GameModel model;
	private GameController controller;
	public static DotButton [][] board;
	private GridLayout overallLayout;

	
	
	/**
     * Constructor used for initializing the board. The action listener for
     * the board's DotButton is the game controller
     * 
     * @param gameModel
     *            the model of the game (already initialized)
     * @param gameController
     *            the controller
     */

    public BoardView(GameModel gameModel, GameController gameController) {
    	//Initialize variables
    	this.model = gameModel;
    	this.controller = gameController;
    	//Initialize Grid Layout
    	setLayout(new GridLayout(model.getSize(),1));
    	//Set a top border size of 10 pixels
    	setBorder(BorderFactory.createEmptyBorder(10,0,0,0));
    	
    	//Initalize object, pass parameters for rows/columns
    	board = new DotButton[model.boardSize][model.boardSize];
    	//For each, check if the row # is odd or even
    	//Condition: Keep looping until model.Boardsize
    	for(int row=0;row<model.boardSize; row++){
    		JPanel newPanel = new JPanel(new FlowLayout());//Create new JPanel for each row
    		if (row%2 == 0) // If row is even,set  right edge of border to 20 pixel space, then create buttons, add to JPanel
    			{
    			 newPanel.setBorder(BorderFactory.createEmptyBorder(0,0,0,20));
    			 for(int column = 0;column< model.boardSize; column++)
    			 	{
    				 board[row][column] = new DotButton(row,column,model.getCurrentStatus(row, column));
    				 newPanel.add(board[row][column]);
    			 	}
    			}
    			 else//If row is even,create buttons, add to JPanel
    			 {
    				 for(int column = 0;column<model.boardSize;column++){
    					 board[row][column] = new DotButton(row,column,model.getCurrentStatus(row, column));
    					 newPanel.add(board[row][column]);
    				 }
    			 }
    			add(newPanel);//Add to overall JPanel
    		}	
    	
    }
    
    //Create new method to initialize/reinitialize board
    private void newBoard(){
    	setLayout(new GridLayout(model.getSize(),1));
    	setBorder(BorderFactory.createEmptyBorder(10,0,0,0));
    	board = new DotButton[model.boardSize][model.boardSize];
    	
    	for(int row=0;row<model.boardSize; row++){
    		JPanel newPanel = new JPanel(new FlowLayout());
    		if (row%2 == 0) 
    			{
    			 newPanel.setBorder(BorderFactory.createEmptyBorder(0,0,0,20));
    			 for(int column = 0;column< model.boardSize; column++)
    			 {
    				 board[row][column] = new DotButton(row,column,model.getCurrentStatus(row, column));
    				 newPanel.add(board[row][column]);
    			 	}
    			}
    			 else
    			 {
    				 for(int column = 0;column<model.boardSize;column++){
    					 board[row][column] = new DotButton(row,column,model.getCurrentStatus(row, column));
    					 newPanel.add(board[row][column]);
    				 }
    			 }
    			add(newPanel);
    		}	
    }
 	/**
	 * update the status of the board's DotButton instances based on the current game model
	 */

    public void update(){
    	removeAll();//remove contents of board
    	newBoard();//call method to re-initialize board
    	revalidate();//recalculate layout
	}

}
