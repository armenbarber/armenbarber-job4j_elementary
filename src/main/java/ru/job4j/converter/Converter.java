package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float euro = rubleToEuro(150);
        float dollar = rubleToDollar(150);
        System.out.println("150 rubles are " + euro + " euro.");
        System.out.println("150 rubles are " + dollar + " dollar.");
    }
}
