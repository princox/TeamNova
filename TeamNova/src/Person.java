
public class Person {
	int age;
	String name;
}

class Sex extends Person {
	// 성별 남성은 1, 여성은 2, 기타 3
	int sex;

	public void setFemale() {
		this.sex = 2;
		System.out.println("여성 한 명이 생겼습니다.");
	}

	public void setMale() {
		this.sex = 1;
		System.out.println("남성 한 명이 생겼습니다.");
	}

	public void setExtra() {
		this.sex = 3;
		System.out.println("기타 성별 한 명이 생겼습니다.");
	}
}