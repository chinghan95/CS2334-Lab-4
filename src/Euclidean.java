/**
 * This class calculate the Euclidean distance.
 * @author Ching Han Huang
 * @version 1.0
 * 
 */
public class Euclidean extends Distance {
	
	/**
	 * Initialize the description field using the format shown in the Tests class.
	 * Calculate the Euclidean distance of the two points and assign it to the distance field.
	 * @param x1 The x value of the first point
	 * @param y1 The y value of the first point
	 * @param x2 The x value of the second point
	 * @param y2 The y value of the second point
	 */
	public Euclidean(int x1, int y1, int x2, int y2) {
		
		description = "Euclidean distance between (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ")";
		distance = Double.toString(Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1)));
		
	}
}
