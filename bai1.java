import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập tên từ bàn phím
        System.out.print("Nhap ten cua ban: ");
        String name = sc.nextLine();

        // In ra màn hình
        System.out.println("Hello " + name);

        sc.close();
    }
}
