package vecka5;

import java.util.Scanner;

public class Array1 {
    static void main(String[] args) {
        String[] array = {"ada","Eva","ole","Bertil"};
        System.out.println("Första namnet: " + array[0] + " sista namnet " + array[array.length - 1]);
        System.out.println("Skriv in 5 namn i terminalen:");
        Scanner konsolReader = new Scanner(System.in);
        String[] namnArray = new String[5];
        for(int i = 0; i < 5; i++)
        {
            String namn = konsolReader.nextLine();
            namnArray[i] = namn;
            System.out.println("Namn " + (i + 1) + namn);
        }
        System.out.println("Förata namnet: " + namnArray[0]);
        System.out.println("Sista namnet: " + namnArray[namnArray.length - 1]);
    }
}
