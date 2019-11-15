public class TicketCalcTax {
    public static void main(String[] args) {
        double ticketCost = 23.45;
        double ticketAmount = 8;
        double totalCost = ticketCost * ticketAmount;
        double taxAmount = totalCost * 0.12;
        System.out.println("Total Cost: " + totalCost);
    }
}
