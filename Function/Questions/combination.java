//to find combination of n & r

import java.util.Scanner;

public class combination {
    public static int combination(int x) {
        int xfact = 1;
        for (int i = 1; i <= x; i++) {
            xfact *= i;
        }
        return xfact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        System.out.println("Enter the value of r;");
        int r = sc.nextInt();

        if (n > r) {
            int nfact = combination(n);
            int rfact =  combination(r);
            int nmrfact = combination(n-r);

            int nCr=nfact / (rfact*nmrfact);
            System.out.println("The nCr of "+n+" and "+r+" is "+nCr);
        }else {
            System.out.println("The n is must be grater than r");
        }
    }
}