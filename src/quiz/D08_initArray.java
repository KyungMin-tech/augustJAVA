package quiz;

import java.util.Arrays;

public class D08_initArray {

	// 다음 소스에 알맞은 예외처리를 추가해 프로그램이 잘 실행되도록 만들어 보세요

	public static void main(String[] args) {

		int[] numArr = new int[20];
		
		try {
			for (int i = 0; true; ++i) {
				numArr[i] = i;			
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println(Arrays.toString(numArr));
			
		}		
	}

}
