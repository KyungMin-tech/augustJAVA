package quiz;

import java.util.Scanner;

public class A07_Calc {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ΰ��� �����ּ��� >>> ");
		int num1 = sc. nextInt();
		int num2 = sc. nextInt();
		
		System.out.println((num1 + num2));
		System.out.println((num1 - num2));
		System.out.println(num1 * num2);
		System.out.println(num1 / num2);
		System.out.println(num1 % num2);
		
		System.out.print("�Ǽ� �ΰ��� �����ּ��� >>> ");
		double num3 = sc.nextDouble();
		double num4 = sc.nextDouble();
		
		System.out.println((num3 + num4));
		System.out.println((num3 - num4));
		System.out.println(num3 * num4);
		System.out.println(num3 / num4);
		System.out.println(num3 % num4);
		
		
	}
	
	
}
