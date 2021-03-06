import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class D07_sort {

	// # 정렬
	//	- Arrays.sort() : 전달한 배열을 오름차순으로 정렬해준다
	//	- Collections.sort() : 전달한 컬렉션을 오름차순으로 정렬해준다
	
	public static void main(String[] args) {
		
		String[] animals = {"wolf", "cat", "cow", "cobra", "zibra", "dog"};
		
		// ※ 리턴 값 없음
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
		
		
		// 포도 배열
		Grape[] grapes = new Grape[5];
		
		grapes[0] = new Grape('A', 10, "KR", 35);
		grapes[1] = new Grape('D', 9, "CH", 40);
		grapes[2] = new Grape('B', 9, "JP", 38);
		grapes[3] = new Grape('D', 7, "US", 29);
		grapes[4] = new Grape('B', 6, "EU", 39);
		
		// ※ 포도는 현재 비교가 불가능한 객체이기 때문에 에러가 발생하게 된다
		//	 (우리가 아직 포도의 비교 기준을 정해주지 않았다)
		Arrays.sort(grapes);	
		System.out.println(Arrays.toString(grapes));
		
		// 객체에 정의한 비교 기준 대신 원하는 Comparator를 사용해 정렬할 수도 있다
		Arrays.sort(grapes, new 포도분류기_등급());
		System.out.println(Arrays.toString(grapes));
		
		// Comparator를 바로 생성해서 사용할 수도 있다
		Arrays.sort(grapes, new Comparator<Grape>() {
			@Override
			public int compare(Grape g1, Grape g2) {
				return g2.grade - g1.grade;
			}			
		});
		System.out.println(Arrays.toString(grapes));
		
		// String필드 기준으로 정렬하고 싶은 경우에는 String의 compareTo()를 사용한다
		Arrays.sort(grapes, new Comparator<Grape>() {
			@Override
			public int compare(Grape g1, Grape g2) {
				// compare결과에 -1을 곱하면 오름차순/내림차순을 뒤집을 수 있다
				return g1.madein.compareTo(g2.madein) * -1;
			}			
		});
		System.out.println(Arrays.toString(grapes));
		
	}
	
	
}

class 포도분류기_등급 implements Comparator<Grape> {

	@Override
	public int compare(Grape g1, Grape g2) {	
		return g1.grade - g2.grade;
	}
	
}

// Comparable 인터페이스를 구현한 객체는 비교가능한 객체가 된다
class Grape implements Comparable<Grape> {
	char grade;	// 등급
	int sweet;	// 당도
	String madein; // 원산지 
	int berry;  // 포도 알맹이 수	
	
	public Grape(char grade, int sweet, String madein, int berry) {
		this.grade = grade;
		this.sweet = sweet;
		this.madein = madein;
		this.berry = berry;
	}

	// compareTo() : 이 객체의 크기 비교 기준을 정의할 수 있다 
	@Override
	public int compareTo(Grape o) {
		// 현재 객체와 매개 변수로 전달되는 다음 객체의 원하는 값을 비교해야 함 
		//	- 양수를 리턴하면 현재 객체가 다음 객체보다 더 큰 것이다
		//	- 음수를 리턴하면 다음 객체가 현재 겍체보다 더 큰 것이다
		//	- 0을 리턴하면 두 객체를 같은 크기로 인식한다
		
		// 현재 객체의 알맹이 개수와 다음 객체의 알맹이 개수를 통해 크기를 비교하도록 정의
//		if (this.berry > o.berry) 
//			return 1;
//		else if (this.berry < o.berry) 
//			return -1;
//		else 
//			return 0;
		
		// # berry 기준 오름차순
		// return this.berry - o.berry;
		
		// # berry 기준 내림차순
		// return o.berry - this.berry;
				
		// # 당도 기준 내림차순을 정의 해보세요
		return o.sweet - this.sweet;
	}
	
	@Override
	public String toString() {	
		return String.format("%c/%d/%s/%d", 
				grade, sweet, madein, berry);
	}
}
















