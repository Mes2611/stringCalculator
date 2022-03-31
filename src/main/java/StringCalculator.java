import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;


public class StringCalculator
{
    public int add(String numbers) {
        ArrayList<String> list = new ArrayList<>();
        if(!numbers.isEmpty()) {
           list.addAll(Arrays.stream(numbers.split(",")).collect(Collectors.toList()));
        return list.stream().mapToInt(Integer::parseInt).sum();
       }
        return 0;
    }
}
