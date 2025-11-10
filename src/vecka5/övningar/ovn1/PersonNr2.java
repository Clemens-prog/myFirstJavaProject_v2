package vecka5.övningar.ovn1;

public class PersonNr2 {
    private char[] personNr;
    public PersonNr2(char[] personNr) {
        this.personNr = personNr;
    }
    public boolean checkPersonNr()
    {
        boolean first8Digits = true;
        boolean bindestreck = true;
        boolean last4Digits = true;
        boolean characterLength = true;
        if (personNr.length != 13)
            characterLength = false;
        for(int i = 0; i < 7; i++)
            if(!Character.isDigit(personNr[i]))
                first8Digits = false;

        if(!(personNr[8] == '-'))
            bindestreck = false;

        for(int i = 9; i < 13; i++)
            if(!Character.isDigit(personNr[i]))
                last4Digits = false;
            return first8Digits && bindestreck && last4Digits && characterLength;
    }
    public String checkIfMaleOrFemale()
    {
        String kön = "";
        if(personNr[11] % 2 == 0)
            kön = "Kvinna";
        else
            kön = "Man";
          return  kön;
    }
}
