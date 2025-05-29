package Week_3.Day_2;

import java.util.Scanner;

public class VowelCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();
        String vowel = "aeiou";
        int vowels = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                continue;
            }
            for (int j = 0; j < vowel.length(); j++) {
                if (str.charAt(i) == vowel.charAt(j)) {
                    vowels++;
                    break;
                }
            }
        }
        System.out.println("Total Vowel are: " + vowels);
        sc.close();
}
}
