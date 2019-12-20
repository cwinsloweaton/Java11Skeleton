import java.util.Scanner;

class CAgeCalc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int age, days;
        
        System.out.println("Enter age: ");
        age = scan.nextInt();
        
        days = 365 * age;
        
        System.out.println("You have been alive at least: " + days + " days");
    }
}