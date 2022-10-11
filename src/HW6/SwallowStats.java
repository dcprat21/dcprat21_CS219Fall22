package HW6;

// importing the necessary tools to use in the program
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;



public class SwallowStats {
    //Public void class to print the average, maximum, and minimum swallow speed
    public static void SwallowStats(){
        // connect to the web  avgSwalpage of speeds
        URL url = null; // null is the "nothing value"
        Scanner s = null;

        // The string from the website
        String path = "http://10.60.15.25/~ehar/cs219/swallow-speeds.txt";

        try {
            url = new URL(path); // create a URL object for the path
            s = new Scanner (url.openConnection().getInputStream());
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // Creating doubles and integers to find the average, min, and max
        double sum = 0.0;
        int count = 0;
        double min = Double.POSITIVE_INFINITY;
        double max = 0.0;
        double number = 0.0;
        double average = 0.0;
        // read each line of the web file
        while (s.hasNextLine()){

            // Creating a string line, so it will pick up the next number in the String
            String line = s.nextLine(); // read a line of the website

            // Creating an isEmpty, so it can skip the blank line
            if (line.isEmpty()){
                continue;
            }

            // Creating line.indecOf("#") == -1, so we can skip any invalid numbers and get the average speed
            if (line.indexOf("#") == -1){ // modify condition
                sum = sum + Double.parseDouble(line);
                count++;
                average = sum/count;

                number = Double.parseDouble(line);

                // Getting the minimum value
                if (number < min){
                    min = number;
                }

                // getting the maximum value
                if (number > max){
                    max = number;
                }
            }
        }

        // Printing the average, maximum, and minimum swallow speed
        System.out.println("The minimum value is... " + min);
        System.out.println("The maximum value is... " + max);
        System.out.printf("The average Swallow speed is %.2f ", average);
    }

    // Creating a main function so SwallowStats can get computed, and we can find the average speed, max, and min
    public static void main(String [] args){
        SwallowStats();
    }
}

