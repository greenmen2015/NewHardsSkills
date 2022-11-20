package H16;

public class Math1 {
    private int id;
    static int counter = 1;


    Math1(){
     id = counter++;
    }




    public void displayId(){
        System.out.printf("Id: %d \n", id);
    }
}
