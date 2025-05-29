package Week_3.Day_5;

import java.util.Scanner;

public class sumofnonalpha {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String num = "0123456789";
        int sum = 0;

        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(num.indexOf(ch) != -1){
                sum += Character.getNumericValue(ch);
            }
           
        }
         System.out.println("The sum of non-alphabetic characters is: " + sum);
}
}
