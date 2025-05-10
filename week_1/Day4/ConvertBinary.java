package Day4;

import java.util.Scanner;

public class ConvertBinary {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int revBin =0;
        int place = 1;
        while(num > 0){
            int bit = num%2;
            revBin = revBin + bit * place;
            place = place * 10;
            num = num/2;
        }
        System.out.println(revBin);
    }
}
