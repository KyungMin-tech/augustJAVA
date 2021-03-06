
public class B04_Array {
	
	public static void main(String[] args) {
		
		// 배열
		//	- 같은 타입의 변수를 한번에 여러개 선언하고 싶을때 사용한다
		//	- 맨 처음 배열은 한번 크기가 정해지면 크기를 변경할 수 없다
		//	- 변수와 다르게 초기화가 자동으로  되어있다
		
		// int형 변수 100개를 선언
		int[] num = new int[100]; 
		// num[0] ~ num[99]까지 int형 변수가 100개 생성된다
		// 방의 번호를 index라고 한다
		
		// 선언한 배열의 각 방에 값을 대입할 수 있다
		num[0] = 9;
		num[1] = 123;
		num[2] = 456;
		
		// ※ 100개를 선언하면 99번까지 있다 (n개를 선언하면 n-1번방까지 있다)
		// num[100] = 10;
		
		
		// 각 방에 저장된 값을 원할때 꺼내서 사용할 수 있다.
		System.out.println(num[0]);
		System.out.println(num[1]);
		System.out.println(num[2]);
		
		// 배열은 값이 자동으로 초기화 되어있다 (변수는 초기화 하지 않으면 에러가 났었다)
		// 정수 : 0
		// 실수 : 0.0
		// boolean : false
		// 참조형 (String) : null
		System.out.println("55번방 : "+ num[55]);
		
		
		// 다른 타입 배열도 사용할 수 있다
		String[] fruits = new String[10];
		fruits[0] = "사과";
		fruits[1] = "오렌지";
		
		System.out.println("fruits[0] : " + fruits[0]);
		System.out.println("fruits[1] : " + fruits[1]);
		System.out.println("fruits[2] : " + fruits[2]);
		
		// 배열을 선언하는 여러가지 방법
		// 1. 타입[] 변수명 = new 타입 [배열크기];
		// 2. 타입[] 변수명 = {값1, 값2, 값3, ...};
		// 3. 타입[] 변수명 = new 타입[] {값1, 값2, 값3, ...};
		
		String[] snacks = {
				"도리토스", "치토스", "멘토스", 
				"스윙칩", "포테토칩", "포카칩",
		};
		
		// 크기가 일정해서 차곡차곡 쌓일 수 있는 값 (기본형)
		// 크기가 일정하지 않아 주소를 통해 참조해야 하는 값 (참조형)
		
		// 배열타입 변수에는 해당 배열의 시작지점의 주소가 저장되어 있다
		// 그 뒤에 인덱스를 붙이면 해당 칸만큼 이동해서 데이터를 읽어준다
		System.out.println(snacks); 
		System.out.println(snacks[0]);
		System.out.println(snacks[1]);
		System.out.println(snacks[2]);
		System.out.println(snacks[3]);
		System.out.println(snacks[4]);
		System.out.println(snacks[5]);
		
		boolean[] passExam = {
				true, true, true, true, true, false, true, false,
		};
		
		double[] weights = new double[] {
				99.99, 88.88, 77.77, 10, 'A', 123.123f,
		};
		
		// toCharArray(); : String을 char[]로 변환 할 수 있다
		char[] charArray = "Hello, world!\n".toCharArray();
		
		System.out.println(charArray[3]);
		System.out.println(charArray[4]);
		System.out.println(charArray[5]);
		
		// # 배열.length를 통해 해당 배열의 길이를 구할 수 있다
		System.out.println("과일배열 길이 : " + fruits.length);
		System.out.println("과자배열 길이 : " + snacks.length);
		
		// # 배열은 반복문과 함께 이용하면 매우 편하다
		for (int i = 0; i < snacks.length; i++) {
			System.out.println(snacks[i]);
		}
		
		// # 합격자가 몇 명인지 구해보기
		int passCount = 0;
		for (int i = 0; i < passExam.length; ++i) {
			passCount = passExam[i] ? passCount + 1 : passCount;
		}
		System.out.printf("전체 응시자 %d명 중 합격자는 %d명입니다.\n", passExam.length,passCount);
		
		
		// # 배열의 내용을 하나씩 꺼내면서 반복하기 (forEach)
		for (String snack : snacks) {
			System.out.println("하나씩 꺼내기 : " + snack);
		}
		
		for (double weight : weights) {
			System.out.println("하나씩 꺼내기 : " + weight);			
		}
		
		for (String fruit : fruits) {
			System.out.println("하나씩 꺼내기 : " + fruit);			
		}
		
		for (int n : num) {
			System.out.println("num : " + n);			
		}
		
	}
	

}
