package �������̽�����;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// ����� ���
		// ����Ƚ�� üũ,

		Scanner sc = new Scanner(System.in);
		int count = 5; // ���� Ƚ��
		int life = 3; // �����ȸ Ƚ��
		int success = 0; // ���� ī��Ʈ

		// GameDummy p1 = new GameDummy(); // �ӽ��׽�Ʈ��
		PlusGame p1 = new PlusGame(); // ���� �ڵ�� �����

		p1.makeRandom();
		p1.getQuizMsg();
		p1.checkAnswer(0); // t,f ���������ؼ� ��������� ����üũ

		System.out.println("��Ģ���� ������ �����մϴ�. ");

		while (true) {

			// �� �Է�
			System.out.println(p1.getQuizMsg());
			System.out.print("��Ģ���� ���� �����Ͽ� �Է��ϼ��� : ");
			int input = sc.nextInt();

			if (p1.checkAnswer(input) == false) { // ����üũ false �� 3�� ī��Ʈ
				System.out.println("���� Ʋ�Ƚ��ϴ�.");
				life--;

				if (life == 0) { // 3ȸ ���н� ����������
					count--;
					life = 3;
					System.out.println("���� ������ �Ѿ�ϴ�.");
					p1.makeRandom();

				}
			} else {
				System.out.println("������ ���߼̽��ϴ�! ");
				System.out.println("���� ������ �Ѿ�ϴ�.");
				p1.makeRandom();
				life = 3;
				count--;
				success++;
			}
			if (count == 0) {
				System.out.println("5������ �� Ǫ�̽��ϴ�.");
				System.out.println(success + "������ ���߼̽��ϴ�.");

				System.out.println("��Ģ���� ������ �����մϴ�. ");
				break;
			}
		}
		sc.close();
	}
}
