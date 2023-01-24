package lesson6.homework;


public class Student {

    Student (int number1, String name1, String surname1, int year1, double math1, double economy1, double language1) {
        number=number1;
        name=name1;
        surname=surname1;
        year=year1;
        math = math1;
        economy= economy1;
        language=language1;
    }
    Student () {
    }

    Student (int number2, String name2, String surname2, int year2){
        this(number2, name2, surname2, year2, 0.0, 0.0, 0.0);
    }

    int number;
    String name;
    String surname;
    int year;
    double math;
    double economy;
    double language;


}

class StudentTest {

    double averageValue(Student st) {
        double st_average = (st.math+st.language+st.economy)/3;
        System.out.println("Average score: "+ st_average);
        return st_average;
    }

    public static void main(String[] args) {
    Student st1 = new Student();
        st1.number=1;
        st1.name = "Name1";
        st1.surname = "Surname1";
        st1.year = 2019;
        st1.math = 10.5;
        st1.economy = 12.5;
        st1.language = 32.5;

        Student st2 = new Student(2, "Name2", "Surname2",2010);
        st1.math = 12.5;
        st1.economy = 14.5;
        st1.language = 33.5;

        Student st3 = new Student(3, "Name3", "Surname3",2011, 14.2,15.3,14.24);


        StudentTest st=new StudentTest();

        st.averageValue(st1);
        st.averageValue(st1);
        st.averageValue(st3);
    }

}
