import java.util.Arrays;

public class B05_Array2 {
	
	public static void main(String[] args) {
		
		// 배열내부에 배열을 사용하기
		
		// int[] : 요소로 int를 가지고 있는 배열
		int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9 };
		
		// int[][] : 요소로int[]을 가지고 있는 배열
		// (내부 배열의 길이는 일정하지 않아도 된다)
		int[][] num2 = {
				{1, 2, 3}, 
				{1, 2, 3, 4, 5}, 
				{9, 99, 999},
				num,
				num,
				num,
		}; // 이 경우 길이는3
		
		// 2차원 배열의 값 사용하기		
		System.out.println(num2[0][2]); // 0번째 배열의 2번째 요소
		System.out.println(num2[2][2]); // 2번째 배열의 2번째 요소
		System.out.println(num2[1]); // 1번째 배열의 주소값
		System.out.println(num2[1]. length); // 1번째 배열의 길이
		
		// int[][]은 int[]의 값(주소값)을 요소로 가지고 있는 배열이다
		System.out.println(num2[3]);
		System.out.println(num2[4]);
		System.out.println(num2[5]);
		
		// num2[3]과  num2[5]는 실제로는 같은 배열을 가리키고 있기 때문에
		// 하나만 수정해도 모두 수정된는 것처럼 보인다
		System.out.println(num2[3][5]);
		System.out.println(num2[5][5]);
		
		num2[3][5] = 555;
		System.out.println(num2[3][5]);
		System.out.println(num2[5][5]);
		
		
		// int[][][] : 요소로 int[][]을 가지고 있는 배열
		int[][][] num3 = {
				{{1, 2}, {2, 3}, {4, 5}},
				{{5, 5, 5}, {6, 6, 6}},
				num2, num2, num2, num2,
		};
		
		// 다차원 배열은 내부 ㅂ열의 개수는 정할 수 있지만
		// 내부 매열의 길이까지 정할 수는 없다 (내부 배열의 길이느 생략이 가능하다)		
		String[][] stores = new String[3][1];
		
		// 내부 길이를 1로 제한하영 했짐나 아무렇게나 넣을 수 있다
		stores[0] = new String[] {"과자", "사탕", "껌", "세제", "우유", "달걀", "치즈"};
		stores[1] = new String[] {"배", "사과", "귤", "복숭아"};
		stores[2] = new String[] {"쌀", "귀리", "현미"};
		
		// 배열의 개수는 3개로 설정해서 3번방은 사용할 수 없다
		// stores[3] = new String[] {};
		
		System.out.println(stores[0][6]);
		
				
		// n차원 배열은 n중 반복문으로 모두 접근 할 수 있다
		for (int i = 0; i < stores.length; ++i)
			System.out.println(Arrays.toString(stores[i]));
		
		for (int i = 0; i < stores.length; ++i) {
			
			for (int j = 0; j < stores.length; ++j) {
				
				System.out.printf("stores[%d][%d] : %s\n", i, j, stores[i][j]);
			}
		}
		
		
	}

}
