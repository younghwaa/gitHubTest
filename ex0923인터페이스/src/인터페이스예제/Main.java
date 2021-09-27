package 인터페이스예제;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// 입출력 담당
		// 정답횟수 체크,

		Scanner sc = new Scanner(System.in);
		int count = 5; // 게임 횟수
		int life = 3; // 정답기회 횟수
		int success = 0; // 성공 카운트

		// GameDummy p1 = new GameDummy(); // 임시테스트용
		PlusGame p1 = new PlusGame(); // 팀원 코드로 덮어쓰기

		p1.makeRandom();
		p1.getQuizMsg();
		p1.checkAnswer(0); // t,f 난수생성해서 문제만들고 정답체크

		System.out.println("사칙연산 게임을 시작합니다. ");

		while (true) {

			// 답 입력
			System.out.println(p1.getQuizMsg());
			System.out.print("사칙연산 답을 예상하여 입력하세요 : ");
			int input = sc.nextInt();

			if (p1.checkAnswer(input) == false) { // 정답체크 false 시 3번 카운트
				System.out.println("답이 틀렸습니다.");
				life--;

				if (life == 0) { // 3회 실패시 다음문제로
					count--;
					life = 3;
					System.out.println("다음 문제로 넘어갑니다.");
					p1.makeRandom();

				}
			} else {
				System.out.println("정답을 맞추셨습니다! ");
				System.out.println("다음 문제로 넘어갑니다.");
				p1.makeRandom();
				life = 3;
				count--;
				success++;
			}
			if (count == 0) {
				System.out.println("5문제를 다 푸셨습니다.");
				System.out.println(success + "문제를 맞추셨습니다.");

				System.out.println("사칙연산 게임을 종료합니다. ");
				break;
			}
		}
		sc.close();
	}
}
