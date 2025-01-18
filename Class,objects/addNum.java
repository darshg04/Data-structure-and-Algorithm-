import java.util.Scanner;

class Algebra{
    int add(int a,int b){
        int ans = a+b;
        return ans;
    }
}

public class addNum {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        Algebra Num = new Algebra();
        System.out.println("Enter the First Number:");
        int a=sc.nextInt();
        System.out.println("Enter the second number:");
        int b=sc.nextInt();

        System.out.println("The sum of "+a+" and "+b+" is "+Num.add(a,b));//method call through object
    }
}
