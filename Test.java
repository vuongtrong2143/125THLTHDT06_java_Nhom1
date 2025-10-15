
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

