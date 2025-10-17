public class SachTieuThuyet extends Sach implements IKiemKe {
    private boolean laSachSeries;

    public SachTieuThuyet(String tieuDe, String tacGia, int namXuatBan, int soLuong, double giaCoBan, boolean laSachSeries) {
        super(tieuDe, tacGia, namXuatBan, soLuong, giaCoBan);
        this.laSachSeries = laSachSeries;
    }

    public boolean isLaSachSeries() {
        return laSachSeries;
    }

    public void setLaSachSeries(boolean laSachSeries) {
        this.laSachSeries = laSachSeries;
    }

    @Override
    public double tinhGiaBan() {
        return giaCoBan + (laSachSeries ? 15000 : 0);
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
        return super.toString() + ", Là sách series: " + laSachSeries + ", Giá bán: " + tinhGiaBan() + " VNĐ";
    }
}
