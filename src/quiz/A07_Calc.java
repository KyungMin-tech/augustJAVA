package quiz;

import java.util.Scanner;

public class A07_Calc {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 두개를 적어주세요 >>> ");
		int num1 = sc. nextInt();
		int num2 = sc. nextInt();
		
		System.out.println((num1 + num2));
		System.out.println((num1 - num2));
		System.out.println(num1 * num2);
		System.out.println(num1 / num2);
		System.out.println(num1 % num2);
		
		System.out.print("실수 두개를 적어주세요 >>> ");
		double num3 = sc.nextDouble();
		double num4 = sc.nextDouble();
		
		System.out.println((num3 + num4));
		System.out.println((num3 - num4));
		System.out.println(num3 * num4);
		System.out.println(num3 / num4);
		System.out.println(num3 % num4);
		
		
	}
	
	
}
