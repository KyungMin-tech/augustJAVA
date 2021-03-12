package quiz;

import java.util.Scanner;

public class B02_Fibonacci {
	
	// 사용자로부터 숫자를 입력받고 해당 번째의 피보나치 수를 구해보세요
	
	// ※ 피보나치 수열 (앞의 두 수를 더하면 다음 숫자가 나오는 수열)
	// 1 1 2 3 5 8 13 21 34 55 ... 
	public static void main(String[] args) {
		
		
		System.out.print("숫자를 입력 > ");		
		int user = new Scanner(System.in).nextInt();	
		
		int num1 = 1;
		int num2 = 1;
		int num3 = 0;
		
		for (int i = 0; i < user; ++i) {
			if (i == 0)
				System.out.println(1);
			else if (i == 1) {
				System.out.println(1);
			} else {
				num3 = num1 + num2;
				System.out.println(num3);
				
				num1 = num2;
				num2 = num3;
			}
		}
		
	}		

}
