
public class Building {
	int cost;
	int area;
	int floor;
	int door;
	int room;
}

class School extends Building {
	int classroom;
	public void setSchool(int a) {
		this.classroom = a;
	}
}

class Factory extends Building {
	// 생산라인
	int produceLine;
	int workingPeople;

	public void setFactory(int a, int b) {
		this.produceLine = a;
		this.workingPeople = b;
	}

}

class Park extends Building {
	int treeNum;
	int rideNum;
	public void setPark(int a, int b){
		this.treeNum = a;
		this.rideNum = b;
	}
}

class Apartment extends Building {
	public void setApartment(){
		
	}
}