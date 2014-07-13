package mathematical;

/**
 * This classis used to convert a number in base 'b' to decimal and vise-versa.
 * @author ankit
 *
 */
public class Bases {

	
	/**
	 * This code converts a number n in base b (2<=b<=10) to a decimal number:
	 * @param n
	 * @param b
	 * @return
	 */
	int toDecimal(int n, int b){
		
		int multiplier = 1;
		int result = 0;
		while(n != 0){
			result += (n % 10) * multiplier;
			multiplier *= b;
			n /= 10;
		}
		return result;
	}
	
	/**
	 * The following code will convert from a decimal to any base (up to base 20).
	 * @param n
	 * @param b
	 * @return
	 */
	String fromDecimal(int n, int b){
		
		String chars = "0123456789ABCDEFGHIJ";
		String result = "";
		while(n > 0){
			result = chars.charAt(n % b) + result; 
			n /= b;
		}
		return result.toString();
	}
	
	
	public static void main(String[] args) {
		Bases bases = new Bases();
		System.out.println(bases.toDecimal(101, 2));
		System.out.println(Integer.parseInt("" + 101, 2));
		
		System.out.println(bases.fromDecimal(16, 16));
		System.out.println(Integer.toHexString(16));
	}
}
