package Vecka3;

public class Letters {
    public boolean isLetter(char sign)
    {
        boolean isACharacter = Character.isLetter(sign);
        /*if(isACharacter)
            System.out.println(sign + " is a character");
        else
            System.out.println(sign + " is not a character");*/
        return isACharacter;
    }
}
