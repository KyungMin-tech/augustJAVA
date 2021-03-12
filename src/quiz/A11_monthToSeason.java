package quiz;

import java.util.Scanner;

public class A11_monthToSeason {
	
	// switch-case문을 이용해서
	// 사용자로부터 달을 입력받으면 해당월에 해당하는 계절을 출력해보세요
	
	// main 쓰고 Ctrl + space
	public static void main(String[] args) {
		
//		sysout 쓰고 Ctrl + space
		System.out.println("月을 입력>");
		
		int month = new Scanner(System.in).nextInt();
		
		String season;
		
		switch (month) {
		case 1: case 2:	case 12:case 11:
			season = "겨울";
			break;
		case 3: case 4: case 5:		
			season = "봄";
			break;
		case 6:	case 7:	case 8:		
			season = "여름";
			break;
		case 9: case 10: 		
			season = "가을";
			break;
		default: 
			season = "없는 달";
			break;
				
		}
		System.out.printf("%d월은 %s입니다", month, season);
		
	}
}
	
		
		
