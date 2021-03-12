package quiz;

public class A05_information {

	public static void main(String[] args) {
		// 숫자 앞에 0을 붙이면 8진수
		// 숫자 앞에 0x를 붙이면 16진수

		// int tel = 010-1234-1234;
		// String tel = String.format("%03d-%d-%d", 10, 1234, 1234);		
		
		String banner = "======== 출력 결과 =========";
		String name = "홍길동";
		int age = 20;
		String tel = "010-1234-1234";
		double tall = 178.5;		
		// 몸무게는 소수점이 나올 수도 있기 때문에 double을 써야 한다
		double weight = 75;		
		// 혈액형은 AB형도 저장해야 하기 때문에 문자열을 써야한다
		String bloodType = "AB"; 		
		boolean goonpil = false;
		boolean gisa = false;
		boolean gf = false;
		
		System.out.println(banner);
		System.out.println("이름\t: " + name);
		System.out.println("나이\t: " + age);
		System.out.println("Tel\t: " + tel);
		System.out.println("키\t: " + tall);
		System.out.println("몸무게\t: " + weight);
		System.out.println("혈액형\t: " + bloodType);
		System.out.println("군필\t: " + goonpil);
		System.out.println("자격증\t: " + gisa);
		System.out.println("여자친구\t: " + gf);
	}
	
}







