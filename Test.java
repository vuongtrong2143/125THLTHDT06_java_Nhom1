import java.util.Scanner;

public class Test {

    // Phương thức nhập thông tin cơ bản của sách
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

        scanner.nextLine(); // Đọc bỏ ký tự xuống dòng
    }

    private static void showMenu() {
        System.out.println("\n========= MENU QUAN LY SACH (Test He Thong) =========");
        System.out.println("1. Them Sach Giao Trinh");
        System.out.println("2. Them Sach Tieu Thuyet");
        System.out.println("3. Hien thi danh sach tat ca sach");
        System.out.println("4. Tim kiem sach theo Ma");
        System.out.println("5. Cap nhat thong tin sach theo Ma");
        System.out.println("6. Xoa sach theo Ma");
        System.out.println("7. Kiem tra chuc nang IKiemKe (Ton kho, Cap nhat vi tri)");
        System.out.println("0. Thoat chuong trinh");
        System.out.println("=====================================================");
        System.out.print("Nhap lua chon cua ban: ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 1. Khai báo Interface: Khởi tạo đối tượng quản lý theo kiểu Interface
        // IQuanLySach
        IQuanLySach quanLy = new QuanLySachImpl();

        int luaChon;

        // 2. Thực thi: Tạo đối tượng SachGiaoTrinh và SachTieuThuyet (dữ liệu mẫu)
        quanLy.themSach(new SachGiaoTrinh("GT001", "Toan Cao Cap A1", "Nguyen Van A", 2020, 150, 85000.0, "Toan Hoc",
                "Dai Hoc"));
        quanLy.themSach(new SachTieuThuyet("TT001", "Hoang Tu Be", "Antoine de Saint-Exupéry", 1943, 80, 50000.0,
                "Huyen Ao", false));
        quanLy.themSach(new SachTieuThuyet("TT002", "Harry Potter Tap 1", "J.K. Rowling", 1997, 200, 120000.0,
                "Fantasy", true));

        do {
            // 3. Tạo menu cho chương trình quản lí sách
            showMenu();
            if (scanner.hasNextInt()) {
                luaChon = scanner.nextInt();
                scanner.nextLine();
            } else {
                System.out.println("Loi: Lua chon phai la so nguyen. Vui long nhap lai.");
                scanner.nextLine();
                luaChon = -1;
                continue;
            }

            switch (luaChon) {
                case 1:
                    System.out.println("\n--- Them Sach Giao Trinh ---");
                    SachGiaoTrinh sgt = new SachGiaoTrinh();
                    nhapThongTinSachCoBan(scanner, sgt);

                    System.out.print("Nhap Mon hoc: ");
                    sgt.setMonHoc(scanner.nextLine());
                    System.out.print("Nhap Cap do: ");
                    sgt.setCapDo(scanner.nextLine());

                    quanLy.themSach(sgt);
                    break;
                case 2:
                    System.out.println("\n--- Them Sach Tieu Thuyet ---");
                    SachTieuThuyet stt = new SachTieuThuyet();
                    nhapThongTinSachCoBan(scanner, stt);

                    System.out.print("Nhap The loai: ");
                    stt.setTheLoai(scanner.nextLine());
                    System.out.print("La sach series (true/false): ");
                    String laSeriesStr = scanner.nextLine().toLowerCase();
                    stt.setLaSachSeries(laSeriesStr.equals("true") || laSeriesStr.equals("co"));

                    quanLy.themSach(stt);
                    break;
                case 3:
                    quanLy.hienThiDanhSach();
                    break;
                case 4:
                    System.out.print("Nhap Ma sach can tim: ");
                    String maSachTim = scanner.nextLine();
                    Sach sachTim = quanLy.timKiemTheoMa(maSachTim);
                    if (sachTim != null) {
                        System.out.println("-> Tim thay sach:");
                        System.out.println(sachTim.toString());
                        System.out.println(
                                "   >>> Gia Ban Uoc Tinh: " + String.format("%,.0f VNĐ", sachTim.tinhGiaBan()));
                    } else {
                        System.out.println("-> Khong tim thay sach voi Ma: " + maSachTim);
                    }
                    break;
                case 5:
                    System.out.print("Nhap Ma sach can cap nhat: ");
                    String maSachCapNhat = scanner.nextLine();
                    quanLy.capNhatSach(maSachCapNhat, scanner);
                    break;
                case 6:
                    System.out.print("Nhap Ma sach can xoa: ");
                    String maSachXoa = scanner.nextLine();
                    quanLy.xoaSach(maSachXoa);
                    break;
                case 7:
                    System.out.println("\n--- Kiem tra chuc nang IKiemKe ---");
                    System.out.print("Nhap Ma sach de kiem tra IKiemKe: ");
                    String maSachIKK = scanner.nextLine();
                    Sach sachIKK = quanLy.timKiemTheoMa(maSachIKK);

                    // Kiểm tra và ép kiểu sang Interface IKiemKe để gọi phương thức
                    if (sachIKK instanceof IkiemKe) {
                        IkiemKe kiemKeInstance = (IkiemKe) sachIKK;
                        System.out.println("-> Sach tim thay: " + sachIKK.getTieuDe());

                        // 1. Kiem tra Ton Kho
                        System.out.print("Nhap So luong toi thieu can kiem tra: ");
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