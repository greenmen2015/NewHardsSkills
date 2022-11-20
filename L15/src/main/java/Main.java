public class Main {
    public static void main(String[] args) {

        Person person = new Person(25, "Lesha");
        person.goToStreet();


        Person person1 = new PersonAfternoon(50, "Valera");
        person1.goToStreet();

        Person person2 = new PersonEvening(34, "Vasia");
        person2.goToStreet();

        Person [] mas = {person1, person2, person};
        for (Person object : mas){
            object.goToStreet();
        }
    }
}
