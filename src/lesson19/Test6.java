package lesson19;

public class Test6 {
    public static void main(String[] args) {
        int [][] array ={{3,6,5 },{5,6},{4,3,6,5,6,2}};
        for (int [] array2 :array) {
            for (int a:array2){
                System.out.print(a+ " ");
            }
        }
    }
}
