package Zad2;

import org.apache.commons.math3.exception.MaxCountExceededException;
import org.apache.commons.math3.ode.sampling.StepHandler;
import org.apache.commons.math3.ode.sampling.StepInterpolator;

import java.util.ArrayList;

public class LotkaVolterraPath implements StepHandler {

    ArrayList<Double> narazeni = new ArrayList<>();
    ArrayList<Double> chorzy = new ArrayList<>();
    ArrayList<Double> odporni = new ArrayList<>();
    ArrayList<Integer> czas= new ArrayList<>();
    ArrayList<Double> time= new ArrayList<>();

    public ArrayList<Integer> getCzas() {
        return czas;
    }

    public ArrayList<Double> getNarazeni() {
        return narazeni;
    }

    public ArrayList<Double> getChorzy() {
        return chorzy;
    }

    public ArrayList<Double> getOdporni() {return odporni; }

    public ArrayList<Double> getTime() {return time; }

    @Override
    public void init(double t0, double[] y0, double t) {

    }

    @Override
    public void handleStep(StepInterpolator interpolator, boolean isLast) throws MaxCountExceededException {

        time.add(interpolator.getCurrentTime()*100);
        double[] x = interpolator.getInterpolatedState();
        narazeni.add(x[0]);
        chorzy.add(x[1]);
        odporni.add(x[2]);




    }
}




