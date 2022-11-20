public class H9 {
    public static void main (String [] args){
        String s = "null";
        if (s == null)
        System.out.println("String is null");

        String s1 = "";
        if (s1 == null || s1.length()== 0)
        System.out.println("String in empty");

        String a = "Hello";
        String b = "Bart";
        String d = " baka hey ";
        String f = "hey";
        String g = " ";
        System.out.println(f.concat(g + b));

        System.out.println(f.charAt(2));

        System.out.println(f.compareTo(b));

        System.out.println(f.compareTo(d));

        System.out.println(f.equals(b));

        System.out.println(f.equals(d));

        System.out.println(f.indexOf(65)); // по юникоду

        System.out.println(d.trim());// удаляет пробелы в начал и конце

        System.out.println(String.valueOf(65)); // преобразует объект в строковый вид
        String str1 = String.valueOf(65);
        System.out.println(str1);

        String str2 = String.join(" ", a + b );
        System.out.println(str2);

        String str = "hello world";
        String replstr1 = str.replace("hello", "bye");
        String replstr2 = str.replace("h", "de");
        System.out.println(replstr1);
        System.out.println(replstr2);



        String c = a + " " + b;
        System.out.println(c);
    }
}
