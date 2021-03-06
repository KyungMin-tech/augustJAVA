
public class A13_for {

	public static void main(String[] args) {

		// 반복문
		// - 똑같은 코드를 여러번 반복하고 싶을 때 사용한다

		/*
		 	for (초기값; 조건; 증가값) { 조건이 참인 동안 반복할 명령어들 }
		  
		  	초기값 : for문을 실행하면 가장먼저 실행되는 부분. 주로 사용할 값을 초기화 하는 용도로 사용한다. 
		  	조건 : 이곳에 정의한 조건이 참인 동안 반복이 진행된다 
		  	증가값 : {}의 실행이 끝난 후 실행되는 부분. 주로 반복에 이용되는 값을 증감시키는 용도로 사용한다.
		 */

		// # 가장 기초적인 for문
		// - i를 0부터 시작하고, 조건을 반복 횟수로 지정한다.
		// - i값이 0부터 반복 횟수 - 1까지 변하며 반복이 진행된다.
		for (int i = 0; i < 5; ++i) {
			System.out.println("Hello, world!");
			System.out.printf("현재 %d번째 반복입니다.\n", i);
		}

		// # 큰 값 부터 감소시키면서 반복
		for (int i = 100; i > 0; --i) {
			System.out.print(i + "\t");

			// # 반복문 내부에서 여태까지 배운 모든 문법을 사용할 수 있다
			if (i % 3 == 2)
				System.out.print('\n');
		}
		System.out.println();

		// # 반복을 통해 값을 누적시키기 (총합 구하기)
		// 1. 총합을 저장할 변수를 선언과 동시에 0으로 초기화 해둔다
		// 2. 그 변수에 값을 계속 누적시킨다

		// ex> 50부터 77까지의 총 합을 구해보기
		int total = 0; // (1)

		for (int num = 50; num <= 77; ++num) {
			total += num; // (2)
		}
		System.out.printf("50부터 77까지의 총합은 %d입니다.\n", total);
	}

}
