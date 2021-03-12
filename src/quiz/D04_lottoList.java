package quiz;

import java.util.ArrayList;

public class D04_lottoList {

	// 1 ~ 45������ �ߺ����� ���� ���� 6���� ArrayList�� �߰��غ����� 
	// �� Hint. ArrayList.contains(value)
	
	public static void main(String[] args) {
		ArrayList<Integer> lotto = new ArrayList<>();
		
		// ���̰� 6�� �ɶ������� �ݺ��Ѵ�
		while (lotto.size() != 6) {
			int ran = (int)(Math.random() * 45 + 1);
			
			// �����ϰ� ���� �������� �߰��ϵ��� �Ѵ�
			if (!lotto.contains(ran))
				lotto.add(ran);			
		}
		
		System.out.println(lotto);
	}
	
}