package lesson15;

public class test9 {

    public static void main(String[] args) {
        int h =-1;

        OUTER:
        do {
            h++;
            int m=0;
            INNER:
            while (m<60) {
                if (m==20) {
                    break OUTER;
                }
                System.out.println(h+":"+m);
                m++;
            }
         h++;
        }
        while (h<23);
    }

}
