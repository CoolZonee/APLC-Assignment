package main.java;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateAndTime {
    private static DateFormat date = new SimpleDateFormat("dd/MM/yy");
    private static DateFormat time = new SimpleDateFormat("HH:mm:ss");
    private static Calendar calendarObj;
    
    public static String getCurrentTime(){
        return time.format(calendarObj.getInstance().getTime());
    }
    public static String getCurrentDate(){
        return date.format(calendarObj.getInstance().getTime());
    }
}
