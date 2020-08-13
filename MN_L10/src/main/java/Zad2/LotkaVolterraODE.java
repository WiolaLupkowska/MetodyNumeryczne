package Zad2;

import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.MaxCountExceededException;
import org.apache.commons.math3.ode.FirstOrderDifferentialEquations;

public class LotkaVolterraODE implements FirstOrderDifferentialEquations {

    private double[] params;

    public LotkaVolterraODE(double[] params){
        this.params = params;
    }

    @Override
    public int getDimension() {
        return 3;
    }

    // params={beta, gamma, N}
    //          0       1   2
    // x[0] --- x
    // x[1] --- y
    // x[2] --- z

    @Override
    public void computeDerivatives(double t, double[] x, double[] dxdt) throws MaxCountExceededException, DimensionMismatchException {
        dxdt[0]=-(params[0]/params[2])*x[0]*x[1];  //zdrowi
        dxdt[1]=(params[0]/params[2])*x[0]*x[1]- (1/params[1])*x[1];  //chorzy
        dxdt[2]=(1/params[1])*x[1];  //odporni
    }
}
