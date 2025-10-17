public class Test {
    public static void main(String[] args) {
        QuanLySach ql = new QuanLySach();

        SachGiaoTrinh sg = new SachGiaoTrinh("Lập trình Java", "Nguyễn Văn A", 2020, 150, 50000, "Công nghệ thông tin");
        SachTieuThuyet st = new SachTieuThuyet("Harry Potter", "J.K. Rowling", 2018, 200, 80000, true);

        ql.themSach(sg);
        ql.themSach(st);

        System.out.println("===== DANH SÁCH SÁCH =====");
        ql.hienThiDanhSachSach();

        // Kiểm tra giao diện
        IKiemKe kiemKe = sg;
        System.out.println("\nKiểm tra tồn kho >= 100: " + kiemKe.kiemTraTonKho(100));
        kiemKe.capNhatViTri("Kho A1 - Kệ 5");
    }
}
