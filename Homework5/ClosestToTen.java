package Homework5;

public class ClosestToTen {
    public static void main(String[] args) {
        double m = 10.5;
        double n = 10.45;

        double closestToTen = findClosestToTen(m, n);

        System.out.println("Число " + closestToTen + " ближе к 10.");
    }

    public static double findClosestToTen(double m, double n) {
        double num1 = Math.abs(m - 10);
        double num2 = Math.abs(n - 10);

        if (num1 < num2) {
            return m;
        } else {
            return n;
        }
    }
}




