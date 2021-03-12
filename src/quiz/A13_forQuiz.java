package quiz;

public class A13_forQuiz {
	
	//  사용자가 숫자를 입력하면
	//	1. 1부터 입력한 숫자까지 중 3의 배수의 총합을 구해보세요
	//	2. 1부터 입력한 숫자까지 중 7의 배수가 몇 개있는지 구해보세요
	//	3. 1부터 입력한 숫자 중 2 또는 3의 배수가 아닌 수들의 총합을 구해보세요
	
	public static void main(String[] args) {
		
		int input = 100;
		
		int sum3 = 0;
		int count7 = 0;
		int sum23 = 0;
		
		
		for (int num = 1; num <= input; ++num) {
		// ※ 총합(sum)을 구할 때는 값을 누적시키고
		//   개수(count)를 구할 때는 1씩 증가시킨다 
			if (num % 3 == 0)
				sum3 += num;
			
			if (num % 7 == 0)
				count7 += 1;
			
			if (!(num % 2 == 0 || num % 3 ==0))
				sum23 += num;
		}
		
		System.out.printf("1부터 %d까지의 숫자 중\n" 
				+ "3의 배수의 총합 : %d\n" 
				+ "7의 배수의  개수 : %d\n" 
				+ "2또는 3의 배수가 아닌 수의 총합 : %d\n",
				input, sum3, count7, sum23);
		
		}

}
