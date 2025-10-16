package vecka6;
import java.util.Scanner;
public class SquareRoot {
    static void main(String[] args) {
       // int a = 5;
       // int b = 8;
        double a;
        double b;
        System.out.println("Type in two numbers");
        Scanner scan = new Scanner(System.in);
        a = Double.parseDouble(scan.nextLine());
        b = Double.parseDouble(scan.nextLine());
        double c = Math.sqrt(a*a + b*b);
        System.out.println("Hypotenusan " + c);
    }
}
