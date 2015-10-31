import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {
	@SuppressWarnings("null")
	public static void main(String[] args) {
		/**
		 * 메인 게임을 시작합니다. 건물과 인구수가 매 턴 감소하고 0이 되면 끝납니다. 매 턴마다 시민을 뽑을 수 있습니다. (직업을
		 * 가진)
		 */
		int nationchoice = 0;
		int buildingNum = 0;
		int checksum = 1; // 쓰레드 체크
		Nation n1 = new Nation();
		System.out.println("############### 나라 만드는 게임 ################");
		System.out.println("나라를 선택합니다.\n어떤 나라를 선택하시겠습니까?");
		System.out.println("1: 한국, 2: 중국, 3:일본, 4:싱가포르");
		System.out.println("##########################################");
		while (true) {
			try {
				Scanner sc = new Scanner(System.in);
				nationchoice = sc.nextInt();
			} catch (InputMismatchException ie) {
				System.out.println("숫자를 입력해주세요.");
			}
			if (nationchoice == 1 || nationchoice == 2 || nationchoice == 3 || nationchoice == 4)
				break;
		}

		/**
		 * 나라를 선택한다. 각 나라마다 세팅되는 인구수가 다르다.
		 */
		switch (nationchoice) {
		case 1:
			// 한국
			n1.setName("한국");
			n1.setPopulation(400);
			break;
		case 2:
			// 중국
			n1.setName("중국");
			n1.setPopulation(600);
			break;
		case 3:
			// 일본
			n1.setName("일본");
			n1.setPopulation(450);
		case 4:
			// 싱가포르
			n1.setName("싱가포르");
			n1.setPopulation(250);
		default:
			break;
		}

		/**
		 * 처음 시작할 때 빌딩의 수를 선택한다. 빌딩은 한 턴 마다 하나씩 사라지며 빌딩이 0이 되면 나라가 망해서 프로그램이
		 * 종료된다.
		 */
		while (true) {
			System.out.println("######### 빌딩을 생성합니다 #########");
			System.out.println("생성하고 싶은 빌딩을 선택하세요.\n선택이 끝났으면 Enter를 누르세요.");
			System.out.println("최대 10개까지 생성\n빌딩은 재난이 발생하면 하나씩 없어집니다.");
			// try {
			Scanner sc2 = new Scanner(System.in);
			buildingNum = sc2.nextInt();

			// sc2.close();
			// } catch (InputMismatchException ie) {
			// System.out.println("숫자를 입력해주세요.");
			// }

			if (buildingNum > 0 && buildingNum < 11)
				break;
			else
				System.out.println("다시 입력해주세요.");
			sc2.next();
		}

		while (true) {
			Disaster disaster = new Disaster();

			int select = (int) (Math.random() * 100);
			/**
			 * 랜덤으로 0~99 사이의 값이 생긴다.
			 */

			/***
			 * 0~9 : 재난 규모 10의 발생 10~19 : 재난 규모 20의 발생 20~79 : 재난 규모 30의 발생
			 * 80~90 : 재난 규모 40의 발생 91~99 : 매우 적은 확률로 건물이 하나 추가
			 */
			if (select >= 0 && select <= 9)
				disaster.setMagnitude(10);
			else if (select >= 10 && select <= 19)
				disaster.setMagnitude(20);
			else if (select >= 20 && select <= 79)
				disaster.setMagnitude(30);
			else if (select >= 80 && select <= 90)
				disaster.setMagnitude(40);
			else if (select >= 91 && select <= 99) {
				System.out.println("운이 좋으시네요! 건물이 하나 추가됩니다.");
				buildingNum++;

			}
			//
			// else if (select >= 91 && select <= 99) {
			// System.out.println("운이 좋으시네요! 건물이 하나 추가됩니다.");
			// buildingNum++;
			//
			//
			// else if (select >= 91 && select <= 99){
			// System.out.println("건물과 재난 랜덤 이벤트가 발생했습니다.\n인구수 50이 넘으면 종료됩니다.");
			// if(checksum == 1){
			// Thread1 th1 = new Thread1(n1.population);
			// Thread2 th2 = new Thread2(n1.population);
			// th1.start;
			// th2.start;
			// } if(checksum ==
			// 2){ if(n1.population >= 100) {th1.stop; th2.stop;} else break;}
			//

			if (n1.population < 0) {
				System.out.println("망하셨습니다.");
				System.exit(1);
			}

			/**
			 * 현재 인구수를 보여주며 건물을 하나 없앤다.
			 */
			n1.population = (n1.population - disaster.magnitude);
			System.out.println("재난 발생! 규모: " + disaster.magnitude);
			System.out.println("재난이 발생하였습니다. 남은 인원 수 =" + n1.population + "\n\n");
			buildingNum--;

			if (buildingNum < 0 || n1.population < 0)
				break;

			/**
			 * 재난이 끝나면 인원을 추가할 수 있다. 직업마다 각각 인원수가 다르다. 간호사 : 10 선생님 : 11 관리자 :
			 * 12 노동자 : 13
			 */
			System.out.println("생산할 직업을 고르세요.");
			System.out.println("1. 간호사 2. 선생님 3. 관리자 4. 노동자");
			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();
			// sc.close();
			Person person1 = new Person();
			if (choice == 1) {
				person1.setPerson("간호사");
				n1.population += 10;
			} else if (choice == 2) {
				person1.setPerson("선생님");
				n1.population += 11;
			} else if (choice == 3) {
				person1.setPerson("관리자");
				n1.population += 12;
			} else if (choice == 4) {
				person1.setPerson("노동자");
				n1.population += 13;
			}

			/**
			 * 현재 인구수와 빌딩 보여주고 빌딩이 없을 경우 프로그램을 종료한다.
			 */
			System.out.println("* 현재 인구 수는" + n1.population + "입니다.");
			System.out.println("현재 빌딩 수는" + buildingNum + " *");
			if (buildingNum == 0) {
				System.out.println("\n**더 이상 빌딩이 없습니다. 망해서 게임을 종료합니다.**");
				sc.close();
				System.exit(1);
			}
		}
	}
}
