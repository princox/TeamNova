
public class Disaster {
	// 재난크기
	int magnitude=0;
	public void setMagnitude(int magnitude) {
		this.magnitude = magnitude;
	}
	public Disaster(){
		
	}
}

// 재난을 상속받은 재난의 종류들
class earthquake extends Disaster {
	public void setEarthquake() {
		System.out.println("지진이 일어났습니다.\n도시땅이 흔들립니다.");
		this.magnitude = 10;
		System.out.println("재난 규모는" + magnitude + "입니다.");

	}
}

class typoon extends Disaster {
	public void setDisaster() {
		System.out.println("태풍이 일어났습니다. \n도시에 바람이 크게 붑니다.");
		this.magnitude = 20;
		System.out.println("재난 규모는" + magnitude + "입니다.");
	}
}

class volcano extends Disaster {
	public void setVocano() {
		System.out.println("화산이 일어났습니다. \n도시로 마그마가 흘러갑니다.");
		this.magnitude = 40;
		System.out.println("재난 규모는" + magnitude + "입니다.");
	}
}

class Heavyrain extends Disaster {
	public void setHeavyrain() {
		System.out.println("비가 너무 심하게 내립니다. \n홍수가 발생합니다.");
		this.magnitude = 30;
		System.out.println("재난 규모는" + magnitude + "입니다.");
	}
}