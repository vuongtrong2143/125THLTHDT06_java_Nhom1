import java.util.Scanner;

public class Tuan4_Quang_Bai_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ===== Nhập mảng ban đầu =====
        System.out.print("Nhập số lượng phần tử ban đầu: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        // In mảng ban đầu
        System.out.print("Mảng ban đầu: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // ===== Thêm phần tử =====
        System.out.print("Nhập số cần thêm: ");
        int soThem = sc.nextInt();
        System.out.print("Nhập vị trí cần thêm (0 -> " + n + "): ");
        int viTriThem = sc.nextInt();

        if (viTriThem >= 0 && viTriThem <= n) {
            int[] newArr = new int[n + 1]; // mảng mới có thêm 1 phần tử
            for (int i = 0, j = 0; i < newArr.length; i++) {
                if (i == viTriThem) {
                    newArr[i] = soThem;
                } else {
                    newArr[i] = arr[j];
                    j++;
                }
            }
            arr = newArr;
            n++;
        } else {
            System.out.println("Vị trí không hợp lệ.");
        }

        // In mảng sau khi thêm
        System.out.print("Mảng sau khi thêm: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // ===== Xóa phần tử =====
        System.out.print("Nhập vị trí cần xóa (0 -> " + (n - 1) + "): ");
        int viTriXoa = sc.nextInt();

        if (viTriXoa >= 0 && viTriXoa < n) {
            int[] newArr = new int[n - 1]; // mảng mới nhỏ hơn 1 phần tử
            for (int i = 0, j = 0; i < n; i++) {
                if (i == viTriXoa) continue; // bỏ qua vị trí cần xóa
                newArr[j] = arr[i];
                j++;
            }
            arr = newArr;
            n--;
        } else {
            System.out.println("Vị trí không hợp lệ.");
        }

        // In mảng sau khi xóa
        System.out.print("Mảng sau khi xóa: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        sc.close();
    }
}
