package lesson14;

public class Test6 {
    public void Time() {
        OUTER:for (int h = 0; h<=23; h++ ) {
            INNER:for (int m=0; m<=59;m++) {
                System.out.println(h+":"+m);
                if (m==30) {
                    break INNER;
                }
            }
        }
    }

    public static void main(String[] args) {
        Test6 t= new Test6();
        t.Time();
    }
}
