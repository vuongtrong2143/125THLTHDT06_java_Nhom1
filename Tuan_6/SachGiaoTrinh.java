

package THLTHDT;

public class SachGiaoTrinh extends Sach {
    private String monHoc;
    private String capDo; // Ví dụ: Đại học, Phổ thông

    public SachGiaoTrinh(String maSach, String tieuDe, String tacGia,
                         int namXuatBan, int soLuong,
                         String monHoc, String capDo) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong);
        this.monHoc = monHoc;
        this.capDo = capDo;
    }

    public String getMonHoc() { return monHoc; }
    public void setMonHoc(String monHoc) { this.monHoc = monHoc; }

    public String getCapDo() { return capDo; }
    public void setCapDo(String capDo) { this.capDo = capDo; }

    @Override
    public String toString() {
        return super.toString() + String.format(" | Môn học: %s | Cấp độ: %s", monHoc, capDo);
    }
}
=======
package THLTHDT;

public class SachGiaoTrinh extends Sach {
    private String monHoc;
    private String capDo; // Ví dụ: Đại học, Phổ thông

    public SachGiaoTrinh(String maSach, String tieuDe, String tacGia,
                         int namXuatBan, int soLuong,
                         String monHoc, String capDo) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong);
        this.monHoc = monHoc;
        this.capDo = capDo;
    }

    public String getMonHoc() { return monHoc; }
    public void setMonHoc(String monHoc) { this.monHoc = monHoc; }

    public String getCapDo() { return capDo; }
    public void setCapDo(String capDo) { this.capDo = capDo; }

    @Override
    public String toString() {
        return super.toString() + String.format(" | Môn học: %s | Cấp độ: %s", monHoc, capDo);
    }
=======
public class SachGiaoTrinh extends Sach{
    private String monHoc;
    private String capDo;

    public SachGiaoTrinh(){ super(); }
    public SachGiaoTrinh(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong,
                            String monHoc, String capDo){ 
        // Gọi đến hàm tạo của lớp cha (Sach) để khởi tạo các thuộc tính chung
        // Từ khóa 'super' phải là câu lệnh đầu tiên trong hàm tạo của lớp con.
        super(maSach,tieuDe,tacGia,namXuatBan,soLuong);
        
        // Khởi tạo các thuộc tính riêng của lớp con
        this.monHoc = monHoc;
        this.capDo = capDo;
    }
    // Các phương thức getter và setter cho thuộc tính riêng
    public void setmonHoc(String monHoc){      this.monHoc = monHoc;    }
    public String getmonHoc(){        return monHoc;    }
    public void setcapDo(String capDo){        this.capDo = capDo;    }
    public String getcapDo(){        return capDo;    }

    /*
     * 3. Ghi đè (Override) phương thức toString()
     * Để hiển thị đầy đủ thông tin, bao gồm cả thông tin từ lớp cha ta dùng super.toString(),
     * sau đó thay thế dấu } cuối cùng bằng dòng lệnh nối dài.
    */
    @Override
    public String toString() {
        return super.toString().replace("}", ", monHoc='" + monHoc + '\'' + ", capDo='" + capDo + "'}");
    }


}
