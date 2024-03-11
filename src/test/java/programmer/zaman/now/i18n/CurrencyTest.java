package programmer.zaman.now.i18n;

import org.junit.jupiter.api.Test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Currency;
import java.util.Locale;

public class CurrencyTest {
    @Test
    void testCurrencyIndonesia() {
        Locale locale = new Locale("in", "ID");
        var currency = Currency.getInstance(locale);

        System.out.println(currency.getDisplayName());
        System.out.println(currency.getCurrencyCode());
        System.out.println(currency.getSymbol());
    }

    @Test
    void testCurrencyUSA() {
        Locale locale = new Locale("en", "US");
        var currency = Currency.getInstance(locale);

        System.out.println(currency.getDisplayName());
        System.out.println(currency.getCurrencyCode());
        System.out.println(currency.getSymbol());
    }

    @Test
    void testNumberFormatCurrencyIndonesia() {
        Locale locale = new Locale("in", "ID");
        var numberFormat = NumberFormat.getCurrencyInstance(locale);

        var format = numberFormat.format(1000000);
        System.out.println(format);
    }

    @Test
    void testNumberFormatCurrencyParseIndonesia() {
        Locale locale = new Locale("in", "ID");
        var numberFormat = NumberFormat.getCurrencyInstance(locale);

        try {
            var parse = numberFormat.parse("Rp900.000,25").doubleValue();
            System.out.println(parse);
        }catch (ParseException e){
            System.out.println("Error:"+e.getMessage());
        }
    }

}
