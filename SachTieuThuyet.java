public class SachTieuThuyet extends Sach implements IkiemKe {
    private String theLoai;
    private boolean laSachSeries;

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

    @Override
    public double tinhGiaBan() {
        double giaBanThem = 0.0;
        if (laSachSeries) {
            giaBanThem = 15000.0;
        }

        return getGiaCoBan() + giaBanThem;
    }

    // Triển khai IkiemKe: kiemTraTonKho
    @Override
    public boolean kiemTraTonKho(int soLuongToiThieu) {
        // Trả về true nếu soLuong của sách >= soLuongToiThieu
        return getSoLuong() >= soLuongToiThieu;
    }

    // Triển khai IkiemKe: capNhatViTri
    @Override
    public void capNhatViTri(String viTriMoi) {
        // In ra thông báo: "Đã chuyển sách [Tiêu đề] đến khu vực: [vị trí mới]."
        System.out.println("Da chuyen sach '" + getTieuDe() + "' den khu vuc: " + viTriMoi + ".");
    }

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