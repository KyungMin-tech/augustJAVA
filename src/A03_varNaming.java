
public class A03_varNaming {

	public static void main(String[] args) {

		// # ������ ����ؾ� �ϴ� ����
		// 1. ���� �ѹ��� ������ �� �ִ� (2�� �̻� ���� ���� ������ ����ϴ� ���� ����)
		// 2. ���� �ǹ̸� �ο��� �� �ִ� (������ �̸��� �� ���°��� �ſ� �߿��ϴ�)

		int price = 8000;

		System.out.println("������" + price + "���Դϴ�");
		System.out.println("������" + 8000 + "���Դϴ�");
		
		int apple_num = 13;     // ����� ����
		int apple_price = 478; // ��� �� ���� ����
		int apple_cal = 52;    // ��� �� ���� Į�θ�
		
		System.out.println("����� ���� : " + apple_num);
		System.out.println("�� ���� : " + apple_price * apple_num + "��");
		System.out.println("�� Į�θ� : " + apple_cal * apple_num + "kcal");
		
		/*
		   # ����Ǵ� ���� �۸� ��Ģ (�����ڵ��� ��ȭ)
		   
		   (1) snke_case (�� ǥ���)
		       - �� �ܾ� �̻��� �̾���� �������� ����� �� _�� Ȱ���Ѵ�
		       - apple_cal, minsu_eng_score, user_password
		       - C/C++ ��Ÿ��
		       
		   (2) camelCase (��Ÿ ǥ���)
		       - �� �ܾ� �̻��� �̾���� �������� ����� �� �빮�ڸ� Ȱ���Ѵ�
		       - appleNum, appleCal, userName, userProfile
		       
		   (3) ������ ù ���ڴ� �ҹ��ڸ� ����Ѵ� (Ŭ������ ù ���ڴ� �빮�ڸ� ����Ѵ�)
		   
		   (4) ���� ������ ���� ����(���)�� �̸��� ��� �빮�ڸ� ����Ѵ�
		       - MAX_SCORE = 100, PI
		       
		   (5) ������ ���� � ������  ������ �� �ִ� �ܾ ����ϴ� ���� ����
		   
		   # �ʼ����� ������ �۸� ��Ģ (�� ��Ű�� ������ ���� �߻�)
		   
		   (1) ������ ù ���ڴ� ���ڰ� �� �� ����
		       ex> 1st, 2nd 4pple
		       
		   (2) ���� ���̿��� ������ ����� �� ����
		   
		   (3) Ư�� ���ڴ� _�� $�� ����� �� �ִ�
		   		ex> @pple, b@nana, #id
		   
		   (4) �̹� �ڹٿ��� ���������� ����ϰ� �ִ� �ܾ��(�����)�� 
				���������� ����� �� ����
				ex> public, static, void, int
		 */
		 
	}

}