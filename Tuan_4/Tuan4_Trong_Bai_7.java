import java.util.Scanner;

public class Tuan4_Trong_Bai_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so luong phan tu cua mang: ");
        int kichThuoc = scanner.nextInt();

        // Khai bao mang voi kich thuoc da nhap
        int[] mangSoNguyen = new int[kichThuoc];

        // Bước 3: Nhập tung phan tu vao mang
        System.out.println("Nhap cac phan tu cua mang:");
        for (int i = 0; i < kichThuoc; i++) {
            System.out.print("Phan tu thu " + (i + 1) + ": ");
            mangSoNguyen[i] = scanner.nextInt();
        }

        int tong = 0;
    
        for (int phanTu : mangSoNguyen) {
            tong += phanTu;
        }
        // In ra kết quả
        System.out.println("Tong cac phan tu trong mang la: " + tong);
        scanner.close();
    }
}
