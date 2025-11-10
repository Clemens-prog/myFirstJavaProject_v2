package vecka6.math;

public class Array {
    static void main(String[] args) {
        int[] arr = new int[10];
        int max = 1000;
        int min = 100;
        int range = max - min;
        for(int i = 0; i <10 ;i++)
        {
            arr[i] = (int) (range * Math.random() + min);
            System.out.println("Tal nr: " + (i + 1) + " " +  arr[i]);
        }
    }
}