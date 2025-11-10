package vecka5.övningar.ovn1;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class UserTest5_2 {
    //Uppgift 1
    @Test
    public void tittaAttFödelsedatumSkillsAvBindestreck()
    {
        //Arrange
        char[] personNr = {'2','0','0','5','0','6','2','7','-','0','1','5','7'};
        PersonNr2 perNr = new PersonNr2(personNr);
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
        char[] personNr = {'2','0','0','5','0','6','2','7','-','0','1','5','7'};
        PersonNr2 perNr = new PersonNr2(personNr);
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
        int[] arr50 = new int[50];
        for(int i = 0; i < 50; i++)
            arr50[i] = i;

        Array50 array50 = new Array50(arr50);
        boolean expected = true;
        //Act
        boolean actual = array50.multiplyArrayElementsBy2();
        //Assert
        assertEquals(expected,actual);
    }

    //Uppgift 4
    @Test
    public void adderaMed2ITalIArrayen()
    {
        //Arrange
        int[] arr50 = new int[50];
        for(int i = 0; i < 50; i++)
            arr50[i] = i;

        Array50 array50 = new Array50(arr50);
        boolean expected = true;
        //Act
        boolean actual = array50.adderaMed2();
        //Assert
        assertEquals(expected,actual);
    }

    //Uppgift 5
    @Test
    public void countPossitiveNrInArray()
    {
        //Arrange
        int[] arr50 = new int[50];
        for(int i = 0; i < 50; i++)
            arr50[i] = -i;

        arr50[4] = -arr50[4];
        arr50[1] = -arr50[1];
        arr50[2] = -arr50[2];
        arr50[3] = -arr50[3];
        Array50 array50 = new Array50(arr50);
        int expected = 4;
        //Act
        int actual = array50.countPossitiveNrInArray();
        //Assert
        assertEquals(expected,actual);
    }

    //Uppgift 6
    @Test
    public void räkanHurMangaTallSomÄrStörreÄnDetFörsta()
    {
        //Arrange
        int[] arr50 = new int[50];
        for(int i = 0; i < 50; i++)
            arr50[i] = i;


        arr50[1] = 0 * arr50[1];

        Array50 array50 = new Array50(arr50);
        int expected = 48;
        //Act
        int actual = array50.countLargerNrThanFirst();
        //Assert
        assertEquals(expected,actual);
    }

    //Uppgift 7
    @Test
    public void lastNegativeNrInArrayIndex()
    {
        //Arrange
        int[] arr50 = new int[50];
        for(int i = 0; i < 50; i++)
            arr50[i] = i;

        arr50[2] = - arr50[2];
        arr50[48] = - arr50[48];

        Array50 array50 = new Array50(arr50);
        int expected = 48;
        //Act
        int actual = array50.lastNegativeNrInArrayIndex()[1];
        //Assert
        assertEquals(expected,actual);
    }

    //Uppgift 8
    @Test
    public void averageOf50Nr()
    {
        //Arrange
        int[] arr50 = new int[50];
        for(int i = 0; i < 25; i++)
            arr50[i] = 1;
        for(int i = 25; i < 50; i++)
            arr50[i] = 3;

        Array50 array50 = new Array50(arr50);
        int expected = 2;
        //Act
        int actual = array50.calcAverageOf50Nr();
        //Assert
        assertEquals(expected,actual);
    }

    //Uppgift 9
    @Test
    public void hittaStortaOchMinstaTalet()
    {
        //Arrange
        int[] arr50 = new int[50];
        for(int i = 0; i < 25; i++)
            arr50[i] = 1;
        for(int i = 25; i < 50; i++)
            arr50[i] = 1;
        arr50[20] =5;
        Array50 array50 = new Array50(arr50);
        int expected = 1;
        //Act
        //int actual = array50.findLargest();
        int actual = array50.findSmallest();

        //Assert
        assertEquals(expected,actual);
    }

    //Uppgift 10
    @Test
    public void summanAvAllaPositivaOchNegativaTal()
    {
        //Arrange
        int[] arr50 = new int[50];
        for(int i = 0; i < 25; i++)
            arr50[i] = 1;
        for(int i = 25; i < 50; i++)
            arr50[i] = -1;
        //arr50[20] =5;
        Array50 array50 = new Array50(arr50);
        int expected = -25;
        //Act
        //int actual = array50.calculatePosNr();
        int actual = array50.calculateNegNr();

        //Assert
        assertEquals(expected,actual);
    }

    //Uppgift 11
    @Test
    public void vandOrdningPaArray()
    {
        //Arrange
        int[] arr50 = new int[10];
        for(int i = 0; i <= 4; i++)
            arr50[i] = 1;
        for(int i = 5; i < 10; i++)
            arr50[i] = -1;
        //arr50[20] =5;
        Array50 array50 = new Array50(arr50);
        int expected = -1;
        //Act
        //int actual = array50.calculatePosNr();
        int actual = array50.vandTalFöldIArray();

        //Assert
        assertEquals(expected,actual);
    }

    //Uppgift 12
    @Test
    public void skrivUtArrayenBaklänges()
    {
        //Arrange
        int[] arr50 = new int[10];
        for(int i = 0; i <= 4; i++)
            arr50[i] = 1;
        for(int i = 5; i < 10; i++)
            arr50[i] = -1;
        //arr50[20] =5;
        Array50 array50 = new Array50(arr50);
        int expected = -1;
        //Act
        //int actual = array50.calculatePosNr();
        int actual = array50.skrivUtArrayenBaklänges();

        //Assert
        assertEquals(expected,actual);
    }//Uppgift 13
    @Test
    public void bråkMed0INämnmaren()
    {
        //Arrange
        int[] arr50 = new int[2];
        //for(int i = 0; i <= 4; i++)
            arr50[0] = 1;
        //for(int i = 5; i < 10; i++)
            arr50[1] = -1;
        //arr50[20] =5;
        Array50 array50 = new Array50(arr50);
        boolean expected = true;
        //Act
        //int actual = array50.calculatePosNr();
        boolean actual = array50.brakMedNollINamnaren();

        //Assert
        assertEquals(expected,actual);
    }


}
