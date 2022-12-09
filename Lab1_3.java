import java.util.Scanner;

public class Lab1_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // input: int x, n; output: x ^ n;
        System.out.print("Введите x: ");
        int x = in.nextInt();
        System.out.print("Введите n: ");
        int n = in.nextInt();

        double res = 1;

        if (n <= -15 || n >= 15) {
            System.out.println("Неверное значение");
        } else {
            if (n > 0) {
                for (int i = 1; i <= n; i++) {
                    res *= x;
                }
            } else {
                for (int i = 1; i <= -n; i++) {
                    res /= x;
                }
            }

            System.out.println("x^m = " + res);
        }
    }
}
