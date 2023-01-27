package lesson17;

import static lesson17.homework.rivnist;

public class homework {
    static boolean rivnist (StringBuilder sb1, StringBuilder sb2) {
        if (sb1.equals(sb2) || sb2.equals(sb1)) {
            System.out.println("True");
            return true;
        }
        else {
            System.out.println("False");
            return false;

        }
    }
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("12345");
        StringBuilder sb2 = sb1.append("rege");
        rivnist(sb1, sb2);
    }

}
