import java.io.*;

public class Run {

    public static void main(String[] args) throws IOException {

//        FileOutputStream fileOutputStream = new FileOutputStream("1.txt");
//        String txt = "Our company is New HardSkills ";
//        byte[] bytes = txt.getBytes();
//        fileOutputStream.write(bytes);// строка записывается в файл
//        fileOutputStream.close();
//
//        // cчитываем строку нижнее подчеркивание
//
//        FileInputStream inputStream = new FileInputStream("1.txt");
//        StringBuilder stringBuilder = new StringBuilder();
//        int i;
//
//        while ((i = inputStream.read()) != -1){
//            char ch = (char)i;
//            if (ch ==  ' '){
//                ch = '_';
//            }
//            stringBuilder.append(ch);
//        }
//        inputStream.close();
//        System.out.println(stringBuilder);



        //создаем на диске

        Writer writer =  new FileWriter("D//1.txt", false);
        String text = "me company is New HardSkills";
        writer.write(text);//строка записывается в файл
        writer.append("\n");
        writer.write("Hello");//строка записывается в файл
        writer.flush();//записывает и освобождает память
        writer.close();


        //считываем

        FileReader reader = new FileReader("D://1.txt");
        StringBuilder builder = new StringBuilder();
        int i;
        while ((i = reader.read()) != -1){
            builder.append((char) i);
        }
        System.out.println(builder.toString());
        reader.close();

//создание
        File initDirect = new File(("D://1"));
        boolean created = initDirect.mkdir();
        if (created){
            System.out.println("Папка создана");
        }

//переименование
        File newDirect = new File("D://2");
        initDirect.renameTo(newDirect);//переименование

//удаление

        boolean deleted = newDirect.delete();
        if (deleted){
            System.out.println("Папка удалена");
        }

//
    }
}
