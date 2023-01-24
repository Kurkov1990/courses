package lesson8.homework;

public class Test11 {

    static double multiplication(double a, double b, double c) {
        return a*b*c;
    }

    static void division (int a, int b) {
        System.out.println("whole part: "+a/b+ " Remainder: "+a%b );
    }
}
class Test12 {
    public static void main(String[] args) {
        System.out.println(Test11.multiplication(2.5,3.2,4.3));
        System.out.println(Test11.multiplication(8,7,15));
        Test11.division(10,3);
        Test11.division(15,2);
    }
}

