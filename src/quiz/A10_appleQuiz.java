package quiz;


// 자동 import 단축키 : Ctrl + shift + O(영어 O)
import java.util.Scanner;

public class A10_appleQuiz {

	// 사과를 10개씩 담을 수 있는 바구니가 있다.
	// 사과의 개수를 입력받으면 필요한 바구니의 개수를 계산하여
	// 출력해주는 프로그램을 작성해보세요.
	
	public static void main(String[] args) {
		
		System.out.print("사과의 개수를 입력 >>> ");
		int appleNum = new Scanner(System.in).nextInt();
		int basketCapacity = 10;
		int basketNum1 = appleNum/basketCapacity + 1;
		int basketNum2 = appleNum/basketCapacity;
		
		// 사과의 개수가 10으로 나누어 떨어지면 나누기만 하면 되고
		// 나누어 떨어지지 않을땐 바구니가 한 개 더 필요하다
		
		// ※ 입력값 검증(validate)
		if (appleNum < 0) {
			System.out.println("사과의 개수는 0보다 작을 수 없습니다. " + "프로그램을 종료합니다.");
			System.exit(0); // 프로그램 강제 종료
		} else if ((appleNum > 0) && (appleNum %10 != 0)) {
			System.out.println("바구니의 개수 : " + basketNum1);
		} else if (appleNum %10 == 0) {
			System.out.println("바구니의 개수 : " + basketNum2);
		}
				
	}

}
