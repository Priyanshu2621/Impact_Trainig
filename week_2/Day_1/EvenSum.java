package week_2.Day_1;
import java.util.Scanner;
public class EvenSum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int EvenSum = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                EvenSum += arr[i];
            }
        }
        System.out.println("The sum of even numbers in the array is: " + EvenSum);
        sc.close();
    }
}
