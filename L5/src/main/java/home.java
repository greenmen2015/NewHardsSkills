public class home {
    public static void main (String [] args){
        for (int i = 1; i <= 100; i++){
            if (i % 2 == 1 )
                System.out.println(i);
        }

        for (int i = 100; i >= 1 ; i--) {
            if (i % 2 == 1)
                System.out.println(i);
        }
        for (int i = 20; i <= 40 ; i++) {
            System.out.println(i);
        }

        for (int i = 50; i <= 80 ; i++) {
            System.out.println(i);
        }

        for (int i = 1; i <= 10 ; i++) {
            for (int b = 1; b <=10; b ++){
            System.out.println(i + "*" + b + "=" + i * b );
            }
        }

        for (int i = 1; i <= 1024 ; i = i * 2) {
            if (i == 1)
            continue;
            System.out.println(i);
        }

        for (int i = 0; i <= 273 ; i = i + 7 ) {
            if (i == 0)
                continue;
            System.out.println(i);
        }

        for (int i = 0; i <= 100 ; i++  ) {
            if (i % 7 == 0);
            System.out.println(i);
        }

        for (int i = 1; i <= 3 ; i++) {
            for (int j = 1; j <= 5 ; j++) {
                System.out.print( "*" + " " + "\t");
            }
            System.out.println();
        }

        for (int i = 1; i <= 5 ; i++) {
            for (int j = 1; j <= 8 ; j++) {
                System.out.print( "star" + " " + "\t");
            }
            System.out.println();
        }


    }
}
