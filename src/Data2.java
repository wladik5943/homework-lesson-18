import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Data2 {

    static Map<Integer,String> map = new HashMap<>();
    static {
        map.put(3,"vlad");
        map.put(2,"andrey");
        map.put(6,"daniil");
        map.put(7,"kirill");
        map.put(12,"aleksei");
        map.put(13,"ilya");
        map.put(8,"ashot");
    }

    static LinkedList<Integer> list = new LinkedList<>();

    public static LinkedList<Integer> getList() {
        return list;
    }

    static {
        list.add(1);
        list.add(2);
        list.add(5);
        list.add(8);
        list.add(9);
        list.add(13);
    }
    public static Map<Integer, String> getMap() {
        return map;
    }
}
