import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class D07_sort {

	// # ����
	//	- Arrays.sort() : ������ �迭�� ������������ �������ش�
	//	- Collections.sort() : ������ �÷����� ������������ �������ش�
	
	public static void main(String[] args) {
		
		String[] animals = {"wolf", "cat", "cow", "cobra", "zibra", "dog"};
		
		// �� ���� �� ����
		Arrays.sort(animals);
		
		System.out.println(Arrays.toString(animals));
		
		
		ArrayList<String> fruits = new ArrayList<>();
		
		fruits.add("apple");
		fruits.add("banana");
		fruits.add("apple");
		fruits.add("kiwi");
		fruits.add("banana");
		fruits.add("apple");
		fruits.add("banana");	
	
		Collections.sort(fruits);	
		System.out.println(fruits);
		
		
		// ���� �迭
		Grape[] grapes = new Grape[5];
		
		grapes[0] = new Grape('A', 10, "KR", 35);
		grapes[1] = new Grape('D', 9, "CH", 40);
		grapes[2] = new Grape('B', 9, "JP", 38);
		grapes[3] = new Grape('D', 7, "US", 29);
		grapes[4] = new Grape('B', 6, "EU", 39);
		
		// �� ������ ���� �񱳰� �Ұ����� ��ü�̱� ������ ������ �߻��ϰ� �ȴ�
		//	 (�츮�� ���� ������ �� ������ �������� �ʾҴ�)
		Arrays.sort(grapes);	
		System.out.println(Arrays.toString(grapes));
		
		// ��ü�� ������ �� ���� ��� ���ϴ� Comparator�� ����� ������ ���� �ִ�
		Arrays.sort(grapes, new �����з���_���());
		System.out.println(Arrays.toString(grapes));
		
		// Comparator�� �ٷ� �����ؼ� ����� ���� �ִ�
		Arrays.sort(grapes, new Comparator<Grape>() {
			@Override
			public int compare(Grape g1, Grape g2) {
				return g2.grade - g1.grade;
			}			
		});
		System.out.println(Arrays.toString(grapes));
		
		// String�ʵ� �������� �����ϰ� ���� ��쿡�� String�� compareTo()�� ����Ѵ�
		Arrays.sort(grapes, new Comparator<Grape>() {
			@Override
			public int compare(Grape g1, Grape g2) {
				// compare����� -1�� ���ϸ� ��������/���������� ������ �� �ִ�
				return g1.madein.compareTo(g2.madein) * -1;
			}			
		});
		System.out.println(Arrays.toString(grapes));
		
	}
	
	
}

class �����з���_��� implements Comparator<Grape> {

	@Override
	public int compare(Grape g1, Grape g2) {	
		return g1.grade - g2.grade;
	}
	
}

// Comparable �������̽��� ������ ��ü�� �񱳰����� ��ü�� �ȴ�
class Grape implements Comparable<Grape> {
	char grade;	// ���
	int sweet;	// �絵
	String madein; // ������ 
	int berry;  // ���� �˸��� ��	
	
	public Grape(char grade, int sweet, String madein, int berry) {
		this.grade = grade;
		this.sweet = sweet;
		this.madein = madein;
		this.berry = berry;
	}

	// compareTo() : �� ��ü�� ũ�� �� ������ ������ �� �ִ� 
	@Override
	public int compareTo(Grape o) {
		// ���� ��ü�� �Ű� ������ ���޵Ǵ� ���� ��ü�� ���ϴ� ���� ���ؾ� �� 
		//	- ����� �����ϸ� ���� ��ü�� ���� ��ü���� �� ū ���̴�
		//	- ������ �����ϸ� ���� ��ü�� ���� ��ü���� �� ū ���̴�
		//	- 0�� �����ϸ� �� ��ü�� ���� ũ��� �ν��Ѵ�
		
		// ���� ��ü�� �˸��� ������ ���� ��ü�� �˸��� ������ ���� ũ�⸦ ���ϵ��� ����
//		if (this.berry > o.berry) 
//			return 1;
//		else if (this.berry < o.berry) 
//			return -1;
//		else 
//			return 0;
		
		// # berry ���� ��������
		// return this.berry - o.berry;
		
		// # berry ���� ��������
		// return o.berry - this.berry;
				
		// # �絵 ���� ���������� ���� �غ�����
		return o.sweet - this.sweet;
	}
	
	@Override
	public String toString() {	
		return String.format("%c/%d/%s/%d", 
				grade, sweet, madein, berry);
	}
}
















