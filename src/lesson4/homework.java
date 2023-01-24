package lesson4;

import java.util.Date;

public class homework {
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

class StudentTest {
    public static void main(String[] args) {
        Student st1 = new Student();
        Student st2 = new Student();
        Student st3 = new Student();
        st1.number = 1;
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
        double st1_average = (st1.math+st1.language+st1.economy)/3;
        double st2_average = (st2.math+st2.language+st2.economy)/3;
        double st3_average = (st3.math+st3.language+st3.economy)/3;
        System.out.println("Student 1:"+st1.name+" "+st1.surname+", Year:"+st1.year+", Average score:"+st1_average);
        System.out.println("Student 2:"+st2.name+" "+st2.surname+", Year:"+st2.year+", Average score:"+st2_average);
        System.out.println("Student 3:"+st3.name+" "+st3.surname+", Year:"+st3.year+", Average score:"+st3_average);
    }
}
