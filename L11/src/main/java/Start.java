public class Start {
    public static void main (String [] args){
        Human kate = new Human("kate", 32, "City street", "12345678");
        kate.displayName();
        kate.displayAge();
        kate.displayPhone();

        System.out.println(kate.name);
        System.out.println(kate.address);
        System.out.println(kate.age);

}

}

