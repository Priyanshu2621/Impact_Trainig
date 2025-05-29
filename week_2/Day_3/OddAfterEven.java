package week_2.Day_3;

import java.util.Scanner;

public class OddAfterEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no. of inputs: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            long num = sc.nextLong();
            long rev = 0;
            int count = 0;
            while (num != 0) {
                int r = (int) num % 10;
                if (r % 2 == 0) {
                    rev = (rev * 10) + r;
                } else {
                    count++;
                }
                num = num / 10;
            }
            long res = (long) (rev * Math.pow(10, count));
            System.out.println(res);
        }
    }
}
