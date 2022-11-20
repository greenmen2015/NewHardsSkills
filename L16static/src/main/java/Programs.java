public class Programs {

    public static void main(String [] args){

        Person tom = new Person();
        Person bob = new Person();

        tom.displayId();
        bob.displayId();
        System.out.println(Person.counter);

        Person.counter = 9;

        Person sam = new Person();
        sam.displayId();

    }
}
