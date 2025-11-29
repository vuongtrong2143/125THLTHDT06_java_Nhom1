import java.util.List;

public interface IQuanLySach {
    Sach timKiemtheomasach(String maSach);
    int size(); // Them phuong thuc nay de lay so luong
    // <<< THAY ĐỔI Ở ĐÂY >>>
    // Xóa phương thức cũ:
    // boolean themSach(Sach... sach);

    // Thêm các phương thức mới nhận dữ liệu thô để TẠO SÁCH:
    boolean themSachGiaoTrinh(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, double giaCoBan, String viTri,
                              String monHoc, String capDo);

    boolean themSachTieuThuyet(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, double giaCoBan, String viTri,
                               String theLoai, boolean laSachSeries);
    // <<< KẾT THÚC THAY ĐỔI >>>
    List<Sach> timKiemSach(String tenSach);
    boolean xoaSach(String maSach);
    void hienThiDanhSach();
}
