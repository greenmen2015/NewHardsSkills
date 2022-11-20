public class Exception1 {

    double divNumbers(int a, int b){
        double result = 0;

        try {
            result = a / b;
        }
        catch (ArithmeticException e){
            System.out.println("Div by zero " + e);
        }


        return result;
    }
}
