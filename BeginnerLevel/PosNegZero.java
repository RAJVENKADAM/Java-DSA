import java.util.Scanner;

public class PosNegZero {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter any number: ");
            double n = sc.nextDouble();

            if (n > 0) {
                System.out.println(n + " is Positive number.");
            } 
            else if (n == 0) {
                System.out.println(n + " is Zero.");
            } 
            else {
                System.out.println(n + " is Negative number.");
            }
        }
    }
}