import java.util.Scanner;

public class Tuan4_Minh_Bai2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a, b, c;
        int soNhoNhat;

        System.out.print("Nhap a: ");
        a = scanner.nextInt();

        System.out.print("Nhap b: ");
        b = scanner.nextInt();

        System.out.print("Nhap c: ");
        c = scanner.nextInt();

        soNhoNhat = Math.min(a, Math.min(b, c));

        System.out.println("So nho nhat trong 3 so " + a + ", " + b + ", " + c + " là: " + soNhoNhat);

        scanner.close();
    }
}
