package Week_3.Day_1;

import java.util.Scanner;

public class CheckSeitBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number:");
        int n = sc.nextInt();
        System.out.print("Enter ith Value: ");
        int i = sc.nextInt();
        int checker = (n &(i<<i));
        if(checker!=0){
            System.out.println("Set Bit");
        }
        else{
            System.out.println("Not a Set Bit");


            222
    }
}
}
