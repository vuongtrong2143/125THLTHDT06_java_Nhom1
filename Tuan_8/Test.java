import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IQuanLySach quanLy = new QuanLySachImpl();

        int chon;
        do {
            System.out.println("\n====== MENU QUẢN LÝ SÁCH ======");
            System.out.println("1. Thêm sách giáo trình");
            System.out.println("2. Thêm sách tiểu thuyết");
            System.out.println("3. Hiển thị danh sách");
            System.out.println("4. Tìm kiếm sách");
            System.out.println("5. Xóa sách");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");
            chon = sc.nextInt();
            sc.nextLine();

            switch (chon) {
                case 1:
                    quanLy.themSach(new SachGiaoTrinh("GT01", "Lập trình Java", "Nguyễn Văn A", 2023, 5, 120000, "Kệ A1", "Công nghệ thông tin"));
                    break;
                case 2:
                    quanLy.themSach(new SachTieuThuyet("TT01", "Đắc nhân tâm", "Dale Carnegie", 2020, 3, 150000, "Kệ B3", "Kỹ năng sống"));
                    break;
                case 3:
                    quanLy.hienThiDanhSach();
                    break;
                case 4:
                    System.out.print("Nhập mã sách: ");
                    String ma = sc.nextLine();
                    Sach s = quanLy.timKiemSach(ma);
                    System.out.println(s != null ? s : "Không tìm thấy sách!");
                    break;
                case 5:
                    System.out.print("Nhập mã sách cần xóa: ");
                    quanLy.xoaSach(sc.nextLine());
                    break;
                case 0:
                    System.out.println("Thoát chương trình!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        } while (chon != 0);
    }
}