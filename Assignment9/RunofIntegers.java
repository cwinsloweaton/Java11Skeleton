import java.util.Scanner;

class RunofIntegers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int runStart;
        int runEnd;
        
        System.out.println("Enter Start:");
        runStart = scan.nextInt();
        
        System.out.println("Enter End:");
        runEnd = scan.nextInt();

        while (runStart <= runEnd) {
            System.out.println(runStart);
            runStart += 1;
        }
    }
}