package lesson5;

public class StudentTest {
}

class Student {
        int number;
        String name;
        String surname;
        int year;
        double math;
        double economy;
        double language;
}

class StudentClass {

    double averageValue(Student st) {
        double st_average = (st.math+st.language+st.economy)/3;
        System.out.println("Average score: "+ st_average);
        return st_average;
    }

    public static void main(String[] args) {
        Student st1 = new Student();
        Student st2 = new Student();
        Student st3 = new Student();
        st1.number=1;
        st2.number = 2;
        st3.number = 3;
        st1.name = "Name1";
        st2.name = "Name2";
        st3.name = "Name3";
        st1.surname = "Surname1";
        st2.surname = "Surname2";
        st3.surname = "Surname3";
        st1.year = 2019;
        st2.year = 2018;
        st3.year = 2021;
        st1.math = 10.5;
        st2.math = 9.2;
        st3.math = 11.5;
        st1.economy = 12.5;
        st2.economy = 27.2;
        st3.economy = 14.5;
        st1.language = 32.5;
        st2.language = 27.7;
        st3.language = 29.5;

        StudentClass stud = new StudentClass();
        stud.averageValue(st1);
        stud.averageValue(st2);
        stud.averageValue(st3);
    }
}


