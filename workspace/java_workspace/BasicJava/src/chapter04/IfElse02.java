package chapter04;

import java.util.Scanner;

//public 

public class IfElse02 {

	public static void main(String[] args) {
		// 학점 계산 프로그램

		Scanner sc = new Scanner(System.in);
		int score = 0;
		// 파트1: 학생점수 입력받는 부분

		while (true) {

			while (true) {

				System.out.print("학생점수>>");
				score = sc.nextInt();

				if (score > 100 || score < 0) {
					System.out.println("0~100: 다시 입력");
					System.out.println("================");
				} else {
					break;// 0~100들어온 경우 반복문 빠져나감
				}
			}

			/*
			 * 중첩 if사용
			 * 
			 * if( ) { if() { } }
			 */

			// a+: 100-96 / a:95-90
			// b+: 89-96 / b:85-80
			// c+: 79-76 / c:75-70
			// d+: 69-66 /d: 65-60
			// 70점 이상 C등급
			// 60점 이상 D등급
			// 60점 미만 F등급
			// 파트2: 학점 등급 매기는 부분

			// int score = 0;
			String grade = ""; // 학점등급

			// System.out.print("학생점수>>");
			// score = sc.nextInt();

			if (score >= 90 && score <= 100) { // a+: 100-96 / a:95-90
				grade = "A";
				if (score >= 96) {
					grade = "A+";
				}
			}
				if (score >= 80 && score <= 89) { // b+: 89-86 / b:85-80
					grade = "B";
					if (score >= 86) {
						grade = "B+";
					}

				}
				if (score >= 70 && score <= 79) { // c+: 79-76 / c:75-70
					grade = "C";
					if (score >= 76) {
						grade = "c+";
					}

				}
				if (score >= 60 && score <= 69) { // d+: 69-66 /d: 65-60
					grade = "D";
					if (score >= 66) {
						grade = "D+";
					}

				}
				if (score < 60 && score >= 0) {
					grade = "F";

				} else {
			//		 System.out.println("0~100사이의 값을 입력해 주세요");
				}

				System.out.println("당신의 학점은" + grade + "입니다");
				System.out.println("================================");
				
		} // while
	}// 메인

}// 클래스
