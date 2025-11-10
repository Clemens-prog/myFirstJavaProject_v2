package Vecka3.lektionOvning.HundProgram.Item;

public class Item {
    private String namn;
    private double pris;
    private double procent;
    public Item(String namn, double pris)
    {
        this.namn = namn;
        this.pris = pris;
    }

    public void setPrice(double pris)
    {
        this.pris = pris;
    }
    public void applyDiscount(double procent)
    {
        this.procent = procent;
        pris = pris * (1 - procent);
    }
}
