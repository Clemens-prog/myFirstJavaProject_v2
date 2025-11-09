package Vecka3.lektionOvning.HundProgram.Student;

public class Student {
    private String namn;
    private int arskurs;
    private String stadium ="";
    public Student (String namn,int arskurs)
    {
        this.namn = namn;
        this.arskurs = arskurs;
    }
    public String promote()
    {
        arskurs++;
        if(arskurs > 0 && arskurs <= 3)
            stadium = "Lågstadium";
        if(arskurs >= 4 && arskurs <= 6)
            stadium = "Mellanstadium";
        if(arskurs >= 7 && arskurs <= 9)
            stadium = "Högstadium";
        return stadium;
    }
    public int getArskurs()
    {
        return arskurs;
    }
    public String getStadium()
    {
       return stadium;
    }
}