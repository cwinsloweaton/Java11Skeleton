import java.util.Scanner;
class WordsDots {
    public static void main(String[] args) {
        final int totalLength = 30;
        
        Scanner scan = new Scanner(System.in);
        //Get first input
        String firstWord;
        System.out.println("Enter first word:");
        firstWord = scan.nextLine();
        //Get second input
        String secondWord;
        System.out.println("Enter second word:");
        secondWord = scan.nextLine();
        
        //Determine how many dots we'll need
        int dotAmount = 5;
        //Output
        int count = 1;
        System.out.print(firstWord);
        while (count <= dotAmount) {
            System.out.print('.');
            
            count++;
        }
        System.out.println(secondWord);
    }
}