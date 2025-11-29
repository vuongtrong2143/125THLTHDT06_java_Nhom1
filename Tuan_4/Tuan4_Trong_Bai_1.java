import java.util.Scanner;

public class Tuan4_Trong_Bai_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so can kiem tra: ");
        double so = scanner.nextDouble();

        String ketQua = (so > 0) ? "la so duong." : ((so < 0) ? "la so am." : "bang 0.");
        System.out.println("So " + so + " " + ketQua);
        scanner.close();
    }
}