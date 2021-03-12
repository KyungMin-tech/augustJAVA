package quiz;

import java.util.Scanner;

public class A07_CelToFahr {
	
	// 사용자로부터 섭씨 온도를 입력받으면 
	// 화씨 온도로 변환하여 출력해주는 프로그램을 만들어 보세요
	// (변환 공식은 구글에서 찾아보세요, 출력은 소수  첫째 자리까지)
	public static void main(String[] args) {
		
		System.out.print("섭씨 온도를 입력해주세요 >>> ");
		double cel = new Scanner(System.in).nextDouble();
		
		// (27°C × 9/5) + 32 = 80.6°F
		
		System.out.printf("섭씨 %.1f°C는 화씨 %.1f°입니다", cel, cel * 9/5 + 32);

	}

}
