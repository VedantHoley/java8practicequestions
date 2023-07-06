import java.util.List;
import java.util.stream.Collectors;

public class Question1 {
    public static void main(String[] args) {
        // print the count of each element in the list

        List<String>l1 = List.of("ragu","ragu","vikas","naresh","vikas");

        //output should be -> ragu->2, vikas->2 , naresh->1

        l1
                .stream()
                .collect(Collectors.groupingBy(String::valueOf, Collectors.counting()))
                .forEach((key, value) -> System.out.println(key + "->" + value));
    }
}
