package lesson11;

public class Employee {
    public String name;
    public double salary;


    Employee (String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double increaser (double a) {
        a*=2;
        return a;
    }

    public double sal2 () {
        salary*=2;
        return salary;
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee("User1", 145.5);
        double d = emp1.increaser(emp1.salary);
        System.out.println(emp1.salary);
        System.out.println(d);
        emp1.sal2();
        System.out.println(emp1.salary);
    }
}
