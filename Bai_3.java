import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập hai số nguyên
        System.out.print("Nhập số nguyên thứ nhất: ");
        int a = scanner.nextInt();

        System.out.print("Nhập số nguyên thứ hai: ");
        int b = scanner.nextInt();

        // Tính toán
        int tong = a + b;
        int hieu = a - b;
        int tich = a * b;

        // Kiểm tra chia cho 0 trước khi tính thương và phần dư
        if (b != 0) {
            int thuong = a / b;
            int phanDu = a % b;

            // In kết quả
            System.out.println("Tổng: " + tong);
            System.out.println("Hiệu: " + hieu);
            System.out.println("Tích: " + tich);
            System.out.println("Thương: " + thuong);
            System.out.println("Phần dư: " + phanDu);
        } else {
            System.out.println("Không thể chia cho 0!");
            System.out.println("Tổng: " + tong);
            System.out.println("Hiệu: " + hieu);
            System.out.println("Tích: " + tich);
        }

        scanner.close();
    }
}
