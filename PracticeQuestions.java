import java.util.List;
import java.util.stream.Collectors;

public class PracticeQuestions {
    public static void main(String[] args) {
//        Take the above arrayList and find the dublicate count print like below:
//        ragu-2, vijay-1, Naresh-1, Abi-1

//        list<String>  li = new ArrayList<>();
//li.add("ragu");
//li.add("ragu");
//li.add("vijay");
//li.add("Naresh");
//li.add("Abi");
        List<String>l1 = List.of("ragu","ragu","vijay","Naresh","Abi");

        l1
                .stream()
                .collect(Collectors.groupingBy(String::valueOf, Collectors.counting()))
                .forEach((key, value) -> System.out.println(key + "-" + value));
    }
}
