public class BreakDemo {
    public static void main(String[] args) {
        // Break: Thoát ra khỏi switch case, vòng lặp
        String[] names = {"Duy", "Hùng","Đức", "Trang"};
        for (String name : names) {
            System.out.println("Đang tìm kiếm");
            if (name.equals("Hùng")){
                System.out.println("Đã tìm thấy Hùng. ");
                break;
            }
            System.out.println("Tìm kiếm người tiếp theo");
        }
        System.out.println("Tìm kiếm xong");
    }

}
