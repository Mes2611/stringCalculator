import org.junit.Assert;
import org.junit.Test;

public class StringCalculatorTest
{
    private StringCalculator stringCalculator = new StringCalculator();

    @Test
    public void shouldReturn0ForNumbersIsEmpty()
    {
        Assert.assertEquals(stringCalculator.add(""), 0);
    }

    @Test
    public void shouldReturn1ForNumbersIs1()
    {
        Assert.assertEquals(stringCalculator.add("1"), 1);
    }

    @Test
    public void shouldReturn3ForNumbersIs1And2()
    {
        Assert.assertEquals(stringCalculator.add("1,2"), 3);
    }

    @Test
    public void shouldReturn26ForUnknowNumbers()
    {
        Assert.assertEquals(stringCalculator.add("1,2,3,10,10"), 26);
    }

    @Test
    public void shouldReturn6ForTwoDelimeter()
    {
        Assert.assertEquals(stringCalculator.add("1\n2,3"), 6);
    }

    @Test
    public void shouldReturn3ForAnyDelimeter()
    {
        Assert.assertEquals(stringCalculator.add("//;\n1;2"), 3);
    }

    @Test
    public void shouldReturn6ForAnyDelimeter()
    {
        Assert.assertEquals(stringCalculator.add("//&\n1&2&3"), 6);
    }
}
