import java.util.Scanner;

class FMadLibs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String name;
        int x;
        double y;
        boolean z;
        
        System.out.println("Enter a name: ");
        name = scan.nextLine();
        
        System.out.format("Welcome, %s! %s %s %s", name, name, name, name);
    }
}