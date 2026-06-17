import java.util.LinkedList;

public class day10{

    static void process(LinkedList<String> list) {
        System.out.println("Removed : " + list.removeFirst());
    }

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();
        list.add("101 - Arun - 85");
        list.add("102 - Bala - 78");
        list.add("103 - Charan - 90");
        list.add("104 - Deepak - 88");
        list.add("105 - Eshan - 75");

        System.out.println("Student List:");
        System.out.println(list);


        list.add("106 - Farhan - 92");
        System.out.println("\nAfter Adding:");
        System.out.println(list);


        process(list);

        System.out.println("\nAfter Removing:");
        System.out.println(list);


        list.set(2, "104 - Dinesh - 95");

        System.out.println("\nAfter Updating:");
        System.out.println(list);
    }
}