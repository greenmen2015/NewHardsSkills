import java.util.ArrayList;
import java.util.stream.Stream;

public class Home {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        list.add("Map");
        list.add("Java");
        list.add("Python");
        list.stream().filter(str -> str.length() > 5).forEach(System.out::println);


        Stream<ProffessionStream> proffessionStreamStream =
                Stream.of(new ProffessionStream("Java", 5000),
                        new ProffessionStream("Python", 2500),
                        new ProffessionStream("Ruby", 3000));
//        proffessionStreamStream.map(s ->  s.getName()).forEach(s -> System.out.println(s));
        proffessionStreamStream.
                flatMap(s->Stream.of(
                        String.format("название должности: %s  зп названная кандидатом: %d", s.getName(), s.getSalary()),
                        String.format("название должности: %s  зп названная HR: %d", s.getName(), s.getSalary() - (int)(s.getSalary()*0.2))
                ))
                .forEach(s->System.out.println(s));


    }
}
