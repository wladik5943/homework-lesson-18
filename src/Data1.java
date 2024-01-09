import java.util.ArrayList;
import java.util.List;

public class Data1 {
    static List<Integer> list = new ArrayList<>();
    static {
        list.add(6);
        list.add(23);
        list.add(54);
        list.add(32);
        list.add(23);
        list.add(56);
        list.add(1);
        list.add(32);
        list.add(4);

    }

    public static List<Integer> getList() {
        return list;
    }
}
