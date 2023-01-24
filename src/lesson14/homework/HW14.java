package lesson14.homework;

public class HW14 {
     static void Time() {
        HOURS:for (int hours = 0; hours <= 5; hours++) {
            MINUTE:for (int minute = 0; minute <= 59; minute++) {
                if (hours > 1 && minute%10 == 0) {
                    break HOURS;
                }
                SECOND:for (int second = 0; second <= 59; second++) {
                    if (second * hours > minute) {
                        continue MINUTE;
                    }
                    System.out.println(hours + ":" + minute + ":" + second);
                }
            }
        }
    }
    public static void main(String[] args) {
            HW14 tim = new HW14();
            Time();
    }
}

