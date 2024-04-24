import java.util.Scanner;

public class LargestNumberExample1 {
    public static void main(String[] args) {
        int a, b, c, largest, temp;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number:");
        a = sc.nextInt();
        System.out.println("Enter the second number:");
        b = sc.nextInt();
        System.out.println("Enter the third number:");
        c = sc.nextInt();

        // Compare a and b, store the largest number in a temp variable
        temp = a > b ? a : b;

        // Compare the temp variable with c and store the result in the 'largest' variable
        largest = c > temp ? c : temp;

        // Print the largest number
        System.out.println("The largest number is: " + largest);
    }
}
