package HackerRank;
import java.util.Calendar;
/*
The Calendar class is an abstract class that provides methods for converting between a specific instant in time and a set of calendar fields such as YEAR, MONTH, DAY_OF_MONTH, HOUR, and so on, and for manipulating the calendar fields, such as getting the date of the next week.
You are given a date. You just need to write the method, , which returns the day on that date. To simplify your task, we have provided a portion of the code in the editor.
Example:
Month:8
day:14
year:17
The method should return  as the day on that date.
 */
import java.io.*;
import java.util.Scanner;

class Result {
    public static String findDay(int month, int day, int year) {
        Calendar c = Calendar.getInstance();
        c.set(year,month-1,day);

        int dayofweek = c.get(Calendar.DAY_OF_WEEK);

        String result = "";
        switch (dayofweek){
            case 1: result =  "SUNDAY";break;
            case 2: result = "MONDAY";break;
            case 3: result =  "TUESDAY";break;
            case 4: result =  "WEDNESDAY";break;
            case 5: result =  "THURSDAY";break;
            case 6: result =  "FRIDAY";break;
            case 7: result =  "SATURDAY";break;
        }
        return result;
    }
}
public class FindingDay {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Month, Day, Year");
        int month = scanner.nextInt();
        int day = scanner.nextInt();
        int year = scanner.nextInt();

        System.out.println(Result.findDay(month, day, year));
    }
}
