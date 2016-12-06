import java.awt.Dimension;
import javax.swing.*;
import javax.swing.ImageIcon;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;



/**
 * In the application <b>Circle the dot</b>, a <b>DotButton</b> is a specialized type of
 * <b>JButton</b> that represents a dot in the game. It uses different icons to
 * visually reflect its state: a blue icon if the blue dot is currently on this location
 * an orange icon is the dot has been selected and a grey icon otherwise.
 * 
 * The icon images are stored in a subdirectory ``data''. They are:
 * data/ball-0.png => grey icon
 * data/ball-1.png => orange icon
 * data/ball-2.png => blue icon
 *
 * @author Guy-Vincent Jourdan, University of Ottawa
 */

public class DotButton extends JButton {
	//Declare global private variables
	private static int row;
	private static int column;
	private static int type;

    /**
     * Constructor used for initializing a cell of a specified type.
     * 
     * @param row
     *            the row of this Cell
     * @param column
     *            the column of this Cell
     * @param type
     *            specifies the type of this cell
     */

    public DotButton(int row, int column, int type) {
    	//Initialize
    	this.row = row;
    	this.column = column;
    	this.type = type;
    	//Initialize/Set new emptyBorder
    	Border emptyBorder = BorderFactory.createEmptyBorder(0,0,0,0);
    	setBorder(emptyBorder);
    	setBorderPainted(false);
    	
    	if (type == 0){
    		//If type = 0/Available, set button to display image of grey ball
    		this.setIcon(new ImageIcon("src/images/ball-0.png"));
    		
    	}
    	else if (type == 1){
    		//If type = 1/Selected, set button to display image of orange ball
    		this.setIcon(new ImageIcon("src/images/ball-1.png"));
    		
    	}
    	else {
    		//If type = 3/DOT, set button to display image of blue ball
    		this.setIcon(new ImageIcon("src/images/ball-2.png"));
    		
    	}
    }

    /**
     * Changes the cell type of this cell. The image is updated accordingly.
     * 
     * @param type
     *            the type to set
     */

    public void setType(int type) {
    	//This method sets the type of button (AVAILABLE,SELECTED,DOT) for each button on the board
    	this.type = type;
    	Border emptyBorder = BorderFactory.createEmptyBorder(0,0,0,0);
    	setBorder(emptyBorder);
    	setBorderPainted(false);
    	

    	if (type == 0){
    		this.setIcon(new ImageIcon("/data/ball-0.png"));
    		
    	}
    	else if (type == 1){
    		this.setIcon(new ImageIcon("/data/ball-1.png"));
    	}
    	else {
    		this.setIcon(new ImageIcon("/data/ball-2.png"));
    		
    	}
    }
    /**
     * Getter method for the attribute row.
     * 
     * @return the value of the attribute row
     */

    public int getRow() {
    	//Return Row
    	return row;
    }
    /**
     * Getter method for the attribute column.
     * 
     * @return the value of the attribute column
     */

    public int getColumn() {
    	//Return column
    	return column;
    }
    
}
