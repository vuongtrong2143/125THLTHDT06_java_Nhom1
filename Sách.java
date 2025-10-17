public abstract class Sach {
    protected String tieuDe;
    protected String tacGia;
    protected int namXuatBan;
    protected int soLuong;
    protected double giaCoBan;

    public Sach(String tieuDe, String tacGia, int namXuatBan, int soLuong, double giaCoBan) {
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
        this.soLuong = soLuong;
        this.giaCoBan = giaCoBan;
    }

    public String getTieuDe() {
        return tieuDe;
    }

    public void setTieuDe(String tieuDe) {
        this.tieuDe = tieuDe;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public int getNamXuatBan() {
        return namXuatBan;
    }

    public void setNamXuatBan(int namXuatBan) {
        this.namXuatBan = namXuatBan;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getGiaCoBan() {
        return giaCoBan;
    }

    public void setGiaCoBan(double giaCoBan) {
        this.giaCoBan = giaCoBan;
    }

    // 🔹 Phương thức trừu tượng
    public abstract double tinhGiaBan();

    @Override
    public String toString() {
        return "Tiêu đề: " + tieuDe + ", Tác giả: " + tacGia + ", Năm xuất bản: " + namXuatBan +
               ", Số lượng: " + soLuong + ", Giá cơ bản: " + giaCoBan;
    }
}
