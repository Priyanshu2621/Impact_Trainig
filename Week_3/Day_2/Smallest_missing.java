package Week_3.Day_2;

import java.util.Scanner;

public class Smallest_missing {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of elements in the array:");
    int n = sc.nextInt();
    System.out.println("Enter the elements of the array:");
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
    }
    int min = arr[0];
    for (int i = 0; i < n; i++) {
        if (arr[i] < min) {
            min = arr[i];
        }
    }
    int max = arr[0];
    for (int i = 0; i < n; i++) {
        if (arr[i] > max) {
            max = arr[i];
        }
    }
    boolean[] present = new boolean[max + 1];
    for (int i = 0; i < n; i++) {
        if (arr[i] > 0) {
            present[arr[i]] = true;
        }
    }
    int smallestMissing = -1;
    for (int i = 1; i <= max; i++) {
        if (!present[i]) {
            smallestMissing = i;
            break;
        }
    }
    if (smallestMissing == -1) {
        System.out.println("All numbers from 1 to " + max + " are present.");
    } else {
        System.out.println("The smallest missing positive integer is: " + smallestMissing);
    }
    sc.close();

}
}
