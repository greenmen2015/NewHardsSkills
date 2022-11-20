public class Practic {
 public static void main(String [] args){
     int a = 5;
     int b = 7;
     int result = a + b;
     System.out.println( result ); // Можно System.out.println(a+b)

     int c = 9 + a;
     System.out.println(c);

     int a1 = 8;
     int b1 = 5;
     int c1 = b1 - a1;
     System.out.println(c1);

     int d1 = 7 - b1;
     System.out.println(d1);

     int a2 = 55;
     int b2 = 5;
     int c2 = a2 * b2;
     System.out.println(c2);

     double a3 = 19;
     int b3 = 6;
     double c3 = a3 / b3;
     System.out.println(c3);

     int a4 = 11;
     int b4 = 3;
     int c4 = a4 % b4;
     System.out.println(c4);

// постфиксный инкремент
     int i7 = 7;
     //i7++;
     int j1 = i7++;
     System.out.println(j1);

     int  x12 = j1 + i7;
     System.out.println(x12);

//префиксный инкремент
     int i = 7;
     int j = ++i;
     System.out.println(j);

//постфиксный декремент
     int k1 = 5;
     int m1 = k1--;
     System.out.println(m1);

//префиксный декремент
     int k = 5;
     int m = --k;
     System.out.println(m);

//приоритет
     /*
     1. ++ --
     2. * / %
     3. + -
      */
     int result1 = (b + c) * 4 * ++b1;
     System.out.println(result1);

     int a6 = 5;
     int b6 = 7;
     boolean c6 = a6 == b6;
     System.out.println(c6);
     System.out.println(a6 + " != " + b6);

     int a7 = 5;
     int b7 = 7;
     boolean c7 = a7 != b7;
     boolean d7 = a7 != 5;
     System.out.println(c7);
     System.out.println(d7);

     int a8 = 8;
     int b8 = 7;
     boolean c8 = a8 < b8;
     System.out.println(c8);

   int a9 = 8;
   int b9 = 7;
   boolean c9 = a9 > b9;
     System.out.println(c9);

   boolean a10 = 8 >= 8;
   boolean a11 = 8 >=7;
   boolean a12 = 8 >= 12;
     System.out.println(a10);
     System.out.println(a11);
     System.out.println(a12);

     boolean a13 = 8 <= 8;
     boolean a14 = 8 <=7;
     boolean a15 = 8 <= 12;
     System.out.println(a13);
     System.out.println(a14);
     System.out.println(a15);

     boolean value = (3 > 5) || (3 < 5);
     System.out.println(value);

     boolean value1 = (3 > 5) || (3 < 5);
     System.out.println(value1);

     boolean value2 = (3 < 5) && (3 < 2);
     System.out.println(value2);

     /* || или
     true || true = true
     true || false = true
     false || true = true
     false || false = false
      */
     /* && и
     true && true = true
     true && false = false
     false && true = false
     false && false = false
     /*
      true ^ true = false
      true ^ false = true
      false ^ true = true
      false ^ false = false

      */

     /* приоритет операция
     1. !
     2. &&
     3.|| 
      */
 }

 }
