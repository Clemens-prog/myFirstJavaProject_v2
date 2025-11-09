package vecka5.Övning13_14;

import java.util.Scanner;

public class LaserInBrak {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Skriv in nämnaren:");
        int namnare = scan.nextInt();
        while(namnare == 0)
        {
            System.out.println("Du har skrivit 0 i nämnaren skriv ett nytt heltal: ");
            namnare = scan.nextInt();
        }
        if(namnare < 0)
            namnare = - namnare;
        System.out.println("Nämnaren: " + namnare);
        System.out.println("Skriv in täljaren: ");
        int täljare = scan.nextInt();
        System.out.println("Nämnaren: " + namnare + " taljaren " + täljare);
        int[] arr = new int[2];
        arr[0] = namnare;
        arr[1] = täljare;
    }
}
