import java.util.Scanner;

class PieEatingContest {
    public static void main(String[] args) {
        // At the State Fair Pie Eating Contest all contestants in the
        // heavyweight division must weigh within 30 pounds of 250 pounds. 
        // Write a program that asks for a contestant's weight and then
        // says if the contestant is allowed in the contest.
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter weight: ");
        
        int weight = scan.nextInt();
        
        if (weight >= 220 && weight <= 280) {
            
        } else {
            
        }
    }
}