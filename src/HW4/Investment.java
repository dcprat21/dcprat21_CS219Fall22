//Desmond Pratt
//September 21st, 2022
//HW4
package HW4;

//importing Scanner so user can make inputs
import java.util.Scanner;

// public class for investment
public class Investment {
    // returning and creating investment formula
    public static double investment(double c, double r, int t, int n){
        return c * Math.pow(1 + r/n, t*n);
    }

    // Creating a getInitialDeposit class, so we can create a "while loop" to get the correct initial deposit from the user
    public static double getInitialDeposit(Scanner s){
        boolean valid = false;
        double initialDeposit = 0;

        // Creating while loop so the user inputs a number >= 0 and inputs a numeral value.
        while ( !valid ){
            System.out.print("Please enter the initial deposit: ");

            if (s.hasNextDouble()){
                initialDeposit = s.nextDouble();
                if (initialDeposit < 0){
                    System.out.printf("Error: initial deposit cannot be negative. You entered " + initialDeposit );
                    System.out.println("");
                }
                else{
                    valid = true;
                }
            }
            else{
                String word = s.next();
                System.out.println("Your input is invalid because it is not a numeral value. You said: " + word);
            }
        }
        // returning the initial value
        return initialDeposit;
    }

    // Creating a getInterestRate class, so we can create a "while loop" to get the correct interest rate from the user
    public static double getInterestRate(Scanner s){
        boolean valid = false;
        double interestRate = 0;

        // Creating while loop so the user inputs a number between 0 and 1 and inputs a numeral value.
        while (!valid){
            System.out.print("Please enter the interest rate: ");

            if (s.hasNextDouble()){
                interestRate = s.nextDouble();
                if (interestRate < 0){
                    System.out.printf("Error: interest rate cannot be below 0 or above 1. You entered " + interestRate);
                    System.out.println("");
                }
                else if (interestRate > 1){
                    System.out.printf("Error: interest rate cannot be below 0 or above 1. You entered " + interestRate);
                    System.out.println("");
                }
                else{
                    valid = true;
                }
            }
            else{
                String word = s.next();
                System.out.println("Your input is invalid because it is not a numeral value. You said: " + word);
            }
        }
        // Returning the interest rate
        return interestRate;
    }

    //  Creating a getNumberOfYears class, so we can create a "while loop" to get the correct number of years from the user
    public static int getNumberOfYears(Scanner s){
        boolean valid = false;
        int numberOfYears = 0;

        // Creating while loop so the user inputs a number >= 0 and inputs a numeral value.
        while (!valid){
            System.out.print("Please Enter the number of years: ");

            if (s.hasNextInt()){
                numberOfYears = s.nextInt();
                if(numberOfYears < 0){
                    System.out.printf("Error: number of years cannot be negative. You entered " + numberOfYears);
                    System.out.println("");
                }
                else valid = true;
            }
            else{
                String word = s.next();
                System.out.println("Your input is invalid because it is not a numeral value. You said: " + word);
            }
        }
        // Returning the number of years
        return numberOfYears;
    }

    // Creating a getCompoundPerYear class, so we can create a "while loop" to get the correct number of years from the user
    public static int getCompoundPerYear(Scanner s){
        boolean valid = false;
        int compoundPerYear = 0;

        // Creating while loop so the user inputs a number >= 0 and inputs a numeral value.
        while(!valid){
            System.out.print("Please enter the compound per year: ");

            if(s.hasNextInt()){
                compoundPerYear = s.nextInt();
                if (compoundPerYear < 0){
                    System.out.printf("Error: number of years cannot be negative. You entered " + compoundPerYear);
                    System.out.println("");
                }
                else{
                    valid = true;
                }
            }
            else{
                String word = s.next();
                System.out.println("Your input is invalid because it is not a numeral value. You said: " + word);
            }
        }
        // Returning the compound per year
        return compoundPerYear;
    }

    // Creating main function to print total investment
    public static void main(String [] args){
        Scanner kbd = new Scanner(System.in);

        // Getting the different "get" classes value and putting it into variable in order to print the total investment
        double initialDeposit = getInitialDeposit(kbd);
        double interestRate = getInterestRate(kbd);
        int numberOfYears = getNumberOfYears(kbd);
        int compoundPerYear = getCompoundPerYear(kbd);

        // Printing total investment
        System.out.printf("Your investment is worth: %.2f",
                Investment.investment(initialDeposit, interestRate, numberOfYears, compoundPerYear));


    }
}
