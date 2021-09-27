package �������̽�����;

import java.util.Random;

public class PlusGame implements IGame {
	
	//�˰��� �����

	private Random ran;
	private int num1;
	private int num2;

	@Override
	public void makeRandom() {
		// ������ ���� �����ؼ� �ʵ忡 �ִ� num1,num2�� �ֱ�
		ran = new Random();
		num1 = ran.nextInt(9) + 1;
		num2 = ran.nextInt(9) + 1;
	}

	@Override
	public String getQuizMsg() {
		// num1�� num2�� ������ �ͼ� ���� ���� -> ���ڿ� ���·� �ǵ����ֱ�
		// 2+4=
		//String result = num1 + "+" + num2 + "=";
		//return result;
		return num1 + "+" + num2 + "="; // �ٷγ־��ֱ�

	}

	@Override
	public boolean checkAnswer(int answer) {
		// num1 + num2 == answer
		//if (num1 + num2 == answer) {
		//	return true;
		//} else {
		//	return false;
		//}
		
		
		return num1+num2 == answer; //�񱳿����ڴ� ��������� boolean�� �ǵ����ش�
	}

}
