import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so a: ");
        int a = sc.nextInt();

        System.out.print("Nhap so b: ");
        int b = sc.nextInt();

        int ucln = UCLN(a, b);
        int bcnn = (a * b) / ucln;

        System.out.println("UCLN cua " + a + " va " + b + " = " + ucln);
        System.out.println("BCNN cua " + a + " va " + b + " = " + bcnn);

        sc.close();
    }

    public static int UCLN(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
