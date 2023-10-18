
public class Student {
    public String studentCode;
    public String fullName;
    public byte age;
    public String email;
    public String className;
    public double avgMark;

    // Function((Hàm); Java  dùng Method (phương thức)
// Constructor(Hàm/ Phương thức khởi tạo)
    public Student() {//Khởi tạo không tham số
    }

    public Student(String studentCode, String fullName, byte age, String email, String className, Double avgMark) {
        this.studentCode = studentCode;
        this.fullName = fullName;
        this.age = age;
        this.email = email;
        this.className = className;
        this.avgMark = avgMark;

    }
}
