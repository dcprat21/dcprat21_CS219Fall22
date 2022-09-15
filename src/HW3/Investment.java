//Desmond Pratt
//September 15th, 2022

package HW3;

// importing scanner so user can make inputs
import java.util.Scanner;

// public class for investment
public class Investment {

    // returning and creating investment formula
    public static double investment(double c, double r, int t, int n){ return c * Math.pow(1 + r/n, t*n);
    }

    // creating main function, so user can input numbers
    public static void main(String [] args){

        // scanner is used, so user can import inputs
        Scanner s = new Scanner(System.in);

        // having user input initial deposit
        System.out.print("Please enter the initial deposit: ");

        // Identifying the error of when the user does not input a numeral value.
        if (!s.hasNextDouble()){
            String word = s.next();
            System.err.println(word + " is an invalid input because it is not a numeral.");
            return;
        }

        // creating the numeral a double (has a decimal)
        double c = s.nextDouble();

        // identifying an error if user inputs a negative number.
        if ( c < 0){
            System.err.println(c + " is not a valid input because it is a negative number.");
        }

        // having user input an interest rate
        System.out.print("Please enter the interest rate: ");

        // Identifying the error of when the user does not input a numeral value.
        if (!s.hasNextDouble()) {
            String word = s.next();
            System.err.println(word + " is an invalid input because it is not a numeral.");
            return;
        }

        // creating the numeral a double (has a decimal)
        double r = s.nextDouble();

        // creating an if statement to determine an error if the user does not input a number between 0 & 1 to show the percentage
        if (r < 0){
            System.err.println(r + " is not valid because it needs to be in decimal form and has to be between 0 and 1.");
        }
        else if (r > 1){
            System.err.println(r + " is not valid because it needs to be in decimal form and has to be between 0 and 1.");
        }

        // having user input number of years
        System.out.print("Please enter the number of years: ");


        // identifying an error if user does not input a numeral value.
        if (!s.hasNextInt()) {
            String word = s.next();
            System.err.println(word + " is an invalid input because it is not a numeral.");
            return;
        }

        // creating the numeral an integer
        int t = s.nextInt();

        // identifying an error when the number of years is less than 0
        if (t < 0){
            System.err.println(t + " is not valid because the number of years cannot be a negative number.");
        }

        // having user input the number of times to compound per year
        System.out.print("Please enter the number of times to compound per year: ");

        // identifying an error if the user does not input a numeral value
        if (!s.hasNextDouble()) {
            String word = s.next();
            System.err.println(word + " is an invalid input because it is not a numeral.");
            return;
        }

        // Creating the numeral an integer
        int n = s.nextInt();

        // identifying an error when the number of times to compound per year is less than 0
        if (n < 0){
            System.err.println(n +" is not valid because you cannot compound per year with negative numbers.");
        }


        // printing the investment if there are no errors
        System.out.printf("Your investment is worth %.2f", Investment.investment(c,r,t,n));

    }

}
