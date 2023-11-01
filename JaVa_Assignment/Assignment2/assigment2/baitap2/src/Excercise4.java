package Excercise;

import java.time.LocalDate;
import java.util.Random;

public class Excercise4 {



        public static void question01 () {
            Random random = new Random();
            System.out.println("Số nguyên ngẫu nhiên là " + random.nextInt());
        }
        public static void question02 () {
            Random random = new Random();
            System.out.println("Số thực ngẫu nhiên là " + random.nextFloat());
        }
        public static void question03 () {
            Random random = new Random();
            String[] names = {"Hoa", "Dũng", "Quang", "Toàn", "Thơ"};
            int index = random.nextInt(names.length);
            System.out.println("Tên ngẫu nhiên: " + names[index]);
        }
            public static void question04 () {
                Random random1 = new Random();
                LocalDate maxDate = LocalDate.now();
                int minDay = 0;
                int maxDay = (int) maxDate.toEpochDay();
                int randomDay = random1.nextInt(maxDay - minDay);
                LocalDate randomDate = LocalDate.ofEpochDay(randomDay);
                System.out.println("randomDate = " + randomDate);
            }




        }
