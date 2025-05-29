package Week_3.Day_3;
import java.util.*;
public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.nextLine();
        String reversedstr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedstr += str.charAt(i);
        }
        System.out.println("Reversed string: " + reversedstr);
        sc.close();
    }
}
