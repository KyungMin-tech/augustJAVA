import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class D05_HashSet {

	// # Set
	// - 집합을 구현해 놓은 자료구조
	// - 중복을 허용하지 않는다

	// # Hash
	// - 어떤 값을 넣었을 때 전혀 예측할 수 없는 값이 생성되는 알고리즘
	// - 생성된 값으로 원래 값을 찾는것이 불가능에 가깝다
	// - 예측할 수 없는 값이 생성되므로 정렬이 불가능하다
	// - 데이터가 많아질 수록 중복 체크는 모든 알고리즘 중 가장 빠르다
	// - 속도도 빠르고 보안성도 뛰어난 알고리즘이다

	// abc -> ABCDEJJVJCVJBHCH...1231231
	// abc -> ABCDEJJVJCVJBHCH...1231231
	// abd -> FYCYWEVNININICYj...2321421

	// # Tree
	// - 데이터를 추가 할 때 올바른 자리를 미리 찾아서 추가한다
	// - 데이터 추가시 오래걸리는 대신 정렬이 빠르다

	public static void main(String[] args) {
		// # HashSet
		// - Hash를 이용해 구현해놓은 Set
		// - index가 없고 중복을 허용하지 않는다
		// - 정렬이 불가능하지만 정렬이 가능한 다른 알고리즘보다 빠르다
		HashSet<String> animals = new HashSet<>();

		// Set.add(item)
		animals.add("cat");
		animals.add("dog");
		animals.add("pig");
		animals.add("snake");
		animals.add("cat");
		animals.add("cat");
		animals.add("cat");

		// 값이 넣었던 순서대로 나오지 않는다 (Hash의 특징)
		System.out.println(animals);

		// Set.comtains(value)
		System.out.println("horse가 있나요 ?" + animals.contains("horse"));
		System.out.println("cat가 있나요 ?" + animals.contains("cat"));

		// Set.size()
		System.out.println(animals.size());

		// Set.remove(value)
		System.out.println("삭제 성공여부" + animals.remove("horse"));
		System.out.println("삭제 성공여부" + animals.remove("cat"));
		System.out.println(animals);

		// Set은 index가 없기 때문에 하나만 꺼내 올 수 없다
		for (String animal : animals) {
			System.out.println(animals);

			// # List와 Set은 Collection계열이기 때문에 변환이 자유롭다

			// Set으로 ArrayList생성
			ArrayList<String> animal_list = new ArrayList<>(animals);

			System.out.println("lis.get(0) : " + animal_list.get(0));
			System.out.println("lis.get(1) : " + animal_list.get(1));
			System.out.println("lis.get(2) : " + animal_list.get(2));

			// List로 HashSet생성 (중복이 손쉽게 제거된다)
			ArrayList<String> cars = new ArrayList<>();

			cars.add("audi");
			cars.add("bmw");
			cars.add("benz");
			cars.add("volvo");
			cars.add("hyundai");
			cars.add("volvo");
			cars.add("volvo");

			System.out.println(cars);

			HashSet<String> car_set = new HashSet<>(cars);
			System.out.println(car_set);

			// ArrayList는 다양한 형태로 업캐스팅이 가능하다
			// 주로 매개변수에서 요구하는 타입으로 변환하게 된다
			Collection<String> cllection01 = cars;
			List<String> list01 = cars;
			AbstractCollection<String> ab_col01 = cars;
			AbstractList<String> ab_list01 = cars;
			
			// # Collection.addAll(Collection) 
			//	- 다른 컬렉션의 모든 값을 추가한다			
			List<Integer> even = new ArrayList<>();
			even.add(2);
			even.add(4);
			even.add(6);
			even.add(8);
			
			List<Integer> odd = new ArrayList<>();
			odd.add(1);
			odd.add(3);
			odd.add(5);
			odd.add(7);
			
			System.out.println(even);
			System.out.println(odd);
			
			System.out.println(even.addAll(odd));
			System.out.println("addAll을 추가한 후 : " + even);
			
			
			// # Collection.removeAll(Collection)
			//	- 다른 컬렉션의 값과 일치하는 모든 값을 제거한다
			System.out.println(even.removeAll(odd));
			System.out.println("removeAll로 제거한 후 : " + even);
			
			// # Collection.retrainAll(Collection)
			//	- 다른 컬렉션의 값과 일치하는 값만 남긴다
			System.out.println(even.addAll(odd));
			System.out.println(even.retainAll(odd));
			System.out.println("홀수를 더한 뒤 홀수의retainAll : " + even);

		}

	}

}
