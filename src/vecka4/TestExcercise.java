package vecka4;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;
public class TestExcercise {
    @Test
    public void firstTestCase()
    {
        String text = "some text";
        int actual = text.length();
        int expected = 8;
        assertEquals(expected, actual);
    }
}
