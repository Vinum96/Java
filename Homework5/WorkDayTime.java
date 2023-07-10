package Homework5;

import java.util.Random;

public class WorkDayTime {
    public static void main(String[] args) {
        Random random = new Random();
        int secondsLeft = random.nextInt(28801);

        System.out.println("Осталось " + secondsLeft + " секунд");

        int hoursLeft = secondsLeft / 3600;

        if (hoursLeft > 0) {
            System.out.println("Осталось " + hoursLeft + " часов");
        } else {
            System.out.println("Осталось менее часа");
        }
    }
}
