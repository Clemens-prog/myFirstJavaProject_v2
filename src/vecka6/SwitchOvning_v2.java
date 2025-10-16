package vecka6;

import java.util.Scanner;

public class SwitchOvning_v2 {
    static void main(String[] args) {
        System.out.println("Välj ett av orden \n" +
                "A:acetylsalicylsyra \n" +
                "B:barnvårdscentralen \n" +
                "C:citronsyracykeln \n" +
                "D:djungeltelegrafen");
        Scanner scan = new Scanner(System.in);
        String valdBokstav = scan.nextLine();
        char siffra = valdBokstav.charAt(0);
        String ord = "";
                switch(valdBokstav)
        {
            case "A":
                ord = "acetylsalicylsyra";
                break;
            case "B":
                ord = "barnvårdscentralen";
                break;
            case "C":
                ord = "citronsyracykeln";
                break;
            case "D":
                ord = "djungeltelegrafen";
                break;

        }
        System.out.println("Valda bokstaven " + siffra + " motsvarar ordet " + ord);
    }
}