package programmer.zaman.now.i18n;

import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatTest {
    @Test
    void testDateFormat() {
        var pattern = "EEEE dd MMMM yyyy";
        var dateFormat = new SimpleDateFormat(pattern);

        var format = dateFormat.format(new Date());
        System.out.println(format);
    }

    @Test
    void testDateFormatIndonesia() {
        var pattern = "EEEE dd MMMM yyyy";
        Locale locale = new Locale("in", "ID");
        var dateFormat = new SimpleDateFormat(pattern, locale);

        var format = dateFormat.format(new Date());
        System.out.println(format);
    }

    @Test
    void testDateFormatJapan() {
        var pattern = "EEEE dd MMMM yyyy";
        Locale locale = new Locale("ja", "JP");
        var dateFormat = new SimpleDateFormat(pattern, locale);

        var format = dateFormat.format(new Date());
        System.out.println(format);
    }

    @Test
    void testDateFormatParseIndonesia() {
        var pattern = "EEEE dd MMMM yyyy";
        Locale locale = new Locale("in", "ID");
        var dateFormat = new SimpleDateFormat(pattern, locale);

        try{
            var date = dateFormat.parse("Rabu 12 Maret 2024");
            System.out.println(date);
        }catch (ParseException e){
            System.out.println("Error parse : "+e.getMessage());
        }
    }

    @Test
    void testDateFormatParseJapan() {
        var pattern = "EEEE dd MMMM yyyy";
        Locale locale = new Locale("ja", "JP");
        var dateFormat = new SimpleDateFormat(pattern, locale);

        try{
            var date = dateFormat.parse("火曜日 12 3月 2024");
            System.out.println(date);
        }catch (ParseException e){
            System.out.println("Error parse : "+e.getMessage());
        }
    }
}
