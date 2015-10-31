import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//		
//		yield : 현재 실행중인 스레드 객체를 일시적으로 중단
//		sleep : 현재 실행중인 스레드를 지정된 밀리초 + 지정된 나노초 동안 수면 상태(일시적 실행 중단)로 변경
//		stop :스레드가 실행을 중단하도록 강제 실행
//		interrupt : 스레드를 인터럽트
//		interrupted : 현재 스레드를 인터럽트했는지 여부를 테스트
//		destroy : 종결 처리하지 않고, 스레드를 버림
//		isAlive : 스레드가 활동중인지 여부를 테스트 (해당 스레드가 활동중인 경우 true, 그렇지 않으면 false)
//		suspend : 스레드를 일시 중단
//		resume : 중단된 스레드를 재개
//		setPriority : 스레드의 우선순위를 변경
//		getPriority : 스레드의 우선순위를 리턴
//		getName : 스레드의 이름을 리턴
//		activeCount : 스레드 그룹에 있는 활성 스레드의 현재 수를 리턴
//		enumerate : 스레드 그룹 및 하위 그룹에 있는 모든 활성 스레드를 지정된 배열로 복사
//		countStackFrames : 스레드에 있는 스택 프레임의 수를 계산
//		join : 스레드가 종료되는 것을 적어도 millis 밀리초 동안 기다림립. 시간 종료 값이 0이면 무한히 기다림
//		toString : 스레드 이름, 우선순위 및 스레드 그룹을 포함하여, 스레드의 문자열 표시를 리턴
		
		
		int nationchoice = 0;
		int buildingNum = 0;
		// Student s = new Student(); // Student 객체 생성
		// s.set(); // Person클래스를 상속 받았기 때문에 Person클래스에 있는 매개변수를 사용할 수 있음.
		// System.out.println("나이 : " + s.age + "\n이름 : " + s.name + "\n키 : " +
		// s.height + "\n몸무게 : " + s.getWeight());
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
		// 나라 선택
		switch (nationchoice) {
		case 1:
			Korea ko1 = new Korea();
			ko1.setKorea();
			break;
		case 2:
			China ch1 = new China();
			ch1.setChina();
			break;
		case 3:
			Japan jp1 = new Japan();
			jp1.setJapan();
		case 4:
			Singapore sp1 = new Singapore();
			sp1.setSingapore();
		default:
			break;
		}

		while (true) {
			System.out.println("#######빌딩을 생성합니다.#######");
			System.out.println("생성하고 싶은 빌딩을 선택하세요.\n다 선택하면 0을 누르세요.");
			System.out.println("최대 10개까지 생성");
			try {
				Scanner sc2 = new Scanner(System.in);
				buildingNum = sc2.nextInt();
			} catch (InputMismatchException ie) {
				System.out.println("숫자를 입력해주세요.");
			}

			if (buildingNum > 0 && buildingNum < 11)
				;
		}

	}
}







