import java.util.Scanner;

public class SpeecialNo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        do{
            System.out.println("Enter a nummbber between 11 to 19:");
            number = scanner.nextInt();

        }
        while (number < 11 || number > 19);
        int first_digit = number / 10;
        int second_digit = number %10;
        int sum = first_digit + second_digit;
        int product = first_digit * second_digit;
        int SpecialNumber = sum + product;
        System.out.println("Sum of digits: " + sum);
        System.out.println("Product of digits: " + product);
        System.out.println("SpecialNumber : " + SpecialNumber);
        if (SpecialNumber == number) {
            System.out.println("the no. is special");
        }
        else {
            System.out.println("the no. is not special");
        }
    }
}