package com.volkodav4ik;

import java.util.Arrays;
import java.util.Scanner;

public class HW10T2 {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please, enter the length of the side A of the brick: ");
        int a = SCANNER.nextInt();
        System.out.println("Please, enter the length of the side B of the brick: ");
        int b = SCANNER.nextInt();
        System.out.println("Please, enter the length of the side C of the brick: ");
        int c = SCANNER.nextInt();
        System.out.println("Please, enter hole size X: ");
        int x = SCANNER.nextInt();
        System.out.println("Please, enter hole size Y: ");
        int y = SCANNER.nextInt();
        if (isBrickFitHole(a, b, c, x, y)) {
            System.out.printf("Brick with size %d x %d x %d can pass through hole %d x %d", a, b, c, x, y);
        } else {
            System.out.printf("Brick with size %d x %d x %d can't pass through hole %d x %d", a, b, c, x, y);
        }
    }

    private static boolean isBrickFitHole(int a, int b, int c, int x, int y) {
        int[] aB = new int[]{a, b, c};
        int[] aH = new int[]{x, y};
        Arrays.sort(aB);
        Arrays.sort(aH);
        return (aB[0] <= aH[0] && aB[1] <= aH[1]);
    }
}
