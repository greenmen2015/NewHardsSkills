public class PersonEvening extends Person{
    public PersonEvening(int age, String name) {
        super(age, name);
    }

    @Override
    public void goToStreet() {
        System.out.println(toString() + "I walk in the evenings");
    }
}
