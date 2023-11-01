import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class DateTimeFormatDemo {
    public static void main(String[] args) {

formatByCountry();
formatByPattern();
    }

    private static void formatByCountry() {
        // Định dạng thời gian theo đất nước
        LocalDate today = LocalDate.now();
        // Tạo ra country
        Locale vn = new Locale("vi", "VN");
        Locale jp = Locale.JAPAN;
        DateTimeFormatter formatter1 = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)
                .withLocale(vn);
        DateTimeFormatter formatter2 = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL) // Full là in ra tất cả
                .withLocale(jp);
        // Định dạng lại ngày tháng năm
        String formated = formatter1.format(today);
        System.out.println("today = " + formated);
        System.out.println("today = " + formatter2.format(today));

    }

    private static void formatByPattern() {
        LocalDate today = LocalDate.now();
        // Tạo ra pattern
        String pattern  = "yyyy-MM-dd";
        // Tạo ra người định dạng
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        // Định dạng lại ngày tháng năm
        String formated = formatter.format(today);
        System.out.println("today = " + formated);

    }
}