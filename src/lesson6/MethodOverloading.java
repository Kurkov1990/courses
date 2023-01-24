package lesson6;

public class MethodOverloading {

    void show(int i1){
        System.out.println(i1);
        System.out.println("Data Type is int");
    }

    void show(boolean b1){
        System.out.println(b1);
        System.out.println("Data Type is boolean");
    }

    void show(String s1) {
        System.out.println(s1);
        System.out.println("Data Type is String");
    }

    void show(String s, int a) {
        System.out.println("String: "+s+", Int: "+ a);
    }

    void show(int a, String s) {
        System.out.println(s);
        System.out.println(a);
    }
}


class MethodOverloadingTest {
    public static void main(String[] args) {
        MethodOverloading mo = new MethodOverloading();
        int a=500;
        mo.show(a);
        boolean b = true;
        mo.show(b);
        String s = "Test";
        mo.show(s);
        mo.show("Qwerty", 45);
        mo.show(50, "Testing");
    }
}