package lesson15.homework;

public class Hw15 {
    static void Time() {
        int hours =0;
        OUTER:while (hours<6){
            int minute = -1;
            MIDDLE:do {
                minute++;
                if (hours > 1 && minute % 10 == 0) {
                    break OUTER;
                }
                int second=0;
                while (second<60) {
                    if (second * hours > minute) {
                        continue MIDDLE;
                    }
                    System.out.println(hours + ":" + minute + ":" + second);
                    second++;
                }
            }
                while (minute<59);
            hours++;
        }
    }

    public static void main(String[] args) {
        Time();
    }
}
