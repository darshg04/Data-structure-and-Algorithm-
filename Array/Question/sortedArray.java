//To check whether array is shorted or not.(incresing order)

import java.util.Scanner;

public class sortedArray {

    static boolean isShorted(int arr[]){
        boolean check=true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]<arr[i-1]) {
                check = false;
                break;
            }
        }
        return check;
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

        System.out.println("Is array shored: "+isShorted(arr));
    }
}
