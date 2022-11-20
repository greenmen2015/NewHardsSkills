public class Person {
    private String name;
    private int age;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void goToStreet(){
        System.out.println(toString() + "i walk in the morning");
    }

    @Override
    public String toString() {
        return " I'm " + name + " me " + age + " age ";
    }


}
