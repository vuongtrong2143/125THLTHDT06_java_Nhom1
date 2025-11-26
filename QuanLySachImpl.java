package com.mycompany.THLTHDT;

import java.util.ArrayList;
import java.util.List;

public class QuanLySachImpl implements IQuanLySach {

    private final List<Sach> danhSachSach;

    public QuanLySachImpl() {
        danhSachSach = new ArrayList<>();
    }

    @Override
    public void themSach(Sach sach) {
        danhSachSach.add(sach);
        System.out.println("Đã thêm sách có mã: " + sach.getMaSach());
    }

    @Override
    public Sach timKiemSach(String maSach) {
        for (Sach sach : danhSachSach) {
            if (sach.getMaSach().equalsIgnoreCase(maSach)) {
                return sach;
            }
        }
        return null;
    }

    @Override
    public boolean xoaSach(String maSach) {
        for (int i = 0; i < danhSachSach.size(); i++) {
            if (danhSachSach.get(i).getMaSach().equalsIgnoreCase(maSach)) {
                danhSachSach.remove(i);
                System.out.println("Đã xóa sách có mã: " + maSach);
                return true;
            }
        }
        System.out.println("Không tìm thấy sách có mã: " + maSach);
        return false;
    }

    @Override
    public void hienThiDanhSach() {
        if (danhSachSach.isEmpty()) {
            System.out.println("Danh sách sách đang rỗng.");
            return;
        }

        System.out.println("=== DANH SÁCH SÁCH TRONG THƯ VIỆN ===");
        for (Sach sach : danhSachSach) {
            System.out.println(sach.toString());
            System.out.println("----------------------------------");
        }
    }
}
