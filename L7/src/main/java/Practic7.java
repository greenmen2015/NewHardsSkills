import java.util.Arrays;

public class Practic7 {
    public static void main(String[] args) {


//        int [] mas = new int [10];
//        mas[1] = 34;
//        mas[8] = 45;
//        System.out.println(Arrays.toString(mas));

//        int[] num = {1, 2, 3, 4, 5};
//        int length = num.length;
//        System.out.println(length);
//
//        int last = num [num.length - 1];
//        System.out.println(last);
//
//
//        //int [][] mas2 = new int [12][5];
//        int [][] mas2 = {{1, 2, 3}, {4, 5, 6}};
//        System.out.println(Arrays.deepToString(mas2));
//        mas2 [1][0] = 34;
//        System.out.println(Arrays.deepToString(mas2));

//        int [] array = new int [] {1, 2, 3, 4, 5};
//        for (int i : array) {
//            System.out.println(i);
//        }
//
//        int[] array = new int[]{1, 2, 3, 4, 5};
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//        }


//        int[] array = new int[]{1, 2, 3, 4, 5};
//        for (int i = 0; i < array.length; i++) {
//            array[i] = array [i] * 3;
//            System.out.println(array[i]);
//        }

//        int [][] array = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                System.out.printf("%d", array[i][j] );
//            }
//            System.out.println();
//        }

//        int [] array = new int [100];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = i ;
//        }
//        System.out.println(Arrays.toString(array));

        int [] mas = {10, 23, 12, 3, 12, 42, 13, 4, 8};
        int min = 0;
        int max = 0;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] > mas[max])
                max = i;
            if (mas[i] < mas[min])
                min= i;
        }
        System.out.println(min);
        System.out.println(max);

    }
}



