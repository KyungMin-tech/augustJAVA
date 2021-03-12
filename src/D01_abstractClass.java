
import myobj.cookie.*;
import myobj.maple.*;

public class D01_abstractClass {

	// �߻� Ŭ���� (abstract class)
	//	- �߻� �޼��带 ������ �ִ� Ŭ���� 
	//	- �ν��Ͻ��� ������ �� ����
	
	// �߻� �޼��� (abstract method)
	//	- ������ �ƹ��͵� ���� �ʰ� ������� �޼��� 
	//	- �߻� Ŭ������ ��ӹ��� �ڽ� Ŭ�������� ������ �̷�� �޼���
	
	public static void main(String[] args) {
		// abstract class�� �ν��Ͻ��� ������ �� ������
		// ��� �ڽ� Ÿ���� �����ϴ� ���̽��� ������ ������ ���� �ִ�
		// Cookie cookie00 = new Cookie();			
		Cookie cookie01 = new AngelCookie();
		Cookie cookie02 = new PirateCookie();
		Cookie cookie03 = new BraveCookie();
		
		cookie01.levelUp();
		cookie01.levelUp();
		
		cookie02.levelUp();
		cookie02.levelUp();
		cookie02.levelUp();
		
		cookie01.special();		
		cookie02.special();
		cookie03.special();
		
		Job maple01 = new Archer("�ü�");
		Job maple02 = new Thief("����");
		Job maple03 = new Warrior("����");
		Job maple04 = new Wizard("������");
		
		maple01.generationVillage();
		maple02.generationVillage();
		maple03.generationVillage();
		maple04.generationVillage();
		
		
	}
}

// myobj�׿� ��Ű�� �ϳ� �����ϰ� �ϳ��� abstract Ŭ������
// �� Ŭ������ ��ӹ޾� ������ Ŭ�������� �����غ�����
// ex> Weapon - Sword, Knife, Gun



















