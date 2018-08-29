import java.util.Scanner;
public class SumOfNNumbers {
	public static void main(String[] args) {
		double sum = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter a number : ");
		double n = s.nextDouble();
		for(double i = 1;i <= n;i++) {
			sum = sum + i;
		}
		System.out.println("The Sum Of "+n+" Numbers are:" + sum);
	}
}