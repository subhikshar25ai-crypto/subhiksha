import java.util.LinkedList;

public class day10 {
    static void main() {
        LinkedList<String> list = new LinkedList<String>();
        list.add("bhavyaa");
        list.add("thanyaa");
        list.add("subhii");
        list.add("divii");
        list.add("dharanii");
        while(!list.isEmpty()) {
            process(list);
        }
    }
    static void process(LinkedList<String> list){
        String removed=list.removeFirst();
        System.out.println("Removed:"+removed);
    }
}