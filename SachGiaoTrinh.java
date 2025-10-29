public class SachGiaoTrinh extends Sach implements IkiemKe {
    private String monHoc;
    private String capDo;

    public SachGiaoTrinh(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, double giaCoBan,
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

    @Override
    public double tinhGiaBan() {
        final int NAM_HIEN_TAI = 2025;
        int soNamDaXuatBan = NAM_HIEN_TAI - getNamXuatBan();
        double giaBanThem = soNamDaXuatBan * 5000.0;

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
        System.out.println("Đã chuyển sách '" + getTieuDe() + "' đến khu vực: " + viTriMoi + ".");
    }

    @Override
    public String toString() {
        return "Sach Giao Trinh {" +
                super.toString() +
                ", Mon hoc: '" + monHoc + '\'' +
                ", Cap do: '" + capDo + '\'' +
                ", Gia ban: " + String.format("%,.0f VNĐ", tinhGiaBan()) +
                '}';
    }
}