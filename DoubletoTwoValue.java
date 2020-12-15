package javapractise;

import java.math.BigDecimal;
import java.util.Scanner;

public class DoubletoTwoValue {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Double value with more than 2 digits...");
		BigDecimal dblVal=sc.nextBigDecimal();
        @SuppressWarnings("deprecation")
		BigDecimal roundedWithScale = dblVal.setScale(2, BigDecimal.ROUND_HALF_UP);
        System.out.println("Rounded value with setting scale = "+roundedWithScale);
		sc.close();
	}
}
