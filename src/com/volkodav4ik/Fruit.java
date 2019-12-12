package com.volkodav4ik;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Fruit {

    private FruitType type;
    private Color color;
    private int weightGramm;
    private double pricePerKg;

    public Fruit(FruitType type, Color color, int weightGramm, double pricePerKg) {
        this.type = type;
        this.color = color;
        this.weightGramm = weightGramm;
        this.pricePerKg = pricePerKg;
    }

    public double getPrice() {
        double result = pricePerKg * weightGramm / 1000;
        return round(result, 2);
    }

    private static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();
        BigDecimal bd = new BigDecimal(Double.toString(value));
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

    public String toString() {
        return "Fruit{" +
                "type=" + type +
                ", color=" + color +
                ", weightGramm=" + weightGramm + " g" +
                ", pricePerKg=" + pricePerKg + " UAH" +
                '}';
    }
}

