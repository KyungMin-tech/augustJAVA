
// �h�� �� .java������ ��ġ�� ��Ű�� : default (���� �з����� ���� ��)
// ������ ���� ���� �б����� �ٸ� ��Ű���� �ִٸ� �ݵ�� import�� ����ؾ� �Ѵ�

import myobj.Apple;

// ��Ű�� ���ο� �ִ� ��Ű���� �ִ� ���
// import myobj.vehicle.Subway; // ��ҹ��� ������ ����� ���� ������ ��Ű���� Ŭ������ �򰥸�
// import myobj.vehicle.Bus;

// *�� ����ϸ� �ش� ��Ű�� ������ ��� ũ������ import�ϰ� �ȴ�
import myobj.vehicle.*;

public class C06_import {
	
	//�� ��Ű���� import�� �̿��ϸ� �츮�� ������ ���� Ŭ�������� 
	//	����ϰ� �з��ϰ� ������ ����� �� �ִ�
	
	public static void main(String[] args) {
		
		// �ҽ��� ��ü���� ��Ȱ�Ͽ� ����� �� �ֱ� ������
		// ���� ���α׷����� �Բ� �۾��� �� �����ϴ�
		
		// ��  �ϳ��� ������ ���� ���α׷��Ӱ� �ǵ帮�� ���� ���� �ʴ� (�浹�� �߻��Ѵ�)		
		Subway sub01 = new Subway();
		Bus bus01 = new Bus();
		
		Apple apple01 = new Apple();
		
		// �ٸ� ��Ű���� �ڿ��� public�� ���� �ڿ����� ������ �� �ִ�
		apple01.color = 1;
		apple01.size  = 2;
		apple01.grade = 3;
		apple01.sweet = 4;
	}

}