import java.util.ArrayList;

public class QuanLySach {
    private ArrayList<Sach> danhSach;

    public QuanLySach() {
        danhSach = new ArrayList<>();
    }

    public void themSach(Sach s) {
        danhSach.add(s);
    }

    public void hienThiDanhSachSach() {
        for (Sach s : danhSach) {
            System.out.println(s.toString());
            System.out.println("➡ Giá Bán Ước Tính: " + s.tinhGiaBan() + " VNĐ");
            System.out.println("----------------------------------------");
        }
    }
}
