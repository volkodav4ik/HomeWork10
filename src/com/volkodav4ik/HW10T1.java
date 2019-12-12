package com.volkodav4ik;

import java.util.Arrays;

public class HW10T1 {

    public static void main(String[] args) {
        Fruit[] fruits = new Fruit[4];
        Fruit lemon = new Fruit(FruitType.LEMON, Color.YELLOW, 152, 41.90);
        Fruit banana = new Fruit(FruitType.BANANA, Color.YELLOW, 176, 27.00);
        Fruit appleRed = new Fruit(FruitType.APPLE, Color.RED, 274, 14.90);
        Fruit appleGreen = new Fruit(FruitType.APPLE, Color.GREEN, 158, 16.90);

        fruits[0] = lemon;
        fruits[1] = banana;
        fruits[2] = appleRed;
        fruits[3] = appleGreen;
        System.out.println(Arrays.toString(fruits));

        double total = 0;
        for (Fruit fruit : fruits) {
            total += fruit.getPrice();
        }
        System.out.println("Total: " + total + " UAH");
    }
}
