package Week_3.Day_1;

import java.util.Scanner;

public class nonrepeative {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int count = 0;
        int i = 0;
        int j = 0;
        int[] arr = new int[n];
        System.out.println("Enter the elements");
        for(i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        for(i = 0; i < n; i++){
            for(j = i + 1; j < n; j++){
                if(arr[i] == arr[j]){
                    count++;
                    break;
                }
            }
        }
        if(count == 0){
            System.out.println("All elements are unique");
        }
        else{
            System.out.println("There are " + count + " repeating elements");
        }
        sc.close();
       
        
    }
}
