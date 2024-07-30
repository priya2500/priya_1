import java.util.Scanner;

public class LargestSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input three numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        
        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();
        
        // Find the largest number
        int largest = Math.max(num1, Math.max(num2, num3));
        
        // Calculate the average
        double average = (num1 + num2 + num3) / 3.0;
        
        // Display the sum of the largest number (since it's the largest, it's added once)
        System.out.println("The sum of the largest number (" + largest + ") is: " + largest);
        System.out.println("The average of the three numbers is: " + average);
        
        scanner.close();
    }
}

