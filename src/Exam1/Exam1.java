package Exam1;

import java.util.Scanner;

public class Exam1{
    public static void main(String [] args){
        Scanner kbd = new Scanner(System.in);
        int n = getNumber(kbd);
        System.out.println("Your number is..." + n);


    }

    public static int getNumber(Scanner s){
        boolean valid = false;
        int getNumber = 0;

        while ( !valid ){
            System.out.println("Please enter a string of numbers: ");
            if (s.hasNextInt()){
                getNumber = s.nextInt();
                if(getNumber < 0){
                    System.out.printf("Error: number of years cannot be negative. You entered " + getNumber);
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
        return getNumber;


        }


}
