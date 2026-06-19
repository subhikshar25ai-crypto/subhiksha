import java.util.HashMap;
import java.util.Map;

public class day11{
    public static void main(String[] args) {
        Map<String, Object> Person = new HashMap<>();
        Person.put("Ramesh",99);
        Person.put("dharani",90);
        Person.put("vasanth",88);
        Person.put("venkat",70);

        System.out.println(Person.get("Ramesh"));
        Person.entrySet().forEach(entry ->
            System.out.println(entry.getKey() + " : " + entry.getValue()));
        }
    }









