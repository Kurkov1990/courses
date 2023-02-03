package lesson18_massiv;

public class Test6 {

    public static void maxMin (double[] array) {
        double max = array[0];
        double min = array[0];
        for (int i=1; i<array.length; i++) {
            if (array[i]>max) {
                max=array[i];
            }
            if (array[i]<min){
                 min=array[i];
            }
        }
        System.out.println("Min: "+min);
        System.out.println("Max: "+max);
    }
    public static void main(String[] args) {
        double [] array1={1.09,45.56,3.45,12.54};
        maxMin(array1);
    }

}
