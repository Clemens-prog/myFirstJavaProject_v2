package Vecka3.lektionOvning.HundProgram.Lampa;

public class Lampa {
    private boolean isOn;
    private String lampanStatusText = "";
    public String getLampanStatus ()
    {
        if(isOn == true)
            lampanStatusText = " lampan är på";
        else if (isOn == false)
            lampanStatusText = " lampan är av";
        else
            lampanStatusText = " lampans status okänd";
        return lampanStatusText;
    }

    public Lampa(boolean isOn)
    {
        this.isOn = isOn;
    }
    public void setTurnOnLamp()
    {
        isOn = true;
    }
    public void setTurnOffLamp()
    {
        isOn = false;
    }
    public boolean getLampStatus()
    {
        return isOn;
    }

}
