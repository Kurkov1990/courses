package lesson8.homework;

public class Test21 {
    static final double pi =3.14;

    double square (double r1) {
        double s=r1*r1*pi;
        return s;
    }

    static double length (double r2) {
        double l=2*pi*r2;
        return l;
    }

    void showInfo(double r3) {
        System.out.println("Radius: "+r3);
        System.out.println("Square: "+square(r3));
        System.out.println("Length: "+length(r3));
    }
}

class Test22 {
    public static void main(String[] args) {
        System.out.println(Test21.length(10));
        Test21 t41=new Test21();
        System.out.println(t41.square(15));
        t41.showInfo(14);

    }
}
