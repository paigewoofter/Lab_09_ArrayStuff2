import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] dataPoints = new int[100];
        Random gen = new Random();
        String[] items = new String[100];

        for (int l = 0; l < dataPoints.length; l++)
            dataPoints[l] = gen.nextInt(100) + 1;

        for (int l = 0; l < dataPoints.length; l++)
            System.out.print(dataPoints[l] + " | ");

        int sum = 0;
        for (int l = 0; l < dataPoints.length; l++)
            sum += dataPoints[l];

        System.out.println("\nThe sum of the values in the dataPoints array is: " + sum + ".");
        System.out.println("The average of the values in the dataPoints array is: " + sum / dataPoints.length + ".");


        Scanner in = new Scanner(System.in);
        int favInt;

        favInt = SafeInputs.getRangedInt(in, "\nPick a number between 1 and 100. ", 1, 100);

        int target = favInt;
        boolean found = false;
        int timesFound = 0;

        for (int t = 0; t < dataPoints.length; t++)
        {
            if(dataPoints[t] ==  target)
            {
                System.out.println("Found at the dataPoints array index position: " + t);
                found = true;
                timesFound++;
            }
        }
        System.out.println("Your favorite number was found " + timesFound + " times.");
        if (!found)
            System.out.println("Did not find the value " + target + " in the numbers above.");

        favInt = SafeInputs.getRangedInt(in, "\nPick another number between 1 and 100. ", 1, 100);
        target = favInt;
        //Find First - terminate the search after finding first occurrence
        found = false;
        for (int t = 0; t < dataPoints.length; t++)
        {
            if(dataPoints[t] ==  target)
            {
                System.out.println("Found at the dataPoints array index position: " + t);
                found = true;
                break;
            }
        }
        System.out.println("Finished the search!");
        if (!found)
            System.out.println("Did not find the value " + target + " in the outputted numbers above.");

        int min = dataPoints[0];
        int max = dataPoints [0];
        for (int l=0; l < dataPoints.length; l++)
        {
            if(dataPoints[l] < min)
                min = dataPoints[l];
            if(dataPoints[l] > max)
                max = dataPoints[l];
        }
        System.out.println("\nThe minimum value in the dataPoints array is: " + min);
        System.out.println("The maximum value in the dataPoints array is: " + max);

        System.out.println("\nAverage of dataPoints is: " + getAverage(dataPoints));
    }

    public static double getAverage(int dataPoints[])
    {
        double sum = 0.0;
        double average = 0;

        for (int l=0; l < dataPoints.length; l++)
        {
            sum += dataPoints[l];
        }
        average = sum/ dataPoints.length;

        return average;
    }
}