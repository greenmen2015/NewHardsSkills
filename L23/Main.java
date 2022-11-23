import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

//        Operation sum = ((x, y) -> x + y);
//        Operation sub = ((x, y) -> x - y);
//        Operation mul = ((x, y) -> x * y);
//        Operation div = ((x, y) -> x / y);
//
//        System.out.println(sum.calculate(5,4));
//        System.out.println(sub.calculate(5,4));
//        System.out.println(mul.calculate(5,4));
//        System.out.println(div.calculate(5,4));
//
//
//        TaskOperation taskOperation = () -> 9 / 3;
//        System.out.println(taskOperation.divoperation());
//
//
//        Oper oper = (((x, y) -> System.out.println(x + y)));
//        oper.printToConsole(5,3);

//        int [] numbers = {10, 4 , 7, 31, 6, 45, 13, 74, 25};
////        int counter = 0;
////        for (int number : numbers) {
////            if (number > 10)
////                counter++;
////        }
////        System.out.println(counter);
//
//        Arrays.stream(numbers).filter(x -> x > 10)
//                .forEach(System.out::println);

//        ArrayList<String> list = new ArrayList<>();
//        list.add("Hello");
//        list.add("World");
//        list.add("Map");
//        list.add("Java");
//        list.stream().filter(str -> str.length() > 4).forEach(System.out::println);
//
//        Stream<String> words = Arrays.stream(new String[]{
//                "Hello", "World", "Map", "Java"
//        });
//        words.forEach(System.out::println);
//
//        Stream<String> names = Stream.of("Vasya Petya");
//        names.filter(str -> str.length() == 5).forEach(System.out::println);


        Stream<ProffessionStream> proffessionStreamStream =
                Stream.of(new ProffessionStream("Java", 5000),
                        new ProffessionStream("Python", 2500));
        proffessionStreamStream.filter(prof -> prof.getSalary() > 4000)
                .forEach(s -> System.out.println(s.getName() + " " + s .getSalary() ));


    }
}
