package mathematical;

/**
 * This class is used to find the greatest common divisor of two numbers.
 * @author ankit
 *
 */
public class GCDLCM {

	int gcd(int a, int b){
		
		if(b == 0)
			return a;
		else
			return gcd(b, a % b);
	}
	
	public static void main(String[] args) {
		int b = 12, a = 48;
		int gcd = new GCDLCM().gcd(48, 12);
		System.out.println("Greatest common divisor of two numbers " + a + " & "+b+" is "+ gcd);
		System.out.println("LCM is : "+ (b * a)/gcd);
	}
}
