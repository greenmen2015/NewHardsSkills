public class Segget {
    public static void main(String[] args) {
        Incapsul paradius = new Incapsul("kate", 23);
        System.out.println(paradius.getAge());
        paradius.setAge(33);
        System.out.println(paradius.getAge());
        paradius.setAge(1234);
        System.out.println(paradius.getAge());
    }
}
