
public class Point {
	//Declare global private variables
	private int xCoord;
	private int yCoord;
	
	/**
	 * Constructor
	 * @param x, the x coordinate
	 * @param y, the y coordinate
	 */
	public Point (int x,int y){
		//Initialize
		xCoord = x;
		yCoord = y;
	}
	/**
	 * Getter method for the attribute x
	 * @return the value of the attribute x
	 */

	public int getX(){
		//Get x-coordinate
		return xCoord;
	}
	
	/**
	 * Getter method for the attribute y
	 * @return the value of the attribute y
	 */
	
	public int getY(){
		//Get y-coordinate
		return yCoord;
	}
	
	/**
	 * Setter for x and y
	 * @param x, x coordinate
	 * @param y, y coordinate
	 */
	
	public void reset (int x, int y){
		//Reset x and y coordinates
		xCoord = x;
		yCoord = y;
	}
	
}
