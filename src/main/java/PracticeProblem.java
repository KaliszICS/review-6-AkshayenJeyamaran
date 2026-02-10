public class PracticeProblem {

	public static void main(String args[]) {
	
		}
	public static int sum(int addnum1, int addnum2) {
		int add;
		add = addnum1 + addnum2;
		return add;

	}

	public static int difference(int subtractnum3, int subtractnum4) {
		int subtract;
		subtract = subtractnum3 - subtractnum4;
		return subtract; 
	}

	public static double product (double double1, double double2) {
		double multiply;
		multiply = double1 * double2;
		return multiply;
	}

	public static String removeFirst(String word){
		String newWord;
		newWord = word.substring(1);
		return newWord;
	}

	public static int combinedLength(String word1, String word2){
		String newWord;
		newWord = word1 + word2;
		int a;
		a = newWord.length();
		return a;
	}

	public static boolean isEven(int num1){
		boolean bool1;
		bool1 = num1 % 2 == 0;
		return bool1;


	}

	public static boolean isOdd(int num3){
		boolean bool1;
		bool1 = num3 % 2 != 0;
		return bool1;
	}

	public static boolean isPositive(int num3){
		boolean bool1;
		bool1 = num3 > 0;
		return bool1;
	}

	public static boolean isNegative(int num3){
		boolean bool1;
		bool1 = num3 < 0;
		return bool1;
	}
}