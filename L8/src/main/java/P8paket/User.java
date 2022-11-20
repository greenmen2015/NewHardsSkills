package P8paket;

public class User {
    void useCalculator(Calculator calculator){
        calculator.operations( '+', 2, 3 );
        calculator.operations( '-', 1, 3 );
        calculator.operations( '*', 5, 4 );
        calculator.operations( '/', 2, 3 );
    }
}
