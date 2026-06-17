import java.util.HashMap;
import java.util.Map;

public class day11{
    public static void main(String[] args) {
        Map<String, Object> Students = new HashMap<>();
        Students.put("Ramesh",99);
        Students.put("dharani",90);
        Students.put("vasanth",88);
        Students.put("venkat",70);

        System.out.println(Students.get("Ramesh"));
        Students.entrySet().forEach(entry ->
            System.out.println(entry.getKey() + " : " + entry.getValue()));
        }
    }









