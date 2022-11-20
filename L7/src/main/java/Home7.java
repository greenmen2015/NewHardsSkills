import java.util.Arrays;

public class Home7 {
    public static void main (String [] args){

        int [] mas =  new int[]{1, 2, 4, 3, 5, 6, 8, 15, 16, 9, 10, 42, 45, 13, 14, 22, 32, 54, 27, 21 };
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] % 2 == 0)
            {
            System.out.println(mas[i]);
            }
        }

        int [] mas1 =  new int[]{1, 2, 4, 3, 5, 6, 8, 15, 16, 9, 10, 42, 45, 13, 14, 22, 32, 54, 27, 21 };;
        for (int i = 0; i < mas1.length; i++) {
            if (mas1[i] % 2 == 1) {
                System.out.println(mas1[i]);
            }
        }

        int [] mas2 =  new int[]{1, 2, 4, 3, 5, 6, 8, 15, 16, 9, 10, 42, 45, 13, 14, 22, 32, 54, 27, 21 };;
        for (int i = 0; i < mas1.length; i++) {
            if (mas2[i] % 2 == 1)
            mas2[i] = 0;
        }
        System.out.println(Arrays.toString(mas2));

        int [] ga = {18, 23, 57, 23, 17, 46, 176, 2, 8};
        int min = 0;
        int max = 0;
        for (int i = 0; i < ga.length; i++) {
            if (ga[i] > ga[max])
                max = i;
            if (ga[i] < ga[min])
                min= i;
        }
        System.out.println(min);
        System.out.println(max);


        int [] array = new int [41];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 2 ;

        }
        System.out.println(Arrays.toString(array));




    }
}
