package quiz;

public class B01_whileQuiz {
	
	// while문을 이용하여
	
	// 1. 200부터 37까지 출력해보세요
	
	// 2. 1부터 1386까지 중 7의 배수를 모두 출력해보세요
	//	  (가로로 출력하되, 5개 출력할떄마다 줄바꾸기, 줄 맞출걸)
	
	// 3. (1) + (1 + 2)  + (1 + 2 + 3) + ... (1 + 2 + ... + 10)
	// 의 결과를 구해보세요
	
	public static void main(String[] args) {
		
		int num = 200;
		while (num > 36) { 			
			System.out.print(num-- + " ");			
		}
		System.out.println();
		
		num = 1;
		
		while (num < 1387) {
			if(num % 7 == 0)
				System.out.print(num + "\t");
				if (num % 35 == 0)
					System.out.println();
				++num;
			
		}
		System.out.println();
		
		num = 1;
		int sum = 0;
		int sum2 = 0;
		while (num < 11) {
			sum += num++;
			sum2 += sum;
		}
		System.out.println(sum2);
		
		num = 1;
		
		while (num < 11) {
//			System.out.println(num);
			
			int num2 = 1;
			sum = 0;
			while(num2 <= num) {
				System.out.print(num2 + " ");				
				sum += num2++;
			}
			System.out.println(": " + sum);
			
			++num;
		}
			
			
		
	}

}
