import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLySachImpl implements IQuanLySach { // implements giao diện mới
    private List<Sach> danhSachSach;

    public QuanLySachImpl() {
        this.danhSachSach = new ArrayList<>();
    }

    // Triển khai themSach
    @Override
    public void themSach(Sach sach) {
        if (timKiemTheoMa(sach.getMaSach()) == null) {
            danhSachSach.add(sach);
            System.out.println("-> Them sach thanh cong: " + sach.getTieuDe());
        } else {
            System.out.println("-> Loi: Ma sach '" + sach.getMaSach() + "' da ton tai. Khong the them.");
        }
    }

    // Triển khai xoaSach
    @Override
    public boolean xoaSach(String maSach) {
        Sach sachCanXoa = timKiemTheoMa(maSach);
        if (sachCanXoa != null) {
            danhSachSach.remove(sachCanXoa);
            System.out.println("-> Xoa sach thanh cong voi Ma Sach: " + maSach);
            return true;
        } else {
            System.out.println("-> Khong tim thay sach voi Ma Sach: " + maSach + ". Khong the xoa.");
            return false;
        }
    }

    // Triển khai capNhatSach
    @Override
    public boolean capNhatSach(String maSach, Scanner scanner) {
        Sach sachCanCapNhat = timKiemTheoMa(maSach);
        if (sachCanCapNhat == null) {
            System.out.println("-> Khong tim thay sach voi Ma Sach: " + maSach + ". Khong the cap nhat.");
            return false;
        }

        // --- Logic cập nhật ---
        System.out.println("\n--- Cap nhat thong tin sach: " + maSach + " ---");

        System.out.print("Nhap Tieu de moi (Hien tai: " + sachCanCapNhat.getTieuDe() + "): ");
        sachCanCapNhat.setTieuDe(scanner.nextLine());

        System.out.print("Nhap Tac gia moi (Hien tai: " + sachCanCapNhat.getTacGia() + "): ");
        sachCanCapNhat.setTacGia(scanner.nextLine());

        System.out.print("Nhap Nam xuat ban moi (Hien tai: " + sachCanCapNhat.getNamXuatBan() + "): ");
        while (!scanner.hasNextInt()) {
            System.out.print("Nhap Nam xuat ban KHONG hop le. Vui long nhap so nguyen: ");
            scanner.next();
        }
        sachCanCapNhat.setNamXuatBan(scanner.nextInt());

        System.out.print("Nhap So luong moi (Hien tai: " + sachCanCapNhat.getSoLuong() + "): ");
        while (!scanner.hasNextInt()) {
            System.out.print("Nhap So luong KHONG hop le. Vui long nhap so nguyen: ");
            scanner.next();
        }
        sachCanCapNhat.setSoLuong(scanner.nextInt());

        System.out.print("Nhap Gia co ban moi (Hien tai: " + sachCanCapNhat.getGiaCoBan() + "): ");
        while (!scanner.hasNextDouble()) {
            System.out.print("Nhap Gia co ban KHONG hop le. Vui long nhap so thuc: ");
            scanner.next();
        }
        sachCanCapNhat.setGiaCoBan(scanner.nextDouble());
        scanner.nextLine();

        // Cập nhật thuộc tính riêng (nếu cần)
        if (sachCanCapNhat instanceof SachGiaoTrinh) {
            SachGiaoTrinh sgt = (SachGiaoTrinh) sachCanCapNhat;
            System.out.print("Nhap Mon hoc moi (Hien tai: " + sgt.getMonHoc() + "): ");
            sgt.setMonHoc(scanner.nextLine());
            System.out.print("Nhap Cap do moi (Hien tai: " + sgt.getCapDo() + "): ");
            sgt.setCapDo(scanner.nextLine());
        } else if (sachCanCapNhat instanceof SachTieuThuyet) {
            SachTieuThuyet stt = (SachTieuThuyet) sachCanCapNhat;
            System.out.print("Nhap The loai moi (Hien tai: " + stt.getTheLoai() + "): ");
            stt.setTheLoai(scanner.nextLine());
            System.out.print("La sach series (true/false) (Hien tai: " + stt.isLaSachSeries() + "): ");
            String laSeriesStr = scanner.nextLine().toLowerCase();
            stt.setLaSachSeries(laSeriesStr.equals("true") || laSeriesStr.equals("co"));
        }

        System.out.println("-> Cap nhat sach thanh cong!");
        return true;
    }

    // Triển khai timKiemTheoMa
    @Override
    public Sach timKiemTheoMa(String maSach) {
        for (Sach sach : danhSachSach) {
            if (sach.getMaSach().equalsIgnoreCase(maSach)) {
                return sach;
            }
        }
        return null;
    }

    // Triển khai hienThiDanhSach
    @Override
    public void hienThiDanhSach() {
        if (danhSachSach.isEmpty()) {
            System.out.println("\n--- Danh sach sach rong ---");
            return;
        }

        System.out.println("\n--- Danh sach Sach Hien Co (" + danhSachSach.size() + " cuon) ---");
        // Sử dụng DecimalFormat để định dạng tiền tệ cho dễ đọc
        DecimalFormat formatter = new DecimalFormat("###,###.0 VNĐ");

        for (Sach sach : danhSachSach) {
            System.out.println(sach.toString());
            System.out.println("   >>> Gia Ban Uoc Tinh: " + formatter.format(sach.tinhGiaBan()));
            System.out.println("-----------------------------------------------------------------");
        }
    }
}