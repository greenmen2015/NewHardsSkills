/*
try{}
catch{}
finally{}
 */

public class Main {

    public static void main(String[] args) {
        double result = 0;
//        Exception0 exception0 = new Exception0();
//        result = exception0.divNumbers(5,0);
//        System.out.println("result = " + result);
//
//
//        Exception1 exception01 = new Exception1();
//        result = exception01.divNumbers(6,0);
//        System.out.println("result = " + result);
//
//
//        Exception2 exception2 = new Exception2();
//        result = exception2.divNumbers(7,0);
//        System.out.println("result = " + result);


        double[] a = {1.3, 1.4, 1.5, 5.6};
        double[] b = {1.0, 0.0, 2.0};
        double[] c;

        DivisionArrays divisionArrays = new DivisionArrays(4, a, 3, b);
        c = divisionArrays.division();

        for (int i = 0; i < c.length; i++) {
            System.out.println("a --> " + i + " = " + c[i]);
            
        }
    }
}
