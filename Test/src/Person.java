
public class Person {
	int age;
	// male = 1, female = 2;
	String name;

	public void setPerson(String a) {
		this.name = a;
		System.out.println("직업을 " + a + "로 선택하셨습니다.");
	}
}

class female extends Person {
	String sex = "여성";
}

class male extends Person {
	String sex = "남성";
}

class nurse extends female {
	// 간호
	String job = "간호사";

	public void setNurse() {
		System.out.println("간호사가 한 명 생겼습니다.");
	}
}

class teacher extends female {
	// 선생
	String job = "선생님";

	public void setTeacher() {
		System.out.println("선생님이 한 명 생겼습니다.");
	}

}

class worker extends male {
	// 노동자
	String job = "노동자";

	public void setWorker() {
		System.out.println("노동자가 한 명 생겼습니다.");
	}
}

class manager extends male {
	// 관리
	String job = "관리자";

	public void setManager() {
		System.out.println("관리자가 한 명 생겼습니다.");
	}
}