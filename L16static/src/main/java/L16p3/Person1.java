package L16p3;

public class Person1 {
    private int id;
    static int counter = 1;

    public Person1() {
        id = counter++;
    }

    public static void displayCounter(){
        System.out.printf("Counter: %d \n", counter);
    }

    public void displayId(){
        System.out.printf("Id: %d \n", id);
    }
}
