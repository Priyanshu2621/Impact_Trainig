package Day2;
import java.util.Scanner;

public class HotelTariffCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking inputs
        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter daily rent: ");
        double dailyRent = scanner.nextDouble();
        System.out.print("Enter number of days stayed: ");
        int days = scanner.nextInt();

        // Validate the month
        if (month < 1 || month > 12) {
            System.out.println("Invalid Input");
        } else {
            // Check for peak season (April-June and November-December)
            boolean isPeakSeason = (month >= 4 && month <= 6) || (month >= 11 && month <= 12);
            if (isPeakSeason) {
                dailyRent *= 1.2; // Increase rent by 20%
            }

            // Calculate total tariff
            double totalTariff = dailyRent * days;
            System.out.printf("Total Tariff: %.2f\n", totalTariff);
        }

        scanner.close();
    }
}