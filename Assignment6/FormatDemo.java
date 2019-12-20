import java.util.Scanner;

class FormatDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int health = 10;
        int attack = 5;
        String name = "Grarg";
        System.out.println(Math.abs(Math.pow(12, 4)));
        System.out.format("Greetings, %s! You have %d health and %d attack.", name, health, attack);
    }
}