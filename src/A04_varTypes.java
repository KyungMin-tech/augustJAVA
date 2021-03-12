
public class A04_varTypes {
	
	
	public static void main(String[] args) {
		
		/*
		  # �ڹ��� ���� Ÿ�Ե�
		 
		  (1) ������
		  - Ÿ�Ը��� ũ�Ⱑ �ٸ���, ������ �� �ִ� ���� ������ �ٸ���
		  - ������� 0�� ���ԵǱ� ������ ��Ÿ�� �� �ִ� ���ڰ� �������� �� �� ����
		      byte  (1byte)    -128(2^7) ~ +127(2^7-1)		    
		      short (2byte)    -32768(2^15) ~ +32767(2^15-1)
		      char  (2byte)    0 ~ 65535
		                  �� charŸ���� ù ��° ��Ʈ�� ��ȣ ������ ���� �ʴ� ���� Ÿ���̴�		                  
		      int   (4byte)    -21.5��(2^31) ~ +21.5��7(2^31-1)	*�⺻��*
		      long  (8byte)    -(2^63) ~ +(2^63-1)
		 */
		byte _byte_max = 127;
		byte _byte_min = -128;
		
		short _short_max = 32767;
		short _short_min = -32768;
		
		// char�� ���ڸ� �����ϱ� ���� ����  Ÿ���̴�
		// ���� Ÿ�� �����ʹ� ���������δ� ������ ����ȴ�
		// ����� ���� �������� �ش��ϴ� ���ڸ� ����Ѵ�
		char _char_max = 65535;
		char _char_min = 0;
		
		// ''�� ����ϴ� ���� Ÿ�� ���� ��ǻ�Ϳ��Դ� ���������� ������ �νĵȴ�
		// ������, ""�� ����ϴ� ���ڿ��� ������ �ƴϴ�
		char ch1 = 'A';
		char ch2 = 66;
		char ch3 = 'C';
		
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(ch3);
		
		// ū ���ڸ� ǥ���Ҷ� ���� ���� _�� ���� �ڸ����� ǥ���� �� �ִ�
		int _int_max = 21_4000_0000;
		int _int_min = -21_4000_0000;
		
		// �ڹ� ���� Ÿ���� �⺻Ÿ���� intŸ���̴�.
		// longŸ�� ������ ����� ������ ǥ���ϱ� ���ؼ��� �ڿ� L(l)�� �ٿ��� �Ѵ�.
		long _long = 221_4000_0000L;
				
		/*  
		  (2) �Ǽ���
		  	- �����ϰ� ������ ���� ����� �ʿ��� �о߿� ���ȴ�
		  	- �ε��Ҽ��� ����� ����Ѵ�
		  	
		  	float	(4byte)
		  	double	(8byte)		*�⺻��*
		*/  		  
		
		// �ڹ� �Ǽ����� �⺻Ÿ���� doubleŸ�� ���̴�.
		// floatŸ�� ������ ���� �����ϱ� ���ؼ��� �ڿ� F(f)��
		// �ٿ���  float������ �����ؾ��Ѵ�
		float _float = 123.123F;
		double _double = 123.123;		
		
		
		/*  
		  (3) �� / ������ (boolean)
		  	- true, false �� ������ ���� ������ �ִ� Ÿ��
		  	- ���� ������ ��Ÿ�� �� ���ȴ�		  	
		*/
		boolean like = true;
		boolean under18 = false;
		boolean over130cm = true;
		
		System.out.println("���ƿ並 ��������?" + like);
		System.out.println("18�� �̸��ΰ���?" + under18);
		System.out.println("130cm �̻��ΰ���?" + over130cm);
		
		/*  
		  (4) ������ (Ŭ���� Ÿ��)
		  	-String : ���ڿ� Ÿ��
		  	- �빮�ڷ� �����ϴ� ��� Ÿ�Ե��� ������ Ÿ���̴�
		  	- (1), (2), (3)ó�� �ҹ��ڷ� �����ϴ� Ÿ�Ե��� �⺻�� Ÿ���̴�
		*/ 
		String welcomeMessage = "�������!";
		String byeMessage = "�ȳ���������~";
		
		System.out.println(welcomeMessage);
		System.out.println(byeMessage);
		
		
	}

}