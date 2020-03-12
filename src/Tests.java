/**
 * This class contains tests for the Distance, Euclidean, and Hamming classes.
 * @author James Dizikes
 * @version 1.0
 */
public class Tests {
	
	public static void main(String[] args) {
		
		Distance emptyDist = new Distance();
		String emptyDistAns = "No argument: 0";
		test(emptyDist, emptyDistAns, "Distance()");
		
		Distance intDist = new Distance(5);
		String intDistAns = "Number of 1s in binary 5 (101): 2";
		test(intDist, intDistAns, "Distance(int)");
		
		Distance strDist = new Distance("Hi!");
		String strDistAns = "Sum of chars in \"Hi!\": 210";
		test(strDist, strDistAns, "Distance(String)");
		
		// Note that a Euclidean object can be assigned to a Distance variable.
		Distance eucDist = new Euclidean(3, 0, 0, 4);
		String eucDistAns = "Euclidean distance between (3, 0) and (0, 4): 5.0";
		test(eucDist, eucDistAns, "Euclidean(int, int, int, int)");
		
		// Note that a Hamming object can be assigned to a Distance variable.
		Distance strHammDist = new Hamming("cat", "sat");
		String strHammDistAns = "Hamming distance between cat and sat: 1";
		test(strHammDist, strHammDistAns, "Hamming(String, String)");
		
		Distance intHammDist = new Hamming(10, 5);
		String intHammDistAns = "Hamming distance between 100 and 101: 1";
		test(intHammDist, intHammDistAns, "Hamming(int, int)");
		
	}
	
	/**
	 * A helper method for main that tests the toString output of a Distance 
	 * object. The method prints an error message if the output is incorrect.
	 * @param obj a Distance object.
	 * @param ans the correct toString output.
	 * @param testName a description of the constructor used to create obj.
	 */
	public static void test(Distance obj, String ans, String testName) {
		if (!obj.toString().equals(ans)) {
			System.out.println("Incorrect " + testName);
			System.out.println("Expected: " + ans);
			System.out.println("Returned: " + obj.toString());
			System.out.println();
		}
	}
}
