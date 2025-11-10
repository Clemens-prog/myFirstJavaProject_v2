package vecka6.switchar;

import java.util.Scanner;

public class Switch_program {
    static void main(String[] args) {
        System.out.println("Välj ett sv alternativen: \n" +
                           "A:Acetylsalicylsyra \n" +
                           "B:Barnvårdscentralen \n" +
                           "C:Citronsyracykeln \n" +
                           "D:Djungeltelegrafen");
        Scanner scan = new Scanner(System.in);
        String valdBokstav = scan.nextLine();
        String valtOrd = "";
        while(!valtOrd.equals("stop")) {
            switch (valdBokstav) {
                case "A":
                    valtOrd = "Acetylsalicylsyra";
                    break;
                case "B":
                    valtOrd = "Barnavårdscentralen";
                    break;
                case "C":
                    valtOrd = "Citronsyracykeln";
                    break;
                case "D":
                    valtOrd = "Djungeltelegrafen";
                    break;
                default:
                    valtOrd = "Ej valbart alternativ";
            }
        System.out.println("Det valda alternativet: " + valtOrd);
            valdBokstav = scan.nextLine();
        }
        System.out.println("Programmet är avslutat");
    }
}
