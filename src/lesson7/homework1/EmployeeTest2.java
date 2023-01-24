package lesson7.homework1;


public class EmployeeTest2 {
    public static void main(String[] args) {
        lesson7.homework.Employee em1= new lesson7.homework.Employee(5);
        // lesson7.homework.Employee em2= new lesson7.homework.Employee("Surname1");
        // lesson7.homework.Employee em3= new lesson7.homework.Employee(521.2);
        em1.surname="TEST";
        System.out.println(em1.surname);
        em1.showSurname();
        em1.showSalary();
        em1.showId();
    }

}
