package quiz;

public class B02_Gugudan {
	public static void main(String[] args) {
// 1. �������� ������ ���� ���η� ����غ�����

// 2��: 2X1=2 2X2=4 2x3=6 ...
// 3��: 3X1=3 3X2=6 3x3=9 ...
// ...

		for (int dan = 2; dan <= 9; ++dan) {
			// �� ���� ����
			System.out.printf("%d��: ", dan);
			for (int gop = 1; gop <= 9; ++gop) {
				System.out.printf("%dx%d=%-2d ", dan, gop, dan * gop);

			}
			System.out.println();
			// �� ���� ������

		}
		System.out.println();
// 2. �������� ������ ���� ���η� ����غ�����

// 2��		3�� 		4�� ...
// 2X1=2	3X1=3	4X1=4 ...
// 2X2=4	3X2=6	4X2=8 ...
// ...
		for (int dan = 2; dan <= 9; ++dan) {
			System.out.printf("%d�� \t", dan);
		}
		System.out.println();

		for (int gop = 1; gop <= 9; gop++) {
			for (int dan = 2; dan <= 9; dan++) {
				System.out.printf("%dX%d=%d\t", dan, gop, dan * gop);
			}
			System.out.println();
		}
		for (int line = 0; line < 12; ++line) {
			for (int dan = 2; dan <= 9; ++dan) {
				if (line == 0)
					System.out.printf("%d��\t\t", dan);
				else if (line == 1)
					System.out.print("��������������������������\t");
				else if (line == 11)
					System.out.print("��������������������������\t");
				else
					System.out.printf("��%d x %d = %-3d��\t", dan, line - 1, dan * (line - 1));
			}
			System.out.println();

		}

	}
}
