package Week_3.Day_1;
import java.util.Scanner;
public class set_bit_right_shift {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        System.out.println("Enter the position of bit to be set:");
        int pos = sc.nextInt();

        if(((n >> pos)& 1) != 0){
            System.out.println("bit is a set bit.");
        }
        else{
            System.out.println("Bit is not a set bit.");
        }
        sc.close();
    }
}
