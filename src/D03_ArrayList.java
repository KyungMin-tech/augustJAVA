import java.util.ArrayList;

// Ctrl + Shift + o

public class D03_ArrayList {
	
	// JAVA Collections
	//	- 자바에서 기본적으로 제공하는 자료구조 인터페이스
	//	- Collections 인터페이스를 구현한 클래스로는 List와 Set이 있다
	//	※ 인터페이스를 상속보다는 구현이라는 표현을 많이 사용한다
	
	// # ArrayList
	//	- 크기가 자동으로 조절되는 배열과 유사한 클래스
	//	- 배열과 다르게 크기가 고정적이지 않고 길이가 늘어나거나 줄어들 수 있다
	//	- 배열과 유사한 형태이기 때문에 순차적으로 데이터에 접근할 때 가장 유리하다
	
	public static void main(String[] args) {
		// java.util 패키지에 들어있다
		ArrayList list = new ArrayList();
		
		// ArrayList.add(item) : 원하는 데이터를 리스트의 맨 뒤에 추가한다
		list.add("홍길동");
		list.add("임꺽정");
		list.add("정발산");
		list.add("산기슭");
		
		System.out.println(list);
		
		// ArrayList.add(index, item) : 원하는 위치에 데이터를 추가한다
		list.add(0, "맨앞에 추가");
		list.add(3, "중간에 추가");
		
		System.out.println(list);
		
		// 기본적으로 모든 타입의 데이터를 추가 할 수 있다
		list.add(99.999);
		list.add('A');
		list.add(100);
		
		System.out.println(list);
		
		// # Object 타입
		//	- 모든 타입의 부모
		//	- JAVA에 모든 타입은 Object클래스의 자식이가
		//	- 모든타입은 Object타입으로 업캐스팅 될 수 있다
		
		// ※ 직접 만든 클래스도 Object의 자식이기 때문에 list에 추가가 가능하다
		list.add(new myobj.cookie.BraveCookie());
		list.add(new myobj.person.Police("김순경", 30));
		
		System.out.println(list);
		
		// ArrayList.get(index) : 원하는 데이털흘 하나 꺼낸다
		// ArrayList.size() : 현재 리스트의 크기를 변환한다
		//					   인덱스는 Size -1번까지 존재한다
		for (int i = 0; i < list.size(); ++i)
			System.out.printf("get(%d)" + list.get(i) + "\n", i);
		
		// ArrayList.remove(item) : 해당 데이터를 삭제한다, 삭제된느 값을 꺼낸다
		// ArrayList.remove(index) : 해당 번째 데이터를 삭제한다
		System.out.println("0번째 데이터를 삭제하면서 동시에 사용한다 : " + list.remove(0));
		
		System.out.println("삭제 성공 여부 : " + list.remove("홍길동"));
		System.out.println("삭제 성공 여부 : " + list.remove("김길동"));
		
		// list에 저장된 데이터는 Object타입으로 업캐스팅된 상태이기 때문에 
		// 꺼내서 사용할때는 다운캐스팅이 필요하다
		
		// # index를 뒤에서 부터 접근할때는 길이를 통해 접근하면 좋다
		Object obj1 = list.get(list.size() - 1);
		Object obj2 = list.get(list.size() - 2);
		
		
		// # 리스트에 들어있던 데이터를 다시 사용할 때 다운 캐스팅을 해야한다 (불편함)
		((myobj.person.Police)obj1).introduce();
		((myobj.cookie.Cookie)obj2).special();
		
		
		// # 리스트와 반복문
		for (int i = 0; i < list.size(); ++i) {
			System.out.println("index : " + list.get(i));
		}
		
		// ※ 리스트로도 배열과 마찬가지로 forEach를 사용할 수 있다
		for (Object item : list) {
			
			// 반복문과 함께 사용할 때도 해당 인스턴지스인지 구분한 후 다운캐스팅이 필요 (불편함) 
			if (item instanceof myobj.person.Police) {
				((myobj.person.Police) item).arrest("김범죄");
			}
			System.out.println("forEach " + item);
		}
		
	}

}
