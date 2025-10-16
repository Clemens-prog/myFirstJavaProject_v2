package vecka4.PasswordChecker;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;
public class PasswordProg {
    @Test
    public void passwordChecker()
    {
        PasswordCheck pwdCheck = new PasswordCheck();
       boolean okPwdLength = pwdCheck.setPassword("passwor9%");
       assertEquals(true,okPwdLength);
    }
}