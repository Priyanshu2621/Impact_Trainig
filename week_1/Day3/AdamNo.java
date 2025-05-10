package Day3;

import java.util.Scanner;

public class AdamNo {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int square = n*n;  
        int reverse = 0;
        int temp = n;
        while (temp!=0){
            reverse = reverse*10 + temp%10;
            temp = temp/10;
        }
        int squareReverse = reverse*reverse;
        int reverseSquare = 0;
        while (squareReverse!=0){
            reverseSquare = reverseSquare*10 + squareReverse%10;
            squareReverse = squareReverse/10;
        }
        if (square == reverseSquare){
            System.out.println("Adam Number");
    }
        else {
            System.out.println("Not an Adam Number");
        }
        sc.close();
    }
    
}
