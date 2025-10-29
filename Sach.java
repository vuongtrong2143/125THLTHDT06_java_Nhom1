public abstract class Sach implements IGiaBan, IkiemKe { // Đã cập nhật implements IGiaBan và IkiemKe
    private String maSach;
    private String tieuDe;
    private String tacGia;
    private int namXuatBan;
    private int soLuong;
    private double giaCoBan; // Thuộc tính mới

    public Sach() {
        this.maSach = "";
        this.tieuDe = "";
        this.tacGia = "";
        this.namXuatBan = 0;
        this.soLuong = 0;
        this.giaCoBan = 0.0; // Khởi tạo giaCoBan
    }

    // Constructor đã cập nhật để bao gồm giaCoBan
    public Sach(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, double giaCoBan) {
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
        this.soLuong = soLuong;
        this.giaCoBan = giaCoBan; // Gán giá trị cho giaCoBan
    }

    // --- Getters và Setters cho tất cả các thuộc tính ---
    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
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

    // --- Phương thức của IGiaBan (Trừu tượng, sẽ được triển khai ở lớp con) ---
    @Override
    public abstract double tinhGiaBan();

    // --- Phương thức của IKiemKe (Trừu tượng, sẽ được triển khai ở lớp con) ---
    // Cần phải khai báo abstract vì Sach là abstract class và nó implements IkiemKe
    // Các lớp con (SachGiaoTrinh, SachTieuThuyet) sẽ thực thi chi tiết
    @Override
    public abstract boolean kiemTraTonKho(int soLuongToiThieu);

    @Override
    public abstract void capNhatViTri(String viTriMoi);

    // --- Các phương thức khác (Giữ nguyên) ---
    public void hienThiThongTin() {
        System.out.println("Ma sach: " + getMaSach());
        System.out.println("Tieu de: " + getTieuDe());
        System.out.println("Tac gia: " + getTacGia());
        System.out.println("Nam xuat ban: " + getNamXuatBan());
        System.out.println("So luong: " + getSoLuong());
        System.out.println("Gia co ban: " + getGiaCoBan());
        System.out.println("-------------------");
    }

    @Override
    public String toString() {
        return "Ma sach: " + maSach +
                ", Tieu de: '" + tieuDe + '\'' +
                ", Tac gia: '" + tacGia + '\'' +
                ", Nam xuat ban: " + namXuatBan +
                ", So luong: " + soLuong +
                ", Gia co ban: " + giaCoBan;
    }
}