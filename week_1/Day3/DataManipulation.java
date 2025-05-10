package Day3;

import java.util.Scanner;

public class DataManipulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int count = 0; // Initialize count

        while (n != 0) {
            int last_digit = (int) (n % 10);
            System.out.println(last_digit);
            n = n / 10;
            if (last_digit == 9) {
                count++;
            }
        }
        System.out.println(count);
    }
}