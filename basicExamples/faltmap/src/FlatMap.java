import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {
    public static void main(String[] args) {
        List<List<String>> list = Arrays.asList(
                Arrays.asList("A", "B"),
                Arrays.asList("C")
        );
        System.out.println("List of lists " + list);

        List<String> list2 = list.stream().flatMap(Collection::stream).collect(Collectors.toList());

        System.out.println("The new List " + list2);
    }
}
