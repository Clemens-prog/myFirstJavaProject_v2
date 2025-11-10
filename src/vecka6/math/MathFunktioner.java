package vecka6.math;

import java.util.Scanner;

public class MathFunktioner {
    static void main(String[] args) {
        System.out.println("Skriv in två heltal:");
        Scanner scan = new Scanner(System.in);
        double katet1 = Double.parseDouble(scan.nextLine());
        double katet2 = Double.parseDouble(scan.nextLine());
        //double a = 3.0;
        //double b = 4.0;
        double a = katet1;
        double b = katet2;
        double c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
        System.out.println("c lika med " + c);
    }
}
