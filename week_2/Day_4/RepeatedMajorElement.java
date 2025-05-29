package week_2.Day_4;

import java.util.Scanner;

public class RepeatedMajorElement {
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
         System.out.println("Enter the element");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int count = 0;
        int majority = arr[0];
        for(int j=0; j<n-1; j++){
            if (majority == arr[j]){
                count++;
            }
            else{
                count--;
                if(count == 0)
                majority = arr[j+1];

            }
        }
        if(count != 0 && count > n/2){
        System.out.println("your majority element is: " + majority);
        }
        else{
            System.out.println("No such element.");
        }
    }
    
}          


        
