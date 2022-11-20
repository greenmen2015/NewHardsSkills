public class Incapsul {
    private String name;
    protected int age = 1;

    public Incapsul(String name, int age){
    setName(name);
    setAge(age);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if(age > 0 && age < 110)
        this.age = age;
    }
}
