package mathematical;

import java.util.Arrays;

public class SumBaseN {
	
	/**
	 * This is used to sum two numbers of base n having same length.
	 * 
	 * @param num1
	 * @param num2
	 * @param n
	 * @return
	 */
	String sumBaseN(String num1, String num2, int n){
		
		int l1 = num1.length();
		int l2 = num2.length();
		int nm1, nm2, resSum;
		if(l1 != l2){
			System.out.println("Length of the strings aren't equal.");
			return  null;
		}
		char[] result = new char[l1 + 1]; 
		int carry = 0;
		for(int i = l1  - 1; i >= 0; i--){
			nm1 = getNumeralValue(num1.charAt(i));
			nm2 = getNumeralValue(num2.charAt(i));
			resSum = carry + nm1 + nm2;
			if(resSum >= n){
				carry = 1;
				resSum -= n;
			}else{
				carry = 0;
			}
			result[i + 1] = getNumeral(resSum);
		}
		
		
		if(carry == 0)
			return new String(result).substring(1);
		
		result[0] = '1';
		return new String(result);	
	}
	
	/**
	 * This method returns numeral for a value.
	 * @param num
	 * @return
	 */
	int getNumeralValue(char num){
		
		if(num >= '0' && num <= '9')
			return num - '0';
		else
			return num - 'A' + 10;
	}
	
	/**
	 * This method returns a character numeral for the i/p value.
	 * @param num
	 * @return
	 */
	char getNumeral(int num){
		
		if(num >= 0 && num <= 9)
			return (char)('0' + num);
		else 
			return (char)('A' + num - 10);
	}
	
	public static void main(String[] args) {
		System.out.println(new SumBaseN().sumBaseN("10", "10", 2));
	}
}
