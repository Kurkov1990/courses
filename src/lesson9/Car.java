package lesson9;

public class Car {
    String color;
    int a=10;
    String engine;
    static int count;

    public Car(String color, String engine){
        count++;
        this.color=color;
        this.engine=engine;
    }

    public void showColor() {
        System.out.println("Color"+ "color");
        changeColor("red");
    }

    public void changeColor(String color3) {
        System.out.println("New color");
        int price=5000;
        this.color=color3;
        price+=1000;
    }
}
