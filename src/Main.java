import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner in = new Scanner(System.in);

        // 1a
        int ARRAY_LENGTH = 100;
        int[] dataPoints = new int[ARRAY_LENGTH];

        // 1b
        for (int i = 0; i < dataPoints.length; i++){
            dataPoints[i] = rnd.nextInt(100) + 1;
        }

        // 1c
        for (int i = 0; i < dataPoints.length; i++){
            if (i % 10 == 0 && i != 0){
                System.out.print(" |\n");
            }
            System.out.printf("| %3d ", dataPoints[i]);
        }
        System.out.print(" |\n\n");

        // 1d
        int sum = 0;
        for (int dataPoint : dataPoints){
            sum = sum + dataPoint;
        }

        System.out.println("The sum of 'dataPoints' is " + sum);
        System.out.println("The average of 'dataPoints' is " + sum / dataPoints.length + "\n");

        // 2a
        int target = SafeInput.getRangedInt(in, "Enter a target int between 1 and 100", 1, 100);

        // 2b
        int timesFound = 0;
        for (int i = 0; i < dataPoints.length; i++){
            if (dataPoints[i] == target){
                System.out.println("The target value " + target + " was found at array index " + i);
                timesFound++;
            }
        }
        System.out.println("The target was found " + timesFound + " times");

        // 2c
        int secondTarget = SafeInput.getRangedInt(in, "Enter a target int between 1 and 100", 1, 100);
        boolean found = false;
        for (int i = 0; i < dataPoints.length; i++){
            if (dataPoints[i] == secondTarget){
                System.out.println("The target value " + secondTarget + " was first found at array index " + i);
                found = true;
                break;
            }
        }
        if (!found){
            System.out.println("The target value " + secondTarget + " was not found");
        }
        System.out.println();

        // 2d
        int min = dataPoints[0];
        int max = dataPoints[0];
        for (int dataPoint : dataPoints) {
            if (dataPoint < min)
                min = dataPoint;
            if (dataPoint > max)
                max = dataPoint;
        }
        System.out.println("The minimum value in 'dataPoints' is " + min);
        System.out.println("The maximum value in 'dataPoints' is " + max);
        System.out.println();

        // 2e
        System.out.println("Average of dataPoints is " + getAverage(dataPoints));
    }

    public static double getAverage(int[] values){
        double sum = 0.0;
        for (double value : values){
            sum = sum + value;
        }
        return sum / values.length;
    }
}