package 인터페이스예제;

import java.util.Random;

public class PlusGame implements IGame {
	
	//알고리즘 담당자

	private Random ran;
	private int num1;
	private int num2;

	@Override
	public void makeRandom() {
		// 랜덤한 수를 생성해서 필드에 있는 num1,num2에 넣기
		ran = new Random();
		num1 = ran.nextInt(9) + 1;
		num2 = ran.nextInt(9) + 1;
	}

	@Override
	public String getQuizMsg() {
		// num1과 num2를 가지고 와서 퀴즈 생성 -> 문자열 형태로 되돌려주기
		// 2+4=
		//String result = num1 + "+" + num2 + "=";
		//return result;
		return num1 + "+" + num2 + "="; // 바로넣어주기

	}

	@Override
	public boolean checkAnswer(int answer) {
		// num1 + num2 == answer
		//if (num1 + num2 == answer) {
		//	return true;
		//} else {
		//	return false;
		//}
		
		
		return num1+num2 == answer; //비교연산자는 결과값으로 boolean을 되돌려준다
	}

}
