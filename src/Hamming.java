/**
 * This class calculate the Hamming distance. 
 * @author Ching Han Huang
 * @version 1.0
 *
 */
public class Hamming extends Distance {
	
	/**
	 * Initialize the description field using the format shown in the Test class.
	 * 
	 * Calculate the Hamming distance between two Strings. If the 
	 * Strings have different lengths, add 1 for every extra character of 
	 * the longer String. Compare the Strings starting with the rightmost 
	 * character. Assign the result to the distance field.
	 * @param s1 The first String input
	 * @param s2 The second String input
	 */
	public Hamming(String s1, String s2) {

		description = "Hamming distance between " + s1 + " and " + s2;
		
		int s1length = s1.length();
		int s2length = s2.length();
		int lengthDifference = Math.abs(s1length - s2length);
		int distanceNum = lengthDifference;
		int shorterString = Math.min(s1length, s2length);
		
		for (int i = (shorterString - 1); 0 <= i && i < shorterString; --i) {
			char c1;
			char c2;
			if ((s1length - s2length) < 0) {
				c1 = s1.charAt(i);
				c2 = s2.charAt(i + lengthDifference);
			}
			else {
				c1 = s1.charAt(i + lengthDifference);
				c2 = s2.charAt(i);
			}
			
			if (c1 != c2) {
				distanceNum++;
			}
		}
		distance = Integer.toString(distanceNum);
	}
	
	/**
	 * Convert x and y to binary.
	 * 
	 * Initialize the description field using the format shown in the Tests class.
	 * 
	 * Calculate the Hamming distance between the binary representations of x and y. 
	 * Use the rules given above for bit Strings of unequal length.
	 * @param x The first input integer value
	 * @param y The second input integer value
	 */
	public Hamming(int x, int y) {
		// Convert base 10 integer value to base 2 integer value
		String xBits = Integer.toBinaryString(x);
		String yBits = Integer.toBinaryString(y);
		description = "Hamming distance between " + xBits + " and " + yBits;
		
		// Calculate each length of base 2
		int s1length = xBits.length();
		int s2length = yBits.length();
		// Calculate the difference of length of two base 2 strings
		int lengthDifference = Math.abs(s1length - s2length);
		int distanceNum = lengthDifference;
		// Calculate the shorter length of base 2 string
		int shorterString = Math.min(s1length, s2length);
		
		// Compare the char of strings from the rightmost position of string
		for (int i = (shorterString - 1); 0 <= i && i < shorterString; --i) {
			// The char value of xBits
			char c1;
			// The char value of yBits
			char c2;
			
			// If the length of xBits is shorter than yBits, add the length difference to index of yBits.
			// For example, for the first time, the first compare index of yBits should be the last index of yBits, 
			// if the yBits is longer than xBits.
			if ((s1length - s2length) < 0) {
				c1 = xBits.charAt(i);
				c2 = yBits.charAt(i + lengthDifference);
			}
			else {
				c1 = xBits.charAt(i + lengthDifference);
				c2 = yBits.charAt(i);
			}
			// Compare the char of both strings
			if (c1 != c2) {
				distanceNum++;
			}
		}
		distance = Integer.toString(distanceNum);
	}
}
