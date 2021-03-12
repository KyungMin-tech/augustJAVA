
public class C04_this {
	
	// this
	//	- ���� �ν��Ͻ� �ڱ��ڽ��� ���Ѵ�
	//	- �ν��Ͻ��� �������� �ʾҴٸ� �������� �ʴ´�
	public static void main(String[] args) {
		
		// � �ν��Ͻ��� ȣ���ߴ��Ŀ� ���� this�� ���� �ٸ��� �ۿ��ϰ� �ȴ�
		Peach peach01 = new Peach(3.0, "��糪��");
		Peach peach02 = new Peach(4.0, "ĥ��");
		Peach peach03 = new Peach(5.0, "�߱�");
		
		System.out.println(peach01.info());
		System.out.println(peach02.info());
		System.out.println(peach03.info());			
	}

}

class Peach {
	// �ν��Ͻ� ����
	double sweet;
	String made_in;
	
	public Peach() {
		sweet = 5.0;
		made_in = "�ð�";
	}
	
	// �Ű�����
	public Peach(double sweet, String made_in) {
		// �ν��Ͻ� ������ �Ű������� �̸��� �����ϴٸ�
		// �ν��Ͻ� ������ ������ ���� this�� ���� ��Ȯ�ϰ� �����ؾ� �Ѵ�		
		this.sweet = sweet;
		this.made_in = made_in;
	}
	
	public String info() {
		String sweet = "����ϰ� ���� ���� ��";
		String made_in = "����ϰ� ���� ���� ��";
		
		return String.format("[%f:%s]", this.sweet, this.made_in);
	}
}