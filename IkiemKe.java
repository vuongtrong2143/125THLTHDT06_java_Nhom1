public interface IkiemKe {

    // Kiểm tra sách có đủ số lượng tối thiểu hay không
    boolean kiemTraTonKho(int soLuongToiThieu);

    // Cập nhật vị trí lưu trữ mới của cuốn sách
    void capNhatViTri(String viTriMoi);
}