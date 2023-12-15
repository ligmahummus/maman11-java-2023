import java.util.Scanner;

/**
 * Polynomial Equation class that helps calculating roots of polynomial.
 * 
 * @author Ariel Aharon
 * @version 12/2023
 */
public class Equation {
    public static void main(String[] args) {
        // Declare variables
        double a, b, c;

        // Assign a new scanner object
        Scanner scan = new Scanner(System.in);

        // Ask the user for the coefficients
        System.out.println("Enter 3 coefficients of the polynomial equation: ");

        // Assign the first in order input to the a variable
        a = scan.nextDouble();

        // Assign the second in order input to the b variable
        b = scan.nextDouble();

        // Assign the third in order input to the c variable
        c = scan.nextDouble();

        double delta = Math.pow(b, 2) - 4 * a * c;

        if (delta < 0) {
            System.out.println("There is no solution.");
        } else if (delta == 0) {
            double x1 = -b / (2 * a);
            System.out.println("There is 1 solution. X1 = " + x1 + ".");
        } else {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("There are 2 solutions. X1 = " + x1 + ", X2 = "
                    + x2 + ".");
        }

        scan.close();
    }
}