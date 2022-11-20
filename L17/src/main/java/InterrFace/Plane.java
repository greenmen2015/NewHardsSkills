package InterrFace;

public class Plane implements Fly, Go {

    String name;
    int age;

    int vpp;

    public Plane(String name, int age ,int vpp){
        this.name = name;
        this.age = age;
        this.vpp = vpp;
    }

    @Override
    public void fly() {
        System.out.println(toString());
    }

    @Override
    public void go() {
        System.out.println(toString());
    }



    @Override
    public String toString() {
        return "Я " +  name + " мне " + age + " лет " + ", " + " мне нужно расстояние " + vpp + "м " + " для взлета";

    }
}
