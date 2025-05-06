import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int first_digit = x / 100;
        int second_digit = ((x / 10) % 10);
        int last_digit = x % 10;
        int reverse = (last_digit * 100) + (second_digit * 10) + first_digit;
        System.out.print(reverse);
    }
    
}   