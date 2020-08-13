import org.apache.commons.math3.ode.FirstOrderDifferentialEquations;
import org.apache.commons.math3.ode.FirstOrderIntegrator;
import org.apache.commons.math3.ode.nonstiff.EulerIntegrator;

import java.util.ArrayList;

public class TestLotkaVolterra {

    public static void main(String[] args) {
        double[] params= new double[]{1.5,1,1,3,1,2,0.2,0.4};
        double[] xStart= new double[]{50,10};
        double[] xStop= new double[]{0,0};


        FirstOrderDifferentialEquations lotkaVolterraODE = new LotkaVolterraODE(params);
        FirstOrderIntegrator eulerInt = new EulerIntegrator(0.01);
        LotkaVolterraPath lotkaVolterraPath = new LotkaVolterraPath();
        eulerInt.addStepHandler(lotkaVolterraPath);
        eulerInt.integrate(lotkaVolterraODE,0,xStart,50,xStop);

        FirstOrderDifferentialEquations lotkaVolterraODE2 = new LotkaVolterraODE2(params);
        FirstOrderIntegrator eulerInt2 = new EulerIntegrator(0.01);
        LotkaVolterraPath lotkaVolterraPath2 = new LotkaVolterraPath();
        eulerInt2.addStepHandler(lotkaVolterraPath2);
        eulerInt2.integrate(lotkaVolterraODE2,0,xStart,100,xStop);


        FirstOrderDifferentialEquations lotkaVolterraODE3 = new LotkaVolterraODE3(params);
        FirstOrderIntegrator eulerInt3 = new EulerIntegrator(0.01);
        LotkaVolterraPath lotkaVolterraPath3 = new LotkaVolterraPath();
        eulerInt3.addStepHandler(lotkaVolterraPath3);
        eulerInt3.integrate(lotkaVolterraODE3,0,xStart,100,xStop);


        ArrayList<Double> time = lotkaVolterraPath.getTime();
        ArrayList<Double> preys = lotkaVolterraPath.getPreys();
        ArrayList<Double> predators = lotkaVolterraPath.getPredators();
        ArrayList<Double> time2 = lotkaVolterraPath2.getTime();
        ArrayList<Double> preys2 = lotkaVolterraPath2.getPreys();
        ArrayList<Double> predators2 = lotkaVolterraPath2.getPredators();
        ArrayList<Double> time3 = lotkaVolterraPath3.getTime();
        ArrayList<Double> preys3 = lotkaVolterraPath3.getPreys();
        ArrayList<Double> predators3 = lotkaVolterraPath3.getPredators();

        System.out.println("t,preys,predators");
        //System.out.println(lotkaVolterraPath3.getTime());
        //System.out.println(lotkaVolterraPath3.getPreys());
        System.out.println(lotkaVolterraPath3.getPredators());



    }


}
