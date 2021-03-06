package quiz;

import java.util.ArrayList;

public class D04_lottoList {

	// 1 ~ 45까지의 중복없는 랜덤 숫자 6개를 ArrayList에 추가해보세요 
	// ※ Hint. ArrayList.contains(value)
	
	public static void main(String[] args) {
		ArrayList<Integer> lotto = new ArrayList<>();
		
		// 길이가 6이 될때까지만 반복한다
		while (lotto.size() != 6) {
			int ran = (int)(Math.random() * 45 + 1);
			
			// 포함하고 있지 않을때만 추가하도록 한다
			if (!lotto.contains(ran))
				lotto.add(ran);			
		}
		
		System.out.println(lotto);
	}
	
}
