import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;


public class StringCalculator
{
    public int add(String numbers) {
        String defaultDelimeter = ",";
        String newNumbers = "";
        if(numbers.startsWith("//")) {
            // récupération du delimiteur par défaut
            defaultDelimeter = numbers.substring(2, numbers.indexOf("\n"));
            newNumbers = numbers.substring(numbers.indexOf("\n") + 1, numbers.length());
        }else {
            newNumbers = numbers;
        }
        String delimeter = defaultDelimeter + "|\n";
        ArrayList<String> listNumbers = new ArrayList<>();

        if(!newNumbers.isEmpty()) {
           listNumbers.addAll(Arrays.stream(newNumbers.split(delimeter)).collect(Collectors.toList()));
        return listNumbers.stream().mapToInt(Integer::parseInt).sum();
       }
        return 0;
    }
}
