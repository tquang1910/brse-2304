public class ContinueDemo {
    public static void main(String[] args) {
        // Continue: Bỏ qua phần tử hiện tại, tiếp tục lặp phần tử tiếp theo
        //=> Những câu lệnh dưới continue không được chạy
        String[] names = {"Duy", "Hùng","Đức", "Trang"};

        for (String name : names) {
            System.out.println("Đang tìm kiếm");
            if (!name.equals("Hùng")){
                System.out.println("Tìm kiếm người tiếp theo");
                continue;
            }
            System.out.println("Đã tìm thấy Hùng. ");
            break;
        }
        System.out.println("Tìm kiếm xong");




    }

}
