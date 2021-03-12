
public class A05_print {
	
	public static void main(String[] args) {
		// 출력에 이용되는 여러가지 메서드
		
		// println() : 원하는 내용을 출력한 뒤에 줄을 자동으로 바꿔준다.
		//				(맨 뒤에 \n을 자동으로 추가해준다)
		// print() : 줄을 자동으로 바꿔주지 않는다.
		int apple = 10;
		System.out.print("사과 : ");
		System.out.println(apple);		
		System.out.println(); // println()에 아무것도 쓰지 않으면 줄을 바꾼다
		System.out.println(apple);
		// System.out.print(); // print()는 아무것도 없이 쓸 수 없다
		
		
		// printf() 
		// - 서식문자를 이용해 출력한다
		// - printf()는 줄을 자동으로 바꿔주지 않으므로 \n을 빼먹지 앟도록 주의 하자
		
		// # printf()에 이용되는 서식 문자들
		// %d : 정수 
		// %f : 실수
		// %s : 문자열
		// %c : 문자
		// %o : 8진수 정수
		//%x, %X : 16진수 정수
		System.out.printf("%d년 %d월 %d일의 원/달러 환율 : %.2f\n", 2020, 8, 13, 1200.33);
		System.out.printf("%s님의 신용등급은 '%c'등급입니다\n", "홍길동", 'A');
		
		int num =13;
		
		System.out.printf("10진수 %d는 8진수로 %o, 16진수로는 %x입니다.\n", num, num, num);
		
		// # 서싲문자의 옵션들
		
		// %숫자d : 숫자만큼 칸을 확보한 뒤 정수를 출력한다
		System.out.printf("최종 점수 : %d점\n", 9);
		System.out.printf("최종 점수 : %5d점\n", 9);
		System.out.printf("최종 점수 : %10d점\n", 9);
		
		System.out.printf("최종 점수 : %15d점\n", 9);
		
		// %-숫자d : 숫자만큼  칸을 확보한 뒤 값을 왼쪽 정렬하여 출력한다
		System.out.printf("%s : 10살\n", "나이");
		System.out.printf("%-10s : 10살\n", "나이");
		System.out.printf("%-15s : 10살\n", "나이");
		System.out.printf("%-20s : 10살\n", "나이");
		
		// %0숫자d : 숫자만큼 칸을 확보한 뒤 빈 칸을 0으로 채워 출력한다
		System.out.printf("2 x 1 = %05d\n", 2*1);
		System.out.printf("2 x 5 = %02d\n", 2*5);
		
		// %.숫자f : 소수점 아래 자릿수를 설정한다
		System.out.printf("평균 점수 : %.3f\n", 99.87654321);
		
		// 서식을 이용해 원하는 문자열을 쉽게 생성 할 수 있다
		
		// String.format() : 서식을 이용해 원하는 문자열을 쉽게 생성할 수 있다
		
		String format = "%d년 %d월 %d일의 원/달러 환율 : %.2f\n";
		String todayCurrency = String.format(format, 2020, 5, 13, 999.85);
		
		System.out.print(todayCurrency);
	}

}
