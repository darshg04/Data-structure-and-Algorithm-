//uses of in-built math function

import java.util.Scanner;
public class maxNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        int a=sc.nextInt();
        System.out.println("Enter the second number");
        int b=sc.nextInt();
        System.out.println("Enter the third number");
        int c=sc.nextInt();
        System.out.println("Enter the four number");
        int d=sc.nextInt();
        System.out.println("The gratest Number is: "+Math.max(Math.max(a,b),Math.max(c,d)));//to find the maximum number
    }
}
