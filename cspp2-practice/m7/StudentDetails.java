import java.util.Scanner;
class Student{
    public Student(String name,String rollno, Double subject1, Double subject2, Double subject3){
        String n = name;
        String r = rollno;
        Double s1 = subject1;
        Double s2 = subject2;
        Double s3 = subject3;
        System.out.println("Average is" + ((s1+s2+s3)/3));
    }

}
public class StudentDetails{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String rollnum = sc.nextLine();
        Double s1 = sc.nextDouble();
        Double s2 = sc.nextDouble();
        Double s3 = sc.nextDouble();
        Student st = new Student(name,rollnum,s1,s2,s3);
    }
}
