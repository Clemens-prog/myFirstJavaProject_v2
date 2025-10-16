package vecka6;

public class ArrayOvning {
    static void main(String[] args) {
        int[] heltal = new int[10];
        int max = 100;
        int min = 1;
        int range = max - min;
        for(int i = 0; i < 10; i++)
        {
            heltal[i] = (int)(range * Math.random()) + min;
            System.out.println("Tal " + i + " i arryen är " + heltal[i]);

        }
    }
}
