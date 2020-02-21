import java.util.Scanner;

class AnnualApplianceCost {
    public static void main(String[] args) {
        double costPerKwh;
        double kwhPerYear;
        double annualCost;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter cost per kilowatt-hour in cents:");
        costPerKwh = scan.nextDouble();
        
        System.out.println("Enter kilowatt-hours used per year:");
        kwhPerYear = scan.nextDouble();
        
        annualCost = costPerKwh * kwhPerYear;
        
        System.out.println("Annual cost: " + annualCost);
    }
}