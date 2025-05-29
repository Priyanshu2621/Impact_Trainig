package week_2.Day_4;
public class BinaryToDecimal {
    public static void main(String[] args) {
        int n = 1101;
        int result = 0;
        int base = 1;
        while (n > 0) {
            int lastDigit = n % 10;
            n = n / 10;
            result += lastDigit * base;
            base = base * 2;
        }
        System.out.println("Decimal equivalent: " + result);
        
    }
}
