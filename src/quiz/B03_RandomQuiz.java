package quiz;

public class B03_RandomQuiz {
	
	// 1000부터 9999 까지의 랜덤 숫자를 100번 생성하고
	// 나왔던 숫자 중 가장  큰 수와 가장 작은 수를 출력해보세요
	public static void main(String[] args) {
		
		int startNum = 1000, endNum = 9999;		
		int max = startNum, min = endNum;
		
		for (int i = 0; i < 100; ++i) {
			int newNum = (int)(Math.random()*(endNum - startNum + 1)) + startNum;
			
			System.out.println(i + "\t: " + newNum);
			
			// ※ 최대값 구하는 법
			//	- 현재 최대 숫자보다 더 큰  수가 있다면 최대값을 교체한다
			//	- 마지막에 남은 숫자가 최대값이다
			if (max < newNum) {
				max = newNum;
				System.out.println("최대값이 " + max + "로 변경되었습니다.");				
			}
			
			// ※ 최소값 구하는 법
			//	- 현재 최대 숫자보다 더 작은  수가 있다면 최소값을 교체한다
			if (min < newNum) {
				min = newNum;
				System.out.println("최소값이 " + min + "로 변경되었습니다.");					
			}
		}		
		System.out.printf("최대값 [%d] / 최소값 [%d]\n", max, min);
	}
	
	

	
}
