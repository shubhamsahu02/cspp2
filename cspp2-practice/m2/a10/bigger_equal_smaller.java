import java.util.Scanner;
public class bigger_equal_smaller {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int varA = s.nextInt();
	int varB = s.nextInt();
if (varA > varB) {
	System.out.println("Bigger");
}
else if (varA == varB) {
	System.out.println("Equal");
}
else {
	System.out.println("Smaller");
}	
}
}



/*"Bigger", If varA is larger than varB.
"Equal", If varA is equal to varB.
"Smaller", If varA is smaller than varB.*/