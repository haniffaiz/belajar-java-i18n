package programmer.zaman.now.i18n;

import org.junit.jupiter.api.Test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest {

    @Test
    void testNumberFormat() {
        var numberFormat = NumberFormat.getNumberInstance();
        var format = numberFormat.format(10000000.255);

        System.out.println(format);
    }

    @Test
    void testNumberFormatIndonesia() {
        Locale locale = new Locale("in", "ID");

        var numberFormat = NumberFormat.getNumberInstance(locale);
        var format = numberFormat.format(10000000.255);

        System.out.println(format);
    }

    @Test
    void testNumberFormatParseIndonesia() {
        Locale locale = new Locale("in", "ID");
        var numberFormat = NumberFormat.getNumberInstance(locale);

        try {
            var result = numberFormat.parse("10000000.255").doubleValue();
            System.out.println(result);

        }catch (ParseException e){
            System.out.println("Error parse : "+e.getMessage());
        }


    }
}
