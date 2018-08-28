import java.util.Scanner;
public class area_of_Circle {
	static double area;
	static double radius;
	static double pi(){
		return 3.14;
	}

	static double area(double radius) {
		area = pi() * radius * radius;
		return area;	
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		radius = s.nextDouble();
		System.out.println(area(radius));
	}
}
