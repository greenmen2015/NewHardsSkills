package InterrFace;

public class Bea implements Fly {

    int age;

    public Bea(int age){
        this.age = age;
    }

    @Override
    public void fly() {
        System.out.println(toString());

    }

    @Override
    public String toString() {
        return "Я пчелка и мне" + age + " лет";
    }
}
