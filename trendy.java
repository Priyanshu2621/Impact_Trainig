
import java.util.Scanner;

public class trendy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int middle_digit = ((n/10) % 10);
        if(middle_digit%3==0){
            System.out.print("Trendy");
        }
        else if(middle_digit%3!=0){
            System.out.print("Not Trendy");
        }
        else{
            System.out.print("Invalid Input");
        }
    }
}
