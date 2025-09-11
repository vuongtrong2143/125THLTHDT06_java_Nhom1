import java.util.Scanner;

public class tuan3bai4 {
    public static void main(String[] args) {
        // Khai báo biến
        double soTienGoi;
        double laiSuatHangNam;
        int soThangGoi;
        double soTienLai;
        double tongSoTienCuoiKy;

        // Tạo đối tượng Scanner để nhận dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);

        // Nhập thông tin từ người dùng
        System.out.print("Nhap so tien gui: ");
        soTienGoi = scanner.nextDouble();

        System.out.print("Nhap lai suat hang nam (%): ");
        laiSuatHangNam = scanner.nextDouble();

        System.out.print("Nhap so thang gui: ");
        soThangGoi = scanner.nextInt();

        // Tính lãi suất hàng tháng
        double laiSuatHangThang = laiSuatHangNam / 100 / 12;

        // Tính tiền lãi
        soTienLai = soTienGoi * laiSuatHangThang * soThangGoi;

        // Tính tổng số tiền cuối kỳ
        tongSoTienCuoiKy = soTienGoi + soTienLai;

        // In kết quả
        System.out.println("------------------------------------");
        System.out.printf("So tien lai: %.2f\n", soTienLai);
        System.out.printf("Tong so tien cuoi ky: %.2f\n", tongSoTienCuoiKy);

        // Đóng đối tượng Scanner
        scanner.close();
    }
}