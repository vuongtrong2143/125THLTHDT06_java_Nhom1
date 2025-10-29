

package THLTHDT;

public class Test {
    public static void main(String[] args) {
        QuanLySach ql = new QuanLySach();

        // Tạo đối tượng SachGiaoTrinh
        SachGiaoTrinh sg1 = new SachGiaoTrinh(
            "GT001", "Lập trình Java", "Nguyễn Văn A",
            2022, 10, "Công nghệ thông tin", "Đại học"
        );
        SachGiaoTrinh sg2 = new SachGiaoTrinh(
            "GT002", "Toán cao cấp", "Trần Thị B",
            2021, 8, "Toán học", "Đại học"
        );

        // Tạo đối tượng SachTieuThuyet
        SachTieuThuyet st1 = new SachTieuThuyet(
            "TT001", "Harry Potter", "J.K. Rowling",
            2007, 15, "Giả tưởng", true
        );
        SachTieuThuyet st2 = new SachTieuThuyet(
            "TT002", "Doraemon", "Fujiko F. Fujio",
            1995, 20, "Thiếu nhi", true
        );

        // Thêm sách
        ql.themSach(sg1);
        ql.themSach(sg2);
        ql.themSach(st1);
        ql.themSach(st2);

        // Hiển thị
        ql.hienThiDanhSach();

        // Tìm kiếm
        System.out.println("\n>>> Tìm sách mã TT001:");
        System.out.println(ql.timSach("TT001"));

        // Cập nhật
        System.out.println("\n>>> Cập nhật số lượng GT002 -> 12:");
        ql.capNhatSoLuong("GT002", 12);
        ql.hienThiDanhSach();

        // Xóa
        System.out.println("\n>>> Xóa sách GT001:");
        ql.xoaSach("GT001");
        ql.hienThiDanhSach();
    }
}
=======
package THLTHDT;

public class Test {
    public static void main(String[] args) {
        QuanLySach ql = new QuanLySach();

        // Tạo đối tượng SachGiaoTrinh
        SachGiaoTrinh sg1 = new SachGiaoTrinh(
            "GT001", "Lập trình Java", "Nguyễn Văn A",
            2022, 10, "Công nghệ thông tin", "Đại học"
        );
        SachGiaoTrinh sg2 = new SachGiaoTrinh(
            "GT002", "Toán cao cấp", "Trần Thị B",
            2021, 8, "Toán học", "Đại học"
        );

        // Tạo đối tượng SachTieuThuyet
        SachTieuThuyet st1 = new SachTieuThuyet(
            "TT001", "Harry Potter", "J.K. Rowling",
            2007, 15, "Giả tưởng", true
        );
        SachTieuThuyet st2 = new SachTieuThuyet(
            "TT002", "Doraemon", "Fujiko F. Fujio",
            1995, 20, "Thiếu nhi", true
        );

        // Thêm sách
        ql.themSach(sg1);
        ql.themSach(sg2);
        ql.themSach(st1);
        ql.themSach(st2);

        // Hiển thị
        ql.hienThiDanhSach();

        // Tìm kiếm
        System.out.println("\n>>> Tìm sách mã TT001:");
        System.out.println(ql.timSach("TT001"));

        // Cập nhật
        System.out.println("\n>>> Cập nhật số lượng GT002 -> 12:");
        ql.capNhatSoLuong("GT002", 12);
        ql.hienThiDanhSach();

        // Xóa
        System.out.println("\n>>> Xóa sách GT001:");
        ql.xoaSach("GT001");
        ql.hienThiDanhSach();
    }
}

=======

/**
 * Lớp Test chứa hàm main để chạy chương trình quản lý sách.
 * Tại đây, chúng ta sẽ tạo đối tượng QuanLySach và gọi các chức năng của nó.
 */
public class Test {

    public static void main(String[] args) {
        // 1. Tạo đối tượng quản lý sách
        // Đây là "trái tim" của chương trình, nơi lưu trữ và xử lý mọi thứ.
        QuanLySach quanLy = new QuanLySach();
        System.out.println("Chuong trinh quan ly thu vien da khoi dong.");

        // 2. THÊM MỚI: Tạo và thêm các đối tượng sách vào danh sách
        System.out.println("\n## THUC HIEN CHUC NANG THEM SACH ##"); 
        quanLy.them(new SachGiaoTrinh("SGT01", "Toan cao cap A1", "Nguyen Van A", 2022, 50, "Toan hoc", "Dai hoc"));
        quanLy.them(new SachTieuThuyet("STT01", "Tri tue nhan tao ", "Jane Smith", 2023, 30, "Trinh tham", true));
        quanLy.them(new SachGiaoTrinh("SGT02", "Vat ly dai cuong", "Tran B", 2021, 100, "Vat ly", "Dai hoc"));
        System.out.println(" -> Da them 3 cuon sach vao thu vien.");

        // 3. HIỂN THỊ: In toàn bộ danh sách sách hiện có
        System.out.println("\n## THUC HIEN CHUC NANG HIEN THI DANH SACH ##");
        quanLy.hienThiDanhSach();

        // 4. TÌM KIẾM: Tìm một cuốn sách cụ thể theo mã sách
        System.out.println("\n## THUC HIEN CHUC NANG TIM KIEM SACH 'SGT02' ##");
        Sach sachTimDuoc = quanLy.timKiem("SGT02");
        if (sachTimDuoc != null) {
            System.out.println(" -> Tim thay: " + sachTimDuoc);
        } else {
            System.out.println(" -> Khong tim thay sach co ma 'SGT02'.");
        }

        // 5. CẬP NHẬT: Thay đổi nam xuat ban, số lượng của một cuốn sách
        System.out.println("\n## THUC HIEN CHUC NANG CAP NHAT NAM XUAT BAN THANH 2024, SO LUONG SACH 'SGT01' THANH 75 ##");
        boolean capNhatThanhCong = quanLy.capNhat("SGT01", 2024, 75);
        if (capNhatThanhCong) {
            System.out.println(" -> Cap nhat thanh cong. Danh sach sau khi cap nhat:");
            quanLy.hienThiDanhSach();
        } else {
            System.out.println(" -> Cap nhat that bai, khong tim thay sach.");
        }

        // 6. CẬP NHẬT: Thay đổi maSach của một cuốn sách
        System.out.println("\n## THUC HIEN CHUC NANG CAP NHAT MA SACH TU 'SGT01' THANH 'SGT001' ##");
        boolean capNhatMAsACH = quanLy.capNhat("SGT01", "SGT001");
        if (capNhatMAsACH) {
            System.out.println(" -> Cap nhat thanh cong. Danh sach sau khi cap nhat:");
            quanLy.hienThiDanhSach();
        } else {
            System.out.println(" -> Cap nhat that bai, khong tim thay sach.");
        }

        // 6. XÓA: Xóa một cuốn sách khỏi danh sách
        System.out.println("\n## THUC HIEN CHUC NANG XOA SACH 'SGT02' ##");
        boolean xoaThanhCong = quanLy.xoa("SGT02");
        if (xoaThanhCong) {
            System.out.println(" -> Xoa thanh cong. Danh sach cuoi cung:");
            quanLy.hienThiDanhSach();
        } else {
            System.out.println(" -> Xoa that bai, khong tim thay sach.");
        }
    }
}

