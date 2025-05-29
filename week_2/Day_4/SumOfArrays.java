package week_2.Day_4;

import java.util.Scanner;
class SumOfArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int num1[] = new int[n];
        int num2[] = new int[n];
        int num3[] = new int[n];
        int rev = 0;

        System.out.println("Enter the elements of the first array");
        for(int i=0; i<n; i++){
            num1[i] = sc.nextInt();
        }
        System.out.println("Enter the elements of the second array");
        for(int j=0; j<n; j++){
            num2[j] = sc.nextInt();
        }
        int value1=0;
        int value2=0;
        for(int k=0; k<n; k++){
            value1  = value1*10 + num1[k];
            value2  = value2*10 + num2[k];
        }
        int sum = value1 + value2;
        System.out.println("The sum of the two arrays is: " + sum);
        int y =0 ;
        while(sum != 0){
            rev =  sum%10;
            sum = sum/10;
            num3[y] = rev;
            y++;
        }
        for(int z=0; z<n; z++){
            System.out.print(num3[z] + " ");
        
    }
}
}
