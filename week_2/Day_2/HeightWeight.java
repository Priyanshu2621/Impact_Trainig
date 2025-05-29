package week_2.Day_2;

import java.util.Scanner;

public class HeightWeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of people: ");
        int n = sc.nextInt();
        int hw =n*2;
        int[] heightsWeight = new int[hw];
        System.out.println("Enter the heights and Weight of the people: ");
        for(int i = 0; i<n; i++){
            heightsWeight[i] = sc.nextInt();

        }
        int maxWeight =  heightsWeight[0];
        for(int j=0; j<hw; j++){
            if(maxWeight<heightsWeight[j]){
                maxHeight = heightsWeight[j];
            }
            else{
                j+=2;
            }
            int

        }

        
    }
}
