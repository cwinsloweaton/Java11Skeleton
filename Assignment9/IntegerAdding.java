import java.util.Scanner;

class IntegerAdding {
    public static void main(String[] args) {
        // Write a program that adds up integers that the user enters. 
        // First the programs asks how many numbers will be added up. 
        // Then the program prompts the user for each number. 
        // Finally it prints the sum.
        Scanner scan = new Scanner(System.in);
        System.out.println("How many numbers will be added up: ");
        int sum = 0;
        int numAmount = scan.nextInt();
        
        int count = 0;
        while (count < numAmount) {
            System.out.println("Enter an integer: ");
            sum += scan.nextInt();
            
            count++;
        }
        
        System.out.println(sum);
    }
}