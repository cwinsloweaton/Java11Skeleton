public class PurchaseCalc {
    public static void main(String[] args) {
        double price = 1.47;
        int amount = 5;
        double totalCost = 0;
        // totalCost = price * amount;
        for (int i = 0; i < amount; i++) {
            totalCost = totalCost + price;
        }
        
        System.out.println("Total cost: " + totalCost);
    }
}