import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();

        int[] dataPoints = new int[100];
        int userValue = SafeInput.getRangedInt(in,"Please enter a number between", 1, 100);
        int searchedValue = SafeInput.getRangedInt(in,"Please enter a number to find", 1, 100);
        int min = dataPoints[0];
        int max = dataPoints[0];

        for (int i = 0; i < dataPoints.length; i++)
        {
            dataPoints[i] = rnd.nextInt(100) + 1;
        }

        /*for(int i = 0; i < dataPoints.length; i++)
        {
            System.out.print(dataPoints[i]);

            if(i < dataPoints.length - 1)
            {
                System.out.print(" | ");
            }
        }*/

        int sum = 0;

        for(int i = 0; i < dataPoints.length; i++)
        {
            sum += dataPoints[i];
        }
        double average = (double) sum / dataPoints.length;
        System.out.println("The sum of the values in dataPoints is: " + sum);
        System.out.println("The average of the values in dataPoints is: " + average);

        int count = 0;

        for(int i = 0; i < dataPoints.length; i++)
        {
            if(dataPoints[i] == userValue)
            {
                count++;
            }
        }
        System.out.println("The value " + userValue + " was found " + count + " times.");

        int position = -1;

        for(int i = 0; i < dataPoints.length; i++)
        {
            if(dataPoints[i] == searchedValue)
            {
                position = i;
                break;
            }
        }
        if(position >= 0)
        {
            System.out.println("The value " + searchedValue + " was found at index " + position);
        }
        else
        {
            System.out.println("The value " + searchedValue + " was not found.");
        }

        for(int i = 1; i < dataPoints.length; i++)
        {
            if(dataPoints[i] < min)
            {
                min = dataPoints[i];
            }

            if(dataPoints[i] > max)
            {
                max = dataPoints[i];
            }
        }
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);

        System.out.println("Average of dataPoints is: " + getAverage(dataPoints));
    }

    public static double getAverage(int values[])
    {
        int sum = 0;

        for(int i = 0; i < values.length; i++)
        {
            sum += values[i];
        }

        return (double) sum / values.length;
    }
}
