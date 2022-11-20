public class Human {
    /*
    public
    private
    protected
    default
     */
    String name;
    protected int age;
    public String address;
    private String phone;

    public Human(String name, int age, String address, String phone) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.phone = phone;
    }

    public void displayName() {
        System.out.printf("Name: %s \n", name);
    }

     void displayAge() {
        System.out.printf("Age: %s \n", age);
    }

    private void displayAddress() {
        System.out.printf("Address: %s \n", address);
    }

    protected void displayPhone() {
        System.out.printf("Phone: %s \n", phone);
    }
}