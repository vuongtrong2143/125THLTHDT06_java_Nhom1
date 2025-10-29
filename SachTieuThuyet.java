public class SachTieuThuyet extends Sach implements IkiemKe {
    private String theLoai; // Thuộc tính riêng
    private boolean laSachSeries; // Thuộc tính riêng

    public SachTieuThuyet(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, double giaCoBan,
            String theLoai, boolean laSachSeries) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan);
        this.theLoai = theLoai;
        this.laSachSeries = laSachSeries;
    }

    public String getTheLoai() {
        return theLoai;
    }

    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }

    public boolean isLaSachSeries() {
        return laSachSeries;
    }

    public void setLaSachSeries(boolean laSachSeries) {
        this.laSachSeries = laSachSeries;
    }

    // Hoàn thành IGiaBan: tinhGiaBan()
    @Override
    public double tinhGiaBan() {
        double giaBanThem = 0.0;
        // Cộng thêm 15000.0 VNĐ nếu là sách series
        if (laSachSeries) {
            giaBanThem = 15000.0;
        }

        return getGiaCoBan() + giaBanThem;
    }

    // Hoàn thành IKiemKe: kiemTraTonKho
    @Override
    public boolean kiemTraTonKho(int soLuongToiThieu) {
        // Trả về true nếu soLuong của sách >= soLuongToiThieu
        return getSoLuong() >= soLuongToiThieu;
    }

    // Hoàn thành IKiemKe: capNhatViTri
    @Override
    public void capNhatViTri(String viTriMoi) {
        // In ra thông báo: "Đã chuyển sách [Tiêu đề] đến khu vực: [vị trí mới]."
        System.out.println("Da chuyen sach '" + getTieuDe() + "' den khu vuc: " + viTriMoi + ".");
    }

    // Cập nhật toString()
    @Override
    public String toString() {
        return "Sach Tieu Thuyet {" +
                super.toString() +
                ", The loai: '" + theLoai + '\'' +
                ", La sach series: " + (laSachSeries ? "Co" : "Khong") +
                ", Gia ban: " + String.format("%,.0f VNĐ", tinhGiaBan()) +
                '}';
    }
}