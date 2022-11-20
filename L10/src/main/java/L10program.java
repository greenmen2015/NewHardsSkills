public class L10program {
    public static void main (String [] args){
        L10 tom = new L10("Tom");
        tom.displayInfo();

        L10 bob = new L10();
        bob.displayInfo();

        L10 sam = new L10("Sam", 25);
        sam.displayInfo();

        tom.name = "Tom";
        tom.age = 34;
        tom.displayInfo();

    }
}
