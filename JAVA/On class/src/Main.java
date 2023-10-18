import java.security.spec.RSAOtherPrimeInfo;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        /*
        *Data types
         * */
        // Primitive
        byte x = 2;
        short y = 1025;
        int z = 100000;
        long t = 1000000000;

        System.out.println("x= " + x);
        System.out.println("y= " + y);
        System.out.println("z= " + z);
        System.out.println("t= " + t);

        char ch1 = 'A';
        char ch2 = '&';
        char ch3 = '9';
        System.out.println("ch1= " + ch1);
        System.out.println("ch2= " + ch2);
        System.out.println("ch3= " + ch3);

        float a = 20.5f;
        double b = 156.83;

        System.out.println("a =" +a);
        System.out.println("b =" +b);

        /*
        * Sử dụng kiểu dữ liệu đối tượng
         */
        Student student = new Student();

        System.out.println(student);
        System.out.println("Full Name: " + student.fullName);
        System.out.println("Age: " + student.age);
        System.out.println("Class Name: " + student.className);
        student.className = "BrSE2304";
        System.out.println("Age: " + student.age);

        Student student1 = new Student("BrSE01", "Nguyen Quang Hai", (byte) 27, "quanghai@gmail.com", "BrSE2304", 8.5);
        Student student2 = new Student("BrSE02", "Doan Van Hau", (byte) 25, "vanhau@gmail.com", "BrSE2304", 9.5);

        System.out.println("Student1 FullName: " + student1.fullName + "; điểm trung bình: " + student1.avgMark);
        System.out.println("Student2 FullName: " + student2.fullName + "; điểm trung bình: " + student2.avgMark);
    }
}
