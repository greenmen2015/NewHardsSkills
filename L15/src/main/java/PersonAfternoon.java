public class PersonAfternoon extends Person{
    public PersonAfternoon(int age, String name) {
        super(age, name);
    }

    @Override
    public void goToStreet() {
        System.out.println(toString() + "I take a walk after lunch");
    }
}
