import java.util.Scanner;

public class LastChanceGas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int tankCapacity, fuelTankPercent, vehicleMPG;
        final int distance = 200;
        
        System.out.println("Tank capacity: ");
        tankCapacity = scan.nextInt();
        
        System.out.println("Fuel percent remaining: ");
        fuelTankPercent = scan.nextInt();
        
        System.out.println("Vehicle MPG rating: ");
        vehicleMPG = scan.nextInt();
        
        int gallonsRemaining = (fuelTankPercent * tankCapacity) / 100;
        
        int range = 
    }
}