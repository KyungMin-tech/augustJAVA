
// # Eclipse 단축기
// Ctrl + S     : 저장하기 (저장하지 않은 파일은 *가 있음)
// Ctrl + F11   : 소스 컴파일 및 실행
// Ctrl + [+,-] : 글자 크기조절
// Ctrl + M     : 현재 창을 최대화/최소화
// Ctrl + Shift + f : 자동으로 줄 및 띄어쓰기 정렬
// Ctrl + I : 블록 지정된 부분의 들여쓰기 맞춤 
// Ctrl + W : 힌개만 닫을 때
// Ctrl + shift + W : 전체 다 닫을때

// # 실수로 닫은 창 찾기 
//  Window -> Show view -> 원하는 것 선택

// # 블록 지정 관련 단축기
// Ctrl + A     : 전체 블록 지정
// Shift + 방향키  : 방향키를 이용해 블록지정
// Shift + HOME : 커서 위치부터 줄의 맨 앞까지 블록지정
// Shift + END  : 커서 위치부터 줄의 맨 뒤까지 블록지정
// HOME : 커서를 줄의 맨 앞으로 이동
// END  : 커서를 줄의 맨 뒤로 이동

// Ctrl + X   : 잘라내기
// Ctrl + C   : 복사하기
// Ctrl + V   : 붙여넣기
// Alt + 방향키  : 소스 줄 바꾸기

// Ctrl + Z   : 되돌리기
// Ctrl + Y   : 되돌리기 취소하기

// # 주석
//  - 프로그래머가 하고 싶은 말을 메모해두는 것
//  - 보통은 소스에 대한 설명이난 사용법 등을 적는 용도로 사용한다
//  - 프로그램 실행에 영향을 미치지 핞는다

// 한 줄 주석
/* 여러주석 */
/** 문서화 주석 **/

// public class의 이름은 반드시 파일명과 같아야 한다
public class A00_Hello {
// 빨간 줄이 생겼을 때 그곳에 커서를 두고 F2를 누르면
// 에러에 대한 정보와 해결책을 볼 수 있다	

	// # 함수란?
	// - 어떤 단어 뒤에 ()가 붙어 있는 것을 모두 함수라고 한다
	// - 클래스 내부에 있는 함수는 메서드라고 부른다

	// # main() 함수
	// - 프로그램의 시작 지점
	// - 프로그램을 시작하면 가장 먼저 main()함수를 찾아 실행시킨다
	// - main()함수가 끝나면 프로그램도 끝난다
	// - main()함수의 범위는 중괄호로 결정된다
	public static void main(String[] args) {
		// 프로그램의 시작 지점

		// # System.out.println() 함수
		// ; (세미콜론) : 한 명령어의 끝을 알린다.

		// # 자바의 데이터들

		// 1. ""사이에 적는것 : 믄자열 (String)
		System.out.println("Hello, world!");
		System.out.println("안녕하세요~");

		// 2. 그냥 숫자 : 정수 (Integar)
		System.out.println(123);

		// 3. 소수 : 실 수 (Double, float)
		System.out.println(123.123);

		// 4. ''사이에 적는 것 : 문자 (Character)
		// ※ 작은 따옴표에 문자를 여러개 넣으면 에러
		System.out.println('韓');
		System.out.println('A');
		System.out.println('※');

		// - ()안에 전달한 내용을 콘솔에 출력하는 함수

		// 프로그램 끝
	}

}