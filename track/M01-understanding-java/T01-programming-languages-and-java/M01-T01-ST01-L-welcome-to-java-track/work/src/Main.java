import java.util.*;
class student {
    int id;
    String name;
    String course;
    double javaScore;
}
public class Main{
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        student s= new student();
        student s2= new student();
        System.out.println("enter student 1 details");
        System.out.println("enter student id");
        s.id = sc.nextInt();
        System.out.println("enter student name");
        s.name = sc.next();
        System.out.println("enter student course");
        s.course = sc.next();
        System.out.println("enter student java score");
        s.javaScore = sc.nextDouble();
        System.out.println("enter student 2 details");
        System.out.println("enter student id");
        s2.id = sc.nextInt();
        System.out.println("enter student name");
        s2.name = sc.next();
        System.out.println("enter student course");
        s2.course = sc.next();
        System.out.println("enter student java score");
        s2.javaScore = sc.nextDouble();
        System.out.println("Student 1:");
        System.out.println("ID "+ s.id);
        System.out.println("Name "+ s.name);
        System.out.println("Course "+ s.course);
        System.out.println("Java Score "+ s.javaScore);
        System.out.println("Student 2:");
        System.out.println("ID "+ s2.id);
        System.out.println("Name "+ s2.name);
        System.out.println("Course "+ s2.course);
        System.out.println("Java Score "+ s2.javaScore);
        
    }
}
