package quiz;

import java.util.Arrays;

public class D08_initArray {

	// ���� �ҽ��� �˸��� ����ó���� �߰��� ���α׷��� �� ����ǵ��� ����� ������

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
