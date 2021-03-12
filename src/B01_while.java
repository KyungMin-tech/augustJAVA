import java.util.Scanner;

public class B01_while {
	
	public static void main(String[] args) {
		
		// while
		//	- for���� ������ �ణ �ٸ� �ݺ���
		//	- �ʱⰪ�� �������� ��ġ�� ������ ���� �ʴ�
		//	- �������� ��ġ�� ���� �ݺ����� ����� �޶��� �� �ִ�
		
		
		// # ���� �⺻���� ������ while��
		int i =0;
		
		while (i < 10) { /* ��ȣ ���� ������ ���϶� ��� ����, ()�ȿ� ++i�� �� ���� �ʴ´� */ 
			System.out.println("Hello while! " + i);
			++i;
		}
		
		
		// # for���� while�� �Ȱ��� �� �� ������ ���⿡ �������ϴ�
		i = 0;
		for (; i++ < 10; ) {
			System.out.println("Hello for! " + i);
		}
		
		
		// # while���� continue�� ���� ���ѷ����� ������ �ʵ��� 
		//	���� �ؾ��Ѵ�	
		
		// ex> continue�� �̿��� ¦���� ����غ��� ���� ���
		i = 0;
		while (i++ < 100) { /* ���� ��ġ�� �޶����� ��ƾ���� ���ѷ��� ������ �ִ�, ��ƾ�� ������ ���� �ʴ� ()�� */
			if (i % 2 == 1)
				continue;
			
			System.out.println("¦�� : " + i);
			// ++i; // �̰��� �������� ��ġ�ϸ�
					// continue������ ���ѷ����� ������ �ȴ�
		}
		
		// # while���� ���ѷ���
		i = 0;
		while(true) {
			System.out.println(i += 5000);
			
			if (i == 50000) // ���ѷ����϶� �������ð� �ʿ�
				break;
		}
		
		// # while���� ���ǿ� ���Կ����� �̿��ϱ�
		Scanner sc = new Scanner(System.in);
		String word = null;
		
//		System.out.println("�ܾ �Է����ּ���! ");
//		while(!(word = sc.nextLine()).equals("exit")) {
//			System.out.println("�Է��� �ܾ� : " + word);
//		}
			
//		while (true) {
//			word = sc.nextLine();
//			System.out.println("�ܾ �Է����ּ���! ");
//			
//			if (word.equals("exit"))
//				break;
//			else
//				System.out.println("�Է��� �ܾ� : " + word);			
			
		
		// while������ ����ϰԲ� ����� Ŭ����/ �޼������ �ִ�
		//	- hasNext, next, hasNextElement.. ����
		//	   �̸��� ���� ���� ���� ã�� �޼��带 ����Ѵ�
		//	- �������� ������ ���� ���� �ϳ��� ������ ������� ����Ѵ�
		//	- ��ǥ���� ���δ� ��ĳ�ʰ� �ִ�
		
		Scanner sc2 = new Scanner(System.in);
		
		System.out.println("���ڸ� ������ �Է��غ�����! ");
		
		
		// hasNextInt() 
		//	- ��⿭(����)�� �������� �����̸� true
		//	- ��⿭�� �ƹ��͵� �������� ������ �Է��� ��ٸ���
		while (sc2.hasNextInt()) {
			System.out.println("���� ���ڰ� ������ nextInt()�� �ϳ��� ������" + sc2.nextInt());
		}
		System.out.println("�ݺ����� Ż���߽��ϴ�!");
		System.out.println("�����ִ� ��⿭ ��� ��� : " + sc2.nextLine());
		
	}
	

}