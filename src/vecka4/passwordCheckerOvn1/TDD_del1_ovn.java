package vecka4.passwordCheckerOvn1;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class TDD_del1_ovn {
@Test
    public void losenOrdChecker()
    {
        //Arrange
        String str = "password8@";
        //Act
        PassWordChecker_ovn checker = new PassWordChecker_ovn();
        boolean passWordOK = checker.checkPsw(str);
        boolean actual = passWordOK;
        boolean expected = true;
        //Assert
        assertEquals(expected,actual);
    }
}