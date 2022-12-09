import java.util.Scanner;

public class Lab1_1 {
    public static void main(String[] args) {
        Scanner insertDate = new Scanner(System.in);
        int day;
        int month;
        int year;

        int currentDay = 9;
        int currentMonth = 12;   //Дата для сравнния
        int currentYear = 2022;

        try {
            System.out.print("Введите день: ");
            day = insertDate.nextInt();
            if ( !(day >=1 && day<=31) ) {
                System.out.print("Ошибка! (Некорректный формат дня)");
                return;
            }
            System.out.print("Введите месяц: ");
            month = insertDate.nextInt();
            if ( !(month >=1 && month<=12) ){
                System.out.print("Ошибка! (Некорректный формат месяца)");
                return;
            }
            if ( (month%2==0 && day==31 ) || ( month==2 && day>=29) ) {
                System.out.print("Ошибка! (День не соотносится с месяцем)");
                return;
            }
            System.out.print("Введите год: ");
            year = insertDate.nextInt();
            if (year>currentYear || year==currentYear &&(month>currentMonth || (month==currentMonth && day>currentDay))){
                System.out.print("Ошибка! (Вы ввели ещё ненаступившую дату)");
                return;
            }
        }
        catch (Exception e) {
            System.out.print("Ошибка! (Некорректный формат даты)");
            return;
        }
        insertDate.close();

        int finalYear;
        int finalMonth;
        int finalDay;

        if (currentMonth>month || (currentMonth==month && currentDay>=day)){
            finalYear = currentYear - year;
            if (currentDay>=day){
                finalMonth = currentMonth - month;
                finalDay= currentDay - day;
            }
            else {
                finalMonth = currentMonth - month - 1;
                if (currentMonth%2==1) finalDay = 31 - (day - currentDay);
                else finalDay = 30 - (day - currentDay);
            }
        }

        else {
            finalYear = currentYear - year - 1;
            if (currentDay>=day){
                finalMonth = 12 - (month - currentMonth);
                finalDay = currentDay - day;
            }
            else {
                finalMonth = 12 - (month - currentMonth) - 1;
                if (currentMonth%2==1) finalDay = 31 - (day - currentDay);
                else finalDay = 30 - (day - currentDay);
            }
        }
        System.out.println(finalYear + " лет " + finalMonth + " месяцев " + finalDay + " дней " + "по состоянию на " + currentDay + "." + currentMonth + "." + currentYear);
    }
}