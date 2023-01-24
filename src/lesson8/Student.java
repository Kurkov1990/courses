package lesson8;

public class Student {
    String name;
    public int course;
    static int count;
    int a;

    public Student(String name2, int course2) {
        count++;
        name = name2;
        course = course2;
        System.out.println("Student #:"+count+" was created");
    }

    public static void showCount(){
        System.out.println("Total count: "+count);
    }

    public void showInfo() {
        System.out.println("Welcome to Ukraine");
    }

    void abc() {
        a++;
        count++;
    }

    static void abcd() {
        count++;
        Student st2 = new Student("Name4", 5);
        st2.a++;
    }

    public static void main(String[] args) {
        abcd();
        Student st3 = new Student("Name5", 2);
        st3.abc();
    }
}
