import java.time.LocalDate;
import java.util.Scanner;

public class Excercise5 {

    public static void main(String[] args) {
    }
        public static void question04() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập vào ngày sinh của bạn (yyyy-MM-dd):");
            String bornday = scanner.next();
            LocalDate birthday = LocalDate.parse(bornday);
            System.out.println("birthday = " + birthday);
        }
    }

