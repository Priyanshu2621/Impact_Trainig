package Week_3.Day_5;

import java.util.Scanner;

public class RemoveCommon {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string:");
        String str1 = sc.nextLine();
        System.out.println("Enter the second string:");
        String str2 = sc.nextLine();
        for(int i = 0; i<str1.length();i++){
            char ch = str1.charAt(i);
            for(int j = 0; j<str2.length();j++){
                char ch2 = str2.charAt(j);
                if(ch == ch2){
                    str1 = str1.replace(ch, ' ');
                    str2 = str2.replace(ch2, ' ');
                }
            }
        }
        System.out.println("The first string after removing common characters: " + str1);
        System.out.println("The second string after removing common characters: " + str2);
    }

}
