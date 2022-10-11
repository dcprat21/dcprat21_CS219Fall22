package Exam1;

import java.util.Scanner;

public class Exam1 {
    public static void main(String[] args) {

        // scanner is used, so user can import inputs
        Scanner s = new Scanner(System.in);

        System.out.print("Please enter a string of numbers: ");

        boolean valid = false;
        int getNumber = 0;

        int n = 0;
        while (!valid) {
            System.out.print("Please enter a string of numbers: ");
            if (s.hasNextInt()) {
                getNumber = s.nextInt();
                if (getNumber < 0) {
                    System.out.printf("Error: number of years cannot be negative. You entered " + getNumber);
                    System.out.println("");
                } else {
                    valid = true;
                }
                while (getNumber > 0) {
                    int check = 0;
                    check = getNumber % 10;
                    getNumber = getNumber / 10;

                    if (check > 2 && check < 7) {
                        n = n + 1;
                    }


                }

            } else {
                String word = s.next();
                System.out.println("Your input is invalid because it is not a numeral value. You said: " + word);
            }


        }

        System.out.println("Your number is..." + n);
    }
}