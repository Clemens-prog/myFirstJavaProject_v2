package Vecka3.lektionOvning.HundProgram;

public class DogMain {
    static void main(String[] args) {
    Hunden hund = new Hunden("Labrador");
        hund.bark();
        hund.setAge(10);
        System.out.println("Human age " + hund.getHumanAge());
    }
}
