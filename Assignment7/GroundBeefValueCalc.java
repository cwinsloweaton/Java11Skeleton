import java.util.Scanner;

class GroundBeefValueCalc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Price per pound package A: ");
        double pricePerPoundA = scan.nextDouble();
        
        System.out.println("Percent lean package A: ");
        int percentLeanA = scan.nextInt();
        
         
        double pricePerPoundLeanA = (pricePerPoundA * 100) / percentLeanA;
        
        if () {
            
        } else {
            
        }
        
    }
}