
package quiz;

import java.util.Scanner;

public class A10_scoreToGrade {
	
	// 점수를 입력받으면 해당하는 등급을 출력해주는 프로그램을 작성해보세요
	
	// 90점 이상	: A
	// 80점 이상	: B
	// 70점 이상	: C
	// 60점 이상	: D
	// 50점 이상	: E
	// 그 외		: F
	
	// ※ 점수는 0점부터 100점까지 있습니다
public static void main(String[] args) {
		
		System.out.print("점수 > ");
		int score = new Scanner(System.in).nextInt();
		
		// ※ 입력값 검증 - 사용자가 입력한 값은 항상 검증해야 한다
		if (score < 0 || score > 100) {
			System.out.println("잘못된 값을 입력하셔서 점수를 0점처리 하겠습니다.");
			score = 0;
		}		
		
		// ※ {}내부의 명령이 단 한 줄이라면 {}를 생략할 수 있다
		String msg = "F등급";
		
		if (score >= 90) 
			msg = "A등급";
		else if (score >= 80) 
			msg = "B등급";
		else if (score >= 70)
			msg = "C등급";
		else if (score >= 60)
			msg = "D등급";
				
		System.out.printf("점수 %d점으로 %s입니다.\n", score, msg);
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("점수 입력란 >>> ");
//		int num = sc. nextInt();
//		
//		if (num > 100 || num < 0) {
//			System.out.println("잘못 입력했습니다");
//		} else if ((100 >= num) && (num >= 90)) {
//			System.out.println("A");
//		} else if ((90 > num) && (num >= 80)) {
//			System.out.println("B");
//		} else if ((80 > num) && (num >= 70)) {
//			System.out.println("C");
//		} else if ((70 > num) && (num >= 60)) {
//			System.out.println("D");
//		} else if ((60 > num) && (num >= 50)) {
//			System.out.println("E");
//		} else if ((50 > num) && (num >= 0)) {
//			System.out.println("F");
//		} 
		
	}
		

}
