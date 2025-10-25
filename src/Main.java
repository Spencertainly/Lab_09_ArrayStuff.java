import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //array declaration
        int[] dataPoints = new int[100];

        Random rnd = new Random();
            for (int i = 0; i < dataPoints.length; i++)
            {
                dataPoints[i] = rnd.nextInt(100) + 1;
            }
            for (int i = 0; i < dataPoints.length; i++)
            {
                System.out.print(dataPoints[i]);
                if (i < dataPoints.length - 1) ;
                {
                    System.out.print(" | ");
                }
            }
    }
}