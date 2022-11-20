public class  Client13 extends Person13 {
    private String bank;

    public Client13(String name, String company) {
        super(name);
        this.bank = company;
    }
    public void display(){
        System.out.printf("Client Name: %s \t Bank: %s \n", super.getName(), bank);
    }
}
