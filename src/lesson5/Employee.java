package lesson5;

public class Employee {
    Employee(int id1, String surname1, int age1, double salary1, String department1){
        id=id1;
        surname=surname1;
        age=age1;
        salary=salary1;
        department=department1;
    }
    int id;
    String surname;
    int age;
    double salary;
    String department;

    double addSalary() {
        salary*=2;
        return salary;
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee em1 = new Employee(1, "User1", 32, 2010, "QA");
        Employee em2 = new Employee(2, "User2", 25, 1500, "Dev");
        em1.addSalary();
        em2.addSalary();
        System.out.println("New Sallary" + em1.salary);
        System.out.println("New Sallary" + em2.salary);
    }


}
