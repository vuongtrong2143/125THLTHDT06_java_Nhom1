import java.util.Scanner;

public interface IQuanLySach {

    // Thêm một cuốn sách mới vào hệ thống
    void themSach(Sach sach);

    // Xóa sách theo mã sách
    boolean xoaSach(String maSach);

    // Cập nhật thông tin sách theo mã sách, sử dụng Scanner cho input
    boolean capNhatSach(String maSach, Scanner scanner);

    // Tìm kiếm sách theo mã sách, trả về đối tượng Sach (abstract class)
    Sach timKiemTheoMa(String maSach);

    // Hiển thị toàn bộ danh sách sách hiện có
    void hienThiDanhSach();
}