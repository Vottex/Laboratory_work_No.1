import java.util.Scanner;

public class Lab1_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int day, month;
        System.out.print("Введите день: ");
        day = in.nextInt();
        System.out.print("Введите месяц: ");
        month = in.nextInt();

        if (((month == 4 || month == 6 || month == 9 || month == 11) && day > 30 ) || (day < 1 || day > 31 || month < 1 || month > 12 || (month == 2 && day > 28))) {
            System.out.println("Неверное значение");
        } else {

            // || -- or
            // && -- and

            if (month == 12 || month < 3) {
                System.out.println("Зима");
            } else if (month < 6) {
                System.out.println("Весна");
            } else if (month < 9) {
                System.out.println("Лето");
            } else {
                System.out.println("Осень");
            }
        }
    }
}