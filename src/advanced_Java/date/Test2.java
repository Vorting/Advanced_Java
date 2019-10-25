package advanced_Java.date;

import java.io.IOException;
import java.util.Date;

public class Test2 {
    public static void main(String[] args) throws Exception {

        Date currentTime = new Date(); // получаем текующую дату и время
        Thread.sleep(3000);     // ждем 3 сек - 3000 мс
        Date newTime = new Date();    // получаем новое текущее время

        long msDelay = newTime.getTime() - currentTime.getTime(); // вычисляем разницу
        System.out.println("Time distance is: " + msDelay + " in ms");
    }
}
