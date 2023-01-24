package lesson12;

import lesson11.Student;


public class StudentTest {

    public static void StudentCompare (Student st1, Student st2) {
        if (st1.name.equals(st2.name) && st1.course==st2.course && st1.grade==st2.grade) {
            System.out.println("Students are equals");
        } else {
            System.out.println("Students are not equals");
        }
    }

    public static void StudentDataCompare (Student st1, Student st2) {
        if (st1.name.equals(st2.name)) {
            System.out.println("Students name are equals");
            if (st1.course==st2.course) {
                System.out.println("Student course are eguals");
                if (st1.grade==st2.grade) {
                    System.out.println("Student grade are eguals");
                    System.out.println("Student are the same");
                }
                else {
                    System.out.println("Student grade are different");
                    System.out.println("Student are the different");
                }
            } else {
                System.out.println("Student course are different");
                System.out.println("Student are the different");
            }
        }
        else {
            System.out.println("Student are the different");
            System.out.println("Students name are different");
        }
    }


    public static void main(String[] args) {
        Student s1 = new Student("Test1", 2, 2);
        Student s2 = new Student("Test", 1, 12.5);
        StudentDataCompare(s1,s2);
        StudentCompare(s1, s2);
    }

}
