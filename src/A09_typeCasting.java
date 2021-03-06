
public class A09_typeCasting {
	
	public static void main(String[] args) {
		
		// # 타입 캐스팅
		//	- 어떤 변수 혹은 값을 다른 타입으로 강제로 변환 시키거나 
		//	- 혹은 자동으로 변하는 것
		
		// # 타입의 크기
		// 정수 타입 : byte < char, short < int < long(8byte)
		// 실수 타입 : float(4byte) < double
		// ※  실수 타입은 정수 타입보다 크다
		
		
		// (1) 작은 타입의 변수 혹은 값은 큰 타입에 넣을때는 자동 타입캐스팅 된다.
		//		(넣으려는 값을 모두 포함하고 있는 타입에 넣을때는 안전하다)
		byte _byte = 100;
		char _char = 40000;
		
		// byte타입은 가장 작은 타입이기 때문에 어떤 정수타입에도 들어갈 수 있다
		short _short = _byte;				
		int _int = _byte;			
		long _long = _byte;
		
		// 실수 타입은 아무리 큰 정수가 들어와도 모두 포함할 수 있다
		_long = 999999990999L;		
		float _float = _long; // 9.99999... * 10^n;
		
		// (2) 큰 타입의 값은 작은 타입에 넣으려고 할 때는 문제가 발생 할 수 있다
		//		이런 경우에는, 타입캐스팅을 통해 억지로 값을 넣어줄 수 있다
		_int = -129; // 오버플로우, 언더 플로우 256진수라고 생각할 수 있다 
		
		// 값이 손상 될 수도 있는 캐스팅의 경우 컴파일러가 개발자에게 경고를 보낸다
		// 개발자가 직접 타입캐슽팅을 입력하여 
		// 이 캐스팅을 인지하고 있음을 컴파일러에게 알려야 컴파일을 할 수있다
		_byte = (byte)_int;
		
		System.out.printf("_byte에 들어있는 값 : %d\n ", _byte);
		
		
		// (3) 같은 값이지만 다르게 해석되는 경우 타입캐스팅이 필요하다
		
		// 문자는 실제로 정수값을 지니고 있다 
		// char타입에 들어있는 정수는 문자로 해석된다.
		
		char ch01 = 'A';		
		System.out.println("ch01 : " + ch01);
		System.out.println("(int)ch01 : " + (int)ch01);
		
		// char타입에 정수를 대입해도 기본적으로 문자로 인식한다
		char ch02 = 66;
		System.out.println("타입 캐스팅이 없을  떄 ch02 : " + ch02);
		System.out.println("(int)ch02 : " + (int)ch02);
		
		int ch03 = 66; // 0부터 66 칸을 가서 A
		System.out.println("타입 캐스팅이 없을  떄 ch03 : " + ch03);
		System.out.println("(char)ch03 : " + (char)ch03);
		
		// 같은 66이라도 어떤 타입에 들어있느냐에 따라서 해석 방식이 달라진다
		// char 타입이라면 문자표(charset)를 보고 해석을 하고
		// int타입이라면 그대로 숫자로 받아들인다
		
		// 하지만, 타입캐스팅을 이용하면 66이라는 값을 다른 형태로 변환하여
		// 사용하거나 대입 할 수 있다
		
		
		// # char타입은 문자를 담기 편하도록 설계된 타입이다
		//	문자타입은 실제로는 정수 값이기 때문에 문자끼리의 연산도 가능하다
		System.out.println("A는 몇번째 알파벳인가요? " + ('A' - 'A')); // zerobase 0부터 숫자를 쓰는거
		System.out.println("J는 몇번째 알파벳인가요? " + ('J' - 'A'));
		
		// # 문자 와 정수의 연산도 가능하다
		System.out.println("A에서 5칸 뒤로가면 뭐가 있나요? " + (char)('A' + 5));
		System.out.println("30칸 뒤로가면? " + (char)('A' + 30)); // Ascii code 참고
		
		// ※ 문자가 포함된 연산 결과는 정수가 된다
		
	}

}
