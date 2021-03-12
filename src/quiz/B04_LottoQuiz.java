package quiz;

import java.util.Random;
import java.util.Arrays;

public class B04_LottoQuiz {

	// int형 배열에 중복되지 않은 6개의 랜덤 숫자(1 ~45)를 저장하고 출력해보세요
	public static void main(String[] args) {
		Random seed = new Random();

		int[] lotto = new int[6];		
		
		for (int i = 0; i < lotto.length; ) {
			lotto[i] = seed.nextInt(45) +1;	
			
			boolean duple = false;			
			
			// i : 방금 뽑은 숫자의 인덱스
			// j : 방금 뽑은 숫자바로 전까지 반복할 인덱스
			for (int j = 0; j < i; ++j) {
				if (lotto[i] == lotto[j]) {
					duple = true;
					break; // break를 해주면 불 필요한  연산이 줄어든다
				}
			}
			
			if (!duple)
				++i;
		}
		
		// Arrays.toString() : 배열에 저장된 값을 보기 좋은 문자열로 변환하기
		System.out.println("정렬 전" + Arrays.toString(lotto));
		
		// Arrays.sort() : 배열을정렬할 수 있다
		// (단, 배열에 속한 값들이 키그 비교가 가능한 경우만)
		// 오름차순으로만
		Arrays.sort(lotto);
		
		System.out.println("정렬 후 : " + Arrays.toString(lotto));
		
		// ※ 문자열도 크기 비교가 가능하다 (ABC, 가나다순)
		String[] animals = {"코끼리", "사자", "쥐", "벼멸구", "가재"};
		Arrays.sort(animals);
		System.out.println(Arrays.toString(animals));
			
	}
}
