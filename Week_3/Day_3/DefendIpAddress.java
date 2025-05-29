package Week_3.Day_3;

import java.util.Scanner;

public class DefendIpAddress {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the IP address: ");
        String ip = sc.nextLine();
        System.out.println("Defended IP address: " + ip.replace(".", "[.]"));
    }
    
}
