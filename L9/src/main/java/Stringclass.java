public class Stringclass {
    public static void main (String [] args){
     //   String text1 = new String("qwerty");
        String text = "qwerty";
        System.out.println(text);

        String s = "Hello";
        String s1 ="World";
        System.out.println(s + s1); //контекенация строк ! string не изменяемая переменная

        String str = "Hello World";
        System.out.println(str.length());

        String str1 = new String(new char[]{'H', 'e', 'l', 'l', 'o'});
        char [] hellomas = str1.toCharArray();
        System.out.println(hellomas);

        String s2 = "";
        if (s2.isEmpty());
        System.out.println("String_is_empty");

        System.out.println(String.valueOf(65));



    }
}
