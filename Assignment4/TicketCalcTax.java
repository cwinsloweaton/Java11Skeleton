public class TicketCalcTax {
    public static void main(String[] args) {
        double ticketCost = 23.45;
        double ticketAmount = 8;
        double preTaxPrice = ticketCost * ticketAmount;
        double taxAmount = preTaxPrice * 0.12;
        double totalCost = preTaxPrice * 1.12;
        
        System.out.println("Total Cost: " + totalCost);
        System.out.println("Total Tax: " + taxAmount);
        System.out.println("Total with tax: " + totalCost);
    }
}
