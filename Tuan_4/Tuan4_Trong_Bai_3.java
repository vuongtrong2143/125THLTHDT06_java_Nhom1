import java.util.Scanner;

public class Tuan4_Trong_Bai_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Hien thi menu
        System.out.println("----- CHUONG TRINH CAC PHEP TINH CO BAN -----");
        System.out.println("1. Phep cong (+)");
        System.out.println("2. Phep tru (-)");
        System.out.println("3. Phep nhan (*)");
        System.out.println("4. Phep chia (/)");
        System.out.print("Vui long chon mot phep tinh (1-4): ");

        // Lay lua chon tu nguoi dung
        int luaChon = scanner.nextInt();

        // Yeu cau nguoi dung nhap hai so
        System.out.print("Nhap so thu nhat: ");
        double so1 = scanner.nextDouble();
        System.out.print("Nhap so thu hai: ");
        double so2 = scanner.nextDouble();

        double ketQua = 0;

        // Su dung switch de thuc hien phep tinh duoc chon
        switch (luaChon) {
            case 1:
                ketQua = so1 + so2;
                System.out.println("Ket qua cua phep cong la: " + ketQua);
                break;
            case 2:
                ketQua = so1 - so2;
                System.out.println("Ket qua cua phep tru la: " + ketQua);
                break;
            case 3:
                ketQua = so1 * so2;
                System.out.println("Ket qua cua phep nhan la: " + ketQua);
                break;
            case 4:
                // Xử lý trường hợp chia cho 0
                if (so2 != 0) {
                    ketQua = so1 / so2;
                    System.out.println("Ket qua cua phep chia la: " + ketQua);
                } else {
                    System.out.println("Loi: Khong the chia cho 0!");
                }
                break;
            default:
                System.out.println("Lua chon khong hop le. Vui long chon tu so 1-4.");
                break;
        }
        scanner.close();
    }
}