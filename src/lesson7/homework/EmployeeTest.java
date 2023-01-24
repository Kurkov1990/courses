package lesson7.homework;

public class EmployeeTest {
    public static void main(String[] args) {
        lesson7.homework.Employee em1= new lesson7.homework.Employee(5);
        lesson7.homework.Employee em2= new lesson7.homework.Employee("Surname1");
    //    lesson7.homework.Employee em3= new lesson7.homework.Employee(521.2);
        System.out.println(em1.surname);
        System.out.println(em1.id);
        System.out.println(em2.surname);
        System.out.println(em2.id);
        em1.showId();
        em1.showSalary();
        em1.showSurname();
        em2.showId();
        em2.showSalary();
        em2.showSurname();
    }

}
