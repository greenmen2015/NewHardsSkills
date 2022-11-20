package P8paket;
// модификаторы доступа , тип возвращаемого значения , имя метода
/* public(модификатор доступа) static (модификатор доступа) void(тип возвращаемого значения)
 main(имя метода)((String []args) (параметры метода)
 */

public class Calculator {


    public double sum(double a, double b) {
        return a + b;
    }

    public double sub(double a, double b) {
        return a - b;
    }

    public double mul(double a, double b) {
        return a * b;
    }

    public double div(double a, double b) {
        return a / b;
    }

    void operations(int result, double x, double y) {
        switch (result) {
            case '+':
                System.out.println(sum(x, y));
                break;
            case '-':
                System.out.println(sub(x, y));
                break;
            case '*':
                System.out.println(mul(x, y));
                break;
            case '/':
                System.out.println(div(x, y));
                break;
        }
    }
}




