import java.util.Scanner;

public class Lab1_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
 
        int count = 0;
        System.out.println("Количество точек: ");
        int PointsAmount = in.nextInt();
        System.out.println("Радиус окружности: ");
        double radius = in.nextDouble();

        for (int i = 1; i <= PointsAmount; i++) {
            System.out.println("Координаты точки: ");
            double x = in.nextDouble();  // points X Y
            double y = in.nextDouble();
            if (x * x + y * y <= radius * radius) { // x^2 + y^2 = R^2
                count++;
            }
        }

        System.out.println(count + " точек попали в окружность");
    }
}