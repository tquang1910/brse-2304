import assignment1.Exam;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Excercise3 {

    public static void question1() {
        Exam exam = new Exam();
        exam.title = "Java Core";
        exam.createddate = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)
                .withLocale(new Locale("vi", "VN"));
        System.out.println("Ngày thi là " + exam.createddate.format(formatter));
    }
    public static void question2(){
        Exam exam = new Exam();
        exam.createddate = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd-hh-mm-ss");
        System.out.println("Ngày thi là: " + exam.createddate.format(formatter));
    }
}
