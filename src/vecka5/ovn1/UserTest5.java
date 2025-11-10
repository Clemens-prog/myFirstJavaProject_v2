package vecka5.ovn1;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class UserTest5 {
    //Uppgift 1
    @Test
    public void tittaAttFödelsedatumSkillsAvBindestreck()
    {
        //Arrange
        String personNr = "20050627-0157";
        PersonNr perNr = new PersonNr(personNr);
        boolean expected = true;
        //Act
        boolean actual = perNr.checkPersonNr();
        //Assert
        assertEquals(expected,actual);
    }

    //Uppgift 2
    @Test
    public void avgörOmManEllerKvinna()
    {
        //Arrange
        String personNr = "20050627-0157";
        PersonNr perNr = new PersonNr(personNr);
        String expected = "Man";
        //Act
        String actual = perNr.checkIfMaleOrFemale();
        //Assert
        assertEquals(expected,actual);
    }

    //Uppgift 3
    @Test
    public void fördubblaTalIArrayen()
    {
        //Arrange
        String personNr = "20050627-0157";
        PersonNr perNr = new PersonNr(personNr);
        String expected = "Man";
        //Act
        String actual = perNr.checkIfMaleOrFemale();
        //Assert
        assertEquals(expected,actual);
    }
}
