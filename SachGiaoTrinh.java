package com.mycompany.THLTHDT;

public class SachGiaoTrinh extends Sach {
    private String monHoc;
    private String capDo; // Đại học, Phổ thông,...

    public SachGiaoTrinh(String maSach, String tieuDe, String tacGia,
                         int namXuatBan, int soLuong, double giaCoBan,
                         String monHoc, String capDo) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan);
        this.monHoc = monHoc;
        this.capDo = capDo;
    }

    public String getMonHoc() {
        return monHoc;
    }

    public void setMonHoc(String monHoc) {
        this.monHoc = monHoc;
    }

    public String getCapDo() {
        return capDo;
    }

    public void setCapDo(String capDo) {
        this.capDo = capDo;
    }

    // IGiaBan: Giá bán = giaCoBan + (số năm đã xuất bản × 5000)
    // Số năm đã xuất bản = 2025 - namXuatBan
    @Override
    public double tinhGiaBan() {
        int soNamXuatBan = 2025 - getNamXuatBan();
        if (soNamXuatBan < 0) {
            soNamXuatBan = 0;
        }
        return getGiaCoBan() + soNamXuatBan * 5000;
    }

    // IKiemKe
    @Override
    public boolean kiemTraTonKho(int soLuongToiThieu) {
        return getSoLuong() >= soLuongToiThieu;
    }

    @Override
    public void capNhatViTri(String viTriMoi) {
        System.out.println("Đã chuyển sách \"" + getTieuDe()
                + "\" đến khu vực: " + viTriMoi + ".");
    }

    @Override
    public String toString() {
        return "=== SÁCH GIÁO TRÌNH ===\n"
                + super.toString()
                + "\nMôn học: " + monHoc
                + "\nCấp độ: " + capDo
                + "\nGiá bán: " + tinhGiaBan() + " VNĐ";
    }
}

