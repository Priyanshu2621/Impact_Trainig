package Day5;

import java.util.Scanner;
public class EvenArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Size of Array  ");
        int n = sc.nextInt();
        
        int arr[] = new int[20];
        for(int i = 0;i<n+1;i++){
            System.out.print("Enter The Element of Array ");
            arr[i] = sc.nextInt();
        }
        System.out.println("The Even Numbers in the Array are:");
        for(int i = 0;i<n+1;i++){
            if(arr[i]%2==0){
                System.out.println(arr[i]);
            }

        }
        
    }
    
}