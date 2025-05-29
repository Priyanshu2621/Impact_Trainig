package Week_3.Day_2;

import java.util.Scanner;

public class pallindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.nextLine();
        String reversedstr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedstr += str.charAt(i);
        }
        if (str.equals(reversedstr)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
        sc.close();
    }
}
