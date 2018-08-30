import java.util.Scanner;
public class FirstLast6 {
	public static void main(String[] args) {
		int arr[], len;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size : ");
		len = s.nextInt();
		arr = new int[len];
		System.out.println("Enter the elements : ");
		for (int i = 0; i < len; i++) {
			arr[i] = s.nextInt();
		}
		if (arr[0] == 6) {
			System.out.println(true);
		}
		else if (arr[len-1]==6) {
			System.out.println(true);
		}	
		else {
			System.out.println(false);
		}
		}
	}
