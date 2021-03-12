package quiz;

import java.util.Scanner;

public class A10_alarmQuiz {
	
	// 맨날 지각하는 사람들을 위해, 사용자가 알람을 설정하면
	// 설정하고자 한 시간보다 45분 이른 시간에도 알람을 설정해주는 
	// 프로그램을 만들려고 한다.
	
	// 시간을 입력하면, 그 시간보다 45분 이른 시간을 출력해보세요
	// ※ 시간은 0 ~ 23시, 분은 0 ~ 59분 까지 입력 가능
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int earlier = 20;
		
		System.out.print("시간, 분 입력 > ");		
		int hour = sc.nextInt();
		int minute = sc.nextInt();

		if (hour < 0 || hour > 23 || minute < 0 || minute > 59) {
			System.out.println("올바르지 않은 시간입니다. 알람 설정을 취소합니다.");
			System.exit(0);
		}
		
		System.out.printf("알람 (1) : %d:%d\n", hour, minute);
		
		if (minute < earlier) {			
			// 삼항 연산자
			//	- 비교 ? 참 : 거짓;
			hour =  hour == 0 ? 23 : hour - 1;			
			minute = minute - earlier + 60;			
			
		} else {
			minute = minute - earlier;
		}
		
		System.out.printf("알람 (2) : %d:%d\n", hour, minute);
		
		
//		Ctrl + / : Eclipse 주석처리 단축키
//		System.out.println("스캐너에 남아있는 데이터들 : " + sc.nextLine();
		
//		int hour = new Scanner(System.in).nextInt();
//		int minute = new Scanner(System.in).nextInt();
		
		
		
	}


}
