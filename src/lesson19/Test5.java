package lesson19;

public class Test5 {
    public static void main(String[] args) {
        String [] students= {"st1","st2","st3"};
        String [] exams= {"ex1","ex2","ex3"};
        for (String s1: students) {
            for (String s2: exams) {
                System.out.println(s1+"   "+s2);
            }
        }
    }
}
