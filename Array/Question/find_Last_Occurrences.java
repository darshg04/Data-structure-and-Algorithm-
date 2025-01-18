//index of which last occurrences of digit

import java.util.Scanner;
public class find_Last_Occurrences {
    static int lastOccurrences(int arr[],int x){
        int lastIndex=-1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==x) {
                lastIndex = i;
            }
        }
        return lastIndex;
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

        System.out.println("The occurrences of "+x+" is: "+lastOccurrences(arr, x));
    

    }
}
