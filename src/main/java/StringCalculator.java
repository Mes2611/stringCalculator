public class StringCalculator
{
    public int add(String numbers) {
        if(numbers.length() == 1) {
            return Integer.valueOf(numbers);
        }

        if(numbers.length() == 3) {
            return Integer.valueOf(numbers.split(",")[0]) + Integer.valueOf(numbers.split(",")[1]);
        }

        return 0;
    }
}
