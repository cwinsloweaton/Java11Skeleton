import java.util.Scanner;

class FantasyGame {
    public static void main(String[] args) {
        String characterName;
        int strength, health, luck;
        final int maxPoints = 15;
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to quest game!");
        
        
        int totalPoints = strength + health + luck;
        
        System.out.println("%.2f".format(strength));
        
        System.out.println(characterName + ", strength: " + strength + ", health: " + health);
    }
}