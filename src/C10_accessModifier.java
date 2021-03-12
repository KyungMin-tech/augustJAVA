
public class C10_accessModifier {
	
	// ���� ������ (���� ������)
	//	- �ٸ� Ŭ������ �� Ŭ������ �ڿ��� ����ҷ��� ���� �� �� ��� ���θ� �����Ѵ�
	//	- �ش� �ڿ��� ��� ���� �Ÿ��� Ŭ�������� ������ �� �ִ��� �����Ѵ�
	
	// # ������ �� �ִ� �Ÿ��� ����
	//	- ���� Ŭ���� ���� (���� ����� �Ÿ�)
	//	- ���� ��Ű�� ����
	//	- �ٸ� ��Ű�� (���� �� �Ÿ�)
	
	// # ������������ ����
	//	- Public : �ٸ� ��Ű�������� �����Ӱ� ������ �� �ִ� �ڿ��� �ȴ�
	//	- protected : ����� ���� ��ü�� �ٸ� ��Ű������ ������ �� �ִ�
	//				���� ��Ű�������� �����Ӱ� ������ �� �ִ�
	//	- �ƹ��͵� �Ⱦ� : �ٸ� ��Ű������ ������ �Ұ����ϴ�
	//				���� ��Ű�������� �����Ӱ� ������ �� �ִ�
	//	- private : ���� Ŭ���������� ������ �����ϴ�
	
	public static void main(String[] args) {
		C10_PublicClass instance01 = new C10_PublicClass();
		
		System.out.println(instance01.public_var);
		System.out.println(instance01.protected_var);
		System.out.println(instance01.default_var);
		// System.out.println(instance01.private_var);
		// System.out.println(instance01.not_existing_var);
		
		instance01.public_method();
		instance01.protected_method();
		instance01.default_method();
		// instance01.private_method();
		
		
		// ���� ��Ű���� �����ϴ� default class �� ���
		DefaultClass instance02 = new DefaultClass();
		
		System.out.println(instance02.public_var);
		System.out.println(instance02.protected_var);
		System.out.println(instance02.default_var);
		// System.out.println(instance01.private_var);
		
		// �ٸ� ��Ű���� public class�� �����ϴ� ���
		myobj.C10_PublicClass instance03 = new myobj.C10_PublicClass();
		
		// public�� ���� �ڿ��� ���̰� �ȴ�
		// �� Ŭ������ ����� �ٸ� ���α׷��ӵ鿡�� �����ְ� ���� �κθ� ������ �� �ִ�
		System.out.println(instance03.public_var);
		instance03.public_method();
		
		// �ٸ� ��Ű���� default class���� ������ �� ����
		// myobj.DefaultClass instance04 = new myobj.DefaultClass();
		
			
	}

}
