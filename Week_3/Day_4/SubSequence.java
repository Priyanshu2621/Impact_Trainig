package Week_3.Day_4;

import java.util.Scanner;

public class SubSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str1 = sc.nextLine();
        int i = 0;
        int j = 0;
        while (i < str.length() && j < str1.length()) {
            if (str.charAt(i) == str1.charAt(j)) {
                j++;
            }
            i++;
        }
        if (j == str.length()) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
        sc.close();

    }
}
