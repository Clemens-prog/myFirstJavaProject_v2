package Vecka3.lektionOvning.HundProgram;

public class Hunden {
    private String ras;
    private int alder;
    public Hunden(String ras)
    {
        this.ras = ras;
    }
    public void bark()
    {
        System.out.println("Voff");
    }
    public void setAge(int alder)
    {
        this.alder = alder;
    }
    public int getHumanAge()
    {
        return alder * 7;
    }
}
