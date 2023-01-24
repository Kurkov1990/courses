package lesson3;

public class test4 {
    public static void main(String[] args) {
        //System.out.println(a);
        int a=5; //5-4+4+5+5
        int c= a-- - --a + ++a + a++ + a; //5-4+4+4+5
        int b=8;
        int d=++b - b++ + ++b - --b; //9-9+11-10
        System.out.println(c);
        System.out.println(a);
        System.out.println(d);

        double d2=5d;
        int i1=2;
        System.out.println(d2%i1);
    }
}

