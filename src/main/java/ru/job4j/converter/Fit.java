package ru.job4j.converter;

public class Fit {
    public static double manWeight(double height) {
        double rsl = (height - 100) * 1.15;
        return rsl;
    }

    public static double womanWeight(double height) {
        double rsl = (height - 110) * 1.15;
        return rsl;
    }

    public static void main(String[] args) {
        double man = Fit.manWeight(180);
        double women = Fit.womanWeight(170);
        System.out.println("Women 170 is " + women);
        System.out.println("Man 187 is " + man);
    }
}
