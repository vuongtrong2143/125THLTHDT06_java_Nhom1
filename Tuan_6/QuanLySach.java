
package THLTHDT;

import java.util.ArrayList;
import java.util.List;

public class QuanLySach {
    private final List<Sach> danhSach = new ArrayList<>();

    // Thêm mới
    public void themSach(Sach s) {
        danhSach.add(s);
    }

    // Xóa theo mã sách
    public boolean xoaSach(String maSach) {
        return danhSach.removeIf(s -> s.getMaSach().equalsIgnoreCase(maSach));
    }

    // Cập nhật (ví dụ: cập nhật số lượng)
    public boolean capNhatSoLuong(String maSach, int soLuongMoi) {
        Sach s = timSach(maSach);
        if (s != null) {
            s.setSoLuong(soLuongMoi);
            return true;
        }
        return false;
    }

    // Tìm kiếm theo mã
    public Sach timSach(String maSach) {
        for (Sach s : danhSach) {
            if (s.getMaSach().equalsIgnoreCase(maSach)) return s;
        }
        return null;
    }

    // Hiển thị danh sách
    public void hienThiDanhSach() {
        System.out.println("===== DANH SÁCH SÁCH =====");
        if (danhSach.isEmpty()) {
            System.out.println("(trống)");
            return;
        }
        for (Sach s : danhSach) {
            System.out.println(s);
        }
    }
}
=======
package THLTHDT;

import java.util.ArrayList;
import java.util.List;

public class QuanLySach {
    private final List<Sach> danhSach = new ArrayList<>();

    // Thêm mới
    public void themSach(Sach s) {
        danhSach.add(s);
    }

    // Xóa theo mã sách
    public boolean xoaSach(String maSach) {
        return danhSach.removeIf(s -> s.getMaSach().equalsIgnoreCase(maSach));
    }

    // Cập nhật (ví dụ: cập nhật số lượng)
    public boolean capNhatSoLuong(String maSach, int soLuongMoi) {
        Sach s = timSach(maSach);
        if (s != null) {
            s.setSoLuong(soLuongMoi);
            return true;
        }
        return false;
    }

    // Tìm kiếm theo mã
    public Sach timSach(String maSach) {
        for (Sach s : danhSach) {
            if (s.getMaSach().equalsIgnoreCase(maSach)) return s;
        }
        return null;
    }

    // Hiển thị danh sách
    public void hienThiDanhSach() {
        System.out.println("===== DANH SÁCH SÁCH =====");
        if (danhSach.isEmpty()) {
            System.out.println("(trống)");
            return;
        }
        for (Sach s : danhSach) {
            System.out.println(s);
        }
    }
}

