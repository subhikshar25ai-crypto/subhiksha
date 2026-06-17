import java.util.HashSet;
import java.util.Set;

public class day11 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add("student 1");
        set.add("student 2");
        set.add("student 1");
        set.add("student 2");
        set.add("student 1");
        set.add("student 2");
        for (String s : set)
            System.out.println(s);
    }
}







