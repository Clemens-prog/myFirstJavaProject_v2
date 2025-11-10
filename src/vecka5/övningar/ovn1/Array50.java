package vecka5.övningar.ovn1;

import java.util.Scanner;

public class Array50 {
    private int[] arr50;
    public Array50(int[] arr50) {
        this.arr50 = arr50;
    }
   public boolean  multiplyArrayElementsBy2()
   {
       for(int i = 0; i < arr50.length; i++)
       {
           System.out.print(arr50[i] + " ");
       }
       for(int i = 0; i < arr50.length; i++)
       {
           arr50[i] = 2 * arr50[i];
       }
       System.out.println();
       for(int i = 0; i < arr50.length; i++)
       {
           System.out.print(arr50[i] + " ");
       }

       return true;
   }

    public boolean  adderaMed2()
    {
        for(int i = 0; i < arr50.length; i++)
        {
            System.out.print(arr50[i] + " ");
        }
        for(int i = 0; i < arr50.length; i = i + 2)
        {
            arr50[i] = 2 + arr50[i];
        }
        System.out.println();
        for(int i = 0; i < arr50.length; i++)
        {
            System.out.print(arr50[i] + " ");
        }

        return true;
    }

    public int countPossitiveNrInArray() {
        int antalPossitivaTal = 0;
        for(int i = 0; i < arr50.length; i++)
        {
            if(arr50[i] > 0)
                antalPossitivaTal++;
        }
        return antalPossitivaTal;
    }

    public int countLargerNrThanFirst() {
        int antalStorreTal = 0;
        for(int i = 1; i < arr50.length; i++)
        {
            if(arr50[i] > arr50[0])
                antalStorreTal++;
        }
        return antalStorreTal;
    }

    public int[] lastNegativeNrInArrayIndex() {

        int[] firstLastNeg ={0,0};
        int firstNegNr = 0;
        for(int i = 1; i < arr50.length; i++)

        while(arr50[firstNegNr] > 0)
        {
           // if(arr50[i] < 0)
                firstNegNr++;
        }
        int lastNegNr = 49;
        //for(int i = arr50.length - 1; i >=0 ; i--)
        while(arr50[lastNegNr] > 0)
        {
           // if(arr50[i] < 0)
                lastNegNr--;
        }
        int index = lastNegNr;

        firstLastNeg[0] = firstNegNr;
        firstLastNeg[1] = lastNegNr;
        return firstLastNeg;
    }

    public int calcAverageOf50Nr() {
        int totalSumma = 0;
        for(int i = 0; i < arr50.length; i++)
        {
            totalSumma = totalSumma + arr50[i];
        }
        System.out.println("totalSumma " + totalSumma);
        int average = totalSumma / arr50.length;
        return average;
    }

    public int findLargest() {
        int largestNr = arr50[0];
        for(int i = 0;i < arr50.length - 2;i++)
            if(arr50[i] < arr50[i + 1])
                largestNr = arr50[i + 1];
        System.out.println("largestNr " + largestNr);
        return largestNr;
    }

    public int findSmallest() {
        int smallestNr = arr50[0];
        for(int i = 0;i < arr50.length - 2;i++)
            if(arr50[i] > arr50[i + 1])
                smallestNr = arr50[i + 1];
        System.out.println("smallestNr " + smallestNr);
        return smallestNr;

    }

    public int calculatePosNr() {
        int sumPosNrTot = 0;
        for(int i = 0;i < arr50.length - 1;i++)
            if(arr50[i] > 0)
                sumPosNrTot = sumPosNrTot + arr50[i];
        System.out.println("sumPosNrTot " + sumPosNrTot);
        return sumPosNrTot;
    }


    public int calculateNegNr() {
        int sumNegNrTot = 0;
        for(int i = 0;i < arr50.length;i++)
            if(arr50[i] < 0)
                sumNegNrTot = sumNegNrTot + arr50[i];
        System.out.println("sumNegNrTot " + sumNegNrTot);
        return sumNegNrTot;
    }

    public int vandTalFöldIArray() {
        int[] array2 = new int[10];
        for(int i = 0;i < arr50.length;i++)
            System.out.println(arr50[i]);

        for(int i = 0;i < arr50.length;i++)
            array2[9-i] = arr50[i];

        System.out.println("array2[0] " + array2[0] + ("array2[9] " + array2[9]) +
        "arr50.length " + arr50.length);
        return array2[0];
    }

    public int skrivUtArrayenBaklänges() {
        System.out.println("Fram länges ");
        for(int i = 0;i < arr50.length;i++)
            System.out.print(arr50[i] + " ");

        System.out.println("Bak länges ");
        for(int i = 0;i < arr50.length;i++)
            System.out.print(arr50[9 - i] + " ");
        return arr50[arr50.length - 1];
    }

    public boolean brakMedNollINamnaren() {
        int namnare = 0;
        int taljare = 0;
        Scanner scan = new Scanner(System.in);
        while(true)
        {
            System.out.println("Skriv in ett heltal till nämnaren:");
            namnare = scan.nextInt();
            if(namnare == 0)
                System.out.println("Skriv ett nytt heltal:");
            else
                break;
        }
        System.out.println("Skriv ett täljar tal:");
        taljare = scan.nextInt();

        System.out.println("Täljar tal:" + taljare);
        System.out.println("Nämnar tal:" + namnare);
        boolean namnarTal;
        if(namnare != 0)
            namnarTal = true;
        else
            namnarTal = false;
return namnarTal;
    }
}