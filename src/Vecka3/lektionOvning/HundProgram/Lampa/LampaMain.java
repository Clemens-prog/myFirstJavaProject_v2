package Vecka3.lektionOvning.HundProgram.Lampa;

public class LampaMain {
    static void main(String[] args) {
        Lampa lampa = new Lampa(true);
        System.out.println("Lamp status " + lampa.getLampanStatus());
        lampa.setTurnOffLamp();
    }

}
