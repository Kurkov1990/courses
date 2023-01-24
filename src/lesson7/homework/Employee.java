package lesson7.homework;

public class Employee {
    int id;
    public String surname;
    int age;
    private double salary;
    String department;

    public void showId(){
        System.out.println("ID: "+id);
    }

    public void showSurname() {
        System.out.println("Surname: " +surname);
    }

    public void showSalary() {
        System.out.println("Salary: "+salary);
    }

    public Employee(int id1) {
        id=id1;
    }

     Employee(String surname1) {
        surname=surname1;
    }

    private Employee(double salary1) {
        salary=salary1;
    }

}
