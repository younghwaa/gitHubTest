package �������̽�����;

import java.util.Scanner;

public class MainTR {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// GameDummy p1 = new GameDummy(); // ->�ӽ��׽�Ʈ �뵵
		PlusGame p1 = new PlusGame();

		int count = 0; // ������ ������ üũ�ϴ� ����.

		// 1.�� �ټ������� ����
		for (int i = 0; i < 5; i++) {
			// 2.���� �����ϴ� ���
			p1.makeRandom();
			// 3.�������
			for (int j = 0; j < 3; j++) {
				System.out.print(p1.getQuizMsg());
				int answer = sc.nextInt();

				// 4.�� ������ ������ ������ �ִ� ��ȸ�� 3��
				if (p1.checkAnswer(answer)) {
					// ������ ������.
					System.out.println("�����Դϴ�!");
					count++;
					break;
				} else {
					// ������ ������ ���ߴ�.
					System.out.println("�����Դϴ�!");

				}
			}

		}
		// 5.���� ���� Ƚ���� ���
		System.out.println("���� ������ ������" + count + "�Դϴ�.");

		sc.close();
	}

}
