import mathcal.*;
import mathcal.mathcheck.*;
public class pg4 {
	public static void main(String[] args) {
		System.out.println("GCD = "+FactGCD.calGCD(4,6));
		System.out.println("Factorial = "+FactGCD.calFactorial(5));
		if(Calculations.isprime(3))
			System.out.println("prime");
		else
			System.out.println("not prime");
	}
}