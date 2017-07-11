import java.util.ArrayList;

public class PrimeFactorization {

	public static void main(String[] args) {
		//600851475143
		long answer = largestFactor();//Enter the number you want to find largest prime factor for here
		System.out.println(answer);
	}

	public static long largestFactor(long n) {
		long myVal = 2;
		while (n > myVal) {
			if(n % myVal == 0) {
				n = n / myVal;
				myVal = 2;
			}
			else {
				myVal += 1;
			}
		}
		return myVal;
	}

}
