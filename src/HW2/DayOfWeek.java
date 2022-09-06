//Desmond Pratt
//September 6th, 2022
//HW#2, Day of the week
package HW2;

//Importing Scanner, so user can input the necessary information
import java.util.Scanner;

public class DayOfWeek {
    //Creating class and statistic that will identity what day of the week it is numbers
    public static int date(int m, //month2
                              int d, //day
                              int y ) { //year
        //Mathematical formula to find out the day of the week in numbers
        int y1 = y- (14 - m )/12;
        int x = y1 + y1/4 - y1/100 + y1/400;
        int m1 = m + 12 * ((14 - m)/12) - 2;
        int d1 = (d + x + 31 * m1/12) % 7;

        //returning the day of the week in numbers
        return d1;
    }
    //Creating a main program, so the user can input the necessary information
    public static void main(String [] args) {
        Scanner kbd = new Scanner(System.in);

        //User enters the month
        System.out.print("Enter the month: ");
        int month = kbd.nextInt();

        //User enters the day
        System.out.print("Enter the day: ");
        int day = kbd.nextInt();

        //User enters the year
        System.out.print("Enter the year: ");
        int year = kbd.nextInt();

        //Finished product and finding out what day of the week in numbers it is
        System.out.printf("The day of the week for %d %d %d is ...%d", month, day, year, date(month, day, year));
    }

}
