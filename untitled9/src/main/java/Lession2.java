/*многострочный комментарий так пишется*/
// однострочный комментарий  так пишется
/*переменные
 2целочисленые
 1числа с плав. точкой(дробные)
 3символьные значения
 4логическое значение
 */
public class Lession2{
public static final double Pi=3.14;
    public static void main(String[] args) {
           //целочисленные
        byte b=127;
        System.out.println(b);  //-128 до 127
        b =-128 ;
        System.out.println(b);  // в этой строке b = равно 12
        final short s=4; //-32000 до 32000 слово finаl фиксирует
        short s=15;
        int i=5;     //-2млрд до 2млрд
        long l=6L;
        //числа с плавающей точкой дробные
        double PI=3.14213;
        System.out.println(PI);
        float f=3.14F;
        // символьные значения
         char c = 1;
         // логические
        boolean boot = true;
        boolean boot1 = false;
    }
}
