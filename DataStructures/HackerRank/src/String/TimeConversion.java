package String;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class TimeConversion {
    public static String timeConversion(String s) {
//        DateTimeFormatter to12Time= DateTimeFormatter.ofPattern("HH:mm:ss a");
//        CharSequence ss= s.substring(0,s.length()-2);
//        DateTimeFormatter to24Time=DateTimeFormatter.ofPattern("HH:mm:ss");
//        LocalDateTime newFormat=LocalDate.parse(ss,to24Time.ISO_DATE).atStartOfDay();
//        return newFormat.toString();
        DateFormat inFormat = new SimpleDateFormat( "hh:mm:ssaa");
        DateFormat outFormat = new SimpleDateFormat( "HH:mm:ss");
        Date date= null;
        try {
            date = inFormat.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return outFormat.format(date);
    }
    public static void main(String[] args)  {
        System.out.println(timeConversion("07:05:45PM"));
    }
}
