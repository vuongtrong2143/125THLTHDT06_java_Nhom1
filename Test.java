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

        System.out.print("Nhap Gia co ban: ");
        while (!scanner.hasNextDouble()) {
            System.out.print("Gia co ban khong hop le. Vui long nhap so thuc: ");
            scanner.next();
        }
        sach.setGiaCoBan(scanner.nextDouble());

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
                sachTam.getNamXuatBan(), sachTam.getSoLuong(), sachTam.getGiaCoBan(), monHoc, capDo);
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
                sachTam.getNamXuatBan(), sachTam.getSoLuong(), sachTam.getGiaCoBan(), theLoai, laSeries);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QuanLySach quanLy = new QuanLySach();
        int luaChon = -1;

        System.out.println("******************* CHUONG TRINH QUAN LY SACH *******************");

        // 1. Tạo và thêm ít nhất một đối tượng SachGiaoTrinh và SachTieuThuyet.
        SachGiaoTrinh sgt1 = new SachGiaoTrinh("GT001", "Giai Tich 1", "Nguyen Van A", 2020, 50, 150000.0, "Toan",
                "Dai hoc");
        SachTieuThuyet stt1 = new SachTieuThuyet("TT001", "Chien tranh va Hoa binh", "Leo Tolstoy", 1869, 25, 200000.0,
                "Lich su", false);

        // Dữ liệu mẫu thêm để kiểm tra Giá Bán Series
        SachTieuThuyet stt2 = new SachTieuThuyet("TT002", "Harry Potter: Hon da phu thuy", "J.K. Rowling", 1997, 80,
                120000.0, "Huyen ao", true);

        quanLy.themSach(sgt1);
        quanLy.themSach(stt1);
        quanLy.themSach(stt2);

        System.out.println("-> Da them san 3 cuon sach de kiem tra chuc nang.");

        // 2. Gọi hienThiDanhSachSach() để kiểm tra kết quả tính giá.
        System.out.println("\n--- Kiem tra Gia Ban Uoc Tinh cho Sach mau ---");
        quanLy.hienThiDanhSach();
        System.out.println("---------------------------------------------");

        // 3. Thực hiện kiểm tra giao diện IkiemKe
        System.out.println("\n--- Kiem tra Giao dien IkiemKe ---");

        // Tạo một đối tượng IKiemKe tham chiếu đến một đối tượng SachGiaoTrinh
        IkiemKe kiemKe = sgt1;

        System.out.println("-> Thuc hien kiem tra cho Sach Giao Trinh: " + sgt1.getTieuDe());

        // Gọi phương thức kiemTraTonKho(100)
        boolean tonKho = kiemKe.kiemTraTonKho(100);
        System.out.println("   Kiem tra Ton Kho (toi thieu 100): " + (tonKho ? "DAT" : "KHONG DAT") + " (Hien tai: "
                + sgt1.getSoLuong() + ")");

        // Gọi phương thức capNhatViTri("Kho A1-Kệ 5")
        kiemKe.capNhatViTri("Kho A1-Kệ 5");

        // Kiểm tra thêm cho SachTieuThuyet
        IkiemKe kiemKe2 = stt2;
        System.out.println("\n-> Thuc hien kiem tra cho Sach Tieu Thuyet: " + stt2.getTieuDe());

        // Gọi phương thức kiemTraTonKho(100)
        boolean tonKho2 = kiemKe2.kiemTraTonKho(100);
        System.out.println("   Kiem tra Ton Kho (toi thieu 100): " + (tonKho2 ? "DAT" : "KHONG DAT") + " (Hien tai: "
                + stt2.getSoLuong() + ")");

        // Gọi phương thức capNhatViTri("Kho Tieu Thuyet")
        kiemKe2.capNhatViTri("Kho Tieu Thuyet");

        do {
            System.out.println("\n-------------------------------------------------------------");
            System.out.println("Vui long chon chuc nang:");
            System.out.println("1. Them moi Sach");
            System.out.println("2. Xoa Sach theo Ma");
            System.out.println("3. Cap nhat thong tin Sach theo Ma");
            System.out.println("4. Tim kiem Sach theo Ma");
            System.out.println("5. Hien thi tat ca Sach");
            System.out.println("6. Kiem tra Ton Kho & Cap nhat Vi tri (Chuc nang IkiemKe)");
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
                        System.out.println("   >>> Gia Ban Uoc Tinh: "
                                + new java.text.DecimalFormat("###,###.0 VNĐ").format(ketQua.tinhGiaBan()));
                    } else {
                        System.out.println("-> Khong tim thay sach voi Ma: " + maTimKiem);
                    }
                    break;

                case 5:
                    quanLy.hienThiDanhSach();
                    break;

                case 6:
                    System.out.println("\n--- KIEM TRA TON KHO & CAP NHAT VI TRI ---");
                    System.out.print("Nhap Ma sach can kiem tra/cap nhat: ");
                    String maSachIKK = scanner.nextLine();
                    Sach sachIKK = quanLy.timKiemTheoMa(maSachIKK);

                    if (sachIKK instanceof IkiemKe) {
                        IkiemKe kiemKeInstance = (IkiemKe) sachIKK;

                        // 1. Kiem tra Ton Kho
                        System.out.print("Nhap so luong ton kho toi thieu: ");
                        int soLuongToiThieu = 0;
                        if (scanner.hasNextInt()) {
                            soLuongToiThieu = scanner.nextInt();
                            scanner.nextLine();
                        } else {
                            System.out.println("So luong khong hop le. Mac dinh kiem tra 0.");
                            scanner.nextLine();
                        }

                        if (kiemKeInstance.kiemTraTonKho(soLuongToiThieu)) {
                            System.out.println(
                                    "-> Kiem tra Ton Kho: DAT (So luong hien tai: " + sachIKK.getSoLuong() + ")");
                        } else {
                            System.out.println(
                                    "-> Kiem tra Ton Kho: KHONG DAT (So luong hien tai: " + sachIKK.getSoLuong() + ")");
                        }

                        // 2. Cap nhat Vi tri
                        System.out.print("Nhap vi tri luu tru moi: ");
                        String viTriMoi = scanner.nextLine();
                        kiemKeInstance.capNhatViTri(viTriMoi);

                    } else if (sachIKK != null) {
                        System.out.println("-> Sach nay khong ho tro chuc nang Kiem Ke.");
                    } else {
                        System.out.println("-> Khong tim thay sach voi Ma: " + maSachIKK);
                    }
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