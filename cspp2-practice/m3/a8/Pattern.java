import java.util.Scanner;

public class Pattern {
	public static void main(String[] args) {
		int i = 1;
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		while(i <= n) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j +" ");
			}
			System.out.println("");
			i++;
		}
	}
}