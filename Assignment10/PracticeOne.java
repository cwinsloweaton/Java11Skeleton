import java.util.Scanner;

public class PracticeOne {
    public static void main(String[] args) {
        // The user will be prompted to enter a number.
        // The program will output an amount of asterisks (*),
        // on the same line, equal to the entered number.
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter an integer: ");
        int amount = scan.nextInt();
        int count = 0;
        
        while (count < amount) {
            System.out.print("*");
            
            count++;
        }
        
        System.out.println();
    }
}