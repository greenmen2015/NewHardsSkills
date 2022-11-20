import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMaping {
    public static void main(String[] args) {

        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "January");
        hashMap.put(2, "February");
        hashMap.put(3, "March");
        hashMap.put(4, "April");
        hashMap.put(5, "May");
        hashMap.put(6, "June");
        hashMap.put(7, "July");
        hashMap.put(8, "August");
        hashMap.put(9, "September");
        hashMap.put(10, "October");
        hashMap.put(11, "November");
        hashMap.put(12, "December");
        hashMap.put(2, "December");
        System.out.println(hashMap);

        String value = hashMap.get(5);
        System.out.println(value);


        Set<Integer> keys = hashMap.keySet();
        System.out.println(keys);

        ArrayList<String> list = new ArrayList<>(hashMap.values());
        System.out.println(list);

        if (!hashMap.isEmpty()){
            System.out.println(hashMap);
        }

        for (Map.Entry<Integer, String>  value1 : hashMap.entrySet()){
            System.out.println(value1);
        }

        Map<Integer, String> hasMapa2 = new HashMap<>();
        hasMapa2.put(5, "311");
        hasMapa2.put(6, "211");
        hasMapa2.put(7, "111");

        hashMap.putAll(hasMapa2);
        System.out.println(hasMapa2);


//        Map<Integer, Person> people = HashMap<>();
//        people.put(1, new Person("Petya"));
//        people.put(123, new Person("Danila"));
//        people.put(1234, new Person("Masha"));
//
//        for (Map.Entry<Integer, Person> person : people.entrySet());
//        System.out.println(person.getKey + "==>");
//        System.out.println(person.getValue());


    }
}
