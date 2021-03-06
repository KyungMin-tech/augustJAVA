
public class A04_varTypes {
	
	
	public static void main(String[] args) {
		
		/*
		  # 자바의 변수 타입들
		 
		  (1) 정수형
		  - 타입마다 크기가 다르며, 저장할 수 있는 수의 범위가 다르다
		  - 양수에는 0이 포함되기 때문에 나타낼 수 있는 숫자가 음수보다 한 개 적다
		      byte  (1byte)    -128(2^7) ~ +127(2^7-1)		    
		      short (2byte)    -32768(2^15) ~ +32767(2^15-1)
		      char  (2byte)    0 ~ 65535
		                  ※ char타입은 첫 번째 비트가 부호 역할을 하지 않는 정수 타입이다		                  
		      int   (4byte)    -21.5억(2^31) ~ +21.5억7(2^31-1)	*기본값*
		      long  (8byte)    -(2^63) ~ +(2^63-1)
		 */
		byte _byte_max = 127;
		byte _byte_min = -128;
		
		short _short_max = 32767;
		short _short_min = -32768;
		
		// char은 문자를 저장하기 위한 정수  타입이다
		// 문자 타입 데이터는 내부적으로는 정수로 저장된다
		// 출력할 떄는 정수값에 해당하는 문자를 출력한다
		char _char_max = 65535;
		char _char_min = 0;
		
		// ''로 사용하는 문자 타입 값도 컴퓨터에게는 내부적으로 정수로 인식된다
		// 하지만, ""를 사용하는 문자열은 정수가 아니다
		char ch1 = 'A';
		char ch2 = 66;
		char ch3 = 'C';
		
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(ch3);
		
		// 큰 숫자를 표현할때 숫자 값에 _를 통해 자릿수를 표현할 수 있다
		int _int_max = 21_4000_0000;
		int _int_min = -21_4000_0000;
		
		// 자바 정수 타입의 기본타입은 int타입이다.
		// long타입 변수에 사용할 값임을 표현하기 위해서는 뒤에 L(l)을 붙여야 한다.
		long _long = 221_4000_0000L;
				
		/*  
		  (2) 실수형
		  	- 복잡하고 정밀한 수학 계산이 필요한 분야에 사용된다
		  	- 부동소수점 방식을 사용한다
		  	
		  	float	(4byte)
		  	double	(8byte)		*기본값*
		*/  		  
		
		// 자바 실수값의 기본타입은 double타입 값이다.
		// float타입 변수에 값을 대입하기 위해서는 뒤에 F(f)를
		// 붙여서  float값임을 명시해야한다
		float _float = 123.123F;
		double _double = 123.123;		
		
		
		/*  
		  (3) 참 / 거짓형 (boolean)
		  	- true, false 두 가지의 값만 가지고 있는 타입
		  	- 참과 거짓을 나타낼 때 사용된다		  	
		*/
		boolean like = true;
		boolean under18 = false;
		boolean over130cm = true;
		
		System.out.println("좋아요를 눌렀나요?" + like);
		System.out.println("18세 미만인가요?" + under18);
		System.out.println("130cm 이상인가요?" + over130cm);
		
		/*  
		  (4) 참조형 (클래스 타입)
		  	-String : 문자열 타입
		  	- 대문자로 시작하는 모든 타입들은 참조형 타입이다
		  	- (1), (2), (3)처럼 소문자로 시작하는 타입들은 기본형 타입이다
		*/ 
		String welcomeMessage = "어서오세요!";
		String byeMessage = "안녕히가세요~";
		
		System.out.println(welcomeMessage);
		System.out.println(byeMessage);
		
		
	}

}
