import java.util.Scanner;

class PracticeTwo {
    public static void main(String[] args) {
        // The user will be prompted to enter an integer.
        // The program will output a box of #'s where each side length is
        // equal to the entered number.
        // 3:
        // ###
        // ###
        // ###
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int sideLength = scan.nextInt();
        
        int rowCount = 0;
        while (rowCount < sideLength) {
            
            int count = 0;
            while (count < sideLength) {
                System.out.print("#");
                count++;
            }
            
            System.out.println();
            rowCount++;
        }
        
    }
}