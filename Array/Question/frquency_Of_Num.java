import java.util.Scanner;
public class frquency_Of_Num{
     static int countOccurrences(int[] arr,int x){
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==x) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int size=sc.nextInt();

        int[] arr=new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the "+(i+1)+" element");
            arr[i]=sc.nextInt();
        }
        
        System.out.println("Enter the number to find frequency: ");
        int x=sc.nextInt();

        System.out.println("The number of frequency of "+x+" is " +countOccurrences(arr, x));
    }
}