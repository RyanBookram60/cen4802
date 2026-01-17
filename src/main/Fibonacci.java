import java.util.Scanner;

public class Fibonacci {

    public static int inputNum;

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter a number to find its fibonacci number: ");
        inputNum = scnr.nextInt();

        System.out.println("The \"" + inputNum + "\" fibonacci number is: " + fibonacciNum(inputNum));

    }

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
