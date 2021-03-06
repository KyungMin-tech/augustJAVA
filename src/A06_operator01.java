
public class A06_operator01 {
	
	// 연산자 (operator)
	//	- 연산 (계산)할 때 쓰는 것
	//	- +, -, * ,/등	
	public static void main(String[] args) {
		
		// 산술 연산자
		int a = 8, b = 5;
		double c = 5.0;
		
		// 연산의 우선순위는 알고 있던대로 진행된다 (곱하기, 나누기는 먼저 연산)
		System.out.println(a + b);
		System.out.println("a + b : " + (a + b));
		System.out.println("a - b : " + (a - b));
		System.out.println("a * b : " + a * b);
		// 정수 끼리의 나누기는 몫만 나온다
		System.out.println("a / b : " + a / b);		
		// 정수와 실수의 나누기는 정확한 계산을 한다
		System.out.println("a / c : " + a / c);
		
		// % : 나머지 연산
		System.out.println("a % b : " + a % b);
		
		// Math.pow() : 제곱 함수
		System.out.println(Math.pow(a, b));
		
		// ^ :  제곱이 아니다 (비트연산 XOR) : 이진법으로 계산할때 숫자가 다르면 1 같으면 0
		System.out.println("a ^ b : " + (a ^ b));	
		
	}

}
