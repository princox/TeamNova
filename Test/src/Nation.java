
public class Nation {
	// 국가는 넓이, 인구를 가진다.

	public int area;
	public int population;
	public String name;

	public void setArea(int area) {
		this.area = area;
		System.out.println("넓이를" + area + "로 설정했습니다.");
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("이름을 " + name + "으로 " + "설정했습니다.");
	}

	public void setPopulation(int population) {
		this.population = population;
		System.out.println("현재 인구는 "+population+"");
	}

	public int getArea() {
		return area;
	}
}

class Korea extends Nation {
	// Student 클래스가 Person 클래스를 상속받음
	String language = "한국어";

	public void setKorea() {
		this.population = 4000;
		this.area = 150;
		System.out.println("한국이 생성되었습니다.");
	}
}

class China extends Nation {
	String language = "중국어";

	public void setChina() {
		this.population = 10000;
		this.area = 350;
		System.out.println("중국이 생성되었습니다.");
	}
}

class Singapore extends Nation {
	String language = "싱가포르어";

	public void setSingapore() {
		this.population = 2500;
		this.area = 100;
		System.out.println("싱가포르가 생성되었습니다.");
	}
}

class Japan extends Nation {
	String language = "일본어";

	public void setJapan() {
		// TODO Auto-generated method stub

		System.out.println("일본이 생성되었습니다.");
		this.population = 3000;
		this.area = 170;
	}

}
