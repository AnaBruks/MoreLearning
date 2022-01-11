import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Time {
    public static void main(String[] args) {
        // Date date = new Date(10_000_000_000L);
  //      Date date2 = new Date();

//        Calendar calendar = new GregorianCalendar();
//        calendar.set(Calendar.YEAR, 2017);
//        calendar.set(Calendar.MONTH, 0);
//        calendar.set(Calendar.DAY_OF_MONTH, 25);
//        calendar.set(Calendar.HOUR_OF_DAY, 19);
//        calendar.set(Calendar.MINUTE, 42);
//        calendar.set(Calendar.SECOND, 12);
//
//        System.out.println(calendar.getTime());

        SimpleDateFormat formatter = new SimpleDateFormat("EEE, MMMM d, yyyy", Locale.ENGLISH);
        String strDate = "Sat, April 4, 2020";

        try {
            Date date = formatter.parse(strDate);
            System.out.println(formatter.format(date));
        }
        catch (ParseException e) {
            e.printStackTrace();
        }
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE, d MMMM yyyy");
        Calendar calendar = new GregorianCalendar(2017, Calendar.JANUARY , 25);
        System.out.println(dateFormat.format(calendar.getTime()));

    }
}
