import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class ArrLinList {


    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            list1.add(i);
        }
        System.out.println(list1);

        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(0,2);
        list.add(1,3);
        list.add(2,4);
        list.add(3,5);
        list.add(4,6);
        list.add(5,7);
        list.add(6,8);
list.remove(3);
        System.out.println(list);


        list.trimToSize();// урезает емкость нашего экземпляра до текущего размера списка

        for (Integer integer : list) {
            System.out.println("number " + integer );
        }

        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1,2,3,4,5));


        ArrayList<String> arrayList1 = new ArrayList<>(Arrays.asList("pasha", "Petia", "Gregoria"));
        System.out.println(arrayList1);


        ArrayList<String> mouth = new ArrayList<>();
        mouth.add("January");
        mouth.add("February");
        mouth.add("March");
        mouth.add("April");
        mouth.add("May");
        mouth.add("June");
        mouth.add("July");
        mouth.add("August");
        mouth.add("September");
        mouth.add("October");
        mouth.add("November");
        mouth.add("December");

        System.out.println(mouth.size());

        mouth.set(1, "December");
        System.out.println(mouth);

        mouth.remove(3);
        System.out.println(mouth);

        System.out.println(mouth.size());

        System.out.println(mouth.get(4));

        int b1 = mouth.indexOf("May");
        System.out.println(b1);

        boolean b2 = mouth.contains("Mar");
        System.out.println(b2);


        ////////////////////////////////////////////////////

        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            linkedList.add(i);
        }

        System.out.println(linkedList);
        System.out.println(linkedList.getFirst() + " " + linkedList.getLast());
        System.out.println(linkedList.removeFirst() + " " +linkedList.removeLast());
        System.out.println(linkedList);

        String mitsu = "OutLander";
        String mazda = "Mazda 6";
        String honda = "Honda 10";
        String toyta = "Highlander";

        LinkedList<String> cars = new LinkedList<>();
        cars.add(mitsu);
        cars.add(mazda);
        cars.addFirst(honda);
        cars.addLast(toyta);
        System.out.println(cars);




    }
}
