public class Lessoin {
    public static void main(String[] args) {
        /*
        if(если) () {
        sout
        }
        else(иначе) {
        }
         */
        if (5 > 7) {
            System.out.println("true");
        } else {
            System.out.println(false);

        }

        int i = 9;
        int k = 7;
        if (i < k) {
            System.out.println("i больше  k");
        } else {
            System.out.println("9 (не) меньше 7");
        }

        int a = 4;
        int b = 5;
        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a == b");
        }

        int number1 = 5;
        int number2 = 5;
        if (number1 > number2) {
            System.out.println("number1 > number2");
        } else if (number1 < number2) {
            System.out.println("number1 < number2");
        } else {
            System.out.println("number1 == number2");
        }

        int num1 = 9;
        int num2 = 7;
        if (num1 > num2 && num1 > 5) {
            System.out.println("true");
        }

        int i1 = 9;
        int i2 = 7;
        if (i1 > i2 || i1 > 3) {
            System.out.println("true");
        }

        int i3 = 9;
        int i4 = 7;
        if (i3 < i4 || i3 > 10) {
            System.out.println("true");
        } else {
            System.out.println(false);
        }

        int dayofTheweek = 5;
        if (dayofTheweek == 1) {
            System.out.println("monday");
        } else if (dayofTheweek == 2) {
            System.out.println("Tuesday");
        } else if (dayofTheweek == 3) {
            System.out.println("Wednesday");
        } else if (dayofTheweek == 4) {
            System.out.println("Thursday");
        } else if (dayofTheweek == 5) {
            System.out.println("Friday");
        } else if (dayofTheweek == 6) {
            System.out.println("Saturday");
        } else if (dayofTheweek == 7) {
            System.out.println("Sunday");
        } else {
            System.out.println("такого дня не существует");


        /*
        switch(выражение){
        case значение 1:
        оператор 1;
        break;
        case значеник 2:
        оператор 2;
        break;
        }
         */



        }
        //тернарные операция
        //1 опероид - условие ? 2 операнд : 3 операнд

        int a4 = 5;
        int b4 = 3;
        int c = a4 > b4 ? 20 : 30 ;
        System.out.println(c);

        int x1 = 9;
        int f1 = 8;
        int c1 = 7;

        if (x1 > f1 && x1 >c1){
            System.out.println("x1 = max");
        }else if (x1 > f1 && x1 < c1) {
            System.out.println("c1 - max");
        }else if (x1 < f1 && f1 > c1 ){
            System.out.println("f1 - max");
        }else if  (x1 < f1 && f1 < c1) {
            System.out.println("c1 - max");
        }


    }
}