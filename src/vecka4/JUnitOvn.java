package vecka4;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class JUnitOvn {
    @Test
    public void TestJUnit (){
        String str = "Hello JUnit";

        assertEquals(10,str.length());
    }

}
