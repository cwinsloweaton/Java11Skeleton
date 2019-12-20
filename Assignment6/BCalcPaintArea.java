import java.util.Scanner;

class BCalcPaintArea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        long width, height, area;
        double paintPrice, totalPaintPrice;
        
        System.out.println("Enter a width:");
        width = scan.nextInt();
        
        System.out.println("Enter a height:");
        height = scan.nextInt();
        
        System.out.println("Enter the price of paint per area unit:");
        paintPrice = scan.nextDouble();
        
        area = width * height;
        
        totalPaintPrice = area * paintPrice;
        
        System.out.println("Cost to paint: $" + totalPaintPrice);
    }
}