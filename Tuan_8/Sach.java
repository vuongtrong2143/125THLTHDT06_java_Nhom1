public abstract class Sach implements IGiaBan, IKiemKe {
    private String maSach;
    private String tieuDe;
    private String tacGia;
    private int namXuatBan;
    private int soLuong;
    private double giaCoBan;
    private String viTri;

    public Sach(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, double giaCoBan, String viTri) {
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
        this.soLuong = soLuong;
        this.giaCoBan = giaCoBan;
        this.viTri = viTri;
    }

    // Getters/Setters
    public String getMaSach() { return maSach; }
    public String getTieuDe() { return tieuDe; }
    public String getTacGia() { return tacGia; }
    public int getNamXuatBan() { return namXuatBan; }
    public int getSoLuong() { return soLuong; }
    public double getGiaCoBan() { return giaCoBan; }
    public String getViTri() { return viTri; }

    public void setSoLuong(int soLuong) { this.soLuong = soLuong; }
    public void setGiaCoBan(double giaCoBan) { this.giaCoBan = giaCoBan; }
    public void setViTri(String viTri) { this.viTri = viTri; }

    @Override
    public boolean kiemTraTonKho(int soLuongToiThieu) {
        return this.soLuong >= soLuongToiThieu;
    }

    @Override
    public void capNhatViTri(String viTriMoi) {
        this.viTri = viTriMoi;
        System.out.println("Đã chuyển sách \"" + tieuDe + "\" đến khu vực: " + viTriMoi);
    }

    // Abstract method cho lớp con triển khai
    public abstract double tinhGiaBan();

    @Override
    public String toString() {
        return String.format("[%s] %s - %s (%d) | Giá cơ bản: %.2f | SL: %d | Vị trí: %s",
                maSach, tieuDe, tacGia, namXuatBan, giaCoBan, soLuong, viTri);
    }
}