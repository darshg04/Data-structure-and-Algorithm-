import java.util.Scanner;

public class permutation {
    public static int permutation(int x){
        int xfact=1;
        for (int i = 1; i <=x; i++) {
            xfact *= i;
        }
        return xfact;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n=sc.nextInt();
        System.out.println("Enter the value of r:");
        int r=sc.nextInt();

        if (n>=r) {
            int nfact=permutation(n);
            int nmrfact=permutation(n-r);
            
            int nPr=nfact/nmrfact;

            System.out.println("The nPr of "+n+" and "+r+" is "+nPr);
        }else {
            System.out.println("The n is must be grater than r");
        }
    }
}
