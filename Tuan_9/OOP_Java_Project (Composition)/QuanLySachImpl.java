import java.util.ArrayList;
import java.util.List;

public class QuanLySachImpl implements IQuanLySach {

    // Sử dụng ArrayList để lưu trữ danh sách các cuốn sách
    private List<Sach> danhSachSach;

    public QuanLySachImpl() {
        this.danhSachSach = new ArrayList<>();
    }

    @Override
    public Sach timKiemtheomasach(String maSach) {
        for (Sach s : this.danhSachSach) {
            // .equalsIgnoreCase() sẽ so sánh không phân biệt chữ hoa hay chữ thường (ví dụ: "S01" sẽ khớp với "s01").
            if (s.getMaSach().equalsIgnoreCase(maSach)) {
                return s;
            }
        }
        return null;
    }

    @Override
    public int size() {
        // Don gian la tra ve kich thuoc (so luong) cua danh sach noi bo
        return this.danhSachSach.size();
    }

    // <<< THAY ĐỔI Ở ĐÂY >>>
    /**
     * Triển khai phương thức tạo Sách Giáo Trình (COMPOSITION)
     * Lớp này chịu trách nhiệm gọi 'new'
     */
    @Override
    public boolean themSachGiaoTrinh(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, double giaCoBan, String viTri, String monHoc, String capDo) {
        // 1. Kiểm tra trùng lặp
        if (timKiemtheomasach(maSach) != null) {
            System.out.println("Loi: Ma sach '" + maSach + "' da ton tai.");
            return false;
        }
        
        // 2. TẠO MỚI đối tượng (Trách nhiệm của Composition)
        Sach sachMoi = new SachGiaoTrinh(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan, viTri, monHoc, capDo);
        
        // 3. Thêm vào danh sách quản lý
        this.danhSachSach.add(sachMoi);
        return true;
    }

    /**
     * Triển khai phương thức tạo Sách Tiểu Thuyết (COMPOSITION)
     * Lớp này chịu trách nhiệm gọi 'new'
     */
    @Override
    public boolean themSachTieuThuyet(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, double giaCoBan, String viTri, String theLoai, boolean laSachSeries) {
        // 1. Kiểm tra trùng lặp
        if (timKiemtheomasach(maSach) != null) {
            System.out.println("Loi: Ma sach '" + maSach + "' da ton tai.");
            return false;
        }

        // 2. TẠO MỚI đối tượng (Trách nhiệm của Composition)
        Sach sachMoi = new SachTieuThuyet(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan, viTri, theLoai, laSachSeries);
        
        // 3. Thêm vào danh sách quản lý
        this.danhSachSach.add(sachMoi);
        return true;
    }
    // <<< KẾT THÚC THAY ĐỔI >>>

    @Override
    public boolean xoaSach(String maSach) {
        Sach sachCanXoa = timKiemtheomasach(maSach);
        if (sachCanXoa != null) {
            this.danhSachSach.remove(sachCanXoa);
            return true;
        }
        return false;
    }

    @Override
    public List<Sach> timKiemSach(String tenSach) {
        List<Sach> ketQuaTimKiem = new ArrayList<>();
        // 2. Duyệt qua toàn bộ danh sách sách trong thư viện
        for (Sach s : this.danhSachSach) {
            // 3. Kiểm tra xem tên sách (getTieuDe()) có chứa chuỗi tìm kiếm hay không
            // Chúng ta dùng .toLowerCase() để tìm kiếm không phân biệt chữ hoa/thường
            // Chúng ta dùng .contains() để tìm khớp một phần (ví dụ: tìm "Java" sẽ ra "Lập trình Java")
            if (s.getTieuDe().toLowerCase().contains(tenSach.toLowerCase())) {
                // 4. Nếu tìm thấy, thêm sách này vào danh sách kết quả
                ketQuaTimKiem.add(s);
            }
        }
        // 5. Trả về danh sách kết quả (sẽ là rỗng nếu không tìm thấy cuốn nào)
        return ketQuaTimKiem;
    }

    @Override
    public void hienThiDanhSach() {
        if (this.danhSachSach.isEmpty()) {
            System.out.println("Thu vien chua co sach nao.");
            return; // quan trong, no se dung lai khi danhsach RONG
        }
        System.out.println("--- DANH SACH SACH TRONG THU VIEN ---");
        System.out.println("Thu vien hien co " + this.danhSachSach.size() + " sach.");
        System.out.println();
        for (Sach s : this.danhSachSach) {
            // Tự động gọi phương thức toString() tương ứng của mỗi đối tượng
            System.out.println(s);
        }
    }
}