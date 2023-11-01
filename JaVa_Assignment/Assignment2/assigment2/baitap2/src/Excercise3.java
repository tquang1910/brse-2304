package Excercise;

import assignment1.Exam;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Excercise3 {

    public static void question1() {
        LocalDateTime today = LocalDateTime.now();
        Locale vn = new Locale("vi", "VN");
        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL)
                .withLocale(vn);
        String formated = formatter.format(today);
        System.out.println("Today is : " + formated);
    }

}
