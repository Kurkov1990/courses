package lesson18_massiv.homework;

import java.util.Arrays;

public class Test1 {

    public static int[] sortuvaniaBbl(int[] array) {
        int a=0;
        boolean zamina = true;
        while (zamina) {
            zamina = false;
            for (int i = 0; i < array.length - 1 - a; i++) {
                if (array[i] > array[i + 1]) {
                    int tmp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tmp;
                    zamina = true;
                }}
                a++;
            }
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
        return array;
    }

    public static int[] sortuvania(int[] array) {
        int a;
        for (int i = 0; i < array.length; i++) {
            int max = array[i];
            int ind = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > max) {
                    max = array[j];
                    ind = j;
                }
            }
            if (i != ind) {
                a = array[i];
                array[i] = max;
                array[ind] = a;
            }

        }
        return array;
    }


    public static void main(String[] args) {
        int array1[]={1,9,3,-8,0,5,4,1};
        sortuvaniaBbl(array1);
        sortuvania(array1);
        System.out.println();
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        }

    }

