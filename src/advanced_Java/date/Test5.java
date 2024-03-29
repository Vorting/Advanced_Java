package advanced_Java.date;

import java.util.Date;

public class Test5 {
    public static void main(String[] args) throws Exception {
        Date yearStartTime = new Date();
        yearStartTime.setHours(0);
        yearStartTime.setMinutes(0);
        yearStartTime.setSeconds(0);

        yearStartTime.setDate(1); // первое число
        yearStartTime.setMonth(0);  //месяц январь, нумерация для месяцев 0-11

        Date currentTime = new Date();
        long msTimeDistance = currentTime.getTime() - yearStartTime.getTime();
        long msDay = 24 * 60 * 60 * 1000;   // сколько миллисекунд в одних сутках

        int dayCount = (int) (msTimeDistance / msDay);    //колличество целых дней
        System.out.println("Days from start of year: " + dayCount);
    }
}
