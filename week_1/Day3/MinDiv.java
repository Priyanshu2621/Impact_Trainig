package Day3;

import java.util.Scanner;
public class MinDiv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter the value of num and m:");
        int num = sc.nextInt();
        int m = sc.nextInt();
        int quo;
        int lb;
        int ub;
        if(num % m == 0){
            System.out.println("The min distance is zero");
        }
        else{
            quo = num/m;
            int min = num - (quo*m);
            System.out.println("The min distance is " + min);

            lb = (quo*m) + m;
            ub = (quo*m) - m;
            System.out.println("The lower bound is " + lb);
            System.out.println("The upper bound is " + ub);
            if(min < lb && min<lb){
                System.out.println("The min distance is" + min);

            }
            else if(min > lb && min>ub){
                System.out.println("The min distance is" + min);
            }
            else if(min < lb && min>ub){
                System.out.println("The min distance is" + min);
            }
            else if(min > lb && min<ub){
                System.out.println("The min distance is " + min);
            }
            else{
                System.out.println("Invalid Input");
            }
            

            
    }
}
}
