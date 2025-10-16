package vecka4.PasswordChecker;

public class PasswordCheck
{
    private String str;
    public boolean setPassword(String str)
    {
        this.str = str;
        boolean length = false;
        boolean numInclud = false;
        boolean numIncludSpec = false;
        if(str.length() >= 8)
            length = true;

        for(int i = 0; i < str.length(); i++)
        {
            char character = str.charAt(i);
            if(Character.isDigit(character))
                numInclud = true;

        }

        for(int i = 0; i < str.length(); i++)
        {
            char character = str.charAt(i);
            if(!Character.isLetterOrDigit(character))
                numIncludSpec = true;

        }

        return length && numIncludSpec && numIncludSpec;
    }
}