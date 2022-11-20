import java.util.*;

public class Home {
    public static void main(String[] args) {
//        ArrayList<Integer> number = new ArrayList<>();
//        for (int i = 0; i <= 4; i++) {
//            double random = Math.random() * 100;
//            number.add((int) random);
//     }
//        System.out.println(number);



//                TreeSet<String> city = new TreeSet<String>();
//
//                city.add("Moskov");
//                city.add("Minsk");
//                city.add("Budapesht");
//                city.add("Vilnus");
//                city.add("Kiev");
//
//                System.out.println(city.first());
//
//                System.out.println(city.last());
//
//                SortedSet<String> set = city.subSet("Moskov", "Kiev");
//                System.out.println(set);
//
//                String greater = city.higher("Moskov");
//
//                String lower = city.lower("Moskov");
//
//                NavigableSet<String> navSet = city.descendingSet();
//
//                SortedSet<String> setLower= city.headSet("Moskov");
//
//                SortedSet<String> setGreater= city.tailSet("Moskov");
//
//                System.out.println(navSet);
//
//                System.out.println(setLower);
//
//                System.out.println(setGreater);

        HashSet<String> city = new HashSet<String>();

        // добавим в список ряд элементов
        city.add("Moskov");
        city.add("Minsk");
        city.add("Kiev");

        boolean isAdded = city.add("Moskov");
        System.out.println(isAdded);

        System.out.printf("Set contains %d elements \n", city.size());

        for(String state : city){

            System.out.println(city);
        }

        city.remove("Moskov");


        HashSet<Person> people = new HashSet<Person>();
        people.add(new Person("Mike"));
        people.add(new Person("Tom"));
        people.add(new Person("Nick"));
        for(Person p : people){

            System.out.println(p.getName());
        }

            }
        }


