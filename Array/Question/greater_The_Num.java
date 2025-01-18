//Count the numbers of elements Strictiy greater than the value x

import java.util.Scanner;

public class greater_The_Num {

    static int greaterTheNum(int arr[],int x){
        int count=0;
        for (int i = 0; i < arr.length; i++) {
                if (arr[i]>x) {
                    count++;
                }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of an array:");
        int size=sc.nextInt();

        int[] arr=new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the "+(i+1)+" element");
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the number of given array:");
        int x=sc.nextInt();

        System.out.println("number of elements which is greater the value of "+x+" is: "+greaterTheNum(arr, x));
    
    }
}
