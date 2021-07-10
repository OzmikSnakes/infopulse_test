package task1;

import java.util.Scanner;

public class Main {

    private static final double C = -1.49, D = 23.4;
    private static final int M = 10, N = 10;  // m,n > 1

    public static void main(String[] args) {
        double[][] arr = new double[M][N];
        double maxValue = Double.MIN_VALUE;
        // rows with i,j = 0 cause division by 0, so they are excluded
        for (int i = 1; i < M; i++)
            for (int j = 1; j < N; j++) {
                arr[i][j] = Math.sqrt(Math.abs(Math.sin(Math.sin(C)) - ((4 * Math.log(Math.log(D))) / Math.pow(i, j))));
                if (arr[i][j] > maxValue)
                    maxValue = arr[i][j];
            }
        System.out.println("Max value: " + maxValue);
    }
}
