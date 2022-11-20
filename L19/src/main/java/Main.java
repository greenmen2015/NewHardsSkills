import java.io.*;

public class Main {


    public static void main(String[] args) {



        try {
            char[] symbols = {'h', 'e', 'l', 'l', 'o'};
            OutputStream output = new FileOutputStream("newFile.txt");
            for (int i = 0; i < symbols.length; i++) {
                output.write(symbols[i]);
            }
            output.close();

            InputStream input = new FileInputStream("newFile.txt");
            int size = input.available()

            for (int i = 0; i < size; i++) {
                System.out.println((char) input.read() + " ");
            }

            input.close();
        }catch (IOException e){
            System.out.println("Exception");
        }
    }
}
