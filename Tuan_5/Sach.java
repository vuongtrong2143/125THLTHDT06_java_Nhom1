import java.util.Scanner;

public class Sach {
    private String maSach;
    private String tieuDe;
    private String tacGia;
    private int namXuatBan;
    private int soLuong;

    public Sach() {
        this.maSach = "";
        this.tieuDe = "";
        this.tacGia = "";
        this.namXuatBan = 0;
        this.soLuong = 0;
    }

    public Sach(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong) {
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
        this.soLuong = soLuong;
    }

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

    public void hienThiThongTin() {
        System.out.println("Ma sach: " + getMaSach());
        System.out.println("Tieu de: " + getTieuDe());
        System.out.println("Tac gia: " + getTacGia());
        System.out.println("Nam xuat ban: " + getNamXuatBan());
        System.out.println("So luong: " + getSoLuong());
        System.out.println("-------------------");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Sach sach1 = new Sach();
        System.out.print("Nhap ma sach 1: ");
        sach1.setMaSach(scanner.nextLine());
        System.out.print("Nhap tieu de ma sach 1: ");
        sach1.setTieuDe(scanner.nextLine());
        System.out.print("Nhap tac gia sach 1: ");
        sach1.setTacGia(scanner.nextLine());
        System.out.print("Nhap nam xuat ban sach 1: ");
        sach1.setNamXuatBan(scanner.nextInt());
        System.out.print("Nhap so luong sach 1: ");
        sach1.setSoLuong(scanner.nextInt());
        scanner.nextLine();

        Sach sach2 = new Sach();
        System.out.print("Nhap ma sach 2: ");
        sach2.setMaSach(scanner.nextLine());
        System.out.print("Nhap tieu de ma sach 2: ");
        sach2.setTieuDe(scanner.nextLine());
        System.out.print("Nhap tac gia sach 2: ");
        sach2.setTacGia(scanner.nextLine());
        System.out.print("Nhap nam xuat ban sach 2: ");
        sach2.setNamXuatBan(scanner.nextInt());
        System.out.print("Nhap so luong sach 2: ");
        sach2.setSoLuong(scanner.nextInt());
        scanner.nextLine();

        System.out.println("\nThong tin sach 1:");
        sach1.hienThiThongTin();

        System.out.println("Thong tin sach 2:");
        sach2.hienThiThongTin();

        scanner.close();
    }
}