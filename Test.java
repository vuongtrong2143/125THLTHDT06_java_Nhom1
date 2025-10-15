import java.util.Scanner;

public class Test {

    private static void nhapThongTinSachCoBan(Scanner scanner, Sach sach) {
        System.out.print("Nhap Ma sach: ");
        sach.setMaSach(scanner.nextLine());
        System.out.print("Nhap Tieu de: ");
        sach.setTieuDe(scanner.nextLine());
        System.out.print("Nhap Tac gia: ");
        sach.setTacGia(scanner.nextLine());

        System.out.print("Nhap Nam xuat ban: ");
        while (!scanner.hasNextInt()) {
            System.out.print("Nam xuat ban khong hop le. Vui long nhap so nguyen: ");
            scanner.next();
        }
        sach.setNamXuatBan(scanner.nextInt());

        System.out.print("Nhap So luong: ");
        while (!scanner.hasNextInt()) {
            System.out.print("So luong khong hop le. Vui long nhap so nguyen: ");
            scanner.next();
        }
        sach.setSoLuong(scanner.nextInt());
        scanner.nextLine();
    }

    private static Sach nhapSachGiaoTrinh(Scanner scanner) {
        Sach sachTam = new Sach();
        nhapThongTinSachCoBan(scanner, sachTam);

        System.out.print("Nhap Mon hoc: ");
        String monHoc = scanner.nextLine();
        System.out.print("Nhap Cap do (VD: Dai hoc, Pho thong): ");
        String capDo = scanner.nextLine();

        return new SachGiaoTrinh(sachTam.getMaSach(), sachTam.getTieuDe(), sachTam.getTacGia(),
                sachTam.getNamXuatBan(), sachTam.getSoLuong(), monHoc, capDo);
    }

    private static Sach nhapSachTieuThuyet(Scanner scanner) {
        Sach sachTam = new Sach();
        nhapThongTinSachCoBan(scanner, sachTam);

        System.out.print("Nhap The loai (VD: Lang man, Khoa hoc vien tuong): ");
        String theLoai = scanner.nextLine();

        System.out.print("La Sach Series (true/false): ");
        String seriesStr = scanner.nextLine().toLowerCase();
        boolean laSeries = seriesStr.equals("true") || seriesStr.equals("co");

        return new SachTieuThuyet(sachTam.getMaSach(), sachTam.getTieuDe(), sachTam.getTacGia(),
                sachTam.getNamXuatBan(), sachTam.getSoLuong(), theLoai, laSeries);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QuanLySach quanLy = new QuanLySach();
        int luaChon = -1;

        System.out.println("******************* CHUONG TRINH QUAN LY SACH *******************");

        quanLy.themSach(new SachGiaoTrinh("GT001", "Giai Tich 1", "Nguyen Van A", 2020, 50, "Toan", "Dai hoc"));
        quanLy.themSach(
                new SachTieuThuyet("TT001", "Chien tranh va Hoa binh", "Leo Tolstoy", 1869, 25, "Lich su", false));
        System.out.println("-> Da them san 2 cuon sach de kiem tra chuc nang.");

        do {
            System.out.println("\n-------------------------------------------------------------");
            System.out.println("Vui long chon chuc nang:");
            System.out.println("1. Them moi Sach");
            System.out.println("2. Xoa Sach theo Ma");
            System.out.println("3. Cap nhat thong tin Sach theo Ma");
            System.out.println("4. Tim kiem Sach theo Ma");
            System.out.println("5. Hien thi tat ca Sach");
            System.out.println("0. Thoat chuong trinh");
            System.out.print("Lua chon cua ban: ");

            if (scanner.hasNextInt()) {
                luaChon = scanner.nextInt();
                scanner.nextLine();
            } else {
                System.out.println("Lua chon khong hop le. Vui long nhap so.");
                scanner.nextLine();
                luaChon = -1;
                continue;
            }

            switch (luaChon) {
                case 1:
                    System.out.println("\n--- THEM MOI SACH ---");
                    System.out.print("Chon loai sach (1: Sach Giao Trinh, 2: Sach Tieu Thuyet): ");
                    String loaiSach = scanner.nextLine();
                    Sach sachMoi = null;
                    if (loaiSach.equals("1")) {
                        sachMoi = nhapSachGiaoTrinh(scanner);
                    } else if (loaiSach.equals("2")) {
                        sachMoi = nhapSachTieuThuyet(scanner);
                    } else {
                        System.out.println("Loai sach khong hop le. Quay ve menu chinh.");
                        break;
                    }
                    if (sachMoi != null) {
                        quanLy.themSach(sachMoi);
                    }
                    break;

                case 2:
                    System.out.println("\n--- XOA SACH ---");
                    System.out.print("Nhap Ma sach can xoa: ");
                    String maXoa = scanner.nextLine();
                    quanLy.xoaSach(maXoa);
                    break;

                case 3:
                    System.out.println("\n--- CAP NHAT SACH ---");
                    System.out.print("Nhap Ma sach can cap nhat: ");
                    String maCapNhat = scanner.nextLine();
                    quanLy.capNhatSach(maCapNhat, scanner);
                    break;

                case 4:
                    System.out.println("\n--- TIM KIEM SACH ---");
                    System.out.print("Nhap Ma sach can tim: ");
                    String maTimKiem = scanner.nextLine();
                    Sach ketQua = quanLy.timKiemTheoMa(maTimKiem);
                    if (ketQua != null) {
                        System.out.println("-> Tim thay sach:");
                        System.out.println(ketQua.toString());
                    } else {
                        System.out.println("-> Khong tim thay sach voi Ma: " + maTimKiem);
                    }
                    break;

                case 5:
                    quanLy.hienThiDanhSach();
                    break;

                case 0:
                    System.out.println("Ket thuc chuong trinh Quan Ly Sach.");
                    break;

                default:
                    System.out.println("Lua chon khong ton tai. Vui long chon lai.");
            }
        } while (luaChon != 0);

        scanner.close();
    }
}