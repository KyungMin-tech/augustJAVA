import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class D05_HashSet {

	// # Set
	// - ������ ������ ���� �ڷᱸ��
	// - �ߺ��� ������� �ʴ´�

	// # Hash
	// - � ���� �־��� �� ���� ������ �� ���� ���� �����Ǵ� �˰���
	// - ������ ������ ���� ���� ã�°��� �Ұ��ɿ� ������
	// - ������ �� ���� ���� �����ǹǷ� ������ �Ұ����ϴ�
	// - �����Ͱ� ������ ���� �ߺ� üũ�� ��� �˰��� �� ���� ������
	// - �ӵ��� ������ ���ȼ��� �پ �˰����̴�

	// abc -> ABCDEJJVJCVJBHCH...1231231
	// abc -> ABCDEJJVJCVJBHCH...1231231
	// abd -> FYCYWEVNININICYj...2321421

	// # Tree
	// - �����͸� �߰� �� �� �ùٸ� �ڸ��� �̸� ã�Ƽ� �߰��Ѵ�
	// - ������ �߰��� �����ɸ��� ��� ������ ������

	public static void main(String[] args) {
		// # HashSet
		// - Hash�� �̿��� �����س��� Set
		// - index�� ���� �ߺ��� ������� �ʴ´�
		// - ������ �Ұ��������� ������ ������ �ٸ� �˰��򺸴� ������
		HashSet<String> animals = new HashSet<>();

		// Set.add(item)
		animals.add("cat");
		animals.add("dog");
		animals.add("pig");
		animals.add("snake");
		animals.add("cat");
		animals.add("cat");
		animals.add("cat");

		// ���� �־��� ������� ������ �ʴ´� (Hash�� Ư¡)
		System.out.println(animals);

		// Set.comtains(value)
		System.out.println("horse�� �ֳ��� ?" + animals.contains("horse"));
		System.out.println("cat�� �ֳ��� ?" + animals.contains("cat"));

		// Set.size()
		System.out.println(animals.size());

		// Set.remove(value)
		System.out.println("���� ��������" + animals.remove("horse"));
		System.out.println("���� ��������" + animals.remove("cat"));
		System.out.println(animals);

		// Set�� index�� ���� ������ �ϳ��� ���� �� �� ����
		for (String animal : animals) {
			System.out.println(animals);

			// # List�� Set�� Collection�迭�̱� ������ ��ȯ�� �����Ӵ�

			// Set���� ArrayList����
			ArrayList<String> animal_list = new ArrayList<>(animals);

			System.out.println("lis.get(0) : " + animal_list.get(0));
			System.out.println("lis.get(1) : " + animal_list.get(1));
			System.out.println("lis.get(2) : " + animal_list.get(2));

			// List�� HashSet���� (�ߺ��� �ս��� ���ŵȴ�)
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

			// ArrayList�� �پ��� ���·� ��ĳ������ �����ϴ�
			// �ַ� �Ű��������� �䱸�ϴ� Ÿ������ ��ȯ�ϰ� �ȴ�
			Collection<String> cllection01 = cars;
			List<String> list01 = cars;
			AbstractCollection<String> ab_col01 = cars;
			AbstractList<String> ab_list01 = cars;
			
			// # Collection.addAll(Collection) 
			//	- �ٸ� �÷����� ��� ���� �߰��Ѵ�			
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
			System.out.println("addAll�� �߰��� �� : " + even);
			
			
			// # Collection.removeAll(Collection)
			//	- �ٸ� �÷����� ���� ��ġ�ϴ� ��� ���� �����Ѵ�
			System.out.println(even.removeAll(odd));
			System.out.println("removeAll�� ������ �� : " + even);
			
			// # Collection.retrainAll(Collection)
			//	- �ٸ� �÷����� ���� ��ġ�ϴ� ���� �����
			System.out.println(even.addAll(odd));
			System.out.println(even.retainAll(odd));
			System.out.println("Ȧ���� ���� �� Ȧ����retainAll : " + even);

		}

	}

}
