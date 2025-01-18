//to find array's smallest element and largest element 

import java.util.Arrays;
import java.util.Scanner;

public class smallestAndlargest {

    static int[] smallestAndlargestOfArray(int arr[]){
        Arrays.sort(arr);//sorting an array
        int[] ans={arr[0],arr[arr.length-1]};
        return ans;
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


        int[] ans=smallestAndlargestOfArray(arr);
        System.out.println("Smallest: "+ans[0]);
        System.out.println("Largest: "+ans[1]);

    }
}
