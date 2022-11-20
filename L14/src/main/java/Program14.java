public class Program14 {
    public static void main(String []args){
    Person14 kate = new Person14("Kate");
        System.out.println(kate.getName());
        changeName(kate);
        System.out.println(kate.getName());


    }
    static void changePerson(Person14 p){
        p = new Person14("Alice");
        p.setName("Anna");
        System.out.println(p.getName());
    }

    static void changeName(Person14 p){
        p.setName("Alice");
    }
}
