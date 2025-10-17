public class SachGiaoTrinh extends Sach implements IKiemKe {
    private String monHoc;

    public SachGiaoTrinh(String tieuDe, String tacGia, int namXuatBan, int soLuong, double giaCoBan, String monHoc) {
        super(tieuDe, tacGia, namXuatBan, soLuong, giaCoBan);
        this.monHoc = monHoc;
    }

    public String getMonHoc() {
        return monHoc;
    }

    public void setMonHoc(String monHoc) {
        this.monHoc = monHoc;
    }

    @Override
    public double tinhGiaBan() {
        int soNam = 2025 - namXuatBan;
        return giaCoBan + (soNam * 5000);
    }

    @Override
    public boolean kiemTraTonKho(int soLuongToiThieu) {
        return this.soLuong >= soLuongToiThieu;
    }

    @Override
    public void capNhatViTri(String viTriMoi) {
        System.out.println("Đã chuyển sách " + tieuDe + " đến khu vực: " + viTriMoi);
    }

    @Override
    public String toString() {
        return super.toString() + ", Môn học: " + monHoc + ", Giá bán: " + tinhGiaBan() + " VNĐ";
    }
}
