package Vecka3;

import java.util.Scanner;

public class merOmChar {
    static void main(String[] args) {
    Letters letter = new Letters();
        System.out.println("Write a letter:");
        Scanner lasFranKonsol = new Scanner(System.in);
        String bokstav = lasFranKonsol.nextLine();
        char bokstaven = bokstav.charAt(0);
        boolean arEnBokstav = letter.isLetter(bokstaven);
        if(arEnBokstav)
            System.out.println(bokstaven + " är en bokstav");
        else
            System.out.println(bokstaven + " är inte en bokstav");
        int bokstavMotsvaraNummer = (int)bokstaven;
        if (arEnBokstav && bokstavMotsvaraNummer > 96 && bokstavMotsvaraNummer < 123)
            System.out.println("Är en engesl bokstav");
    }
}
