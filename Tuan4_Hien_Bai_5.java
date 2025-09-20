import java.util.Scanner;
public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so nguyen: ");
        int x = sc.nextInt();

        if (laNguyenTo(x)) {
            System.out.println(x + " la so nguyen to");
        } else {
            System.out.println(x + " khong phai so nguyen to");
        }

        sc.close();
    }

    public static boolean laNguyenTo(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
