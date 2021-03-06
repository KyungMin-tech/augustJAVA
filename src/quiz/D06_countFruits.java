package quiz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class D06_countFruits {

	// 다음 리스트를 이용해 각 과일이 몇 개 있는지를 기록하고 있는 Map을 생성해보세요

	static List<String> fruits = new ArrayList<>();

	static {
		fruits.add("사과");
		fruits.add("사과");
		fruits.add("사과");
		fruits.add("사과");
		fruits.add("바나나");
		fruits.add("바나나");
		fruits.add("바나나");
		fruits.add("딸기");
		fruits.add("포도");
		fruits.add("포도");
		fruits.add("포도");
		fruits.add("복숭아");

	}

	public static void main(String[] args) {

		Map<String, Integer> fruit_count = new HashMap<>();

		for (String fruit : fruits) {

			// 과일이 처음 추가될 때를 알아낼 수 있다
			if (!fruit_count.containsKey(fruit)) {
				// 리스트에서 처음 등장한 과일이라면 맵에 새로 등록하고 개수를 1로 초기화한다
				fruit_count.put(fruit, 1);
			} else {
				// 이미 추가되어있는 과일은 맵에 등록된 개수를 1증가시킨다
				int count = fruit_count.get(fruit);
				fruit_count.put(fruit, count + 1);
			}
		}

		System.out.println(fruit_count);
	}

}
