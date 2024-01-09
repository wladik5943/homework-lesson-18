import java.util.*;
import java.util.stream.Stream;

public class Task2 {
    public static List<String> task(){
        Map<Integer,String> map = Data2.getMap();
        Map<Integer,String> map1 = new HashMap<>();
        List<String> list = new ArrayList<>();
        LinkedList<Integer> list1 = Data2.getList();
        for (int i = 0; i < list1.size(); i++) {
            if(!map.containsKey(list1.get(i))) {
                list1.remove(i);
                i--;
            }
            else{
                map1.put(list1.get(i),map.get(list1.get(i)));
            }
        }

        for (int i = 0; i < list1.size(); i++) {
            if(map1.get(list1.get(i)).length() % 2 == 0){
                map1.remove(list1.get(i));
                list1.remove(i);
                i--;
            }
        }

        for (int i = 0; i < list1.size(); i++) {
            list.add(new StringBuilder(map1.get(list1.get(i))).reverse().toString());
        }

        return list;
    }

}
