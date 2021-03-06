
public class A08_operator02 {
	
	public static void main(String[] args) {
		
		// 비교 연산
		//	- 비교연산의 결과는 항상 참/거짓(boolean)타입이다		
		int a = 11, b = 11;
		
		System.out.println("a > b : " + (a > b));
		System.out.println("a < b : "+ (a < b));
		
		// 크거나 같다와 작거나 같다는 반드시 부등호(>, <)가 먼저 나와야 한다
		System.out.println("a >= b : " + (a >= b));
		System.out.println("a <= b : " + (a <= b));
		
		System.out.println("a == b : " + (a == b)); // 같을 때 true
		System.out.println("a != b : " + (a != b)); // 다를 때 true
		
		// 논리 연산
		//	&&(shift + 7) (and) : 양 옆의 두 조건 모두 true여야 true 
		//	||(shift + \\) (or) : 양 옆의 두 조건 모두 하나라도 true면 true
		//	! (not) : true는 false로, false는 true로 바뀐다
		System.out.println("--- AND ---");
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		// ※ AND연산은 앞의 비교가 false라면 뒤의 내용은 더 이상 체크하지 않는다
		
		System.out.println("--- OR ---");
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		// ※ OR연산은 앞의 비교가 true라면 뒤의 내용은 더 이상 체크하지 않는다
		
		System.out.println("--- NOT ---");
		System.out.println(! true);
		System.out.println(! false);
		
		a = 25;
		System.out.println("a가 5 의 배수일 때 참 : " + (a%5 == 0) );
		System.out.println("a가 5 의 배수가 아닐 때 참 : " + ! (a%5 == 0) );
		
		boolean hasBrother = false;
		
		System.out.println("남동생이 있으면 참 : " + hasBrother);
		System.out.println("남동생이 없으면 참 : " + !hasBrother);
				
	}

}
