import java.util.Scanner;

public class Tuan4_Quang_Bai_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so luong phan tu: ");
        int n = sc.nextInt();

        int[] arr = new int[n]; // khai báo mảng tĩnh có n phần tử

        // Nhập phần tử
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phan tu thu " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        // In mảng
        System.out.println("Các phan tu trong mang:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
