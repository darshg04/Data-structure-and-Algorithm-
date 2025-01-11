import java.util.Scanner;
public class leastNum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a = sc.nextInt();
        System.out.println("Enter the Second  number:");
        int b = sc.nextInt();
        System.out.println("Enter the Third  number:");
        int c = sc.nextInt();
        System.out.println("Enter the four number:");
        int d = sc.nextInt();
        System.out.println("The least number is : "+Math.min(Math.min(a,b),Math.min(c,d)));//to find gretest number out four
    }
}