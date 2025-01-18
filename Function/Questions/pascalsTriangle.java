package Questions;
import java.util.Scanner;

public class pascalsTriangle {
    public static int combination(int x){
        int xfact=1;
        for (int i = 1; i <=x; i++) {
            xfact *= i;
        }
        return xfact;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int n=sc.nextInt();

        for (int i = 0; i <=n; i++) {
            for (int k = 1; k<=n-i; k++) {
                System.out.print(" "+" ");
            }
            for (int j = 0; j <=i; j++) {
                int iCj=combination(i)/(combination(j)*combination(i-j));
                System.out.print(+iCj+"   ");
            }
            System.out.println();
        }
    }
}