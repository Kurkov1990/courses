package lesson11.homework;

public class Car {
    String color;
    String engine;
    int doorCount;

    Car(String color, String engine, int doorCount) {
        this.color = color;
        this.engine = engine;
        this.doorCount = doorCount;
    }

    public static void changeDoor(Car a, int b) {
       a.doorCount = b;
    }

    public static void swape(Car c1, Car c2) {
        String color = c1.color;
        c1.color =c2.color;
        c2.color=color;
    }
}

    class CarTest {
        public static void main(String[] args) {
            Car cr1 = new Car("red","v8",3);
            Car cr2 = new Car("white","V6",4);
            System.out.println(cr1.doorCount);
            Car.swape(cr1,cr2);
            System.out.println(cr1.color);
            System.out.println(cr2.color);
            Car.changeDoor(cr2, 5);
            System.out.println(cr2.doorCount);
        }

    }

