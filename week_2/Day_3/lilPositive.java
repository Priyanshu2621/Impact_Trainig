package week_2.Day_3;

import java.util.Scanner;

public class lilPositive {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int temp = 1;
        for(int i =0; i<n; i++){
            if(arr[1] == temp){
                temp++;
                i=0;
            }
        }
        System.out.println(temp);
        sc.close();
    }
}
