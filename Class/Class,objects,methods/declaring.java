import java.util.Scanner;

class Student{
    String name;
    int rollNo;
    int batch;
    String course;
}

public class declaring {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student identity = new Student();//declaring object
        System.out.println("Enter your name:");
        identity.name=sc.nextLine();
        System.out.println("Enter your roll no:");
        identity.rollNo=sc.nextInt();
        System.out.println("Enter your batch:");
        identity.batch=sc.nextInt();
        System.out.println("Enter the course:");
        identity.course=sc.next();

        System.out.println();
        System.out.println();


        System.out.println("Name    = "+identity.name);
        System.out.println("Roll No = "+identity.rollNo);
        System.out.println("Batch   = "+identity.batch);
        System.out.println("Course  = "+identity.course);
    }
}