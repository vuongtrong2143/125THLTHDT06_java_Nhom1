import java.util.*;

public class Tuan4_Minh_Bai8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap kich thuoc mang: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Nhap " + n + " phan tu:");
        for (int i = 0; i < n; i++) {
            System.out.print("Phan tu thu " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        List<Integer> ketQua = timTatCaPhanTuNhieuNhat(arr);
        int maxTanSuat = tinhMaxTanSuat(arr);

        System.out.println("\nMang da nhap: " + Arrays.toString(arr));

        if (ketQua.size() == 1) {
            System.out.println("Phan tu xuat hien nhieu nhat: " + ketQua.get(0));
        } else {
            System.out.print("Cac phan tu xuat hien nhieu nhat: ");
            for (int i = 0; i < ketQua.size(); i++) {
                System.out.print(ketQua.get(i));
                if (i < ketQua.size() - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }

        System.out.println("So lan xuat hien: " + maxTanSuat);

        hienThiTanSuat(arr);

        scanner.close();
    }

    public static List<Integer> timTatCaPhanTuNhieuNhat(int[] arr) {
        Map<Integer, Integer> tanSuat = new HashMap<>();

        for (int num : arr) {
            tanSuat.put(num, tanSuat.getOrDefault(num, 0) + 1);
        }

        int maxTanSuat = 0;
        for (int count : tanSuat.values()) {
            maxTanSuat = Math.max(maxTanSuat, count);
        }

        List<Integer> ketQua = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : tanSuat.entrySet()) {
            if (entry.getValue() == maxTanSuat) {
                ketQua.add(entry.getKey());
            }
        }

        Collections.sort(ketQua);

        return ketQua;
    }

    public static int tinhMaxTanSuat(int[] arr) {
        Map<Integer, Integer> tanSuat = new HashMap<>();

        for (int num : arr) {
            tanSuat.put(num, tanSuat.getOrDefault(num, 0) + 1);
        }

        int maxTanSuat = 0;
        for (int count : tanSuat.values()) {
            maxTanSuat = Math.max(maxTanSuat, count);
        }

        return maxTanSuat;
    }

    public static void hienThiTanSuat(int[] arr) {
        Map<Integer, Integer> tanSuat = new HashMap<>();

        for (int num : arr) {
            tanSuat.put(num, tanSuat.getOrDefault(num, 0) + 1);
        }

        System.out.println("\nTan suat xuat hien cua tung phan tu:");
        List<Map.Entry<Integer, Integer>> sortedEntries = new ArrayList<>(tanSuat.entrySet());
        Collections.sort(sortedEntries, Map.Entry.comparingByKey());

        for (Map.Entry<Integer, Integer> entry : sortedEntries) {
            System.out.println("Phan tu " + entry.getKey() + ": " + entry.getValue() + " lan");
        }
    }
}