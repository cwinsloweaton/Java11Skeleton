import java.util.Scanner;

class DTicketCalc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double ticketPrice, totalCost;
        int quantity;
        
        System.out.println("Enter price per ticket: ");
        ticketPrice = scan.nextDouble();
        
        System.out.println("Enter amount of tickets: ");
        quantity = scan.nextInt();
        
        totalCost = ticketPrice * quantity;
        
        System.out.println("Total cost: " + totalCost);
    }
}