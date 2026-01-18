import java.util.Scanner;

/**
 * This class serves the purpose of returning the Nth fibonacci number based on user input.
 * The term is received using a recursive method call.
 * <p>
 * @author Ryan Bookram
 * @version 1.0
 * </p>
 */
public class Fibonacci {

    public static int inputNum;

    public static void main(String[] args) throws Exception {

        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter a number to find its fibonacci number: ");
        inputNum = scnr.nextInt();

        System.out.println("The \"" + inputNum + "\" fibonacci number is: " + fibonacciNum(inputNum));

    }

    /**
     * Calculates the Nth term fibonacci number using a recursive method call.
     * @param n The Nth term of the Fibonacci sequence to be found.
     * @return The calculated fibonacci number based on the Nth term input.
     */
    public static int fibonacciNum(int n){
        if (n == 0) {
            return 0;
        }
        else if (n == 1) {
            return 1;
        }
        else {
            return fibonacciNum(n - 1) + fibonacciNum(n - 2);
        }
    }
}
