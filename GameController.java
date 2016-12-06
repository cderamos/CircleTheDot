import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * The class <b>GameController</b> is the controller of the game. It implements 
 * the interface ActionListener to be called back when the player makes a move. It computes
 * the next step of the game, and then updates model and view.
 *
 * @author Guy-Vincent Jourdan, University of Ottawa
 */


public class GameController implements ActionListener {
	//Declare global variables
	private GameModel game;
	private GameView view;

     /**
     * Constructor used for initializing the controller. It creates the game's view 
     * and the game's model instances
     * 
     * @param size
     *            the size of the board on which the game will be played
     */
    public GameController(int size) {
    	//Initialize objects/variables
    	game = new GameModel(size);
    	view = new GameView(game,this);
    	//Set frame
    	view.setVisible(true);
    	view.setTitle("Assignment 2");
    }
    /**
     * Starts the game
     */
    public void start(){
    	//Call reset method from model
    	game.reset();
    	//Call method getBoardView from gameView, and call method update
    	view.getBoardView().update();
    }
    /**
     * resets the game
     */
    public void reset(){
    	//Call method start to start/restart game
    	start();
    }

    /**
     * Callback used when the user clicks a button or one of the dots. 
     * Implements the logic of the game
     *
     * @param e
     *            the ActionEvent
     */

    public void actionPerformed(ActionEvent e) {
    	
    }
}
