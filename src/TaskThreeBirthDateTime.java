import com.sun.xml.internal.fastinfoset.tools.XML_SAX_StAX_FI;

import java.util.Scanner;

public class TaskThreeBirthDateTime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //variable
        int monthDayMax = 0;

        //stores year and month
        int year = InputHelper.getRangedInt(scan, "What year were you born in? [1950, 2010]", 1950, 2010);
        int month = InputHelper.getRangedInt(scan, "What month were you born in? [1, 12]", 1, 12);

        //gives a maximum value to each month
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            monthDayMax = 31;
        } else if (month == 2) {
            monthDayMax = 29;
        } else {
            monthDayMax = 30;
        }

        //stores the day, hour, min
        int day = InputHelper.getRangedInt(scan, "What day were you born in? Input must within the range of days in a month.", 1, monthDayMax);
        int hour = InputHelper.getRangedInt(scan, "What hour were you born in? [1, 24]", 1, 24);
        int min = InputHelper.getRangedInt(scan, "What minute were you born in? [0, 59]", 0, 59);

        //returns the input
        System.out.printf("%-9s %4d", "Year:", year);
        System.out.printf("\n%-9s %4d", "Month:", month);
        System.out.printf("\n%-9s %4d", "Day:", day);
        System.out.printf("\n%-9s %4d", "hour:", hour);
        System.out.printf("\n%-9s %4d", "Min:", min);
    }
}
