import java.util.HashMap;
import java.util.Map;

public class Question2 {
    public static void main(String[] args) {
        //We need to combine both maps and print one map ->
        Map<Integer, String> map = new HashMap<>();
        map.put(1,"ragu");
        map.put(2,"vijay");
        map.put(3,"raju");
        map.put(4, "rani");


        Map<Integer, String> map1 = new HashMap<>();
        map1.put(5,"ragu1");
        map1.put(6,"vijay");
        map1.put(7,"raju");
        map1.put(8, "rani1");

        //Map<Integer,String>resultMap = new HashMap<>();

//        map
//                .entrySet()
//                .stream()
//                .map(x->
//                        map1
//                                .entrySet()
//                                .stream()
//                                .map(y->Map.of(x.getKey(),x.getValue(),y.getKey(),y.getValue())))
//                .forEach(System.out::println);

       map.putAll(map1);
       
       map
               .forEach((key, value) -> System.out.println(key + "-" + value));

    }
}
