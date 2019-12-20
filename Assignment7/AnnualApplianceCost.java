import java.util.Scanner;

public class AnnualApplianceCost {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double costPerKwh;
        int yearlyKwhUsed;
        double annualCost;
        
        System.out.println("Enter cost per kilowatt-hour in cents");
        costPerKwh = scan.nextDouble();
        
        annualCost = costPerKwh * yearlyKwhUsed;
        
        System.out.println("Annual cost: " + annualCost);
    }
}