public class Practic6
/*
while(булевское выражение){
операторы
}
 */
{
    public static void main (String [] args){

       // int i = 0;
       // while (i <= 100){
       //     System.out.println(i + " ");
        //    i++;
      //  }

       // do {
       //     System.out.println(i);
       //     i++;
       // }while (i < 15);

        //int i1 = 100;
        // while (i1 >= 1){
        //    System.out.print(i1 + " ");
       //     i1--;
       // }

    //    int i = 1;
   //     while (i <= 100){
  //          if (i % 2 == 1){
 //               System.out.println(i + " ");
 //           }
//            i++;
//        }
  //  int i = 547;
 //   int num = 0;
 //   while (i > 0){
 //       num = i % 10;
 //       System.out.print(num);
//        i = i / 10;
 //   }

        int number = 54634;
        int min = 9;
        int max = 0;
        while (number > 0){
            if (min > number % 10){
                min = number % 10;
            }
            if (max < number % 10){
                max = number % 10;
            }
            number = number / 10;
        }
        System.out.println(min + " " + max);

    }
}
