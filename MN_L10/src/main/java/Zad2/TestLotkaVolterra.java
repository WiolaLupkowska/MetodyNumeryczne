package Zad2;

import org.apache.commons.math3.ode.FirstOrderDifferentialEquations;
import org.apache.commons.math3.ode.FirstOrderIntegrator;
import org.apache.commons.math3.ode.nonstiff.EulerIntegrator;

import java.util.ArrayList;

public class TestLotkaVolterra {

    public static void main(String[] args) {
        double[] params= new double[]{1,10,1000};
        double[] xStart= new double[]{90,90,10};
        double[] xStop= new double[]{0,0,0};

        double max;

        FirstOrderDifferentialEquations lotkaVolterraODE = new LotkaVolterraODE(params);
        FirstOrderIntegrator eulerInt = new EulerIntegrator(0.01);
        LotkaVolterraPath lotkaVolterraPath = new LotkaVolterraPath();
        eulerInt.addStepHandler(lotkaVolterraPath);
        eulerInt.integrate(lotkaVolterraODE,0,xStart,50,xStop);

        ArrayList<Double> narazeni = lotkaVolterraPath.getNarazeni();
        ArrayList<Double> chorzy = lotkaVolterraPath.getChorzy();
        ArrayList<Double> odporni = lotkaVolterraPath.getOdporni();
        ArrayList<Double> time = lotkaVolterraPath.getTime();
        //System.out.println(chorzy)

        max=max(chorzy);
        System.out.println("beta: " + params[0]);
        System.out.println("gamma: " + params[1]);
        System.out.println("dzień, w którym było najwięcej chorych: "+max);
       System.out.println(chorzy);


    }

   public static double max(ArrayList<Double> array){
        double max=0;

        for(int i= 0; i<array.size()-3; i++){
             if(array.get(i)-array.get(i+1)<0  && array.get(i+2)-array.get(i+3)<0 ){
                 max= i+2;
             }
        }
        return max;
    };

}
