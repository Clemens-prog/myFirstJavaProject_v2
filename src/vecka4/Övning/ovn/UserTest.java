package vecka4.Övning.ovn;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class UserTest {
    //Uppgift 1 - 7
    @Test
    void userNameTest()
    {
        //Arrange
        String userName = "Calle";
        String password = "keyword";
        //act
        User user = new User(userName,password);
        String expected = "Calle";
        String actual = user.getUserName();
        //Assert
        assertEquals(expected,actual);
    }
    @Test
    void passwordTest()
    {
        //Arrange
        String userName = "Calle";
        String password = "Keyword";
        //act
        User user = new User(userName,password);
        String expected = "Keyword";
        String actual = user.getPassword();
        //Assert
        assertEquals(expected,actual);
    }

    @Test
    void andraUsernameTest()
    {
        //Arrange
        String userName = "Calle";
        String password = "Keyword";
        //act
        User user = new User(userName,password);
        user.setUserName("keyword");
        String expected = "keyword";
        String actual = user.getUserName();
        //Assert
        assertEquals(expected,actual);
    }
    //Uppgift 8 -9
    @Test
    void andraUsernameLangd3Test()
    {
        //Arrange
        String userName = "Calle";
        String password = "Keyword";
        //act
        User user = new User(userName,password);
        user.setUserName("Åsa");
        String expected = "Calle";
        String actual = user.getUserName();
        //Assert
        assertEquals(expected,actual);
    }
    @Test
    void andraUsernameLangd4Test()
    {
        //Arrange
        String userName = "Calle";
        String password = "Keyword";
        //act
        User user = new User(userName,password);
        String newName = "Adam";
        user.setUserName(newName);
        String expected = newName;
        String actual = user.getUserName();
        //Assert
        assertEquals(expected,actual);
    }
    @Test
    void andraUsernameLangd5Test()
    {
        //Arrange
        String userName = "Calle";
        String password = "Keyword";
        //act
        User user = new User(userName,password);
        String newName = "Adams";
        user.setUserName(newName);
        String expected = newName;
        String actual = user.getUserName();
        //Assert
        assertEquals(expected,actual);
    }
    //Uppgift 10
    @Test
    void passwordMinstSjuTecken()
    {
        //Arrange
        String userName = "Calle";
        String password = "Keyword";
        //act
        User user = new User(userName,password);
        String newPassword = "Keyword";
        user.setUserName(newPassword);
        String expected = newPassword;
        String actual = user.getPassword();
        //Assert
        assertEquals(expected,actual);
    }
    @Test
    void passwordMax20Tecken()
    {
        //Arrange
        String userName = "Calle";
        String password = "Keyword";
        //act
        User user = new User(userName,password);
        String newPassword = "KeywordKeywordKeywo!";
        user.setPassword(newPassword);
        String expected = newPassword;
        String actual = user.getPassword();
        //Assert
        assertEquals(expected,actual);
    }
    //Uppgift 11
    @Test
    void hamtaNormalUser()
    {
        //Arrange
        String userName = "Calle";
        String password = "Keyword";
        //act
        User user = new User(userName,password);
        String userType = "normal";
        String expected = userType;
        String actual = user.getTypeUser();
        //Assert
        assertEquals(expected,actual);
    }
    //Uppgift 12
    @Test
    void setNormalUser()
    {
        //Arrange
        String userName = "Calle";
        String password = "Keyword";
        //act
        User user = new User(userName,password);
        String userType = "normal";
        String expected = userType;
        user.setTypeUser(userType);
        String actual = user.getTypeUser();
        //Assert
        assertEquals(expected,actual);
    }
    //Uppgift 13
    @Test
    void set3UserAdmin()
    {
        //Arrange
        String userName = "Calle";
        String password = "Keyword";
        //act
        User user = new User(userName,password);
        String userType = "admin";
        String expected = userType;
        user.setTypeUser(userType);
        String actual = user.getTypeUser();
        //Assert
        assertEquals(expected,actual);
    }
    @Test
    void set3UserSuper()
    {
        //Arrange
        String userName = "Calle";
        String password = "Keyword";
        //act
        User user = new User(userName,password);
        String userType = "super";
        String expected = userType;
        user.setTypeUser(userType);
        String actual = user.getTypeUser();
        //Assert
        assertEquals(expected,actual);
    }
    //Uppgift 14
    @Test
    void setSpecialTeckenPassword()
    {
        //Arrange
        String userName = "Calle";
        String password = "Keyword";
        //act
        User user = new User(userName,password);
        String setPassword = "Keyword#";
        String expected = setPassword;
        user.setPassword(setPassword);
        String actual = user.getPassword();
        //Assert
        assertEquals(expected,actual);
    }
    //Uppgift 15
    @Test
    void setPasswordMasteHaStorOchLitenBokstav()
    {
        //Arrange
        String userName = "Calle";
        String password = "Keyword";
        //act
        User user = new User(userName,password);
        String setPassword = "KEYWORd#";
        String expected = setPassword;
        user.setPassword(setPassword);
        String actual = user.getPassword();
        //Assert
        assertEquals(expected,actual);
    }
    //Uppgift 16
    @Test
    void setKanÄvenVaraGoldMember()
    {
        //Arrange
        String userName = "Calle";
        String password = "Keyword";
        //act
        User user = new User(userName,password);
        String setTypeUser = "gold member";
        String expected = setTypeUser;
        user.setTypeUser(setTypeUser);
        String actual = user.getTypeUser();
        //Assert
        assertEquals(expected,actual);
    }
    //Uppgift 17
    @Test
    void loggaIn20gångerOchBliGoldMember()
    {
        //Arrange
        String userName = "Calle";
        String password = "KEYWORd#";
        //act
        User user = new User(userName,password);
        for(int i = 0; i < 20; i++)
            user.logIn(userName,password);

        String expected = "gold member";
        String actual = user.getTypeUser();
        //Assert
        assertEquals(expected,actual);
    }
    //Uppgift 18
    @Test
    void solidusValuta()
    {
        //Arrange
        String userName = "Calle";
        String password = "KEYWORd#";
        //act
        User user = new User(userName,password);
        for(int i = 0; i < 20; i++)
            user.logIn(userName,password);
        int totalSolidus = user.kopMerchen(1,1,2);
        int expected = 0;
        int actual = totalSolidus;
        //Assert
        assertEquals(expected,actual);
    }
    //extra Uppgift 1
    @Test
    void getSetEmail()
    {
        //Arrange
        String userName = "Calle";
        String password = "KEYWORd#";
        String email = "hello@hotmail.com";
        //act
        User user = new User(userName,password);
        for(int i = 0; i < 20; i++)
            user.logIn(userName,password);
        int totalSolidus = user.kopMerchen(1,1,2);
        user.setEmail(email);
        String expected = email;
        String actual = user.getEmail();
        //Assert
        assertEquals(expected,actual);
    }
    //extra Uppgift 2
    @Test
    void emailArray()
    {
        //Arrange
        String userName = "Calle";
        String password = "KEYWORd#";
        String email_1 = "hello@hotmail.com";
        String email_2 = "bye@hotmail.com";
        String email_3 = "see@hotmail.com";
        String email_4 = "you@hotmail.com";
        //act
        User user = new User(userName,password);
        for(int i = 0; i < 20; i++)
            user.logIn(userName,password);
        int totalSolidus = user.kopMerchen(1,1,2);
        user.setEmail(email_1);
        user.setEmail(email_2);
        user.setEmail(email_3);
        user.setEmail(email_4);
        String expected = email_4;
        String actual = user.getEmailArray()[3];
        //Assert
        assertEquals(expected,actual);
    }

    //extra Uppgift 3
    @Test
    void email4stycken()
    {
        //Arrange
        String userName = "Calle";
        String password = "KEYWORd#";
        String email_1 = "hello@hotmail.com";
        String email_2 = "bye@hotmail.com";
        String email_3 = "see@hotmail.com";
        String email_4 = "you@hotmail.com";
        String email_5 = "me@hotmail.com";

        //act
        User user = new User(userName,password);
        for(int i = 0; i < 20; i++)
            user.logIn(userName,password);
        int totalSolidus = user.kopMerchen(1,1,2);
        user.setEmail(email_1);
        user.setEmail(email_2);
        user.setEmail(email_3);
        user.setEmail(email_4);
        user.setEmail(email_5);
        String expected = email_5;
        String actual = user.getEmailArray()[0];
        //Assert
        assertEquals(expected,actual);
    }
    //extra Uppgift 4
    @Test
    void emailInnehållerSnabela()
    {
        //Arrange
        String userName = "Calle";
        String password = "KEYWORd#";
        String email_1 = "hello@hotmail.com";
        String email_2 = "bye@hotmail.com";
        String email_3 = "see@hotmail.com";
        String email_4 = "you@hotmail.com";
        String email_5 = "me@hotmail.com";
        String email_6 = "meYou@hotmail.com";

        //act
        User user = new User(userName,password);
        for(int i = 0; i < 20; i++)
            user.logIn(userName,password);
        int totalSolidus = user.kopMerchen(1,1,2);
        user.setEmail(email_1);
        user.setEmail(email_2);
        user.setEmail(email_3);
        user.setEmail(email_4);
        user.setEmail(email_5);
        user.setEmail(email_6);
        String expected = email_6;
        String actual = user.getEmailArray()[1];
        //Assert
        assertEquals(expected,actual);
    }
    //extra Uppgift 5
    @Test
    void emailInnehållerInteTvåLikaAdresser()
    {
        //Arrange
        String userName = "Calle";
        String password = "KEYWORd#";
        String email_1 = "hello@hotmail.com";
        String email_2 = "bye@hotmail.com";
        String email_3 = "see@hotmail.com";
        String email_4 = "you@hotmail.com";
        String email_5 = "me@hotmail.com";
        String email_6 = "meYou@hotmail.com";
        String email_7 = "meYou1@hotmail.com";

        //act
        User user = new User(userName,password);
        for(int i = 0; i < 20; i++)
            user.logIn(userName,password);
        int totalSolidus = user.kopMerchen(1,1,2);
        user.setEmail(email_1);
        user.setEmail(email_2);
        user.setEmail(email_3);
        user.setEmail(email_4);
        user.setEmail(email_5);
        user.setEmail(email_6);
        user.setEmail(email_7);
        String expected = email_7;
        String actual = user.getEmailArray()[2];
        //Assert
        assertEquals(expected,actual);
    }
    //extra Uppgift 6
    @Test
    void tabortEmail()
    {
        //Arrange
        String userName = "Calle";
        String password = "KEYWORd#";
        String email_1 = "hello@hotmail.com";
        String email_2 = "bye@hotmail.com";
        String email_3 = "see@hotmail.com";
        String email_4 = "you@hotmail.com";
        String email_5 = "me@hotmail.com";
        String email_6 = "meYou@hotmail.com";
        String email_7 = "meYou1@hotmail.com";

        //act
        User user = new User(userName,password);
        for(int i = 0; i < 20; i++)
            user.logIn(userName,password);
        int totalSolidus = user.kopMerchen(1,1,2);
        user.setEmail(email_1);
        user.setEmail(email_2);
        user.setEmail(email_3);
        user.setEmail(email_4);
        user.setEmail(email_5);
        user.setEmail(email_6);
        user.setEmail(email_7);
        user.deleteEmail(3);
        String expected = "";
        String actual = user.getEmailArray()[3];
        //Assert
        assertEquals(expected,actual);
    }
    //extra Uppgift 7
    @Test
    void frågaHurMångaEmailSomFinns()
    {
        //Arrange
        String userName = "Calle";
        String password = "KEYWORd#";
        String email_1 = "hello@hotmail.com";
        String email_2 = "bye@hotmail.com";
        String email_3 = "see@hotmail.com";
        String email_4 = "you@hotmail.com";
        String email_5 = "me@hotmail.com";
        String email_6 = "meYou@hotmail.com";
        String email_7 = "meYou1@hotmail.com";

        //act
        User user = new User(userName,password);
        for(int i = 0; i < 20; i++)
            user.logIn(userName,password);
        int totalSolidus = user.kopMerchen(1,1,2);
        user.setEmail(email_1);
        user.setEmail(email_2);
        user.setEmail(email_3);
        user.setEmail(email_4);
        user.setEmail(email_5);
        user.setEmail(email_6);
        user.setEmail(email_7);
        user.deleteEmail(3);
        user.deleteEmail(2);
        int expected = 2;
        int actual = user.fragaHurMangaEmailFinns();
        //Assert
        assertEquals(expected,actual);
    }
}
