package lesson13;

public class Test1 {
}
class Student {
    int grade;
    Student (int grade) {
        this.grade = grade;
    }

    public static void main(String[] args) {
        Student st1 = new Student(3);

        switch (st1.grade) {
           case 2:
               System.out.println("bad student");
               break;
           case 3:
               System.out.println("Middle Student");
               break;
           case 4:
               System.out.println("Good Student");
               break;
           case 5:
               System.out.println("Great Student");
               break;
           default:
               System.out.println("Incorrect mark");
       }
    }
}
