import java.util.Scanner;

public class Tuan4_Minh_Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        sc.close();

        int sum = n * (n + 1) / 2;
        System.out.println("Tong tu 1 den " + n + " la: " + sum);
    }
}
