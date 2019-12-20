import java.util.Scanner;

class EEggCalc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int eggAmount, eggDozens, eggSingles;
        
        System.out.println("Enter amount of eggs: ");
        eggAmount = scan.nextInt();
        
        eggDozens = eggAmount / 12;
        eggSingles = eggAmount % 12;
        
        System.out.println("You have " + eggDozens + " dozen and " + eggSingles + " eggs.");
    }
}