
public class Mammalia {
	int age;
	public int height;
	public int weight;

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getWeight() {
		return weight;
	}
}

class Person extends Mammalia {
	public String name;
}

class Student extends Person {
	int grade;

	void set(int age, int height, int Weight) {
		this.age = age;
		this.height = height;
		setWeight(Weight);
	}
}

class MiddleSchoolStudent extends Student {
	int grade;

	void set() {
		System.out.println("중학생 입니다.");
	}

}

class HighSchoolStudent extends Student {
	int grade;

	void set() {
		System.out.println("고등학생 입니다.");
	}
}

class UnderGraduateStudent extends Student {
	int grade;

	void set() {
		System.out.println("대학생 입니다.");
	}
}
