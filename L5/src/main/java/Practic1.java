public class Practic1 {
    /*
        for(объявления переменой; условия сравнения; изменения переменной){
       // действия
        }
         */
    public static void main (String [] args){
        /*
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
        System.out.println("5");
        System.out.println("6");
        System.out.println("7");
      */

        for (int i = 1; i <= 7; i++){
            System.out.println(i);
        }

        for (int i1 = 1; i1 <= 100; i1++){
            System.out.println(i1);
        }

        for (int i2 = 50; i2 <= 100; i2++){
            System.out.println(i2);
        }

        for (int i3 = 100; i3 >= 1; i3--){
            System.out.println(i3);
        }

        for (int i4 = 1; i4 <= 100; i4++){
            if (i4 % 2 == 0)
            System.out.println(i4);
            else {
                System.out.println("ne4et");
            }
        }
        // 10 20 30 40 50
        for (int i5 = 0; i5 <=100 ; i5 = i5 + 10) {
            System.out.println(i5);
        }

        for (int i6 = 1; i6 <= 10 ; i6++) {
            System.out.println(i6 + "*" + 3 + "=" + i6 *3 );
        }

        for (int i7 = 1; i7 <= 10 ; i7++) {
            for (int i8 = 1; i8 <= 10 ; i8++) {
                System.out.print(i7 * i8 + " " + "\t");
            }
            System.out.println();
        }

        for (int i = 1; i < 10 ; i++) {
            if (i == 7)
                break;
            System.out.println(i);
        }

        for (int i = 0; i < 10 ; i++) {
            if (i == 7)
                continue;
            System.out.println(i);

        }


    }
}
