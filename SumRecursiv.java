package sumNumbers;

//Given a string,return the sum of the numbers appearing in the string,ignoring all other characters - recursive

public class SumRecursiv {
	public static int a = 1;
	public int b = 5;

	public int sumNumbers(String str) {

		// System.out.println(b);
		return sumNumbers(str, 0, "");

	}

	public static int sumNumbers(String str, int sum, String partial) {
		if (str.length() == 0)

		{
			if (partial != "")
				sum = sum + Integer.parseInt(partial);
			return sum;
		}
		if (!Character.isDigit(str.charAt(0)))
			if (partial == "") {
				return sumNumbers(str.substring(1), sum, "");
			} else {
				return sumNumbers(str.substring(1), sum + Integer.parseInt(partial), "");
			}
		if (Character.isDigit(str.charAt(0))) {
			return sumNumbers(str.substring(1), sum, partial + str.substring(0, 1));
		}
		return sum;

	}
	/*
	 * public static void checkSum(int expectedSum, String input) throws Exception {
	 * 
	 * int actualSum = sumNumbers(input); System.out.println("Expected sum = " +
	 * expectedSum + " your result: " + actualSum); if (actualSum != expectedSum) {
	 * throw new Exception(
	 * String.format("problem: for string %s, expected: %d, actual: %d", input,
	 * expectedSum, actualSum)); }
	 * 
	 * }
	 */
//
//	public static void main(String[] args) throws Exception {
//
//		String str = "";
//		/*
//		 * checkSum(12, "12"); checkSum(0, ""); checkSum(12, "a12c"); checkSum(16,
//		 * "adsda12cascas4fsa"); checkSum(1240, "..120..4"); checkSum(0, "abc");
//		 * checkSum(80, "50a10aa20");
//		 */
//		// System.out.println(sumNumbers(str, 0, ""));
//		System.out.println(sumNumbers(str, 0, ""));
//	}

}
