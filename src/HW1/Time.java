package HW1;

public class Time {
    public static void main(String[] args) {
        //Hour of starting project
        int hour;
        hour = 18;

        //Minute of starting project
        int minute;
        minute = 33;

        //Second of starting project
        int second;
        second = 20;

        //Calculating seconds since midnight
        System.out.print("18:33:20 is ");
        System.out.print(second + (minute * 60) + (hour * 3600));
        System.out.println(" seconds since midnight.");

        //Calculating seconds until midnight
        System.out.print("There are ");
        System.out.print(86400 - (second + (minute * 60) + (hour * 3600)));
        System.out.println(" seconds remaining.");

        //Calculating the percentage of the day
        /*
        System.out.print((second + (minute * 60) + (hour * 3600))/86400); = 0.77
         */
        System.out.print(100 * (second + (minute * 60) + (hour * 3600)) / 86400);
        System.out.println("% of the day has elapsed.");
    }
}