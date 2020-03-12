/**
 * This class contains one default method and 
 * two different methods to calculate distance.
 * @author Ching Han Huang
 * @version 1.0
 *
 */
public class Distance {
	
	/**
	 * The description presents different ways of calculating distance.
	 */
	protected String description;
	
	/**
	 * The distance is presented in String.
	 */
	protected String distance;
	
	/**
	 *  Initialize the fields using the format shown in the Tests class.
	 */
	public Distance() {
		
		description = "No argument";
		distance = "0";
	}
	/**
	 * Convert x to binary. See the Integer class documentation.
	 * Calculate the number of 1s in the binary representation of x,
	 * and assign the result to the distance field.
	 * @param x A integer value input
	 */
	public Distance(int x) {
		
		String bits = "";
		bits = Integer.toBinaryString(x);
		description = "Number of 1s in binary " + x + " (" + bits + ")";

		int numOf1s = 0;
		for (int i = 0; i < bits.length(); ++i) {
			char c = bits.charAt(i);
			if (c == '1') {
				numOf1s++;
			}
		}
		distance = Integer.toString(numOf1s);
	}
	/**
	 * Calculate the sum of the ASCII codes of the characters in the
	 * given String. Assign the sum to the distance field.
	 * @param s A String input
	 */
	public Distance(String s) {
		
		description = "Sum of chars in \"" + s + "\"";
 
		int asciivalueTotal = 0;
		for(int i = 0; i < s.length(); ++i) {
			char ch = s.charAt(i);
			asciivalueTotal = asciivalueTotal + ch;
		}
		distance = Integer.toString(asciivalueTotal);
	}
	
	@Override
	public String toString() {
		return description + ": " + distance;
	}
}
