import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        //array declaration
        int[] dataPoints = new int[100];

        Random rnd = new Random();
        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = rnd.nextInt(100) + 1;
        }
        for (int i = 0; i < dataPoints.length; i++) {
            System.out.print(dataPoints[i]);
            if (i < dataPoints.length - 1) ;
            {
                System.out.print(" | ");
            }
        }
        System.out.println();
        // system.out.println used to make sure the sum prints below on a new line
        int sum = 0;
        for (int i = 0; i < dataPoints.length; i++)
        {
            sum += dataPoints[i];
        }
        double average = (double) sum / dataPoints.length;
        // sum and average output
        System.out.println("The sum of the random array dataPoints is: " + sum);
        System.out.println("The average of the random array dataPoints is: " + average);

        Scanner scanner = new Scanner(System.in);
        System.out.print ("Enter a value between 1 and 100 to search for in the dataPoints array: ");
        int userValue = scanner.nextInt();

        int count = 0;
        for (int i = 0; i < dataPoints.length; i++)
        {
            if (dataPoints[i] == userValue)
            {
                count++;
            }
        }
        //Results
        System.out.println("Your value " + userValue + " was found " + count + " time(s) in the dataPoint array!");
        scanner.close();
    }
}