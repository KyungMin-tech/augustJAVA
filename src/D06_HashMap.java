import java.util.HashMap;
import java.util.Map;

public class D06_HashMap {
	// Map
	// - (key: value, key: value)
	// - Key/Value가 한 세트를 이루는 자료구조
	// - 다른 언어 혹은 설정 파일에서 Key/Value 형태로 이루어진 데이터를 받을 때
	// - Java에서는 Map타입을 이용해 받게된다
	// - 값을 찾을 때 인덱스 대신 Key를 이용한다
	// - Key는 중복을 허용하지 않는다(같은Key에 값을 추가하면 덮어쓴다)
	// - Map은 컬랙션이 아니다

	public static void main(String[] args) {
		// Map은 Key와 Value의 제네릭을 모두 지정해서 사용한다
		Map<String, Object> info = new HashMap<>();

		// Map.put(k, v) : 키와 값을 추가한다
		info.put("이름", "홍길동");
		info.put("나이", 30);
		info.put("보유자산", 500000000000L);
		info.put("취미", new String[] { "영화", "음악", "게임", "드라마" });

		System.out.println(info);

		// Map.get(key) : 키로 값을 꺼낸다
		String[] hobbies = (String[]) info.get("취미");
		System.out.println(hobbies[2]);

		// Map.keySet() : 해당 Map의 모든 키를 가지고 있는 Set을 변환한다

		System.out.println(info.keySet());

		// 키셋을 이용해 모든 데이터에 접근할 수 있다
		for (String key : info.keySet())
			System.out.println(key + ": " + info.get(key));
		
		// Map.contains(key) : 맴에 해당 키가 존재하는 여부를 반환한다
		System.out.println(info.containsKey("보유자산"));
		System.out.println(info.containsKey("보유부동산"));
		
		// Map.containsValue(value) : 맴에 해당 값이 존재하는 여부를 반환한다
		System.out.println(info.containsValue("30"));
		System.out.println(info.containsValue(30));		
		
	}

}
