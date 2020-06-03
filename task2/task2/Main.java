package task2;

public class Main {

	public static void main(String[] args) {
		
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle(30,40);
		Circle c = new Circle();
		
		System.out.println("Площа прямокутника 1 = " + r1.area());
		System.out.println("Площа прямокутника 2 = " + r2.area());
		System.out.println("Периметр прямокутника 1 = " + r1.perym());
		System.out.println("Периметр прямокутника 2 = " + r2.perym());
		
		System.out.println("Довжина кола = " + c.lengh());
		System.out.println("Площа кола = " + c.area());
	}

}
