package mathematical;

public class Fractions {

	int[] multiplyFractions(int[] a, int[] b){
		int[] c = {a[0] * b[0], a[1] * b[1]};
		return c;
	}
	
	int[] addFractions(int[] a, int[]b){
		int denom = new GCDLCM().lcm(a[1], b[1]);
		int[] c = {(denom / a[1]) * a[0], (denom / b[1]) * b[0]};
		return c;
	}
	
}
