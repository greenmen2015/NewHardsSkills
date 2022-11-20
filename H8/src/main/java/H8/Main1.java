package H8;

public class Main1 {
    public static void main(String [] args){
        int a = 54;
        int b = 53;
        System.out.println(a + b);

        sum(54, 4);
        System.out.println(sum1(12,14));

        System.out.println(sum1(4,sub(2, 3)));

        double c = sum1(2 , 3);
        System.out.println(c);

        double c1 = sub(2 , 3);
        System.out.println(c1);

    }
    public static void sum(double a, double b) {
        System.out.println(a + b);
    }
    public static double sum1(double a1, double b2) {
        return a1 + b2;
    }
    public static double sub(double a2, double b3){
        return  a2 - b3;
    }

}
