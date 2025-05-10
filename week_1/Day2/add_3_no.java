package Day2;
import java.util.*;
public class add_3_no{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int first_digit=n/100;
    int second_digit=((n/10 ) % 10);
    int last_digit=n%10;
    System.out.print(first_digit + second_digit + last_digit);
}
}