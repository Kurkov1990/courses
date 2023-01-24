package lesson6.homework;

public class MethodOverload {

    int sum() {
        int sum=0;
        System.out.println("Summa 0: "+sum);
        return sum;
    }

    int sum(int s1) {
        int sum=s1;
        System.out.println("Summa 1: "+ sum);
        return sum;
    }
    int sum(int s1, int s2) {
        int sum=s1+s2;
        System.out.println("Summa 2: "+sum);
        return sum;
    }

    int sum(int s1, int s2, int s3) {
        int sum=s1+s2+s3;
        System.out.println("Summa 3: "+ sum);
        return sum;
    }

    int sum(int s1, int s2, int s3, int s4) {
        int sum=s1+s2+s3+s4;
        System.out.println("Summa 4: "+ sum);
        return sum;
    }

}

class MethodOverloadTest {
    public static void main(String[] args) {
        MethodOverload me = new MethodOverload();
        me.sum();
        me.sum(2);
        me.sum(2,3);
        me.sum(4,1,5);
        me.sum(7,1,2,8);
    }
}
