package com.mycompany.THLTHDT;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        IQuanLySach quanLy = new QuanLySachImpl();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== MENU QUẢN LÝ SÁCH =====");
            System.out.println("1. Thêm sách giáo trình");
            System.out.println("2. Thêm sách tiểu thuyết");
            System.out.println("3. Hiển thị danh sách sách");
            System.out.println("4. Tìm kiếm sách theo mã");
            System.out.println("5. Xóa sách theo mã");
            System.out.println("0. Thoát");
            System.out.print("Mời chọn: ");

            String line = sc.nextLine();
            if (line.isEmpty()) {
                choice = -1;
            } else {
                choice = Integer.parseInt(line);
            }

            switch (choice) {
                case 1:
                    themSachGiaoTrinh(sc, quanLy);
                    break;
                case 2:
                    themSachTieuThuyet(sc, quanLy);
                    break;
                case 3:
                    quanLy.hienThiDanhSach();
                    break;
                case 4:
                    timKiemSach(sc, quanLy);
                    break;
                case 5:
                    xoaSach(sc, quanLy);
                    break;
                case 0:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }

        } while (choice != 0);

        sc.close();
    }

    // ===== Các hàm hỗ trợ menu =====

    private static void themSachGiaoTrinh(Scanner sc, IQuanLySach quanLy) {
        System.out.println("=== Nhập thông tin Sách Giáo Trình ===");
        System.out.print("Mã sách: ");
        String ma = sc.nextLine();

        System.out.print("Tiêu đề: ");
        String tieuDe = sc.nextLine();

        System.out.print("Tác giả: ");
        String tacGia = sc.nextLine();

        System.out.print("Năm xuất bản: ");
        int namXB = Integer.parseInt(sc.nextLine());

        System.out.print("Số lượng: ");
        int soLuong = Integer.parseInt(sc.nextLine());

        System.out.print("Giá cơ bản: ");
        double giaCoBan = Double.parseDouble(sc.nextLine());

        System.out.print("Môn học: ");
        String monHoc = sc.nextLine();

        System.out.print("Cấp độ: ");
        String capDo = sc.nextLine();

        Sach sach = new SachGiaoTrinh(ma, tieuDe, tacGia, namXB, soLuong, giaCoBan, monHoc, capDo);
        quanLy.themSach(sach);
    }

    private static void themSachTieuThuyet(Scanner sc, IQuanLySach quanLy) {
        System.out.println("=== Nhập thông tin Sách Tiểu Thuyết ===");
        System.out.print("Mã sách: ");
        String ma = sc.nextLine();

        System.out.print("Tiêu đề: ");
        String tieuDe = sc.nextLine();

        System.out.print("Tác giả: ");
        String tacGia = sc.nextLine();

        System.out.print("Năm xuất bản: ");
        int namXB = Integer.parseInt(sc.nextLine());

        System.out.print("Số lượng: ");
        int soLuong = Integer.parseInt(sc.nextLine());

        System.out.print("Giá cơ bản: ");
        double giaCoBan = Double.parseDouble(sc.nextLine());

        System.out.print("Thể loại: ");
        String theLoai = sc.nextLine();

        System.out.print("Có phải sách series không? (true/false): ");
        boolean laSeries = Boolean.parseBoolean(sc.nextLine());

        Sach sach = new SachTieuThuyet(ma, tieuDe, tacGia, namXB, soLuong, giaCoBan, theLoai, laSeries);
        quanLy.themSach(sach);
    }

    private static void timKiemSach(Scanner sc, IQuanLySach quanLy) {
        System.out.print("Nhập mã sách cần tìm: ");
        String ma = sc.nextLine();
        Sach sach = quanLy.timKiemSach(ma);
        if (sach != null) {
            System.out.println("Đã tìm thấy:");
            System.out.println(sach.toString());
        } else {
            System.out.println("Không tìm thấy sách có mã: " + ma);
        }
    }

    private static void xoaSach(Scanner sc, IQuanLySach quanLy) {
        System.out.print("Nhập mã sách cần xóa: ");
        String ma = sc.nextLine();
        boolean kq = quanLy.xoaSach(ma);
        if (!kq) {
            System.out.println("Xóa không thành công (không tìm thấy mã sách).");
        }
    }
}
