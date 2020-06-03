package task2;

public class Rectangle {
	
	int l;
	int w;
	
	Rectangle () {
		this.l=35;
		this.w=100;
	}
	
	Rectangle (int l, int w) {
		this.l=l;
		this.w=w;
	}
	
	public int area() {
		return l * w;
	}
	
	public int perym() {
		return 2*(l+w);
	}

}
