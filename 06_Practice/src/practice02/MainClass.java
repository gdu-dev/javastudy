package practice02;

import java.security.SecureRandom;
import java.util.Scanner;

public class MainClass {

	// 문제1. 통장(balance)에 최초 5000원이 있다.
	// 1원부터 통장 잔고 사이의 난수를 발생시켜서 해당 난수만큼 출금 처리하시오.
	// 더 이상 출금이 불가능한 상황이면 출금을 멈추시오.
	// 예시)
	// 출금 전 5000원, 1회 출금액 2917원, 출금 후 2083원
	// 출금 전 2083원, 2회 출금액 1961원, 출금 후 122원
	// 출금 전 122원, 3회 출금액 102원, 출금 후 20원
	// 출금 전 20원, 4회 출금액 2원, 출금 후 18원
	// 출금 전 18원, 5회 출금액 17원, 출금 후 1원
	// 출금 전 1원, 6회 출금액 1원, 출금 후 0원
	public static void ex01() {
		int balance = 5000;  // 통장
		int count = 0;
		while(balance > 0) {
			count++;
			int withdraw = (int)(Math.random() * balance) + 1;
			System.out.println("출금 전 " + balance + "원, " + count + "회 출금액 " + withdraw + "원, 출금 후 " + (balance -= withdraw) + "원");
		}
	}
	
	// 문제2. UpDown 게임
	// 1 ~ 10000 사이의 난수를 발생시키고 해당 난수를 사용자가 맞히는 게임이다.
	// 입력마다 "Up!", "Down!" 메시지를 출력하시오.
	// 예시)
	// 입력 >>> 5000
	// Down!
	// 입력 >>> 2500
	// Up!
	// ...
	// 입력 >>> 4500
	// 정답. 총 5번만에 성공.
	public static void ex02() {
		Scanner sc = new Scanner(System.in);
		int target = (int)(Math.random() * 10000) + 1;
		int guess;
		int times = 0;
		do {
			System.out.print("입력 >>> ");
			guess = sc.nextInt();
			times++;
			if (guess < 1 || guess > 10000) {
				System.out.println("1~10000 사이만 유효합니다.");
				continue;
			}
			if (guess == target) {
				System.out.println("정답! 총 " + times + "번만에 성공.");
			} else if (guess > target) {
				System.out.println("Down!");
			} else {
				System.out.println("Up!");
			}
		} while(guess != target);
		sc.close();
	}
	
	// 문제3. 자동으로 진행되는 윷 던지기를 구현하시오. 윷이나 모가 나오면 추가로 던지시오.
	// 예시)
	// "도", 1칸 이동한다.
	// "개", 2칸 이동한다.
	// "걸", 3칸 이동한다.
	// "윷", "도", 5칸 이동한다.
	// "모", "윷", "도", 10칸 이동한다.
	public static void ex03() {
		String[] yut = {"", "도", "개", "걸", "윷", "모"};
		int totalMove = 0;
		while (true) {
			int move = (int)(Math.random() * 5) + 1;
			System.out.print("\"" + yut[move] + "\"");  // "도"~"모" 출력
			totalMove += move;
			if (move <= 3) {
				System.out.println(", " + totalMove + "칸 이동한다.");
				break;
			} else {
				System.out.print(", ");
			}
		}
	}
	
	// 문제4. 0~9 사이 난수를 100개 생성하시오.
	// 발생한 0~9 사이의 각 난수들이 생성된 횟수(빈도수)를 그래프화 하여 출력하시오.
	// 예시)
	// 0 : #### 4
	// 1 : ############ 12
	// 2 : ############ 12
	// 3 : ##### 5
	// 4 : ######## 8
	// 5 : ########### 11
	// 6 : ############ 12
	// 7 : ################## 18
	// 8 : ####### 7
	// 9 : ########### 11
	public static void ex04() {
		int[] arr = new int[100];
		int[] count = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 10);
			count[arr[i]]++;
		}
		for (int i = 0; i < count.length; i++) {
			StringBuilder sb = new StringBuilder();
			for (int j = 0; j < count[i]; j++) {
				sb.append("#");
			}
			String graph = sb.toString();
			System.out.println(i + " : " + graph + " " + count[i]);
		}
	}
	
	// 문제5. 간단한 성적 관리 프로그램을 구현하시오.
	// 학생은 3명, 과목은 3과목으로 가정한다.
	// 학생 이름 : "정숙", "미희", "상철"
	// 과목 이름 : "국어", "영어", "수학"
	// 입력 받은 성적과 각 성적의 합계를 함께 출력하시오.
	// 예시)
	// 정숙의 국어 점수 >>> 50
	// 정숙의 영어 점수 >>> 51
	// 정숙의 수학 점수 >>> 53
	// 미희의 국어 점수 >>> 60
	// 미희의 영어 점수 >>> 61
	// 미희의 수학 점수 >>> 63
	// 상철의 국어 점수 >>> 70
	// 상철의 영어 점수 >>> 71
	// 상철의 수학 점수 >>> 73
	//
	// 	    국어 영어 수학 총점	
	// 정숙 50   51   53   154	
	// 미희 60   61   63   184	
	// 상철 70   71   73   214	
	// 합계 180  183  189  552	
	public static void ex05() {
		Scanner sc = new Scanner(System.in);
		String[] name = {"정숙", "미희", "상철", "합계"};
		String[] course = {"국어", "영어", "수학", "총점"};
		int[][] score = new int[name.length][course.length];
		for (int i = 0; i < score.length - 1; i++) {
			for (int j = 0; j < score[i].length - 1; j++) {
				System.out.print(name[i] + "의 " + course[j] + " 점수 >>> ");
				score[i][j] = sc.nextInt();
				score[i][course.length - 1] += score[i][j];
				score[name.length - 1][j] += score[i][j];
				score[name.length - 1][course.length - 1] += score[i][j];
			}
		}
		System.out.print("\n\t");
		for (int i = 0; i < course.length; i++) {
			System.out.print(course[i] + "\t");
		}
		System.out.println();
		for (int i = 0; i < score.length; i++) {
			System.out.print(name[i] + "\t");
			for (int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j] + "\t");
			}
			System.out.println();
		}
		sc.close();
	}
	
	// 문제6. 4계절이 저장되어 있는 영한 사전(2차원 배열)을 이용하여 문제를 해결하시오.
	// 예시)
	// 봄을 영어로 하면? >>> spring
	// 정답
	// 여름을 영어로 하면? >>> sumer
	// 오답
	// 가을을 영어로 하면? >>> fall
	// 정답
	// 겨울을 영어로 하면? >>> win
	// 오답
	public static void ex06() {
		Scanner sc = new Scanner(System.in);
		String[][] dictionary = {
				{"봄", "spring"},
				{"여름", "summer"},
				{"가을", "fall"},
				{"겨울", "winter"}
		};
		for (int i = 0; i < dictionary.length; i++) {
			System.out.print(dictionary[i][0] + "을 영어로 하면? >>> ");
			String answer = sc.next();
			if (answer.equalsIgnoreCase(dictionary[i][1])) {
				System.out.println("정답");
			} else {
				System.out.println("오답");
			}
		}
		sc.close();
	}
	
	// 문제7. 다음 순서에 따라서 5 x 5 형태의 숫자 빙고판을 자동으로 생성하시오.
	// 지시사항)
	//   1. 1 ~ 25 사이 정수를 2차원 배열 bingo 에 순차적으로 넣는다.
	//   2. 섞는다.
	//        총 25번의 교환이 랜덤하게 발생된다.
	//        교환 예시)
	//        순서대로    <-> 임의로
	//        bingo[0][0] <-> bingo[1][4]
	//        bingo[0][1] <-> bingo[0][2]
	//        bingo[0][2] <-> bingo[2][1]
	//        ...
	//        bingo[4][4] <-> bingo[3][1]
	// 예시)
	//  10  9  4 25  2
	//  15  3 13 21  1
	//  14 20 11 19  6
	//   8 17  5 12  7
	//  16 22 18 24 23

	public static void ex07() {
		final int SIZE = 5;
		int[][] bingo = new int[SIZE][SIZE];
		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE; j++) {
				bingo[i][j] = (i * SIZE) + (j + 1);
			}
		}	
		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE; j++) {
				int x = (int)(Math.random() * SIZE);
				int y = (int)(Math.random() * SIZE);
				int temp = bingo[i][j];
				bingo[i][j] = bingo[x][y];
				bingo[x][y] = temp;
			}
		}
		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE; j++) {
				System.out.print(String.format("%3d", bingo[i][j]));
			}
			System.out.println();
		}
	}
	
	// 문제8. 대문자와 소문자와 숫자로 구성된 인증번호를 만드시오.
	// 사용자로부터 몇 자리의 인증번호를 만들것인지 입력 받아서 처리하시오.
	// 대문자와 소문자와 숫자는 임의로 섞으시오.
	// 예시)
	// 몇 자리의 인증번호를 생성할까요? >>> 6
	// 생성된 6자리 인증번호는 Fa013b입니다.
	public static void ex08() {
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 자리의 인증번호를 생성할까요? >>> ");
		int count = sc.nextInt();
		SecureRandom secureRandom = new SecureRandom();
		StringBuilder sbCode = new StringBuilder();
		for(int n = 0; n < count; n++) {
			double randNumber = secureRandom.nextDouble();
			if(randNumber < 0.33) {
				sbCode.append((char)((int)(secureRandom.nextDouble() * 26) + 'A'));
			} else if(randNumber < 0.66) {
				sbCode.append((char)((int)(secureRandom.nextDouble() * 26) + 'a'));
			} else {
				sbCode.append((char)((int)(secureRandom.nextDouble() * 10) + '0'));
			}
		}
		String code = sbCode.toString();
		System.out.println("생성된 " + count + "자리 인증번호는 " + code + "입니다.");
		sc.close();
	}
	
	// 문제9. 다음 지시시항에 따라 요일을 계산하는 프로그램을 구현하시오.
	// 지시사항)
	//   1. AD 1년 1월 1일은 월요일이다.
	//   2. 평년은 1년이 365일이다.(2월 28일까지 있다.)
	//   3. 윤년은 1년이 366일이다.(2월 29일까지 있다.)
	//   4. 윤년이란?
	//      1) 4로 나눠 나머지가 0인 년도는 윤년이다.
	//      2) 이 중 100으로 나눠 나머지가 0인 년도는 평년이다.
	//      3) 이 중 400으로 나눠 나머지가 0인 년도는 윤년이다.
	// 힌트)
	//   1년 1월 1일부터 입력한 날짜까지 며칠이 지났는지 계산한다.
	//   계산된 일수와 요일의 관계는 다음과 같다.
	//     일 : 계산된 일수를 7로 나눈 나머지가 0이다.
	//     월 : 계산된 일수를 7로 나눈 나머지가 1이다.
	//     화 : 계산된 일수를 7로 나눈 나머지가 2이다.
	//     수 : 계산된 일수를 7로 나눈 나머지가 3이다.
	//     목 : 계산된 일수를 7로 나눈 나머지가 4이다.
	//     금 : 계산된 일수를 7로 나눈 나머지가 5이다.
	//     토 : 계산된 일수를 7로 나눈 나머지가 6이다.
	// 예시)
	// 년-월-일 입력(2000-01-01) >>> 2023-01-19
	// 입력된 2023-01-19는 목요일입니다.
	public static void ex09() {
		Scanner sc = new Scanner(System.in);
		System.out.print("년-월-일 입력(2000-01-01) >>> ");
		String date = sc.next();
		String[] dateArr = date.split("-");
		int year = Integer.parseInt(dateArr[0]);
		int month = Integer.parseInt(dateArr[1]);
		int day = Integer.parseInt(dateArr[2]);
		int totalDays = 0;
		// 년도를 totalDays에 누적
		for(int y = 1; y < year; y++) {
			totalDays += 365;
			if((y % 4 == 0 && y % 100 != 0) || y % 400 == 0) {
				totalDays++;
			}
		}
		// 월을 totalDays에 누적
		int[] lastDays = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30};
		if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			lastDays[2] = 29;
		}
		for(int i = 0; i < month; i++) {
			totalDays += lastDays[i];
		}
		// 일을 totalDays에 누적
		totalDays += day;
		// 결과
		String[] weekName = {"일", "월", "화", "수", "목", "금", "토"};
		System.out.println("입력된 " + date + "는 " + weekName[totalDays % 7] + "요일입니다.");
		sc.close();
	}
	
	// 문제10. 사용자가 입력한 금액만큼 로또를 구매한다고 가정하고, 완성된 로또 용지를 출력하시오.
	// 금액은 1000원 단위로 입력하고 100원 이하 단위 입력은 무시하시오.
	// 로또 용지 1개에는 최대 5개의 로또 게임 기록이 가능하다.
	// 예시)
	// 얼마나 구입하시겠습니까? >>> 16000
	// 01 :   24  20  15  39  41  35
	// 02 :   14  43  23  26   4  38
	// 03 :   21  13  38   1  34  42
	// 04 :    1   2  41  33  43  14
	// 05 :   28  24  27  21  23  37
	// ------------------------------
	// 01 :   12  23  42  30  41  43
	// 02 :   38  37  42  31  13  19
	// 03 :   44  18  35  26   3  41
	// 04 :   30  40   5   2  10  22
	// 05 :   45  13   6  39  30  19
	// ------------------------------
	// 01 :   12  15  29  45  28  39
	// 02 :   25  39  20  43  34  27
	// 03 :   30   4  38   9   2  22
	// 04 :    9  39  22  20  21  35
	// 05 :    6  43  40   4  14  31
	// ------------------------------
	// 01 :   13  10  42  34  32  21
	// ------------------------------
	public static void ex10() {
		Scanner sc = new Scanner(System.in);
		System.out.print("얼마나 구입하시겠습니까? >>> ");
		int money = sc.nextInt();
		while(money > 0) {
			int row = (money >= 5000) ? 5 : money / 1000;
			int[][] lotto = new int[row][6];
			for (int i = 0; i < lotto.length; i++) {
				// 45개 숫자에서 랜덤하게 빼서 lotto[i][j]에 저장
				int ballCount = 45;
				int[] ball = new int[ballCount];
				// 1~45 순차적으로 생성
				for (int j = 0; j < ball.length; j++) {
					ball[j] = j + 1;
				}
				// ball 배열에서 6개를 lotto[i][j] 보내기
				for (int j = 0; j < lotto[i].length; j++) {
					int rnd = (int)(Math.random() * ballCount);  // ball 배열의 인덱스(0~ballCount-1) 랜덤 생성
					lotto[i][j] = ball[rnd];
					int lastIdx = 44 - j;
					if (rnd != lastIdx) {
						ball[rnd] = ball[lastIdx];
					}
					ballCount--;
				}
			}
			// 출력
			for (int i = 0; i < lotto.length; i++) {
				System.out.print("0" + (i + 1) + " : ");
				for (int j = 0; j < lotto[i].length; j++) {
					System.out.print( String.format("%4d", lotto[i][j]) );
				}
				System.out.println();
			}
			System.out.println("------------------------------");
			money -= 5000;
		}
		sc.close();
	}
	
	public static void main(String[] args) {
		ex10();
	}

}
