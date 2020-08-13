package edu.ib;

public class LiczFunkcje implements Funkcja {


    @Override
    public double funkcjaZ(double x) {
        return Math.exp(-x) - x;
    }
}
