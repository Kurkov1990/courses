package lesson16;

public class Car {
    String color;
    String engine;
    Car (String color, String engine) {
        this.color = color;
        this.engine = engine;
    }
    final static int a=5;

    public Car abc (String clr) {
        Car c10 = new Car(clr,"V4");
        return c10;
    }

    public static void main(String[] args) {
        Car c = new Car("red", "v6");
        Car c2= c.abc("black");
        System.out.println(c2.engine);
    }
}

class TestCar {
    final static Car c1 =new Car ("red","V8");

    public static void main(String[] args) {
        c1.color ="black";
    }
}

