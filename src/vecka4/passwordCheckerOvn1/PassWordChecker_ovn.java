package vecka4.passwordCheckerOvn1;

public class PassWordChecker_ovn {
    private String str;
    public boolean checkPsw (String str)
    {
        //Length
        boolean lengthOK = false;
        if(str.length() >= 8)
            lengthOK = true;

        //Number
        boolean includeNumber = false;
        for(int i = 0; i < str.length(); i++)
        {
            if(Character.isDigit(str.charAt(i)))
                includeNumber = true;

        }

        //Special character
        boolean includeSpecialCharacter = false;
        for(int i = 0; i < str.length(); i++)
        {
            if(!Character.isLetterOrDigit(str.charAt(i)))
                includeSpecialCharacter = true;

        }


        return lengthOK && includeNumber && includeSpecialCharacter;
    }
}