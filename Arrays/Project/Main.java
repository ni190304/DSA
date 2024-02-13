package DSA.Arrays.Project;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("How many day's temperatures? ");
            int days = scanner.nextInt();

            System.out.println();

            float[] temperatures = new float[days];

            for (int i = 0; i < days; i++) {
                System.out.print("Day " + i + " temperature: ");
                temperatures[i] = scanner.nextFloat();
                System.out.println();
            }

            System.out.println("Average : " + average(temperatures));

            System.out.println(highDays(temperatures, average(temperatures))+" days high");

        }
    }

    public static float average(float[] temp) {
        float sum = 0;

        for (int i = 0; i < temp.length; i++) {
            sum += temp[i];
        }

        float avg = (sum / temp.length);

        return avg;
    }

    public static int highDays(float[] temp, float avg) {
        int high_days = 0;
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] > avg) {
                high_days++;
            }
        }
        return high_days;
    }
}