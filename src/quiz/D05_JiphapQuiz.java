package quiz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class D05_JiphapQuiz<T> {

	// 1. �� �÷����� �������� ���ϴ� �Լ��� �����غ�����
	private Set<T> union(Collection<T> A, Collection<T> B) {

		// ��Ĩ���� �����ص� Set�� �̸� �ϳ� �����صд�
		Set<T> union = new HashSet<>();

		// �Ű������� ���޹��� �� �÷����� Set�� �߰��� �� ����
		union.addAll(A);
		union.addAll(B);

		return union;
	}

	// 2. �� �÷����� �������� ���ϴ� �Լ��� �����غ�����
	private Set<T> inter(Collection<T> A, Collection<T> B) {
		Set<T> inter = new HashSet<>();
		
		inter.addAll(A);
		inter.retainAll(B);
		
		return inter;
	}

	// 3. �� �÷����� �������� ���ϴ� �Լ��� �����غ�����
	private Set<T> cha(Collection<T> A, Collection<T> B) {
		Set<T> cha = new HashSet<>();
		
		cha.addAll(A);
		cha.removeAll(B);
		
		return cha;
	}

	public static void main(String[] args) {
		
		D05_JiphapQuiz<String> instance01 = new D05_JiphapQuiz<>();

		List<String> A = new ArrayList<>();

		A.add("apple");
		A.add("banana");
		A.add("orange");		

		List<String> B = new ArrayList<>();

		B.add("orange");
		B.add("kiwi");
		B.add("cherry");
		
		System.out.println("A: " + A);
		System.out.println("B: " + B);
		
		System.out.println("A U B: " + instance01.union(A, B));
		System.out.println("A n B: " +instance01.inter(A, B));
		System.out.println("A - B: " + instance01.cha(A, B));
		
		// �ٸ� ���׸��� ����ϴ� �÷��ǵ� �ϳ��� Ŭ������ ����ϱ� ���ؼ�
		D05_JiphapQuiz<Integer> instance02 = new D05_JiphapQuiz<>();
		Set<Integer> groupA = new HashSet<>();
		Set<Integer> groupB = new HashSet<>();
		
		instance02.union(groupA, groupB);
		
		
 		
//		System.out.println("B - A: " +instance.cha(B, A));

		
	}
}
