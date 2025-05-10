package Day3;

import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int sum = 0;
        while(n!=0){
            int last_digit = n%10;
            sum = sum + last_digit;
            n = n/10;
        }
        if(temp%sum==0){
            System.out.print("Harshad Number");
        }
        else{
            System.out.print("Not a Harshad Number");
        }
    }
}
