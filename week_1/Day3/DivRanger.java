package Day3;

import java.util.Scanner;
public class DivRanger{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Value for n: ");
        int n = sc.nextInt();
        System.out.print("Enter Value for m: ");
        int m = sc.nextInt();
        for(int i = n;i<(m+1);i++){
            if(i%7==0 && i%9==0){
                System.out.println(i);
            }
        }

    }
}