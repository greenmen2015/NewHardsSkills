public class Employer13 extends Person13{
    String company;
    private String bank;
    public Employer13(String name, String company) {
        super (name);
        this.company = company;
    }
    public  void work(){
        System.out.printf("%s works in %s \n", getName(), company);
    }


    public void display() {
        System.out.printf("Employer13 Name: %s \t Bank: %s \n", super.getName(), bank);
    }

}
