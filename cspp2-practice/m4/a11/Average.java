import java.util.Scanner;
public class Average {
    public static void main(String[] args) {
        int arr[]; int j;
        double sum = 0; 
        double l = 0;
        System.out.println("Enter the size of array :");
        Scanner s = new Scanner(System.in);
         j = s.nextInt();
         arr = new int[j];
         System.out.println("Enter the elements : ");
        for(int i = 0; i<j; i++) {
            arr[i] = s.nextInt();
            sum = sum + arr[i];
        }
         l = sum/j;
        System.out.println("The average is : " + l);

}
}

