

import java.util.Random;

public class Clock {
    public static void main(String[] args) {
        int lastTime = new Random().nextInt(28800);
        double lastTimeHour = (double) lastTime / 3600;
        String stringHour = "";


        if (lastTimeHour >= 1.0 && lastTimeHour < 2.0) {
            stringHour = "остался " + (int)lastTimeHour + " час";
        }
        if (lastTimeHour >= 2.0 && lastTimeHour <= 4.0 ) {
            stringHour = "осталось " + (int)lastTimeHour + " часа";
        }
        if (lastTimeHour > 4.0 && lastTimeHour <= 8.0 ) {
            stringHour = "осталось " + (int)lastTimeHour + " часов";
        }
        if (lastTimeHour > 0.0 && lastTimeHour < 1.0 ) {
            stringHour = "осталось менее часа";
        }
        System.out.println("До конца рабочего дня осталось " + lastTime + " секунд");
        System.out.println("До конца рабочего дня " + stringHour);

    }
}
