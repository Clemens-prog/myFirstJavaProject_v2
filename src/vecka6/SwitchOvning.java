package vecka6;

import java.util.Scanner;

public class SwitchOvning {
    static void main(String[] args) {
        System.out.println("Välj ett av orden \n" +
                "1:acetylsalicylsyra \n" +
                "2:barnvårdscentralen \n" +
                "3:citronsyracykeln \n" +
                "4:djungeltelegrafen");
        Scanner scan = new Scanner(System.in);
        String valdBokstav = scan.nextLine();
        char siffra = valdBokstav.charAt(0);
        String ord = "";
                switch(siffra)
        {
            case 1:
                ord = "acetylsalicylsyra";
                break;
            case 2:
                ord = "barnvårdscentralen";
                break;
            case 3:
                ord = "citronsyracykeln";
                break;
            case 4:
                ord = "djungeltelegrafen";
                break;

        }
        System.out.println("Valda bokstaven " + siffra + " motsvarar ordet " + ord);
    }
}