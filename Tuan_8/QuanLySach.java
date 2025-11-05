// IQuanLySach.java
import java.util.List;

public interface IQuanLySach {
    void themSach(Sach sach);
    Sach timKiemSach(String maSach);
    boolean xoaSach(String maSach);
    void hienThiDanhSach();
}
// QuanLySachImpl.java
import java.util.ArrayList;
import java.util.List;

public class QuanLySachImpl implements IQuanLySach {
    private List<Sach> danhSach = new ArrayList<>();

    @Override
    public void themSach(Sach sach) {
        danhSach.add(sach);
        System.out.println("✅ Đã thêm: " + sach.getTieuDe());
    }

    @Override
    public Sach timKiemSach(String maSach) {
        for (Sach s : danhSach) {
            if (s.getMaSach().equalsIgnoreCase(maSach))
                return s;
        }
        return null;
    }

    @Override
    public boolean xoaSach(String maSach) {
        Sach s = timKiemSach(maSach);
        if (s != null) {
            danhSach.remove(s);
            System.out.println("❌ Đã xóa: " + s.getTieuDe());
            return true;
        }
        System.out.println("⚠️ Không tìm thấy sách có mã: " + maSach);
        return false;
    }

    @Override
    public void hienThiDanhSach() {
        System.out.println("\n📚 DANH SÁCH SÁCH HIỆN CÓ:");
        for (Sach s : danhSach) {
            System.out.println(s);
        }
    }
}