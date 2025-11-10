package vecka5.ovn1;

public class PersonNr {
    private String personNr;
    public PersonNr(String personNr) {
        this.personNr = personNr;
    }
    public boolean checkPersonNr()
    {
        boolean first8Digits = true;
        boolean bindestreck = true;
        boolean last4Digits = true;
        boolean characterLength = true;
        if (personNr.length() != 13)
            characterLength = false;
        for(int i = 0; i < 7; i++)
            if(!Character.isDigit(personNr.charAt(i)))
                first8Digits = false;

        if(!(personNr.charAt(8) == '-'))
            bindestreck = false;

        for(int i = 9; i < 13; i++)
            if(!Character.isDigit(personNr.charAt(i)))
                last4Digits = false;
            return first8Digits && bindestreck && last4Digits && characterLength;
    }
    public String checkIfMaleOrFemale()
    {
        String kön = "";
        if(personNr.charAt(11) % 2 == 0)
            kön = "Kvinna";
        else
            kön = "Man";
          return  kön;
    }

}
