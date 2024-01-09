import java.util.List;
import java.util.stream.Stream;

public class Task1 {
    public static void task(){
        Stream<Integer> stream = Data1.getList().stream();
        List<Integer> list;
        list = stream
                .distinct()
                .filter(x -> x % 2 == 0)
                .toList();

        System.out.println(list);

        int sum = 0;
        for(int temp: list){
            sum += temp;
        }
        System.out.println(sum);
        System.out.println("<<<<<<");


    }


}
