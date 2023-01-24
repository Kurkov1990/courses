package lesson16;

public class Test1 {

    public static void main(String[] args) {
        String s1 = new String("abcdefgabcd");

        int a = s1.length();
        System.out.println(a);

        char c1 = s1.charAt(4);
        System.out.println(c1);

        int i1 = s1.indexOf("ll");
        System.out.println(i1);

        int i2 = s1.indexOf(3);
        System.out.println(i2);

        int i4 = s1.indexOf("ab", 2);
        System.out.println(i4);

        boolean b1 = s1.startsWith("abc");
        System.out.println(b1);

        boolean b2 = s1.startsWith("abc",7);
        System.out.println(b2);

        boolean b3 = s1.endsWith("iuy");
        System.out.println(b3);


    }
}
