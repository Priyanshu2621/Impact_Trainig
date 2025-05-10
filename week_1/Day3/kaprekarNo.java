package Day3;

import java.util.Scanner;

public class kaprekarNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int square = n*n;
        int temp = n;
        int digits = 0;
        while(temp != 0) {
            digits++;
            temp = temp / 10;     
        }
        int divisor = 1;
        for(int i = 0; i < digits; i++) {
            divisor *= 10;
        }
        int sum = square / divisor + square % divisor;
        if(sum == n) {
            System.out.println("Kaprekar Number");
        } else {
            System.out.println("Not a Kaprekar Number");
        }
        sc.close();
        
    }
}
