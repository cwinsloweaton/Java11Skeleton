import java.util.Scanner;

class WordEcho {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int count;
        String inputString;
        int times;

        System.out.println("Enter word:");
        inputString = scan.nextLine();

        times = inputString.length();

        count = 1;

        while (count<=times) {
            System.out.println(inputString);
            count = count + 1;
        }
    }
}