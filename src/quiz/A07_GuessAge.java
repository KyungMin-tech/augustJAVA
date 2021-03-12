package quiz;


import java.util.Scanner;

public class A07_GuessAge {
	
	// 사용자로부터 태어난 년도를 입력받으면 
	// 한국식 나이를 계산하여 몇 살인지 알려주는 프로그램을 만들어 보세요
	public static void main(String[] args) {
		int year = 2020;
		Scanner sc = new Scanner(System.in);
		System.out.print("태어난 년도를 입력해주세요 >>> ");
		int num = sc. nextInt();
		System.out.println("한국식 나이는 " + (year + 1 - num) +"살 입니다.");
		
		// 입력을 이렇게 받으면 한 줄에 끝나 간편해 보이지만
		// 생성한 스캐너가 변수에 보관되지 않기 떄문에 해당 스캐너를 다시 사용할 수 없다
		int thisYear = 2020;
		
		System.out.print("태어난 년도? ");
		int birthYear = new Scanner(System.in).nextInt();
		
		System.out.printf("당신의 나이는 %d살 입니다.\n", thisYear - birthYear +1);
		
	}

}
