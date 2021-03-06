
public class A12_operateor03 {
	
	public static void main(String[] args) {
		
		// # 대입연산
		//	- 왼쪽에 있는 변수에 오른쪽의 값을 넣는다
		//	- 대입하면 변수에 원래 들어있던 값은 사라진다
		//	- 대입연산은 연산자 우선순위가 가장 낮기 때문에 
		//	    오른쪽의 계산이 모두 끝난 후 대입된다
		
		int a = 10 + 15;
		boolean b = 10 < 15;
		
		
		// 대입연산을 통해서 값을 누적시키기
		int c =10;
		c = c + 20; // 왼쪽의 c의 값이 30이 된다, 안에 있는 값을 무시한다
		
		// 대입연산의 결과를 바로 사용하기
		System.out.println("c = c + 20의 결과 : " + (c = c + 20)); // 이럴경우 왼쪽값은 50
		
		// # 누적시키는 대입연산을 축약해서 사용하기 (복합 대입연산)
		int num = 10;
		num += 5; // num = num + 5를 줄여서 표현한것
		num -= 8;
		num *= 2;
		num /= 3;
		num %= 16; // 이게 맨 마지막 연산
		System.out.println("num의 최종값 : " + num);
		
		// # 단항연산
		num = 10;
		num++; // num = num + 1을  줄여서 표현한 것
		System.out.println("num++ : " + num);
		num--; // num = num - 1을  줄여서 표현한 것
		System.out.println("num-- : " + num);
		
		// # 단항 연산자는 위치에 따라 결과가 달라진다
		num = 10;
		System.out.println("num++ 출력 : " + num++);
		System.out.println(num);
		
		num = 10;
		System.out.println("++num 출력 : " + ++num);
		System.out.println(num);
		
		
		// # 삼항연산
		//	- 비교? 예 : 아니오;
		String answer = num % 2 == 0 ?
				String.format("%d는 짝수입니다.", num) : String.format("%d는 홀수입니다.", num);
				
		System.out.println(answer);
		
		int apple =15;
		int size = 10;
		
		int basket = apple % size >0 ? apple / size + 1 : apple/size;
		System.out.printf(" 사과가 %d개이고 바구니의 크기가 %d 일 때 \n" + "필요한 바구니 개수는 %d개 입니다\n", apple, size, basket);
			
	}

}
