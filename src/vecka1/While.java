package vecka1;

public class While {
    public static void main(String[] args) {
        int tal = 1;
        /*while(tal <= 100)
        {
            System.out.println("Talet är " + tal);
            tal++;
        }*/

        /*while(tal <= 100)
        {
            if(tal%2 == 0)
                System.out.println("Jämna talet är " + tal);
            tal++;
        }*/
int tal1 = 1;
int tal2 = 1;

int tal3 = tal1 + tal2;
        System.out.print(" " + tal1);
        System.out.print(" " + tal2);
        int i = 0;
        while(i <= 100)
        {


            System.out.print(" " + tal3);
            tal1 = tal2;
            tal2 = tal3;
            tal3 = tal1 + tal2;
            i++;
        }
    }
}
