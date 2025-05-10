package Day2;
import java.util.Scanner;
public class Odd_Even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        if (i == 0) {
            System.out.println("The no. is Zero");   
        } 
        else if(i % 2 == 0 && i < 5){
            System.out.println("The no. is Even and Not weird");
        }
        else if(i%2!=0){
            System.out.println("The no. is odd and Weird");
        }
    }
}
