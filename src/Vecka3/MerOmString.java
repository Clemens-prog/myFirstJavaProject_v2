package Vecka3;

import java.util.Scanner;

public class MerOmString {
    static void main(String[] args) {
       String str =  "exempelText";
        System.out.println(str.equals("exempelText"));
        System.out.println(str.length());

        Scanner scan = new Scanner(System.in);
        String textFranTangentBord = scan.nextLine();

        for(int i = 0; i < textFranTangentBord.length();i++)
        {
            if(textFranTangentBord.equals("ägg"))
            {
                System.out.println("ägg är knasigt");
                break;
            }
            System.out.print(textFranTangentBord.charAt(i));
        }
    }
}
