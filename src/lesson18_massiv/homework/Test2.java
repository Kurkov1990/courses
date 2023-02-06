package lesson18_massiv.homework;

public class Test2 {
    public static void showArray (String[][] array) {

        for (int i=0; i<array.length; i++) {
            System.out.print("{");
                for (int j=0; j<array[i].length; j++) {
                    System.out.print(" "+array[i][j]);
                }
            System.out.print(" } ");
        }
    }public static void main(String[] args) {
        String array1[][] = {{"dfdf","efdf", "rgtg", "hdgh"},{"add"},{"odjf","fksj"},{"gfg","tfdty"}};
        showArray(array1);
    }
}
