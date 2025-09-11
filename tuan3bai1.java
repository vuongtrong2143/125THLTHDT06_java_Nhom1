import java.util.Scanner;

public class tuan3bai1 {
    public static void main(String[] args) {
        // Tạo đối tượng Scanner để đọc dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);

        // Hiển thị thông báo yêu cầu người dùng nhập tên
        System.out.print("Vui long nhap ten: ");

        // Đọc tên người dùng nhập vào và lưu vào biến 'name'
        String name = scanner.nextLine();

        // In ra màn hình lời chào "Hello + tên"
        System.out.println("Hello " + name);

        // Đóng đối tượng Scanner để giải phóng tài nguyên
        scanner.close();
    }  
}
