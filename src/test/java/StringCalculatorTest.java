import org.junit.Assert;
import org.junit.Test;

public class StringCalculatorTest
{
    private StringCalculator stringCalculator = new StringCalculator();

    @Test
    public void shouldReturn0ForNumbersIsEmpty() {
        Assert.assertEquals(stringCalculator.add(""), 0);
    }

    @Test
    public void shouldReturn1ForNumbersIs1() {
        Assert.assertEquals(stringCalculator.add("1"), 1);
    }

    @Test
    public void shouldReturn3ForNumbersIs1And2() {
        Assert.assertEquals(stringCalculator.add("1,2"), 3);
    }

    @Test
    public void shouldReturn26ForUnknowNumbers() {
        Assert.assertEquals(stringCalculator.add("1,2,3,10,10"), 26);
    }
}
