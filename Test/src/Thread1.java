
class Thread1 extends Thread {
	int value1;

	public Thread1(int value) {
		System.out.println("쓰레드 생성");
		this.value1 = value1;
		this.value1 += 25;
	}

	public void CustomThread1(int value1) {
		this.value1 = value1;
		this.value1 += 25;
	}

	public void run() {
		System.out.println("인구 수 증가 이벤트가 발생합니다.\n현재 인원 수" + value1 + "입니다.");
	}
}

class Thread2 extends Thread {
	int value2;

	public Thread2(int value) {
		System.out.println("쓰레드 생성");
		this.value2 = value2;
		this.value2 -= 5;
	}

	public void CustomThread2(int value2) {
		this.value2 = value2;
		this.value2 -= 5;
	}

	public void run() {
		System.out.println("인구수 감소 이벤트가 발생합니다.\n현재 인원 수" + value2 + "입니다.");
	}
}
