public class Employer12 extends Person12 {
String company;
    public Employer12(String name, String company) {
        super (name);
        this.company = company;
    }
    public  void work(){
        System.out.printf("%s works in %s \n", getName(), company);
    }

    @Override
    public void display() {
        //super.display();
        System.out.printf("Name: %s \n", getName() );
        System.out.printf("Works: %s \n", company );
    }
}
