package quiz;

import java.util.Scanner;

public class B02_Prime {

	// 사용자로부터 숫자를 입력을 받고 1부터 입력한숫자 사이에 존재한는
	// 소수를 모두 출력해보세요

	// 1. 모두 출력한 후 다시 입력받도록 만들기
	// 2. 사용자가 숫자 0이하를 입력하면 프로그램 종료하기

	// ※ 소수 : 약수가 1과 자기 자신밖에 없는 숫자
	// ※ 약수 : 어떤 숫자를 나눴을 때 나누어 떨어지는 수
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("숫자를 입력>> ");
			int user =sc.nextInt();
			
			if (user <= 0)
				break;
			
			// 소수 구하기 (유저가 입력한 숫자까지)
			for(int i = 2; i <= user; ++i) {
				
				// i : 이번에 소수인지 체크해볼 숫자
				// j : i까지 반복하면서 나누기 해볼 숫자
				boolean prime =true;
				// Math.sqrt() : 제곱근을 구하는 함수
				// Math.pow() : 제곱을 구하는 함수
				for (int j = 2; j < Math.sqrt(i); ++j) {
					if (i % j == 0)
						prime = false;
						break;
				}
				if (prime)
					System.out.printf("%d ", i);
			}
			System.out.println();

		}
		System.out.println("프로그램을 종료합니다");

	}
}
