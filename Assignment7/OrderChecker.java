import java.util.Scanner;

public class OrderChecker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        final int boltPrice = 5;
        final int nutPrice = 3;
        final int washerPrice = 4;
        
        int boltAmount, nutAmount, washerAmount;
        
        if (nutAmount < boltAmount) {
            System.out.println("Check the Order: too few nuts");
        }
        
        if (washerAmount * 2 < boltAmount) {
            
        }
        
        int totalCost = (boltAmount * boltPrice) + (nutAmount * nutPrice) + (washerPrice * washerAmount);
    }
}